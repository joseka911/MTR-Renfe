package es.joseka.renfemtr.mod;


import es.joseka.renfemtr.mod.items.*;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.Item;
import org.mtr.mapping.registry.ItemRegistryObject;

public class Items {
    static {
        PLAT_NUMBER_CHANGER = Init.REGISTRY.registerItem(new Identifier(Init.MOD_ID, "plat_number_changer"), itemSettings -> new Item(new PlatformChangerNumber(itemSettings.maxCount(1))), CreativeModeTabs.SIGNALS);
    }
public static final ItemRegistryObject PLAT_NUMBER_CHANGER;


    public static void init() {
        Init.LOGGER.info("Registering MTR Renfe Addon Items");
    }
}
