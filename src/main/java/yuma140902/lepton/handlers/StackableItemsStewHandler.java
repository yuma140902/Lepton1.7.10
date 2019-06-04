package yuma140902.lepton.handlers;

import javax.annotation.Nonnull;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import yuma140902.lepton.config.ModConfigCore;

public class StackableItemsStewHandler {
	
	private static boolean isEatingStew(@Nonnull PlayerUseItemEvent.Finish event) {
 		return event.item != null && event.item.getItem() == Items.mushroom_stew;
	}
	
	public static void onUseItemFinish(PlayerUseItemEvent.Finish event) {
		if(ModConfigCore.Props.stackableItemsStew.getInt() != 1 && isEatingStew(event)) {
			event.result = event.item;
			
			if(!event.entityPlayer.capabilities.isCreativeMode) {
				event.entityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.bowl, 1));
			}
		}
	}
}
