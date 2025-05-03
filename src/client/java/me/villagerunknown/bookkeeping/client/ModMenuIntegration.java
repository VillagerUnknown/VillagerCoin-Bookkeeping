package me.villagerunknown.bookkeeping.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import me.villagerunknown.bookkeeping.BookkeepingConfigData;

public class ModMenuIntegration implements ModMenuApi {
	
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return parent -> AutoConfig.getConfigScreen(BookkeepingConfigData.class, parent).get();
	}
	
}
