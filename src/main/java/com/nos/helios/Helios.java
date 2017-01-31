package com.nos.helios;

import com.nos.helios.tileentity.TileEntityElectrolyzer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Helios.MOD_ID, name = Helios.MOD_NAME, version = Helios.VERSION)
public class Helios {
    public static final String MOD_ID = "helios";
    public static final String MOD_NAME = "Helios";
    public static final String VERSION = "0.0.1";

    public static final TabHelios tabHelios = new TabHelios("tabHelios");

    @Mod.Instance(Helios.MOD_ID)
    public static Helios instance;

    @SidedProxy
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        this.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        this.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        this.proxy.postInit(e);
    }


    public static class CommonProxy {
        public void preInit(FMLPreInitializationEvent e) {
            // Initialization of blocks and items typically goes here:
            ModBlocks.init();
            ModItems.init();
            ModCrafting.init();
            GameRegistry.registerTileEntity(TileEntityElectrolyzer.class, MOD_ID + "TileEntityElectrolyzer");
        }

        public void init(FMLInitializationEvent e) {

        }

        public void postInit(FMLPostInitializationEvent e) {

        }
    }


    public static class ClientProxy extends CommonProxy {
        @Override
        public void preInit(FMLPreInitializationEvent e) {
            super.preInit(e);
            // Typically initialization of models and such goes here:
            ModBlocks.initModels();
            ModItems.initModels();
        }
    }

    public static class ServerProxy extends CommonProxy {

    }
}
