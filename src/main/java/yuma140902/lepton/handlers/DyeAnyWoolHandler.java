package yuma140902.lepton.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import yuma140902.lepton.config.ModConfigCore;
import yuma140902.lepton.util.ColorUtil;
import yuma140902.lepton.util.LeptonProperties;

public class DyeAnyWoolHandler {
	public static void init() {
		for(int meta = 0; meta < 16; ++meta) {
			OreDictionary.registerOre(LeptonProperties.OREDICT_WOOL, new ItemStack(Blocks.wool, 0, meta));
		}
	}
	
	public static void registerRecipes() {
		if(!ModConfigCore.Props.dyeAnyWool.getBoolean()) {
			return;
		}
		
		final String wool = LeptonProperties.OREDICT_WOOL;
		for(int meta = 0; meta < 16; ++meta) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(
					new ItemStack(Blocks.wool, 8, meta),
					wool, wool, wool, 
					wool, wool, wool, 
					wool, wool, "dye" + ColorUtil.metaToDyeName(meta)
					));
		}
	}
	
}
