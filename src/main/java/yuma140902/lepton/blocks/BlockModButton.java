package yuma140902.lepton.blocks;

import net.minecraft.block.BlockButton;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import yuma140902.lepton.ModLepton;

public abstract class BlockModButton extends BlockButton {

	protected int tickRate;
	
	protected BlockModButton(int tickRate) {
		super(false);
		this.tickRate = tickRate;
		setCreativeTab(ModLepton.MOD_CREATIVETAB);
	}
	
	public abstract IIcon getIcon(int side, int meta);
	
	@Override
	public int tickRate(World p_149738_1_) {
		return this.tickRate;
	}
	
}
