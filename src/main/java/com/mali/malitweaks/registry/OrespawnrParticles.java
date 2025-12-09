package com.mali.malitweaks.registry;

import com.mali.malitweaks.MaliTweaks;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OrespawnrParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(Registries.PARTICLE_TYPE, MaliTweaks.MODID);

    /*public static final DeferredHolder<ParticleType<?>, SimpleParticleType> CRYSTAL_YELLOW_LEAF =
            PARTICLE_TYPES.register("crystal_yellow_leaf", () -> new SimpleParticleType(false)); */

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}