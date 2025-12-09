package com.mali.malitweaks.registry;

import com.mali.malitweaks.MaliTweaks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


// Remove unused import

public class OrespawnrCreativeTabs {

    private static void generateGearWithEnchants(CreativeModeTab.Output output, ItemLike item, EnchantmentInstance... instances) {
        ItemStack stack = new ItemStack(item);
        for (EnchantmentInstance enchant : instances) {
            stack.enchant(enchant.enchantment, enchant.level);
        }
        output.accept(stack);
    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MaliTweaks.MODID);

    public static final Supplier<CreativeModeTab> ORESPAWN_EQUIPAMENTS = CREATIVE_MODE_TAB.register("orespawn_equipments",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.orespawnr.orespawn_equipments"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // encantamentos
                        HolderLookup.RegistryLookup<Enchantment> lookup = itemDisplayParameters.holders().lookupOrThrow(Registries.ENCHANTMENT);
                        Holder<Enchantment> sharpnessHolder = lookup.getOrThrow(Enchantments.SHARPNESS);
                        Holder<Enchantment> unbreakingHolder = lookup.getOrThrow(Enchantments.UNBREAKING);
                        Holder<Enchantment> smiteHolder = lookup.getOrThrow(Enchantments.SMITE);
                        Holder<Enchantment> baneOfArthropodsHolder = lookup.getOrThrow(Enchantments.BANE_OF_ARTHROPODS);
                        Holder<Enchantment> knockbackHolder = lookup.getOrThrow(Enchantments.KNOCKBACK);
                        Holder<Enchantment> lootingHolder = lookup.getOrThrow(Enchantments.LOOTING);
                        Holder<Enchantment> fireAspectHolder = lookup.getOrThrow(Enchantments.FIRE_ASPECT);
                        Holder<Enchantment> efficiecyHolder = lookup.getOrThrow(Enchantments.EFFICIENCY);
                        Holder<Enchantment> fortuneHolder = lookup.getOrThrow(Enchantments.FORTUNE);
                        Holder<Enchantment> aquaAffinityHolder = lookup.getOrThrow(Enchantments.AQUA_AFFINITY);
                        Holder<Enchantment> blastProtectionHolder = lookup.getOrThrow(Enchantments.BLAST_PROTECTION);
                        Holder<Enchantment> channelingHolder = lookup.getOrThrow(Enchantments.CHANNELING);
                        Holder<Enchantment> depthStriderHolder = lookup.getOrThrow(Enchantments.DEPTH_STRIDER);
                        Holder<Enchantment> featherFallingHolder = lookup.getOrThrow(Enchantments.FEATHER_FALLING);
                        Holder<Enchantment> fireProtectionHolder = lookup.getOrThrow(Enchantments.FIRE_PROTECTION);
                        Holder<Enchantment> flameHolder = lookup.getOrThrow(Enchantments.FLAME);
                        Holder<Enchantment> frostWalkerHolder = lookup.getOrThrow(Enchantments.FROST_WALKER);
                        Holder<Enchantment> impalingHolder = lookup.getOrThrow(Enchantments.IMPALING);
                        Holder<Enchantment> infinityHolder = lookup.getOrThrow(Enchantments.INFINITY);
                        Holder<Enchantment> mendingHolder = lookup.getOrThrow(Enchantments.MENDING);
                        Holder<Enchantment> multishotHolder = lookup.getOrThrow(Enchantments.MULTISHOT);
                        Holder<Enchantment> piercingHolder = lookup.getOrThrow(Enchantments.PIERCING);
                        Holder<Enchantment> powerHolder = lookup.getOrThrow(Enchantments.POWER);
                        Holder<Enchantment> projectileProtectionHolder = lookup.getOrThrow(Enchantments.PROJECTILE_PROTECTION);
                        Holder<Enchantment> protectionHolder = lookup.getOrThrow(Enchantments.PROTECTION);
                        Holder<Enchantment> punchHolder = lookup.getOrThrow(Enchantments.PUNCH);
                        Holder<Enchantment> quickChargeHolder = lookup.getOrThrow(Enchantments.QUICK_CHARGE);
                        Holder<Enchantment> respirationHolder = lookup.getOrThrow(Enchantments.RESPIRATION);
                        Holder<Enchantment> riptideHolder = lookup.getOrThrow(Enchantments.RIPTIDE);
                        Holder<Enchantment> silkTouchHolder = lookup.getOrThrow(Enchantments.SILK_TOUCH);
                        Holder<Enchantment> soulSpeedHolder = lookup.getOrThrow(Enchantments.SOUL_SPEED);
                        Holder<Enchantment> swiftSneakHolder = lookup.getOrThrow(Enchantments.SWIFT_SNEAK);
                        Holder<Enchantment> thornsHolder = lookup.getOrThrow(Enchantments.THORNS);
                        Holder<Enchantment> vanishingCurseHolder = lookup.getOrThrow(Enchantments.VANISHING_CURSE);
                        Holder<Enchantment> bindingCurseHolder = lookup.getOrThrow(Enchantments.BINDING_CURSE);



                        output.accept(Items.DIAMOND);















                    })
                    .build());

    public static final Supplier<CreativeModeTab> ORESPAWN_FOODS = CREATIVE_MODE_TAB.register("orespawn_foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.orespawnr.orespawn_foods"))
                    .displayItems((itemDisplayParameters, output) -> {



                    }).build());

    public static final Supplier<CreativeModeTab> ORESPAWN_BLOCKS = CREATIVE_MODE_TAB.register("orespawn_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.orespawnr.orespawn_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {






                    }).build());

    public static final Supplier<CreativeModeTab> ORESPAWN_ITEMS = CREATIVE_MODE_TAB.register("orespawn_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.orespawnr.orespawn_items"))
                    .displayItems((itemDisplayParameters, output) -> {






                    }).build());

    public static final Supplier<CreativeModeTab> ORESPAWN_EGGS = CREATIVE_MODE_TAB.register("orespawn_eggs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.orespawnr.orespawn_eggs"))
                    .displayItems((itemDisplayParameters, output) -> {





                    }).build());





    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}