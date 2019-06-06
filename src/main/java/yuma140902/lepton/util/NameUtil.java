package yuma140902.lepton.util;

import yuma140902.lepton.ModLepton;

public final class NameUtil {
	private NameUtil() {}
	
	public static String getDomainedTextureName(String name) {
		return ModLepton.MOD_TEXTURE_DOMAIN + ":" + name;
	}
	
	public static String getDomainedUnlocalizedEntry(String name) {
		return ModLepton.MOD_UNLOCALIZED_ENTRY_DOMAIN + "." + name;
	}
}
