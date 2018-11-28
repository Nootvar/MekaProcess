package com.natvar.mekaprocess.init;

import java.util.ArrayList;
import java.util.List;

import com.natvar.mekaprocess.blocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block IRON_CELL = new IronCell("iron_cell", Material.IRON);
	public static final Block GOLD_CELL = new GoldCell("gold_cell", Material.IRON);
	public static final Block DIAMOND_CELL = new DiamondCell("diamond_cell", Material.IRON);
	public static final Block OBSIDIAN_CELL = new ObsidianCell("obsidian_cell", Material.IRON);
	
	public static final Block QUARTZ_SHELL = new BlockBase("quartz_shell", Material.IRON);
	public static final Block QUARTZ_CONTROLLER = new BlockBase("quartz_controller", Material.IRON);
	
	public static final Block ULTIMATE_LIGHTSOURCE = new UltimateLightsource("ultimate_lightsource", Material.GLASS);
	
}
