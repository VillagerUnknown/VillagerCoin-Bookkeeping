package me.villagerunknown.bookkeeping;

import me.villagerunknown.bookkeeping.feature.ReceiptItemsFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Bookkeeping implements ModInitializer {
	
	public static PlatformMod<BookkeepingConfigData> MOD = Platform.register("bookkeeping", Bookkeeping.class, BookkeepingConfigData.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	public static BookkeepingConfigData CONFIG = MOD.getConfig();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "ReceiptItemsFeature", ReceiptItemsFeatureLoader::execute );
	}
	
}
