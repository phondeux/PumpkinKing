package com.phondeux.pumpkinking.creativetab;

//import com.phondeux.pumpkinking.init.ModItems;
import com.phondeux.pumpkinking.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Glenn on 8/19/2014.
 */
public class CreativeTabPK {
    public static final CreativeTabs PK_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return Item.getItemById(91);
        }
    };
}
