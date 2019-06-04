package yuma140902.lepton.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import yuma140902.lepton.ModLepton;
import yuma140902.lepton.config.ModConfigCore;

public class ModConfigGui extends GuiConfig {
	public ModConfigGui(GuiScreen parent) {
		super(parent, (new ConfigElement<Object>(ModConfigCore.cfg.getCategory(ModConfigCore.CATEGORY_GENERAL))).getChildElements(), ModLepton.MOD_ID, false, false, ModLepton.MOD_NAME);
	}
}
