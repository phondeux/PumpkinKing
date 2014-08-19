package com.phondeux.pumpkinking.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Glenn on 8/19/2014.
 */
public class Recipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.swizzle), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.boneblock), "bbb", "bbb","bbb", 'b', new ItemStack(Items.bone));
    }
}
