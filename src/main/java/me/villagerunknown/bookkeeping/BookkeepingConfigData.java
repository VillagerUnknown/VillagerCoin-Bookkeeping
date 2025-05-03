package me.villagerunknown.bookkeeping;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "villagerunknown-bookkeeping")
public class BookkeepingConfigData implements me.shedaniel.autoconfig.ConfigData {
	
	/**
	 * General
	 */
	
	@ConfigEntry.Category("General")
	public boolean enableTheUnknown = false;
	
}
