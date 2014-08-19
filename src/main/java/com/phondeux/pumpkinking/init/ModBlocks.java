package com.phondeux.pumpkinking.init;

import com.phondeux.pumpkinking.block.BlockBone;
import com.phondeux.pumpkinking.block.BlockPK;
import com.phondeux.pumpkinking.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Glenn on 8/19/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockPK boneblock = new BlockBone();

    public static void init() {
        GameRegistry.registerBlock(boneblock, "boneblock");
    }
}
