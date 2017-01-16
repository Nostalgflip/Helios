package com.nos.helios;

import com.nos.helios.blocks.BasicBlock;
import com.nos.helios.blocks.BasicStair;
import com.nos.helios.blocks.IngotBlock;
import com.nos.helios.blocks.ReactorRing;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    public static IngotBlock solariteBlock;
    public static BasicBlock structureBlock;
    public static BasicBlock plateBlock;
    public static BasicStair structureStair;
    public static ReactorRing reactorRing;

    public static void init() {
        solariteBlock = new IngotBlock("solarite_block");
        structureBlock = new BasicBlock(Material.IRON, "structure_block");
        structureStair = new BasicStair(structureBlock);
        plateBlock = new BasicBlock(Material.IRON, "plate_block");
        reactorRing = new ReactorRing("reactor_ring");
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        solariteBlock.initModel();
        structureBlock.initModel();
        plateBlock.initModel();
        //structureStair.initModel();
    }
}
