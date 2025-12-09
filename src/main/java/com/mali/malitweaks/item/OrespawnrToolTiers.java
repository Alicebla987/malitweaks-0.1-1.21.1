package com.mali.malitweaks.item;


import com.mali.malitweaks.util.OrespawnrTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class OrespawnrToolTiers {

    public static final Tier EMERALD = new SimpleTier(OrespawnrTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            2001, 8f,3f,70, () -> Ingredient.of(Items.EMERALD));



    public static final Tier BLOOD = new SimpleTier(OrespawnrTags.Blocks.INCORRECT_FOR_BLOOD_TOOL,
            199, 8f,2f,70, () -> Ingredient.of(Items.REDSTONE));



    //REGISTRAR A CIMA DAQUI
}
