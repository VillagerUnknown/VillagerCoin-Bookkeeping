package me.villagerunknown.bookkeeping;

import me.villagerunknown.bookkeeping.feature.LedgerItemsFeatureLoader;
import me.villagerunknown.bookkeeping.feature.ReceiptItemsFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Bookkeeping implements ModInitializer {
	
	public static PlatformMod<?> MOD = Platform.register("bookkeeping", Bookkeeping.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	
	@Override
	public void onInitialize() {
		// # Initialize mod with Platform
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "receiptItemsFeature", ReceiptItemsFeatureLoader::execute );
		featureManager.addFeature( "ledgerItemsFeature", LedgerItemsFeatureLoader::execute );
		
		// # Load Features
		featureManager.loadFeatures();
	}
	
}
