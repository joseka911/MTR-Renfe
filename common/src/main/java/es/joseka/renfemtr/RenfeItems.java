package es.joseka.renfemtr;

import es.joseka.renfemtr.Items.PlatformNumberChanger;
import mtr.RegistryObject;
import net.minecraft.world.item.Item;

public interface RenfeItems{
    RegistryObject<Item> PLAT_NUMBER_CHANGER = new RegistryObject<>(PlatformNumberChanger::new);
}
