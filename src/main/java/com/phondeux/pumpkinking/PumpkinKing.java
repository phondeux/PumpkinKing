package com.phondeux.pumpkinking;

import com.phondeux.pumpkinking.proxy.IProxy;
import com.phondeux.pumpkinking.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
/**
 * Created by Glenn on 8/13/2014.
 */
public class PumpkinKing {
    @Mod.Instance("PumpkinKing")
    public static PumpkinKing instance;

    @SidedProxy(clientSide = "com.phondeux.pumpkinking.proxy.ClientProxy", serverSide = "com.phondeux.pumpkinking.proxy.ServerProxy")
    public static IProxy proxy;

    /*
    Network handling, mod configuration, intialize item and blocks
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    /*
    register gui, tile entities, crafting recipes, etc
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    /*
    Anything to be run after other mods have intialize
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
