package yuma140902.lepton.event_handlers;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import yuma140902.lepton.ModLepton;
import yuma140902.lepton.config.ModConfigCore;

public class CommonEventHandler {
	private CommonEventHandler() {}
	
	public static final CommonEventHandler INSTANCE = new CommonEventHandler();
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if(ModLepton.MOD_ID.equals(event.modID))
			ModConfigCore.syncConfig();
	}
}
