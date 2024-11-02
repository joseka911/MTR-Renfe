package es.joseka.renfemtr;

import mtr.RegistryClient;
import net.minecraft.client.renderer.RenderType;

public class RenfeMainClient {

	public static void init() {
		//add transparency at circle signal 20 km/h
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_20_ADVERTISEMENT.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_20_ADVERTISEMENT_ORANGE.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_20_ADVERTISEMENT_TEMP.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_20_ADVERTISEMENT_TEMP_ORANGE.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_20_PREADVERTISEMENT.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_20_PREADVERTISEMENT_TEMP.get());
		//add transparency at circle signal 40 km/h
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_40_ADVERTISEMENT.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_40_ADVERTISEMENT_ORANGE.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_40_ADVERTISEMENT_TEMP.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_40_ADVERTISEMENT_TEMP_ORANGE.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_40_PREADVERTISEMENT.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_40_PREADVERTISEMENT_TEMP.get());
		//add transparency at circle signal 60 km/h
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_60_ADVERTISEMENT.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_60_ADVERTISEMENT_ORANGE.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_60_PREADVERTISEMENT.get());
		//add transparency at circle signal 80 km/h
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_80_ADVERTISEMENT.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_80_ADVERTISEMENT_ORANGE.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_80_PREADVERTISEMENT.get());
		//add transparency at circle signal 120 km/h
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_120_ADVERTISEMENT.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_120_ADVERTISEMENT_ORANGE.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.SIGNAL_120_PREADVERTISEMENT.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), RenfeBlocks.PLATFORM_ES_1.get());
	}

}
