package me.villagerunknown.bookkeeping.feature;

import me.villagerunknown.villagercoin.item.LedgerItem;
import net.minecraft.world.item.Item;
import me.villagerunknown.bookkeeping.item.LedgerItems;
import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.feature.LedgerFeature;

public class LedgerItemsFeature {

	public static void execute(){
		new LedgerItems();
	}
	
	public static Item registerLedgerItem( String id, Item.Properties settings ) {
		return LedgerFeature.registerLedger( Villagercoin.MOD_ID, id, settings );
	}
	
	public static Item registerCraftableLedgerItem( String id, Item.Properties settings ) {
		return LedgerFeature.registerCraftableLedger( Villagercoin.MOD_ID, id, settings );
	}
	
}
