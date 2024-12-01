package es.joseka.renfemtr.mod;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.ItemConvertible;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.registry.CreativeModeTabHolder;

public final class CreativeModeTabs {
    static {
        SIGNALS = Init.REGISTRY.createCreativeModeTabHolder(new Identifier(Init.MOD_ID, "signals"), () -> new ItemStack(new ItemConvertible(Blocks.SIGNAL_TRENCH.get().data)));
    }
    public static final CreativeModeTabHolder SIGNALS;

	public static void init() {
		Init.LOGGER.info("Registering MTR Renfe Addon creative mode tabs");
	}
}
