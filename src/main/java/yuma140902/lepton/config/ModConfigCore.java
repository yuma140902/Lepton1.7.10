package yuma140902.lepton.config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import yuma140902.lepton.integration.IntegrationConfigs;

public class ModConfigCore {
	public static final String
		CATEGORY_GENERAL = "General",
		CATEGORY_TWEAKS = getSubCategory("Tweaks");
	
	public static final String
		CONFIG_PROP_LANGKEY = "config.lepton.prop.",
		CONFIG_CATEGORY_LANGKEY = "config.lepton.category.";
	
	public static Configuration cfg;
	
	public static class Props {
		public static Property clayConversion;
		public static Property dyeAnyWool;
	}
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		cfg = new Configuration(event.getSuggestedConfigurationFile(), true);
		initConfig();
		syncConfig();
		wrapConfig();
	}
	
	private static void initConfig() {
		// General
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "Settings of UpToDateMod");
		cfg.setCategoryLanguageKey(CATEGORY_GENERAL, getCategoryLangkey("general"));
		cfg.setCategoryRequiresMcRestart(CATEGORY_GENERAL, true);
		
		// Tweaks
		cfg.addCustomCategoryComment(CATEGORY_TWEAKS, "Enable/Disable tweaking features");
		cfg.setCategoryRequiresMcRestart(CATEGORY_TWEAKS, true);
		
		IntegrationConfigs.initConfig(cfg);
	}
	
	public static void syncConfig() {
		
		// Tweaks
		Props.clayConversion = cfg.get(CATEGORY_TWEAKS, "Clay Conversion", true, "Add clay conversion recipe");
		Props.dyeAnyWool = cfg.get(CATEGORY_TWEAKS, "Dye Any Wool", true, "Add dye recipe for any colored wool");
		
		IntegrationConfigs.syncConfig(cfg);
		
		cfg.save();
	}
	
	private static void wrapConfig() {
		IntegrationConfigs.wrapConfig(cfg);
	}
	
	
	public static String getSubCategory(String subCategory) {
		return CATEGORY_GENERAL + "." + subCategory;
	}
	
	public static String getCategoryLangkey(String key) {
		return CONFIG_CATEGORY_LANGKEY + key;
	}
	
	public static String getPropertyLangkey(String key) {
		return CONFIG_PROP_LANGKEY + key;
	}
}
