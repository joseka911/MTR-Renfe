package es.joseka.renfemtr.forge;

import es.joseka.renfemtr.RenfeMainClient;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientProxy {

    public static class ModEventBusListener {

        @SubscribeEvent
        public static void onClientSetupEvent(FMLClientSetupEvent event) {
            RenfeMainClient.init();
        }

    }

    public static class ForgeEventBusListener {

    }
}