package com.mali.malitweaks.datagen;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class OrespawnrCookingRecipeGenerator implements DataProvider {
    //═════════════════════════════════════════ ✰ STATIC VARIABLES ✰ ════════════════════════════════════════════════//
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final PackOutput output;
    //══════════════════════════════════════════ ✰ CONSTRUCTOR ✰ ══════════════════════════════════════════════════//
    public OrespawnrCookingRecipeGenerator(PackOutput output) {
        this.output = output;
    }
    //═════════════════════════════════════════ ✰ RECIPE GENERATION ✰ ══════════════════════════════════════════════//
    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache) {
        generateAllCookingRecipes("bacon",
                "orespawnr:raw_bacon",
                "orespawnr:cooked_bacon",
                0.2f,
                "bacon",
                cache);

        generateAllCookingRecipes("corndog",
                "orespawnr:corndog_raw",
                "orespawnr:corndog_cooked",
                0.2f,
                "bacon",
                cache);

        generateAllCookingRecipes("crabmeat",
                "orespawnr:crabmeat",
                "orespawnr:cookedcrabmeat",
                0.2f,
                "bacon",
                cache);

        generateAllCookingRecipes("peacock",
                "orespawnr:rawpeacock",
                "orespawnr:cookedpeacock",
                0.2f,
                "bacon",
                cache);

        generateAllCookingRecipes("popcorn",
                "orespawnr:corn",
                "orespawnr:popcorn",
                0.2f,
                "bacon",
                cache);


        return CompletableFuture.completedFuture(null);
    }
    //═════════════════════════════════════════ ✰ HELPER METHODS ✰ ══════════════════════════════════════════════//
    private void generateAllCookingRecipes(String name, String ingredient, String result,
                                         float experience, String group, CachedOutput cache) {
        // Regular furnace
        generateCookingRecipe(name + "_smelting", "smelting", ingredient, result,
            experience, 200, group, cache);

        // Smoker (50% faster)
        generateCookingRecipe(name + "_smoking", "smoking", ingredient, result,
            experience, 100, group, cache);

        // Campfire
        generateCookingRecipe(name + "_campfire_cooking", "campfire_cooking", ingredient, result,
            experience, 200, group, cache);
    }

    private void generateCookingRecipe(String name, String cookingMethod, String ingredient,
                                     String result, float experience, int cookingTime,
                                     String group, CachedOutput cache) {
        try {
            JsonObject json = new JsonObject();
            json.addProperty("type", "minecraft:" + cookingMethod);
            json.addProperty("category", "food");
            json.addProperty("cookingtime", cookingTime);
            json.addProperty("experience", experience);
            if (group != null && !group.isEmpty()) {
                json.addProperty("group", group);
            }
            JsonObject ingredientJson = new JsonObject();
            ingredientJson.addProperty("item", ingredient);
            json.add("ingredient", ingredientJson);
            JsonObject resultJson = new JsonObject();
            resultJson.addProperty("count", 1);
            resultJson.addProperty("id", result);
            json.add("result", resultJson);
            String jsonString = GSON.toJson(json);
            Path path = output.getOutputFolder()
                    .resolve("data/orespawnr/recipe/" + name + ".json");
            System.out.println("Saving cooking recipe to: " + path);
            HashFunction sha256 = Hashing.sha256();
            HashCode hash = sha256.hashString(jsonString, StandardCharsets.UTF_8);
            cache.writeIfNeeded(path, jsonString.getBytes(StandardCharsets.UTF_8), hash);
        } catch (Exception e) {
            System.err.println("Failed to generate cooking recipe: " + name);
            e.printStackTrace();
        }
    }
    @Override
    public @NotNull String getName() {
        return "Orespawn Cooking Recipes";
    }
    //══════════════════════════════════════════════════ ✰..✰ ═══════════════════════════════════════════════════════//
}
