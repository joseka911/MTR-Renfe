package es.joseka.renfemtr.Items;

import es.joseka.renfemtr.Blocks.PlatformNumber;
import es.joseka.renfemtr.RenfeCreativeModTab;
import mtr.item.ItemWithCreativeTabBase;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class PlatformNumberChanger extends ItemWithCreativeTabBase {

    public PlatformNumberChanger() {
        super(RenfeCreativeModTab.DECORATIONS, properties -> properties.stacksTo(1));
    }

    public static void changeTexture(BlockState state, Level level, BlockPos pos, Player player) {
        IntegerProperty textureProperty = PlatformNumber.TEXTURE; // Acceso a TEXTURE
        int currentTexture = state.getValue(textureProperty);
        int newTexture = (currentTexture % 10) + 1;
        level.setBlock(pos, state.setValue(textureProperty, newTexture), 3);
    }
}
