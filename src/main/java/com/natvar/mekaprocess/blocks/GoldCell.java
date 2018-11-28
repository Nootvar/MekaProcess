package com.natvar.mekaprocess.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GoldCell extends BlockBase {

	public GoldCell(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
