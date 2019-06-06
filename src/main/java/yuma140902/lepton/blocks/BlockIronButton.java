package yuma140902.lepton.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import yuma140902.lepton.registry.IRegisterable;
import yuma140902.lepton.util.NameUtil;

public class BlockIronButton extends BlockModButton implements IRegisterable {
	
	public BlockIronButton() {
		super(100);
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return Blocks.iron_block.getIcon(side, meta);
	}
	
	@Override
	public void register() {
		setBlockName(NameUtil.getDomainedUnlocalizedEntry("iron_button"));
		setBlockTextureName(NameUtil.getDomainedTextureName("iron_button"));
		GameRegistry.registerBlock(this, "iron_button");
	}
}
