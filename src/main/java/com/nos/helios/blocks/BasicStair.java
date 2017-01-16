package com.nos.helios.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BasicStair extends BlockStairs {
    public BasicStair(BasicBlock baseBlock) {
        super(baseBlock.getDefaultState());
        setUnlocalizedName(baseBlock.getUnlocalizedName().split("_")[0] + "_stair");
        useNeighborBrightness = true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
