package com.nos.helios.blocks;

import com.nos.helios.tileentity.TileEntityElectrolyzer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class MachineElectrolyzer extends MachineBase implements ITileEntityProvider {
    public MachineElectrolyzer(Material materialIn, String name) {
        super(name);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityElectrolyzer();
    }
}
