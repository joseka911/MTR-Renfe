package es.joseka.renfemtr.mod.items;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.ItemExtension;
import org.mtr.mapping.mapper.TextHelper;
import es.joseka.renfemtr.mod.blocks.ModelChangerBase;

import javax.annotation.Nullable;
import java.util.List;
public class PlatformChangerNumber extends ItemExtension {
    public PlatformChangerNumber(ItemSettings itemSettings) {
        super(itemSettings);
    }

    @Override
    public ActionResult useOnBlock2(ItemUsageContext context) {
        final World world = context.getWorld();
        if (!world.isClient()) {
            final BlockState state = world.getBlockState(context.getBlockPos());
            final Block block = state.getBlock();
            if (block.data instanceof ModelChangerBase) {
                final int value = state.get(new Property<>(ModelChangerBase.TEXTURE.data));
                final int count = ((ModelChangerBase) block.data).getCount();
                int newValue = (value == count) ? 1 : (value + 1);
                world.setBlockState(context.getBlockPos(), state.with(new Property<>(ModelChangerBase.TEXTURE.data), newValue ));
                System.out.println("TEXTURE Actual: " + value + ", Nueva TEXTURE: " + newValue);
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.FAIL;
    }


}
