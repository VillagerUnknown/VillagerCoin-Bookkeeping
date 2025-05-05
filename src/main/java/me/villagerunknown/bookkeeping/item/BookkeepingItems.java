package me.villagerunknown.bookkeeping.item;

import me.villagerunknown.bookkeeping.feature.LedgerItemsFeatureLoader;
import me.villagerunknown.bookkeeping.feature.ReceiptItemsFeatureLoader;
import net.minecraft.item.Item;

public class BookkeepingItems {
	
	public static final Item RECEIPT;
	public static final Item LEDGER;
	
	static{
		RECEIPT = ReceiptItemsFeatureLoader.registerCraftableReceiptItem( "villager_coin_receipt", new Item.Settings() );
		LEDGER = LedgerItemsFeatureLoader.registerCraftableLedgerItem( "villager_coin_ledger", new Item.Settings() );
	}
	
}
