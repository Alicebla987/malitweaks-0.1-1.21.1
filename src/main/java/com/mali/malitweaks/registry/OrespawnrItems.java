package com.mali.malitweaks.registry;

import com.mali.malitweaks.MaliTweaks;
import com.mali.malitweaks.item.OrespawnrToolTiers;
import net.minecraft.core.Direction;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OrespawnrItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MaliTweaks.MODID);

    //══════════════════════════════════════ ✰.ORES ITEMS.✰ ═══════════════════════════════════════════════//

    public static final DeferredItem<SwordItem> TESTANDO_SWORD = ITEMS.register("testando_sword",
            () -> new SwordItem(OrespawnrToolTiers.EMERALD,new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND,7, -2.4f))));


















    //══════════════════════════════════════════════ ✰..✰ ════════════════════════════════════════════════════════//
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
//══════════════════════════════════════════════ ✰..✰ ════════════════════════════════════════════════════════//