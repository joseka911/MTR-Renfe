package es.joseka.renfemtr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RenfeMain {

	public static final String MOD_ID = "renfe";

	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static void init(RegistriesWrapper registries) {
		registries.registerBlockAndItem("signal_trench", RenfeBlocks.SIGNAL_TRENCH, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_end_temp", RenfeBlocks.SIGNAL_END_TEMP, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20", RenfeBlocks.SIGNAL_20, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_advertisement", RenfeBlocks.SIGNAL_20_ADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_advertisement_temp", RenfeBlocks.SIGNAL_20_ADVERTISEMENT_TEMP, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_pre_advertisement", RenfeBlocks.SIGNAL_20_PREADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_pre_advertisement_temp", RenfeBlocks.SIGNAL_20_PREADVERTISEMENT_TEMP, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_orange", RenfeBlocks.SIGNAL_20_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_temp", RenfeBlocks.SIGNAL_20_TEMP, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_advertisement_orange", RenfeBlocks.SIGNAL_20_ADVERTISEMENT_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_temp_orange", RenfeBlocks.SIGNAL_20_TEMP_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_20_advertisement_temp_orange", RenfeBlocks.SIGNAL_20_ADVERTISEMENT_TEMP_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40", RenfeBlocks.SIGNAL_40, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_advertisement", RenfeBlocks.SIGNAL_40_ADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_advertisement_temp", RenfeBlocks.SIGNAL_40_ADVERTISEMENT_TEMP, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_pre_advertisement", RenfeBlocks.SIGNAL_40_PREADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_pre_advertisement_temp", RenfeBlocks.SIGNAL_40_PREADVERTISEMENT_TEMP, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_orange", RenfeBlocks.SIGNAL_40_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_temp", RenfeBlocks.SIGNAL_40_TEMP, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_advertisement_orange", RenfeBlocks.SIGNAL_40_ADVERTISEMENT_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_temp_orange", RenfeBlocks.SIGNAL_40_TEMP_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_40_advertisement_temp_orange", RenfeBlocks.SIGNAL_40_ADVERTISEMENT_TEMP_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_60", RenfeBlocks.SIGNAL_60, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_60_advertisement", RenfeBlocks.SIGNAL_60_ADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_60_pre_advertisement", RenfeBlocks.SIGNAL_60_PREADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_60_orange", RenfeBlocks.SIGNAL_60_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_60_advertisement_orange", RenfeBlocks.SIGNAL_60_ADVERTISEMENT_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_80", RenfeBlocks.SIGNAL_80, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_80_advertisement", RenfeBlocks.SIGNAL_80_ADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_80_pre_advertisement", RenfeBlocks.SIGNAL_80_PREADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_80_orange", RenfeBlocks.SIGNAL_80_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_80_advertisement_orange", RenfeBlocks.SIGNAL_80_ADVERTISEMENT_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_120", RenfeBlocks.SIGNAL_120, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_120_advertisement", RenfeBlocks.SIGNAL_120_ADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_120_pre_advertisement", RenfeBlocks.SIGNAL_120_PREADVERTISEMENT, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_120_orange", RenfeBlocks.SIGNAL_120_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("signal_120_advertisement_orange", RenfeBlocks.SIGNAL_120_ADVERTISEMENT_ORANGE, RenfeCreativeModTab.SIGNALS);
		registries.registerBlockAndItem("platform_es_1", RenfeBlocks.PLATFORM_ES_1, RenfeCreativeModTab.DECORATIONS);
		registries.registerBlockAndItem("renfe_ticket_machine_1", RenfeBlocks.RENFE_TICKET_MACHINE_1, RenfeCreativeModTab.DECORATIONS);
	}
}
