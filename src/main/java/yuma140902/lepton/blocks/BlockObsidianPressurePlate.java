package yuma140902.lepton.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import yuma140902.lepton.ModLepton;
import yuma140902.lepton.recipes.IHasRecipe;
import yuma140902.lepton.registry.IRegisterable;
import yuma140902.lepton.util.NameUtil;

public class BlockObsidianPressurePlate extends BlockPressurePlate implements IRegisterable, IHasRecipe {

	public BlockObsidianPressurePlate() {
		super("obsidian", Material.rock, Sensitivity.players);
		setHardness(50.0F);
		setResistance(2000.0F);
		setStepSound(soundTypePiston);
		setCreativeTab(ModLepton.MOD_CREATIVETAB);
	}
	
	@Override
	public void register() {
		setBlockName(NameUtil.getDomainedUnlocalizedEntry("obsidian_pressure_plate"));
		setBlockTextureName(NameUtil.getDomainedTextureName("obsidian_pressure_plate"));
		GameRegistry.registerBlock(this, "obsidian_pressure_plate");
	}
	
	@Override
	public void registerRecipe() {
		GameRegistry.addShapedRecipe(
				new ItemStack(this),
				"##",
				'#', Blocks.obsidian
				);
	}
	
}
