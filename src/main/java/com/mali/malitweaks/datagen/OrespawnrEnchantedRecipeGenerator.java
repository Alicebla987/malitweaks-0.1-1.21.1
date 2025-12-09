package com.mali.malitweaks.datagen;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.CompletableFuture;


public class OrespawnrEnchantedRecipeGenerator implements DataProvider {
    //═════════════════════════════════════════ ✰ STATIC VARIABLES ✰ ════════════════════════════════════════════════//
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final PackOutput output;
    //══════════════════════════════════════════ ✰ CONSTRUCTOR ✰ ══════════════════════════════════════════════════//
    public OrespawnrEnchantedRecipeGenerator(PackOutput output) {
        this.output = output;
    }
    //═════════════════════════════════════════ ✰ RECIPE GENERATION ✰ ══════════════════════════════════════════════//
    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache) {
        System.out.println("Starting Enchanted Recipe Generation...");

        generateEnchantedShapedRecipe(
            "ultimate_sword",
            new String[]{" T ", " U ", " I "},
            Map.of(
                'T', "orespawnr:titanium",
                'U', "orespawnr:uranium",
                'I', "minecraft:iron_ingot"
            ),
            "orespawnr:ultimate_sword",
            Map.of(
                "minecraft:sharpness", 5,
                "minecraft:unbreaking", 3,
                "minecraft:looting", 3,
                "minecraft:smite", 5,
                "minecraft:knockback", 3,
                "minecraft:fire_aspect", 2,
                "minecraft:bane_of_arthropods", 5
            ),
            cache
        );

        generateEnchantedShapedRecipe(
                "emerald_pickaxe",
                new String[]{"UUU", " I ", " I "},
                Map.of(
                        'U', "minecraft:emerald",
                        'I', "minecraft:stick"
                ),
                "orespawnr:emerald_pickaxe",
                Map.of("minecraft:silk_touch", 1),
                cache
        );

        generateEnchantedShapedRecipe(
                "ultimate_axe",
                new String[]{"TU ", "TI ", " I "},
                Map.of(
                        'U', "orespawnr:uranium",
                        'T', "orespawnr:titanium",
                        'I', "minecraft:iron_ingot"
                ),
                "orespawnr:ultimate_axe",
                Map.of("minecraft:efficiency", 5),
                cache
        );

        generateEnchantedShapedRecipe(
                "ultimate_boots",
                new String[]{"T T", "U U", "   "},
                Map.of(
                        'U', "orespawnr:uranium",
                        'T', "orespawnr:titanium"
                ),
                "orespawnr:ultimate_boots",
                Map.of(
                        "minecraft:protection", 5,
                        "minecraft:fire_protection", 5,
                        "minecraft:blast_protection", 5,
                        "minecraft:projectile_protection", 5,
                        "minecraft:feather_falling", 3
                ),
                cache
        );

        generateEnchantedShapedRecipe(
                "ultimate_chestplate",
                new String[]{"I I", "TTT", "UUU"},
                Map.of(
                        'U', "orespawnr:uranium",
                        'T', "orespawnr:titanium",
                        'I', "minecraft:iron_ingot"
                ),
                "orespawnr:ultimate_chestplate",
                Map.of(
                        "minecraft:protection", 5,
                        "minecraft:fire_protection", 5,
                        "minecraft:blast_protection", 5,
                        "minecraft:projectile_protection", 5
                ),
                cache
        );

        generateEnchantedShapedRecipe(
                "ultimate_helmet",
                new String[]{"TIT", "U U", "   "},
                Map.of(
                        'U', "orespawnr:uranium",
                        'T', "orespawnr:titanium",
                        'I', "minecraft:iron_ingot"
                ),
                "orespawnr:ultimate_helmet",
                Map.of(
                        "minecraft:protection", 5,
                        "minecraft:fire_protection", 5,
                        "minecraft:blast_protection", 5,
                        "minecraft:projectile_protection", 5,
                        "minecraft:respiration", 2,
                        "minecraft:aqua_affinity", 3
                ),
                cache
        );

        generateEnchantedShapedRecipe(
                "ultimate_hoe",
                new String[]{"TU ", " I ", " I "},
                Map.of(
                        'U', "orespawnr:uranium",
                        'T', "orespawnr:titanium",
                        'I', "minecraft:iron_ingot"
                ),
                "orespawnr:ultimate_hoe",
                Map.of("minecraft:efficiency", 2),
                cache
        );

        generateEnchantedShapedRecipe(
                "ultimate_leggings",
                new String[]{"III", "T T", "U U"},
                Map.of(
                        'U', "orespawnr:uranium",
                        'T', "orespawnr:titanium",
                        'I', "minecraft:iron_ingot"
                ),
                "orespawnr:ultimate_leggings",
                Map.of(
                        "minecraft:protection", 5,
                        "minecraft:fire_protection", 5,
                        "minecraft:blast_protection", 5,
                        "minecraft:projectile_protection", 5
                ),
                cache
        );

        generateEnchantedShapedRecipe(
                "ultimate_pickaxe",
                new String[]{"UTU", " T ", " I "},
                Map.of(
                        'U', "orespawnr:uranium",
                        'T', "orespawnr:titanium",
                        'I', "minecraft:iron_ingot"
                ),
                "orespawnr:ultimate_pickaxe",
                Map.of(
                        "minecraft:efficiency", 5,
                        "minecraft:fortune", 5
                ),
                cache
        );

        generateEnchantedShapedRecipe(
                "ultimate_shovel",
                new String[]{" U ", " T ", " I "},
                Map.of(
                        'U', "orespawnr:uranium",
                        'T', "orespawnr:titanium",
                        'I', "minecraft:iron_ingot"
                ),
                "orespawnr:ultimate_shovel",
                Map.of("minecraft:efficiency", 5),
                cache
        );








        System.out.println("Finished Enchanted Recipe Generation");
        return CompletableFuture.completedFuture(null);
    }
    //═════════════════════════════════════════ ✰ HELPER METHODS ✰ ══════════════════════════════════════════════//
    private void generateEnchantedShapedRecipe(String name, String[] pattern, Map<Character, String> key,
                                               String result, Map<String, Integer> enchantments,
                                               CachedOutput cache) {
        try {
            JsonObject json = new JsonObject();
            json.addProperty("type", "minecraft:crafting_shaped");
            json.addProperty("category", "misc");
            JsonArray patternJson = new JsonArray();
            for (String row : pattern) {
                patternJson.add(row);
            }
            json.add("pattern", patternJson);
            JsonObject keyJson = new JsonObject();
            key.forEach((character, item) -> {
                JsonObject itemJson = new JsonObject();
                itemJson.addProperty("item", item);
                keyJson.add(character.toString(), itemJson);
            });
            json.add("key", keyJson);
            JsonObject resultJson = new JsonObject();
            resultJson.addProperty("id", result);
            resultJson.addProperty("count", 1);
            JsonObject components = new JsonObject();
            JsonObject enchantmentsJson = new JsonObject();
            JsonObject levels = new JsonObject();
            enchantments.forEach(levels::addProperty);
            enchantmentsJson.add("levels", levels);
            components.add("minecraft:enchantments", enchantmentsJson);
            resultJson.add("components", components);
            json.add("result", resultJson);
            String jsonString = GSON.toJson(json);
            Path path = output.getOutputFolder()
                    .resolve("data/orespawnr/recipe/" + name + ".json");  // Changed 'recipes' to 'recipe'
            System.out.println("Saving recipe to: " + path);
            HashFunction sha1 = Hashing.sha256();
            HashCode hash = sha1.hashString(jsonString, StandardCharsets.UTF_8);
            cache.writeIfNeeded(path, jsonString.getBytes(StandardCharsets.UTF_8), hash);
        } catch (Exception e) {
            System.err.println("Failed to generate recipe: " + name);
            e.printStackTrace();
        }
    }
    @Override
    public @NotNull String getName() {
        return "Orespawn Enchanted Recipes";
    }
    //══════════════════════════════════════════════════ ✰..✰ ═══════════════════════════════════════════════════════//
}
