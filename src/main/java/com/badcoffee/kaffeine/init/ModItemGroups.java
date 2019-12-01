package com.badcoffee.kaffeine.init;

import com.badcoffee.kaffeine.Kaffeine;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroups {

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Kaffeine.MODID, () -> new ItemStack(ModItems.COFFEE_MUG));

    // Helper class that creates an item group in the creative inventory...
    // probably useless as i will probably use just one only custom tab
    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}
