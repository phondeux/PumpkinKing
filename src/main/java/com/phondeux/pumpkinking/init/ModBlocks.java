package com.phondeux.pumpkinking.init;

import com.phondeux.pumpkinking.block.BlockBone;
import com.phondeux.pumpkinking.block.BlockPK;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Glenn on 8/19/2014.
 */
public class ModBlocks {
    public static final BlockPK boneblock = new BlockBone();

    public static void init() {
        GameRegistry.registerBlock(boneblock, "boneblock");
    }
}
