package com.phondeux.pumpkinking;

import com.phondeux.pumpkinking.handler.ConfigurationHandler;
import com.phondeux.pumpkinking.init.ModItems;
import com.phondeux.pumpkinking.proxy.IProxy;
import com.phondeux.pumpkinking.reference.Reference;
import com.phondeux.pumpkinking.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
/**
 * Created by Glenn on 8/13/2014.
 */
public class PumpkinKing {
    @Mod.Instance(Reference.MOD_ID)
    public static PumpkinKing instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    /*
    Network handling, mod configuration, intialize item and blocks
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();
    }

    /*
    register gui, tile entities, crafting recipes, etc
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        LogHelper.info("Initialization Complete!");

    }

    /*
    Anything to be run after other mods have intialize
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete!");

    }
}
