package me.villagerunknown.bookkeeping.item;

import me.villagerunknown.bookkeeping.feature.LedgerItemsFeatureLoader;
import me.villagerunknown.bookkeeping.feature.ReceiptItemsFeatureLoader;
import net.minecraft.item.Item;

public class ReceiptItems {
	
	public static final Item RECEIPT;
	
	static{
		RECEIPT = ReceiptItemsFeatureLoader.registerCraftableReceiptItem( "villager_coin_receipt", new Item.Settings() );
	}
	
}
