package es.joseka.renfemtr.Blocks;

import es.joseka.renfemtr.Items.PlatformNumberChanger;
import es.joseka.renfemtr.RenfeItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PlatformNumber extends FacingBlock {
    public static final DirectionProperty FACING = FacingBlock.FACING;
    public static final IntegerProperty TEXTURE = IntegerProperty.create("texture", 1, 10);

    public PlatformNumber(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(TEXTURE, 1));
    }
    public static final VoxelShape SHAPE_NORTH = Block.box(0, 0, 7, 16, 16, 9);
    public static final VoxelShape SHAPE_SOUTH = Block.box(0, 0, 7, 16, 16, 9);
    public static final VoxelShape SHAPE_EAST = Block.box(7, 0, 0, 9, 16, 16);
    public static final VoxelShape SHAPE_WEST = Block.box(7, 0, 0, 9, 16, 16);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case SOUTH -> SHAPE_SOUTH;
            case WEST -> SHAPE_WEST;
            case EAST -> SHAPE_EAST;
            default -> SHAPE_NORTH;
        };
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TEXTURE);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player , InteractionHand hand, BlockHitResult hit) {
        if (player.getItemInHand(hand).is(RenfeItems.PLAT_NUMBER_CHANGER.get().asItem())) {
            if  (!level.isClientSide) {
                PlatformNumberChanger.changeTexture(state, level, pos, player);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }
}
