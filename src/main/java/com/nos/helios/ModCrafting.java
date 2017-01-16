package com.nos.helios;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.solariteBlock, 1), "XXX", "XXX", "XXX", 'X', ModItems.solariteIngot);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.solariteIngot, 9), ModBlocks.solariteBlock);
    }

}
