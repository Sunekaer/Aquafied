package com.sunekaer.mods.aquafied.mixin;

import com.sunekaer.mods.aquafied.Aquafied;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Level.class)
public abstract class AquafiedLevelMixin {


    @Inject(method = "getSeaLevel", at = @At("HEAD"), cancellable = true)
    public void getFixedSeaLevel(CallbackInfoReturnable<Integer> returnable) {
        returnable.setReturnValue(Aquafied.SEA_LEVEL.get());
    }
}
