package yuma140902.lepton.recipes;

import java.util.Iterator;
import net.minecraft.block.Block;
import yuma140902.lepton.handlers.ClayConversionHandler;
import yuma140902.lepton.handlers.DyeAnyWoolHandler;
import yuma140902.lepton.registry.MyBlocks;

public class Recipes {
	private Recipes() {}
	
	public static void register() {
		ClayConversionHandler.registerRecipe();
		DyeAnyWoolHandler.registerRecipes();
		
		Iterator<Block> iter = MyBlocks.iterator();
		while (iter.hasNext()) {
			Block block = iter.next();
			if(block instanceof IHasRecipe) {
				((IHasRecipe) block).registerRecipe();
			}
		}
	}
}
