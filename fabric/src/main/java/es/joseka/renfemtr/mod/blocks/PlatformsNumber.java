package es.joseka.renfemtr.mod.blocks;


import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mod.block.IBlock;


public class PlatformsNumber extends ModelChangerBase {
    public PlatformsNumber() {
        super(BlockHelper.createBlockSettings(true), 10);
    }
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return IBlock.getVoxelShapeByDirection(0, 0, 7, 16, 16, 9, IBlock.getStatePropertySafe(state, FACING));
    }
}
