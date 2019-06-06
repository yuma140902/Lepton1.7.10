package yuma140902.lepton.recipes;

import yuma140902.lepton.handlers.ClayConversionHandler;
import yuma140902.lepton.handlers.DyeAnyWoolHandler;

public class Recipes {
	private Recipes() {}
	
	public static void register() {
		ClayConversionHandler.registerRecipe();
		DyeAnyWoolHandler.registerRecipes();
	}
}
