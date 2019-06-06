package yuma140902.lepton.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;
import yuma140902.lepton.config.ModConfigCore;
import yuma140902.lepton.dispense.DispenseBehaviorBase;

public class DispenserPlantingHandler {
	public static void init() {
		if(!ModConfigCore.Props.dispenserPlanting.getBoolean()) {
			return;
		}
		
		DispenseBehaviorPlanting planting = new DispenseBehaviorPlanting();
		BlockDispenser.dispenseBehaviorRegistry.putObject(Items.wheat_seeds, planting);
		BlockDispenser.dispenseBehaviorRegistry.putObject(Items.pumpkin_seeds, planting);
		BlockDispenser.dispenseBehaviorRegistry.putObject(Items.melon_seeds, planting);
		BlockDispenser.dispenseBehaviorRegistry.putObject(Items.carrot, planting);
		BlockDispenser.dispenseBehaviorRegistry.putObject(Items.potato, planting);
		BlockDispenser.dispenseBehaviorRegistry.putObject(Items.nether_wart, planting);
	}
	
	private static class DispenseBehaviorPlanting extends DispenseBehaviorBase {

		@Override
		protected boolean doDispense(World world, EnumFacing facing, int x, int y, int z, ItemStack itemstack) {
			int plantX = x + facing.getFrontOffsetX();
			int plantY = y + facing.getFrontOffsetY();
			int plantZ = z + facing.getFrontOffsetZ();
			
			if(world.getBlock(plantX, plantY, plantZ) != Blocks.air) {
				return false;
			}
			
			Item item = itemstack.getItem();
			Block blockPlantOn = world.getBlock(plantX, plantY-1, plantZ);
			
			if(item instanceof IPlantable) {
				IPlantable plantableItem = (IPlantable)item;
				Block plant = plantableItem.getPlant(world, plantX, plantY, plantZ);
				int plantMeta = plantableItem.getPlantMetadata(world, plantX, plantY, plantZ);
				
				if(canPlantAt(world, plantX, plantY, plantZ, plantableItem)) {
					world.setBlock(plantX, plantY, plantZ, plant, plantMeta, 3);
					return true;
				}
			}
			
			
			return false;
		}
		
		private static boolean canPlantAt(World world, int x, int y, int z, IPlantable plantable) {
			Block blockPlantAt = world.getBlock(x, y, z);
			Block blockPlantOn = world.getBlock(x, y-1, z);
			return blockPlantAt == Blocks.air && blockPlantOn.canSustainPlant(world, x, y, z, ForgeDirection.UP, plantable);
		}
		
	}
}
