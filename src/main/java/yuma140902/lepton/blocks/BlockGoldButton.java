package yuma140902.lepton.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import yuma140902.lepton.recipes.IHasRecipe;
import yuma140902.lepton.registry.IRegisterable;
import yuma140902.lepton.util.NameUtil;

public class BlockGoldButton extends BlockModButton implements IRegisterable, IHasRecipe {

	public BlockGoldButton() {
		super(4);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return Blocks.gold_block.getIcon(side, meta);
	}
	
	@Override
	public void register() {
		setBlockName(NameUtil.getDomainedUnlocalizedEntry("gold_button"));
		setBlockTextureName(NameUtil.getDomainedTextureName("gold_button"));
		GameRegistry.registerBlock(this, "gold_button");
	}
	
	@Override
	public void registerRecipe() {
		GameRegistry.addShapelessRecipe(
				new ItemStack(this),
				Blocks.wooden_button, Items.gold_ingot
				);
	}
	
}
