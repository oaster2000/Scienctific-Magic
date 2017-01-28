package net.oaster2000.newmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.oaster2000.newmod.Main;

public final class ModBlocks {

	public static Block firstBlock;
	public static Block dStone_ore;
	public static Block dStone_ore_nether;
	public static Block aCrucible;
	public static Block macerator;
	public static Block macerator_ON;
	public static Block furnace;
	public static Block furnace_on;
	public static Block gen;
	public static Block gen_on;
	public static Block wire;
	public static Block sunGen;
	public static Block sunGen_on;
	public static Block copperOre;
	public static Block tinOre;
	public static Block silverOre;
	public static Block deCon;
	public static Block deCon_on;
	
	public static void createBlocks(){
		firstBlock = register(new StrongBlock("firstBlock"));
		dStone_ore = register(new StoneOreBlock("dStone_ore"));
		dStone_ore_nether = register(new NetherOreBlock("dStone_ore_nether"));
		aCrucible = register(new CrucibleBlock("aCrucible"));
		macerator = register(new MaceratorBlock(false, "macerator")).setCreativeTab(Main.creativeTab);
		macerator_ON = register(new MaceratorBlock(true, "macerator_on"));
		gen = register(new GeneratorBlock(false, "gen")).setCreativeTab(Main.creativeTab);
		gen_on = register(new GeneratorBlock(true, "gen_on"));
		wire = register(new WireBlock("wire"));
		sunGen = register(new SolarGeneratorBlock(false, "sunGen")).setCreativeTab(Main.creativeTab);
		sunGen_on = register(new SolarGeneratorBlock(true, "sunGen_on"));
		furnace = register(new ElectricFurnaceBlock(false, "furnaceEl")).setCreativeTab(Main.creativeTab);
		furnace_on = register(new ElectricFurnaceBlock(true, "furnaceEl_on"));
		copperOre = register(new StoneOreBlock("copperOre"));
		tinOre = register(new StoneOreBlock("tinOre"));
		silverOre = register(new StoneOreBlock("silverOre"));
		deCon = register(new DeconstructorBlock(false, "deCon")).setCreativeTab(Main.creativeTab);
		deCon_on = register(new DeconstructorBlock(true, "deCon_on"));
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		if (itemBlock != null) {
			GameRegistry.register(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
}
	
}
