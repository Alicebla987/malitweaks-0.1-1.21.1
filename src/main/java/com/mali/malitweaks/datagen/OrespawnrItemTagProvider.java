package com.mali.malitweaks.datagen;


import com.mali.malitweaks.MaliTweaks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class OrespawnrItemTagProvider extends ItemTagsProvider {
    //══════════════════════════════════════════ ✰ CONSTRUCTOR ✰ ══════════════════════════════════════════════════//
    public OrespawnrItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MaliTweaks.MODID, existingFileHelper);
    }
    //═════════════════════════════════════════ ✰ TAG REGISTRATION ✰ ══════════════════════════════════════════════//
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        //════════════════ ✰ TOOLS TAGS ✰ ════════════════//
      /*  tag(ItemTags.SWORDS)
                .add(OrespawnrItems.RUBY_SWORD.get())
                .add(OrespawnrItems.AMETHYST_SWORD.get())
                .add(OrespawnrItems.TIGEREYES_SWORD.get())
                .add(OrespawnrItems.ULTIMATE_SWORD.get())
                .add(OrespawnrItems.PINK_CRYSTAL_SWORD.get())
                .add(OrespawnrItems.EMERALD_SWORD.get());

        tag(ItemTags.HOES)
                .add(OrespawnrItems.RUBY_HOE.get())
                .add(OrespawnrItems.TIGEREYES_HOE.get())
                .add(OrespawnrItems.PINK_CRYSTAL_HOE.get())
                .add(OrespawnrItems.ULTIMATE_HOE.get())
                .add(OrespawnrItems.EMERALD_HOE.get())
                .add(OrespawnrItems.AMETHYST_HOE.get());

        tag(ItemTags.AXES)
                .add(OrespawnrItems.RUBY_AXE.get())
                .add(OrespawnrItems.TIGEREYES_AXE.get())
                .add(OrespawnrItems.PINK_CRYSTAL_AXE.get())
                .add(OrespawnrItems.ULTIMATE_AXE.get())
                .add(OrespawnrItems.EMERALD_AXE.get())
                .add(OrespawnrItems.AMETHYST_AXE.get());

        tag(ItemTags.PICKAXES)
                .add(OrespawnrItems.RUBY_PICKAXE.get())
                .add(OrespawnrItems.TIGEREYES_PICKAXE.get())
                .add(OrespawnrItems.PINK_CRYSTAL_PICKAXE.get())
                .add(OrespawnrItems.ULTIMATE_PICKAXE.get())
                .add(OrespawnrItems.EMERALD_PICKAXE.get())
                .add(OrespawnrItems.AMETHYST_PICKAXE.get());

        tag(ItemTags.SHOVELS)
                .add(OrespawnrItems.RUBY_SHOVEL.get())
                .add(OrespawnrItems.TIGEREYES_SHOVEL.get())
                .add(OrespawnrItems.PINK_CRYSTAL_SHOVEL.get())
                .add(OrespawnrItems.ULTIMATE_SHOVEL.get())
                .add(OrespawnrItems.EMERALD_SHOVEL.get())
                .add(OrespawnrItems.AMETHYST_SHOVEL.get());

        //════════════════ ✰ ARMOR TAGS ✰ ════════════════//
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(OrespawnrItems.RUBY_HELMET.get())
                .add(OrespawnrItems.RUBY_CHESTPLATE.get())
                .add(OrespawnrItems.RUBY_LEGGINGS.get())
                .add(OrespawnrItems.RUBY_BOOTS.get())

                .add(OrespawnrItems.PINK_CRYSTAL_HELMET.get())
                .add(OrespawnrItems.PINK_CRYSTAL_CHESTPLATE.get())
                .add(OrespawnrItems.PINK_CRYSTAL_LEGGINGS.get())
                .add(OrespawnrItems.PINK_CRYSTAL_BOOTS.get())

                .add(OrespawnrItems.AMETHYST_HELMET.get())
                .add(OrespawnrItems.AMETHYST_CHESTPLATE.get())
                .add(OrespawnrItems.AMETHYST_LEGGINGS.get())
                .add(OrespawnrItems.AMETHYST_BOOTS.get())

                .add(OrespawnrItems.TIGEREYES_HELMET.get())
                .add(OrespawnrItems.TIGEREYES_CHESTPLATE.get())
                .add(OrespawnrItems.TIGEREYES_LEGGINGS.get())
                .add(OrespawnrItems.TIGEREYES_BOOTS.get())

                .add(OrespawnrItems.ULTIMATE_HELMET.get())
                .add(OrespawnrItems.ULTIMATE_CHESTPLATE.get())
                .add(OrespawnrItems.ULTIMATE_LEGGINGS.get())
                .add(OrespawnrItems.ULTIMATE_BOOTS.get());

        //════════════════ ✰ BLOCK TAGS ✰ ════════════════//
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(OrespawnrBlocks.CRYSTAL_LOG.get().asItem())
                .add(OrespawnrBlocks.CRYSTAL_WOOD.get().asItem())
                .add(OrespawnrBlocks.STRIPPED_CRYSTAL_LOG.get().asItem())
                .add(OrespawnrBlocks.STRIPPED_CRYSTAL_WOOD.get().asItem());

        */
    }
    //══════════════════════════════════════════════════ ✰..✰ ═══════════════════════════════════════════════════════//

}
