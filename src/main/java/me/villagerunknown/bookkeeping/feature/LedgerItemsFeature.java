package me.villagerunknown.bookkeeping.feature;

import me.villagerunknown.villagercoin.item.LedgerItem;
import me.villagerunknown.bookkeeping.item.LedgerItems;
import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.feature.LedgerFeature;
import net.minecraft.item.Item;

public class LedgerItemsFeature {

	public static void execute(){
		new LedgerItems();
	}
	
	public static Item registerLedgerItem( String id, Item.Settings settings ) {
		return LedgerFeature.registerLedger( Villagercoin.MOD_ID, id, new LedgerItem( settings ) );
	}
	
	public static Item registerCraftableLedgerItem( String id, Item.Settings settings ) {
		return LedgerFeature.registerCraftableLedger( Villagercoin.MOD_ID, id, new LedgerItem( settings ) );
	}
	
}
