package me.villagerunknown.bookkeeping;

import me.villagerunknown.bookkeeping.feature.LedgerItemsFeature;
import me.villagerunknown.bookkeeping.feature.ReceiptItemsFeature;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import me.villagerunknown.villagercoin.Villagercoin;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Bookkeeping implements ModInitializer {
	
	public static PlatformMod<?> MOD = Platform.register("bookkeeping", Bookkeeping.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	
	@Override
	public void onInitialize() {
		// # Load Villager Coin
		Villagercoin.load();
		
		// # Initialize addon mod with Platform
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "receipt-items", ReceiptItemsFeature::execute );
		featureManager.addFeature( "ledger-items", LedgerItemsFeature::execute );
		
		// # Load Features
		featureManager.loadFeatures();
	}
	
}
