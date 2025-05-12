package me.villagerunknown.bookkeeping.feature;

import me.villagerunknown.bookkeeping.item.ReceiptItem;
import me.villagerunknown.bookkeeping.item.ReceiptItems;
import me.villagerunknown.villagercoin.feature.ReceiptFeature;
import net.minecraft.item.Item;

public class ReceiptItemsFeature {

	public static void execute(){
		new ReceiptItems();
	}
	
	public static Item registerReceiptItem( String id, Item.Settings settings ) {
		return ReceiptFeature.registerReceipt( id, new ReceiptItem( settings ) );
	}
	
	public static Item registerCraftableReceiptItem( String id, Item.Settings settings ) {
		return ReceiptFeature.registerCraftableReceipt( id, new ReceiptItem( settings ) );
	}
	
}
