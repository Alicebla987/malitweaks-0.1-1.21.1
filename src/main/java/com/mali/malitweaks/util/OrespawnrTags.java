package com.mali.malitweaks.util;

import com.mali.malitweaks.MaliTweaks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class OrespawnrTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = createTag("needs_amethyst_tool");
        public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");

        public static final TagKey<Block> NEEDS_RUBY_TOOL = createTag("needs_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");

        public static final TagKey<Block> NEEDS_ULTIMATE_TOOL = createTag("needs_ultimate_tool");
        public static final TagKey<Block> INCORRECT_FOR_ULTIMATE_TOOL = createTag("incorrect_for_ultimate_tool");

        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");


        public static final TagKey<Block> NEEDS_PINK_CRYSTAL_TOOL = createTag("needs_pink_crystal_tool");
        public static final TagKey<Block> INCORRECT_FOR_PINK_CRYSTAL_TOOL = createTag("incorrect_for_pink_crystal_tool");


        public static final TagKey<Block> NEEDS_TIGEREYES_TOOL = createTag("needs_tigereyes_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIGEREYES_TOOL = createTag("incorrect_for_tigereyes_tool");


        public static final TagKey<Block> NEEDS_BLOOD_TOOL = createTag("needs_blood_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLOOD_TOOL = createTag("incorrect_for_blood_tool");



        //registrar tags de blocos a cima daqui
        private static TagKey<Block> createTag(String name ) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MaliTweaks.MODID, name));
        }
    }

    public static class Items {







         //Registrar Tags de Item a cima  daqui
        private static TagKey<Item> createTag(String name ) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MaliTweaks.MODID, name));
        }
    }
}








