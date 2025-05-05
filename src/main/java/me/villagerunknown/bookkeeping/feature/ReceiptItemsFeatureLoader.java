package me.villagerunknown.bookkeeping.feature;

import me.villagerunknown.bookkeeping.item.ReceiptItem;
import me.villagerunknown.bookkeeping.item.BookkeepingItems;
import me.villagerunknown.villagercoin.feature.ReceiptItemsFeature;
import net.minecraft.item.Item;

public class ReceiptItemsFeatureLoader {

	public static void execute(){}
	
	public static Item registerReceiptItem( String id, Item.Settings settings ) {
		return ReceiptItemsFeature.registerReceipt( id, new ReceiptItem( settings ) );
	}
	
	public static Item registerCraftableReceiptItem( String id, Item.Settings settings ) {
		return ReceiptItemsFeature.registerCraftableReceipt( id, new ReceiptItem( settings ) );
	}
	
}
