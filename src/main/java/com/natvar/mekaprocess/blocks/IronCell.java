package com.natvar.mekaprocess.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class IronCell extends BlockBase {

	public IronCell(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
