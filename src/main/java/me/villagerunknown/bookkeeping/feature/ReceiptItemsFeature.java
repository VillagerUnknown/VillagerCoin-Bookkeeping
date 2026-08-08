package me.villagerunknown.bookkeeping.feature;

import me.villagerunknown.villagercoin.item.ReceiptItem;
import net.minecraft.world.item.Item;
import me.villagerunknown.bookkeeping.item.ReceiptItems;
import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.feature.ReceiptFeature;

public class ReceiptItemsFeature {

	public static void execute(){
		new ReceiptItems();
	}
	
	public static Item registerReceiptItem( String id, Item.Properties settings ) {
		return ReceiptFeature.registerReceipt( Villagercoin.MOD_ID, id, settings );
	}
	
	public static Item registerCraftableReceiptItem( String id, Item.Properties settings ) {
		return ReceiptFeature.registerCraftableReceipt( Villagercoin.MOD_ID, id, settings );
	}
	
}
