package com.nos.helios;

import com.nos.helios.blocks.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    public static IngotBlock solariteBlock;
    public static BasicBlock eboniteBlock;
    public static BasicBlock ivoriteBlock;
    public static BasicBlock meteoriteBlock;

    public static BasicBlock machineCasing;
    public static MachineProjector machineProjector;

    public static ReactorRing reactorRing;

    public static void init() {
        solariteBlock = new IngotBlock("solarite_block");
        eboniteBlock = new IngotBlock("ebonite_block");
        ivoriteBlock = new IngotBlock("ivorite_block");
        meteoriteBlock = new IngotBlock("meteorite_block");

        machineCasing = new BasicBlock(Material.IRON, "machine_casing");
        machineProjector = new MachineProjector();

        reactorRing = new ReactorRing("reactor_ring");
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        solariteBlock.initModel();
        eboniteBlock.initModel();
        ivoriteBlock.initModel();
        meteoriteBlock.initModel();

        machineCasing.initModel();
        machineProjector.initModel();

        reactorRing.initModel();
    }
}
