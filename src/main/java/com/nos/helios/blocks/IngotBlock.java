package com.nos.helios.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class IngotBlock extends BasicBlock {
    public IngotBlock(String name) {
        super(Material.IRON, name);
    }

    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon){
        return true;
    }
}
