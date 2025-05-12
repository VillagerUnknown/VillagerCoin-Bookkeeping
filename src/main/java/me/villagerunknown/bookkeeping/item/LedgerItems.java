package me.villagerunknown.bookkeeping.item;

import me.villagerunknown.bookkeeping.feature.LedgerItemsFeature;
import net.minecraft.item.Item;

public class LedgerItems {
	
	public static final Item LEDGER;
	
	static{
		LEDGER = LedgerItemsFeature.registerCraftableLedgerItem( "villager_coin_ledger", new Item.Settings() );
	}
	
}
