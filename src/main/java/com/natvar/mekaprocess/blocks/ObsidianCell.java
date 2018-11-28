package com.natvar.mekaprocess.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ObsidianCell extends BlockBase {

	public ObsidianCell(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(30.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 3);
	}

}
