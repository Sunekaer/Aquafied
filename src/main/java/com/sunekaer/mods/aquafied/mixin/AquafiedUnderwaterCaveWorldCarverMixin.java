package com.sunekaer.mods.aquafied.mixin;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.carver.UnderwaterCaveWorldCarver;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.material.FluidState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(UnderwaterCaveWorldCarver.class)
public class AquafiedUnderwaterCaveWorldCarverMixin {
    @ModifyArg(method = "carveBlock(Lnet/minecraft/world/level/levelgen/carver/WorldCarver;Lnet/minecraft/world/level/chunk/ChunkAccess;Ljava/util/BitSet;Ljava/util/Random;Lnet/minecraft/core/BlockPos$MutableBlockPos;IIIIIIII)Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/chunk/ChunkAccess;setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)Lnet/minecraft/world/level/block/state/BlockState;", ordinal = 2), index = 1)
    private static BlockState carve(BlockState original) {
        return Blocks.WATER.defaultBlockState();
    }
}
