package com.nos.helios;

import com.nos.helios.items.BasicItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public final class ModItems {

    /* might be better to do something like this later
    public static ArrayList<Block> blocks = new ArrayList<Block>();
    public static ArrayList<Item> items = new ArrayList<Item>();
     */

    public static BasicItem solariteIngot;
    public static BasicItem cosmiciteDust;
    public static BasicItem astraliteIngot;
    public static BasicItem meteoriteIngot;
    public static BasicItem darksteelIngot;
    public static BasicItem gemRed;
    public static BasicItem gemOrange;
    public static BasicItem gemYellow;
    public static BasicItem gemCosmic;

    public static void init() {
        solariteIngot = new BasicItem("solarite_ingot");
        cosmiciteDust = new BasicItem("cosmicite_dust");
        astraliteIngot = new BasicItem("astralite_ingot");
        meteoriteIngot = new BasicItem("meteorite_ingot");
        darksteelIngot = new BasicItem("darksteel_ingot");
        gemRed = new BasicItem("gem_red");
        gemOrange = new BasicItem("gem_orange");
        gemYellow = new BasicItem("gem_yellow");
        gemCosmic = new BasicItem("gem_cosmic");

        //Ore Dict
        OreDictionary.registerOre("ingotSolarite", new ItemStack(solariteIngot));
        OreDictionary.registerOre("dustCosmicite", new ItemStack(cosmiciteDust));
        OreDictionary.registerOre("ingotAstralite", new ItemStack(astraliteIngot));
        OreDictionary.registerOre("ingotMeteorite", new ItemStack(meteoriteIngot));
        OreDictionary.registerOre("ingotDarksteel", new ItemStack(darksteelIngot));
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        solariteIngot.initModel();
        cosmiciteDust.initModel();
        astraliteIngot.initModel();
        meteoriteIngot.initModel();
        darksteelIngot.initModel();
        gemRed.initModel();
        gemOrange.initModel();
        gemYellow.initModel();
        gemCosmic.initModel();
    }
}
