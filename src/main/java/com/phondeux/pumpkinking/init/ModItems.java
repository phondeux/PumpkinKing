package com.phondeux.pumpkinking.init;

import com.phondeux.pumpkinking.item.ItemPK;
import com.phondeux.pumpkinking.item.ItemSwizzle;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Glenn on 8/14/2014.
 */
public class ModItems {
    public static final ItemPK swizzle = new ItemSwizzle();

    public static void init() {
        GameRegistry.registerItem(swizzle, "swizzle");
    }

}
