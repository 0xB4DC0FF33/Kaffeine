package com.badcoffee.kaffeine;

import com.badcoffee.kaffeine.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = Kaffeine.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    // registers items... yeah .. that a useful comment
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "coffee_mug")
        );
    }

    // Registers blocks.... just as the name implies
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {

    }

    // I honestly have no idea how this works... so let's not touch it okay ?
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(Kaffeine.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}
