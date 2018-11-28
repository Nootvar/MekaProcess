package com.natvar.mekaprocess.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UltimateLightsource extends BlockBase {

	public UltimateLightsource(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.GLASS);
		setHardness(1.0F);
		setResistance(2.0F);
		setLightLevel(20.0F);
		setLightOpacity(1);
		}

}
