package com.phondeux.pumpkinking.init;

import com.phondeux.pumpkinking.item.ItemPK;
import com.phondeux.pumpkinking.item.ItemSwizzle;
import com.phondeux.pumpkinking.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Glenn on 8/14/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemPK swizzle = new ItemSwizzle();

    public static void init() {
        GameRegistry.registerItem(swizzle, "swizzle");
    }

}
