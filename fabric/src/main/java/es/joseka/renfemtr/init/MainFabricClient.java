package es.joseka.renfemtr.init;

import es.joseka.renfemtr.mod.InitClient;
import net.fabricmc.api.ClientModInitializer;

public class MainFabricClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		InitClient.init();
	}
}