package yuma140902.lepton.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import yuma140902.lepton.config.ModConfigCore;
import yuma140902.lepton.util.ColorUtil;
import yuma140902.lepton.util.LeptonProperties;

public class Recipes {
	private Recipes() {}
	
	public static void register() {
		if(ModConfigCore.Props.clayConversion.getBoolean()) {
			GameRegistry.addShapelessRecipe(
					new ItemStack(Items.clay_ball, 4),
					Blocks.clay
			);
		}
		
		if(ModConfigCore.Props.dyeAnyWool.getBoolean()) {
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
}
