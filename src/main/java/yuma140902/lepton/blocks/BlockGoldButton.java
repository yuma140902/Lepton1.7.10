package yuma140902.lepton.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import yuma140902.lepton.registry.IRegisterable;
import yuma140902.lepton.util.NameUtil;

public class BlockGoldButton extends BlockModButton implements IRegisterable {

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
	
}
