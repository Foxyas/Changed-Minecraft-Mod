package net.ltxprogrammer.changed.mixin.compatibility.BeyondEarth;

import com.st0x0ef.beyond_earth.common.util.OxygenSystem;
import net.ltxprogrammer.changed.extension.RequiredMods;
import net.ltxprogrammer.changed.fluid.TransfurGas;
import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.ltxprogrammer.changed.util.EntityUtil;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = OxygenSystem.class, remap = false)
@RequiredMods("beyond_earth")
public abstract class OxygenSystemMixin {
    @Shadow @Final private static OxygenSystem.AirCheckResult IN_FLUID;

    @Inject(method = "canBreatheWithoutSuit", at = @At("HEAD"), cancellable = true)
    private static void canVariantBreatheWithoutSuit(LivingEntity entity, boolean applyChunkO2, CallbackInfoReturnable<OxygenSystem.AirCheckResult> callback) {
        ProcessTransfur.ifPlayerTransfurred(EntityUtil.playerOrNull(entity), variant -> {
            callback.setReturnValue(OxygenSystem.canBreatheWithoutSuit(variant.getChangedEntity(), applyChunkO2));
        });
    }

    @Inject(method = "canBreatheWithoutSuit", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;isInWater()Z", remap = true), cancellable = true)
    private static void isInTransfurGas(LivingEntity entity, boolean applyChunkO2, CallbackInfoReturnable<OxygenSystem.AirCheckResult> callback) {
        TransfurGas.validEntityInGas(entity).ifPresent(gas -> callback.setReturnValue(IN_FLUID));
    }
}
