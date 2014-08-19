package com.phondeux.pumpkinking.block;

/**
 * Created by Glenn on 8/19/2014.
 */
public class BlockBone extends BlockPK {
    public BlockBone(){
        super();
        this.setBlockName("boneblock");
        this.setStepSound(soundTypeGlass);
        this.setHardness(0.3F);
        this.setBlockTextureName("boneblock");
    }
}
