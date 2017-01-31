package com.nos.helios.blocks;

import com.nos.helios.tileentity.TileEntityElectrolyzer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class MachineElectrolyzer implements ITileEntityProvider {
    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityElectrolyzer();
    }
}
