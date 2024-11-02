package es.joseka.renfemtr;

import es.joseka.renfemtr.Blocks.RenfeSignals;
import mtr.RegistryObject;
import mtr.block.BlockPlatform;
import mtr.block.BlockTicketMachine;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public interface RenfeBlocks{
    //miscellaneous
    RegistryObject<Block> SIGNAL_TRENCH = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_END_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    //Signal 20 km/h
    RegistryObject<Block> SIGNAL_20 = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_ADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_ADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_PREADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_PREADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_ADVERTISEMENT_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_20_ADVERTISEMENT_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    //Signal 40 km/h
    RegistryObject<Block> SIGNAL_40 = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_ADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_ADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_PREADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_PREADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_ADVERTISEMENT_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_40_ADVERTISEMENT_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    //Signal 60 km/h
    RegistryObject<Block> SIGNAL_60 = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_ADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_ADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_PREADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_PREADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_ADVERTISEMENT_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_60_ADVERTISEMENT_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    //Signal 80 km/h
    RegistryObject<Block> SIGNAL_80 = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_ADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_ADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_PREADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_PREADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_ADVERTISEMENT_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_80_ADVERTISEMENT_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    //Signal 120 km/h
    RegistryObject<Block> SIGNAL_120 = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_ADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_ADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_PREADVERTISEMENT = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_PREADVERTISEMENT_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_TEMP = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_ADVERTISEMENT_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    RegistryObject<Block> SIGNAL_120_ADVERTISEMENT_TEMP_ORANGE = new RegistryObject<>(() -> new RenfeSignals(BlockBehaviour.Properties.of(Material.METAL)));
    //platform
    RegistryObject<Block> PLATFORM_ES_1 = new RegistryObject<>(() -> new BlockPlatform(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(2), false));
    //tickets machines
    RegistryObject<Block> RENFE_TICKET_MACHINE_1 = new RegistryObject<>(() -> new BlockTicketMachine(BlockBehaviour.Properties.of(Material.METAL)));
}
