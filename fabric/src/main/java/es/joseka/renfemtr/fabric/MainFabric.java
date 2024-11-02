package es.joseka.renfemtr.fabric;

import es.joseka.renfemtr.RenfeMain;
import net.fabricmc.api.ModInitializer;

public class MainFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		RenfeMain.init(new RegistriesWrapperImpl());
	}

}
