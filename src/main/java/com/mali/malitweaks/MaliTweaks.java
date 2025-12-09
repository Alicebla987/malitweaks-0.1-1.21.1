package com.mali.malitweaks;

import com.mali.malitweaks.registry.OrespawnrBlocks;
import com.mali.malitweaks.registry.OrespawnrCreativeTabs;
import com.mali.malitweaks.registry.OrespawnrItems;
import com.mali.malitweaks.registry.OrespawnrParticles;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Locale;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MaliTweaks.MODID)
public class MaliTweaks {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "malitweaks";
    public static final Logger LOGGER = LogUtils.getLogger();
    public MaliTweaks(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);
        OrespawnrBlocks.register(modEventBus);
        OrespawnrItems.register(modEventBus);
        OrespawnrCreativeTabs.register(modEventBus);
        OrespawnrParticles.register(modEventBus);
        // OrespawnrSoundEvents.SOUNDS.register(modEventBus);
       // OrespawnrTags.register(modEventBus);





        modEventBus.addListener(this::addCreative);



    }

    public static ResourceLocation prefix(String name) {
        return ResourceLocation.fromNamespaceAndPath("malitweaks", name.toLowerCase(Locale.ROOT));
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }
}
