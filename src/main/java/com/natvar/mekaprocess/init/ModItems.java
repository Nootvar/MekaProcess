package com.natvar.mekaprocess.init;

import java.util.ArrayList;
import java.util.List;

import com.natvar.mekaprocess.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<>();
	
	public static final Item IRON_STRUCT = new ItemBase("iron_struct");
	public static final Item GOLD_STRUCT = new ItemBase("gold_struct");
	public static final Item DIAMOND_STRUCT = new ItemBase("diamond_struct");
	public static final Item OBSIDIAN_STRUCT = new ItemBase("obsidian_struct");
	
}
