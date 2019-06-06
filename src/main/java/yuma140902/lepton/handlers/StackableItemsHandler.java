package yuma140902.lepton.handlers;

import net.minecraft.init.Items;
import yuma140902.lepton.config.ModConfigCore;

public class StackableItemsHandler {
	public static void init() {
		final int stacksizeMinecarts = ModConfigCore.Props.stackableItemsMinecarts.getInt();
		Items.minecart.setMaxStackSize(stacksizeMinecarts);
		Items.chest_minecart.setMaxStackSize(stacksizeMinecarts);
		Items.command_block_minecart.setMaxStackSize(stacksizeMinecarts);
		Items.furnace_minecart.setMaxStackSize(stacksizeMinecarts);
		Items.hopper_minecart.setMaxStackSize(stacksizeMinecarts);
		Items.tnt_minecart.setMaxStackSize(stacksizeMinecarts);
		
		final int stacksizeSaddles = ModConfigCore.Props.stackableItemsSaddles.getInt();
		Items.saddle.setMaxStackSize(stacksizeSaddles);
		
		final int stacksizeStew = ModConfigCore.Props.stackableItemsStew.getInt();
		Items.mushroom_stew.setMaxStackSize(stacksizeStew);
		
		final int stacksizeBucket = ModConfigCore.Props.stackableItemsBucket.getInt();
		Items.bucket.setMaxStackSize(stacksizeBucket);
//		Items.lava_bucket.setMaxStackSize(stacksizeBucket);
//		Items.milk_bucket.setMaxStackSize(stacksizeBucket);
//		Items.water_bucket.setMaxStackSize(stacksizeBucket);
	}
}
