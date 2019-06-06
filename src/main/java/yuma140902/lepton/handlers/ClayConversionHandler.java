package yuma140902.lepton.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import yuma140902.lepton.config.ModConfigCore;

public class ClayConversionHandler {
	public static void registerRecipe() {
		if(!ModConfigCore.Props.clayConversion.getBoolean()) {
			return;
		}
		
		GameRegistry.addShapelessRecipe(
				new ItemStack(Items.clay_ball, 4),
				Blocks.clay
		);
	}
}
