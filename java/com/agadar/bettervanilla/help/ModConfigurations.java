package com.agadar.bettervanilla.help;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/** Manages this mod's configuration options. */
public class ModConfigurations 
{
	// Retrieved values from the configuration file
	public static boolean Apples;
	public static double ApplesRate;
	public static boolean BoneMeal;
	public static boolean BookShelves;
	public static boolean Cacti;
	public static boolean CauldronsWash;
	public static boolean CauldronsContent;
	public static boolean CheaperHoppers;
	public static boolean ColoredBeds;
	public static boolean CraftableClay;
	public static boolean CraftableCobwebs;
	public static boolean CraftableEndstone;
	public static boolean CraftableFlint;
	public static boolean CraftableGrass;
	public static boolean CraftableRottenFlesh;
	public static boolean CraftableSlimeBalls;
	public static boolean Dispensers;
	public static boolean Doors;
	public static boolean EnderChests;
	public static boolean HorseArmor;
	public static boolean Ice;
	public static boolean MobFilter;
	public static String[] MobFilterList;
	public static boolean MoreArmor;
	public static boolean MorePotions;
	public static boolean MossStone;
	public static boolean Nametags;
	public static boolean PluckableChickens;
	public static boolean RottenFleshToLeather;
	public static boolean HardLeatherRecipe;
	public static boolean OtherMeats;
	public static boolean Saddles;
	public static boolean SmeltableItems;
	
