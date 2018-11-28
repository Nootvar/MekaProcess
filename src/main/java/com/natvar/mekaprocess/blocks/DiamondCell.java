package com.natvar.mekaprocess.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DiamondCell extends BlockBase {

	public DiamondCell(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(6.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
	}

}
