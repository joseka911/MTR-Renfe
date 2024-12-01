package es.joseka.renfemtr.init;

import net.fabricmc.api.ModInitializer;
import es.joseka.renfemtr.mod.Init;

public class MainFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		Init.init();
	}
}