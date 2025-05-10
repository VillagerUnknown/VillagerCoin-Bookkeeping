package me.villagerunknown.bookkeeping.item;

import me.villagerunknown.bookkeeping.feature.LedgerItemsFeatureLoader;
import me.villagerunknown.bookkeeping.feature.ReceiptItemsFeatureLoader;
import net.minecraft.item.Item;

public class LedgerItems {
	
	public static final Item LEDGER;
	
	static{
		LEDGER = LedgerItemsFeatureLoader.registerCraftableLedgerItem( "villager_coin_ledger", new Item.Settings() );
	}
	
}
