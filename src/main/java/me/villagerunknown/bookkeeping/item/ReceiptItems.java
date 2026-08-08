package me.villagerunknown.bookkeeping.item;

import me.villagerunknown.bookkeeping.feature.ReceiptItemsFeature;
import net.minecraft.world.item.Item;

public class ReceiptItems {
	
	public static final Item RECEIPT;
	
	static{
		RECEIPT = ReceiptItemsFeature.registerCraftableReceiptItem( "villager_coin_receipt", new Item.Properties() );
	}
	
}
