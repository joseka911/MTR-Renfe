package es.joseka.renfemtr.fabric;

import es.joseka.renfemtr.RenfeMain;
import es.joseka.renfemtr.RegistriesWrapper;
import es.joseka.renfemtr.mappings.FabricRegistryUtilities;
import mtr.CreativeModeTabs;
import mtr.RegistryObject;
import mtr.mappings.BlockEntityMapper;
import mtr.mappings.RegistryUtilities;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class RegistriesWrapperImpl implements RegistriesWrapper {

    @Override
    public void registerBlock(String id, RegistryObject<Block> block) {
        Registry.register(RegistryUtilities.registryGetBlock(), new ResourceLocation(RenfeMain.MOD_ID, id), block.get());
    }

    @Override
    public void registerBlockAndItem(String id, RegistryObject<Block> block, CreativeModeTabs.Wrapper tab) {
        Registry.register(RegistryUtilities.registryGetBlock(), new ResourceLocation(RenfeMain.MOD_ID, id), block.get());
        final BlockItem blockItem = new BlockItem(block.get(), RegistryUtilities.createItemProperties(tab::get));
        Registry.register(RegistryUtilities.registryGetItem(), new ResourceLocation(RenfeMain.MOD_ID, id), blockItem);
        FabricRegistryUtilities.registerCreativeModeTab(tab.get(), blockItem);
    }

    @Override
    public void registerItem(String id, RegistryObject<Item> item, CreativeModeTabs.Wrapper tab) {
        Registry.register(RegistryUtilities.registryGetItem(), new ResourceLocation(RenfeMain.MOD_ID, id), item.get());
        FabricRegistryUtilities.registerCreativeModeTab(tab.get(), item.get());
    }

    @Override
    public void registerBlockEntityType(String id, RegistryObject<? extends BlockEntityType<? extends BlockEntityMapper>> blockEntityType) {
        Registry.register(RegistryUtilities.registryGetBlockEntityType(), new ResourceLocation(RenfeMain.MOD_ID, id), blockEntityType.get());
    }

    @Override
    public void registerEntityType(String id, RegistryObject<? extends EntityType<? extends Entity>> entityType) {
        Registry.register(RegistryUtilities.registryGetEntityType(), new ResourceLocation(RenfeMain.MOD_ID, id), entityType.get());
    }

    @Override
    public void registerSoundEvent(String id, SoundEvent soundEvent) {
        Registry.register(RegistryUtilities.registryGetSoundEvent(), new ResourceLocation(RenfeMain.MOD_ID, id), soundEvent);
    }
}
