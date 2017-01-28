	package net.oaster2000.newmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item hammer;
	public static Item dStone;
	public static Item dGem;
	public static Item dCrystal;
	public static Item pCrystal;
	public static Item fCrystal;
	public static Item hCrystal;
	public static Item battery;
	public static Item ironDust;
	public static Item goldDust;
	public static Item dDust;
	public static Item stringUniverse;
	public static Item matter;
	public static Item bronze;
	public static Item copper;
	public static Item silver;
	public static Item tin;
	public static Item bronzeDust;
	public static Item copperDust;
	public static Item silverDust;
	public static Item tinDust;
	public static Item bronzePlate;
	public static Item copperPlate;
	public static Item silverPlate;
	public static Item tinPlate;
	public static Item ironPlate;
	public static Item goldPlate;
	
	public static void createItems(){
		hammer = register(new HammerItem("hammer"));
		dStone = register(new BasicItem("dStone"));
		dGem = register(new BasicItem("dGem"));
		dCrystal = register(new CrystalItem("dCrystal"));
		pCrystal = register(new CrystalItem("pCrystal"));
		fCrystal = register(new CrystalItem("fCrystal"));
		hCrystal = register(new CrystalItem("hCrystal"));
		battery = register(new ElectricItem("battery"));
		ironDust = register(new BasicItem("ironDust"));
		goldDust = register(new BasicItem("goldDust"));
		dDust = register(new BasicItem("dDust"));
		stringUniverse = register(new StringItem("stringUniverse"));
		matter = register(new BasicItem("matter"));
		bronze = register(new BasicItem("bronze"));
		copper = register(new BasicItem("copper"));
		silver = register(new BasicItem("silver"));
		tin = register(new BasicItem("tin"));
		bronzeDust = register(new BasicItem("bronzeDust"));
		copperDust = register(new BasicItem("copperDust"));
		silverDust = register(new BasicItem("silverDust"));
		tinDust = register(new BasicItem("tinDust"));
		bronzePlate = register(new BasicItem("bronzePlate"));
		copperPlate = register(new BasicItem("copperPlate"));
		silverPlate = register(new BasicItem("silverPlate"));
		tinPlate = register(new BasicItem("tinPlate"));
		ironPlate = register(new BasicItem("ironPlate"));
		goldPlate = register(new BasicItem("goldPlate"));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		return item;
}
	
}
