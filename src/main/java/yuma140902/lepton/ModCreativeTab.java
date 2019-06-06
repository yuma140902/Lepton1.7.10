package yuma140902.lepton;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import yuma140902.lepton.registry.MyBlocks;

public class ModCreativeTab extends CreativeTabs {

	public ModCreativeTab() {
		super(ModLepton.MOD_ID);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Item.getItemFromBlock(MyBlocks.obsidianPressurePlate);
	}
	
}
