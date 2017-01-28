package net.oaster2000.newmod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.oaster2000.newmod.Main;
import net.oaster2000.newmod.blocks.ModBlocks;
import net.oaster2000.newmod.items.ModItems;

public class TutorialTab extends CreativeTabs{

	public TutorialTab() {
		super(Main.MODID);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.gen);
	}
	
}