	/** Loads and stores the configuration options from the configuration file. */
	public static void loadConfigurations(File file)
	{
		Properties props = new Properties();
		
		// Load existing properties file if it exists
		if (file != null && file.exists()) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
				props.load(fis);
			} catch (IOException e) {
				// use defaults on error
			} finally {
				if (fis != null) {
					try { fis.close(); } catch (IOException e) { /* ignore */ }
				}
			}
		}
		
		// Read configuration values with defaults
		Apples = parseBool(props.getProperty("Apples"), true);
		ApplesRate = parseDouble(props.getProperty("ApplesRate"), 5.0) * 2;
		BoneMeal = parseBool(props.getProperty("BoneMeal"), true);
		BookShelves = parseBool(props.getProperty("BookShelves"), true);
		Cacti = parseBool(props.getProperty("Cacti"), true);
		CauldronsWash = parseBool(props.getProperty("CauldronsWash"), true);
		CauldronsContent = parseBool(props.getProperty("CauldronsContent"), true);
		CheaperHoppers = parseBool(props.getProperty("CheaperHoppers"), true);
		ColoredBeds = parseBool(props.getProperty("ColoredBeds"), true);
		CraftableClay = parseBool(props.getProperty("CraftableClay"), true);
		CraftableCobwebs = parseBool(props.getProperty("CraftableCobwebs"), true);
		CraftableEndstone = parseBool(props.getProperty("CraftableEndstone"), true);
		CraftableFlint = parseBool(props.getProperty("CraftableFlint"), true);
		CraftableGrass = parseBool(props.getProperty("CraftableGrass"), true);
		CraftableRottenFlesh = parseBool(props.getProperty("CraftableRottenFlesh"), true);
		CraftableSlimeBalls = parseBool(props.getProperty("CraftableSlimeBalls"), true);
		Dispensers = parseBool(props.getProperty("Dispensers"), true);
		Doors = parseBool(props.getProperty("Doors"), true);
		EnderChests = parseBool(props.getProperty("EnderChests"), true);
		HorseArmor = parseBool(props.getProperty("HorseArmor"), true);
		Ice = parseBool(props.getProperty("Ice"), true);
		MobFilter = parseBool(props.getProperty("MobFilter"), false);
		MobFilterList = parseList(props.getProperty("MobFilterList"), new String[]{"Example1", "Example2", "Example3"});
		MoreArmor = parseBool(props.getProperty("MoreArmor"), true);
		MorePotions = parseBool(props.getProperty("MorePotions"), true);
		MossStone = parseBool(props.getProperty("MossStone"), true);
		Nametags = parseBool(props.getProperty("Nametags"), true);
		PluckableChickens = parseBool(props.getProperty("PluckableChickens"), true);
		RottenFleshToLeather = parseBool(props.getProperty("RottenFleshToLeather"), true);
		HardLeatherRecipe = parseBool(props.getProperty("HardLeatherRecipe"), true);
		OtherMeats = parseBool(props.getProperty("OtherMeats"), true);
		Saddles = parseBool(props.getProperty("Saddles"), true);
		SmeltableItems = parseBool(props.getProperty("SmeltableItems"), true);
		
		// Save configuration back (creates file with defaults if not present)
		if (file != null) {
			props.setProperty("Apples", String.valueOf(Apples));
			props.setProperty("ApplesRate", String.valueOf(ApplesRate / 2.0));
			props.setProperty("BoneMeal", String.valueOf(BoneMeal));
			props.setProperty("BookShelves", String.valueOf(BookShelves));
			props.setProperty("Cacti", String.valueOf(Cacti));
			props.setProperty("CauldronsWash", String.valueOf(CauldronsWash));
			props.setProperty("CauldronsContent", String.valueOf(CauldronsContent));
			props.setProperty("CheaperHoppers", String.valueOf(CheaperHoppers));
			props.setProperty("ColoredBeds", String.valueOf(ColoredBeds));
			props.setProperty("CraftableClay", String.valueOf(CraftableClay));
			props.setProperty("CraftableCobwebs", String.valueOf(CraftableCobwebs));
			props.setProperty("CraftableEndstone", String.valueOf(CraftableEndstone));
			props.setProperty("CraftableFlint", String.valueOf(CraftableFlint));
			props.setProperty("CraftableGrass", String.valueOf(CraftableGrass));
			props.setProperty("CraftableRottenFlesh", String.valueOf(CraftableRottenFlesh));
			props.setProperty("CraftableSlimeBalls", String.valueOf(CraftableSlimeBalls));
			props.setProperty("Dispensers", String.valueOf(Dispensers));
			props.setProperty("Doors", String.valueOf(Doors));
			props.setProperty("EnderChests", String.valueOf(EnderChests));
			props.setProperty("HorseArmor", String.valueOf(HorseArmor));
			props.setProperty("Ice", String.valueOf(Ice));
			props.setProperty("MobFilter", String.valueOf(MobFilter));
			props.setProperty("MobFilterList", joinList(MobFilterList));
			props.setProperty("MoreArmor", String.valueOf(MoreArmor));
			props.setProperty("MorePotions", String.valueOf(MorePotions));
			props.setProperty("MossStone", String.valueOf(MossStone));
			props.setProperty("Nametags", String.valueOf(Nametags));
			props.setProperty("PluckableChickens", String.valueOf(PluckableChickens));
			props.setProperty("RottenFleshToLeather", String.valueOf(RottenFleshToLeather));
			props.setProperty("HardLeatherRecipe", String.valueOf(HardLeatherRecipe));
			props.setProperty("OtherMeats", String.valueOf(OtherMeats));
			props.setProperty("Saddles", String.valueOf(Saddles));
			props.setProperty("SmeltableItems", String.valueOf(SmeltableItems));
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(file);
				props.store(fos, "BetterVanilla Configuration");
			} catch (IOException e) {
				// ignore save failure
			} finally {
				if (fos != null) {
					try { fos.close(); } catch (IOException e) { /* ignore */ }
				}
			}
		}
	}
	
	private static boolean parseBool(String value, boolean defaultValue) {
		if (value == null) return defaultValue;
		return Boolean.parseBoolean(value.trim());
	}
	
	private static double parseDouble(String value, double defaultValue) {
		if (value == null) return defaultValue;
		try {
			return Double.parseDouble(value.trim());
		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}
	
	private static String[] parseList(String value, String[] defaultValue) {
		if (value == null || value.trim().isEmpty()) return defaultValue;
		return value.split(",");
	}
	
	private static String joinList(String[] list) {
		if (list == null || list.length == 0) return "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.length; i++) {
			if (i > 0) sb.append(",");
			sb.append(list[i]);
		}
		return sb.toString();
	}
}
