package es.joseka.renfemtr;

import mtr.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static es.joseka.renfemtr.RenfeMain.MOD_ID;
public interface RenfeCreativeModTab {
    CreativeModeTabs.Wrapper SIGNALS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "signals"), () -> new ItemStack(RenfeBlocks.SIGNAL_TRENCH.get()));
    CreativeModeTabs.Wrapper DECORATIONS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "decoration"), () -> new ItemStack(RenfeBlocks.PLATFORM_ES_1.get()));
}
