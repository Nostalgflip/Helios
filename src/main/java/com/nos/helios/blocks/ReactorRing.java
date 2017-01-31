package com.nos.helios.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;

public class ReactorRing extends BasicBlock {
    public static PropertyDirection FACING = PropertyDirection.create("facing");

    public ReactorRing(String name) {
        super(Material.IRON, name);
    }

    //Se på https://github.com/RootsTeam/Embers sine pipes for å forstå hvordan man håndterer connectivity

}
