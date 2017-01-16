package com.nos.helios;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabHelios extends CreativeTabs {
    public TabHelios(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.astraliteIngot); //TODO change to star item
    }
}
