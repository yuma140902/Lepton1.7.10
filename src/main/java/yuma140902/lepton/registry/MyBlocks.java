package yuma140902.lepton.registry;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Block;
import yuma140902.lepton.blocks.BlockObsidianPressurePlate;

public final class MyBlocks {
	private MyBlocks() {}
	
	public static void register() {
		Iterator<Block> iter = iterator();
		while (iter.hasNext()) {
			Block block = iter.next();
			if(block instanceof IRegisterable) {
				((IRegisterable) block).register();
			}
		}
	}
	
	public static Iterator<Block> iterator(){
		return list.iterator();
	}
	
	private static final ArrayList<Block> list = new ArrayList<Block>();
	
	public static final BlockObsidianPressurePlate obsidianPressurePlate = new BlockObsidianPressurePlate();
	
	static {
		list.add(obsidianPressurePlate);
	}
}
