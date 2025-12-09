package com.mali.malitweaks.datagen;


import com.mali.malitweaks.registry.OrespawnrBlocks;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class OrespawnrBlockLootTableProvider extends BlockLootSubProvider {
    //══════════════════════════════════════════ ✰ CONSTRUCTOR ✰ ══════════════════════════════════════════════════//
    protected OrespawnrBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }
    //═════════════════════════════════════════ ✰ LOOT GENERATION ✰ ══════════════════════════════════════════════//
    @Override
    protected void generate() {
        //════════════════ ✰ BASIC BLOCKS ✰ ════════════════//


        //════════════════ ✰ ORES ✰ ════════════════//


        //════════════════ ✰ CROPS ✰ ════════════════//

        //═════════════════════════════════════════ ✰ UTILITY METHODS ✰ ══════════════════════════════════════════════//
    }
    protected LootTable.Builder createSingleOreDrop(Block pBlock, Item item) {
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return OrespawnrBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item){
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between((float) 2, (float) 5)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }
    //══════════════════════════════════════════════════ ✰..✰ ═══════════════════════════════════════════════════════//

}
