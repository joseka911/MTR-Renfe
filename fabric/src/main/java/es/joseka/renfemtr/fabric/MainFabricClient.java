package es.joseka.renfemtr.fabric;

import es.joseka.renfemtr.RenfeMainClient;
import net.fabricmc.api.ClientModInitializer;

public class MainFabricClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		RenfeMainClient.init();
	}

}