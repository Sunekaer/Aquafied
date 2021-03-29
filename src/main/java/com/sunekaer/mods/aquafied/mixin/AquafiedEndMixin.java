package com.sunekaer.mods.aquafied.mixin;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NoiseGeneratorSettings.class)
public class AquafiedEndMixin {

    @Inject(method = "end", at = @At(value = "HEAD"), cancellable = true)
    private static void aquafiedEnd(StructureSettings arg, BlockState arg2, BlockState arg3, ResourceLocation arg4, boolean bl, boolean bl2, CallbackInfoReturnable<NoiseGeneratorSettings> cir) {
        cir.setReturnValue(init(arg, new NoiseSettings(128, new NoiseSamplingSettings(2.0D, 1.0D, 80.0D, 160.0D), new NoiseSlideSettings(-3000, 64, -46), new NoiseSlideSettings(-30, 7, 1), 2, 1, 0.0D, 0.0D, true, false, bl2, false), arg2, Blocks.WATER.defaultBlockState(), -10, -10, 49, bl));
        cir.cancel();
    }

    @SuppressWarnings("InvokerTarget")
    @Invoker(value = "net.minecraft.world.level.levelgen.NoiseGeneratorSettings")
    private static NoiseGeneratorSettings init(StructureSettings arg, NoiseSettings arg2, BlockState arg3, BlockState arg4, int i, int j, int k, boolean bl){
       throw new Error();
    }
}
