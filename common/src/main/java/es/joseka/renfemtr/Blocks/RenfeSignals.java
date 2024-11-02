package es.joseka.renfemtr.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class RenfeSignals extends FacingBlock {
    public static final DirectionProperty FACING = FacingBlock.FACING;

    public RenfeSignals(Properties properties) {
        super(properties);
    }

    public static final VoxelShape SHAPE_NORTH = Block.box(0, 0, 21, 16, 16, 22);
    public static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, -6, 16, 16, -5);
    public static final VoxelShape SHAPE_EAST = Block.box(-6, 0, 0, -5, 16, 16);
    public static final VoxelShape SHAPE_WEST = Block.box(21, 0, 0, 22, 16, 16);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case SOUTH -> SHAPE_SOUTH;
            case WEST -> SHAPE_WEST;
            case EAST -> SHAPE_EAST;
            default -> SHAPE_NORTH;
        };
    }

}
