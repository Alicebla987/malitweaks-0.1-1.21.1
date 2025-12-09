package com.mali.malitweaks.datagen;


import com.mali.malitweaks.MaliTweaks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class OrespawnrBlockTagProvider extends BlockTagsProvider {
    //══════════════════════════════════════════ ✰ CONSTRUCTOR ✰ ══════════════════════════════════════════════════//
    public OrespawnrBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MaliTweaks.MODID, existingFileHelper);
    }
    //═════════════════════════════════════════ ✰ TAG REGISTRATION ✰ ══════════════════════════════════════════════//
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        //════════════════ ✰ MINEABLE TAGS ✰ ════════════════//
        tag(BlockTags.MINEABLE_WITH_PICKAXE);
               // .add(OrespawnrBlocks.RUBY_BLOCK.get())
              //  .add(OrespawnrBlocks.CRYSTAL_PINK_BLOCK.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
        ;

        //════════════════ ✰ NATURAL BLOCKS ✰ ════════════════//


        //════════════════ ✰ TOOL TIER TAGS ✰ ════════════════//
        tag(BlockTags.NEEDS_IRON_TOOL)
               ;

        //════════════════ ✰ TOOL NEEDS TAGS ✰ ════════════════//
       /* tag(OrespawnrTags.Blocks.NEEDS_AMETHYST_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(OrespawnrTags.Blocks.NEEDS_EMERALD_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(OrespawnrTags.Blocks.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(OrespawnrTags.Blocks.NEEDS_ULTIMATE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(OrespawnrTags.Blocks.NEEDS_PINK_CRYSTAL_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(OrespawnrTags.Blocks.NEEDS_TIGEREYES_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL); */

        //════════════════ ✰ TOOL INCORRECT TAGS ✰ ════════════════//
      /*  tag(OrespawnrTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(OrespawnrTags.Blocks.NEEDS_AMETHYST_TOOL);
        tag(OrespawnrTags.Blocks.INCORRECT_FOR_RUBY_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(OrespawnrTags.Blocks.NEEDS_RUBY_TOOL);
        tag(OrespawnrTags.Blocks.INCORRECT_FOR_PINK_CRYSTAL_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(OrespawnrTags.Blocks.NEEDS_PINK_CRYSTAL_TOOL);
        tag(OrespawnrTags.Blocks.INCORRECT_FOR_ULTIMATE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .remove(OrespawnrTags.Blocks.NEEDS_ULTIMATE_TOOL);
        tag(OrespawnrTags.Blocks.INCORRECT_FOR_EMERALD_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(OrespawnrTags.Blocks.NEEDS_EMERALD_TOOL);
        tag(OrespawnrTags.Blocks.INCORRECT_FOR_TIGEREYES_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(OrespawnrTags.Blocks.NEEDS_TIGEREYES_TOOL); */








    }
    //══════════════════════════════════════════════════ ✰..✰ ═══════════════════════════════════════════════════════//

}
