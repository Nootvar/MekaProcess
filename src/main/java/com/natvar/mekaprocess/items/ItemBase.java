package com.natvar.mekaprocess.items;

import com.natvar.mekaprocess.MekaProcess;
import com.natvar.mekaprocess.init.ModItems;
import com.natvar.mekaprocess.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MekaProcess.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	
}
