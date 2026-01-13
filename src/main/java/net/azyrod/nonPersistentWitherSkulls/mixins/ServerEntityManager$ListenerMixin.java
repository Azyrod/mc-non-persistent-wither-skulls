package net.azyrod.nonPersistentWitherSkulls.mixins;

import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.server.world.ServerEntityManager;
import net.minecraft.world.entity.EntityLike;
import net.minecraft.world.entity.EntityTrackingStatus;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(targets = "net.minecraft.server.world.ServerEntityManager$Listener")
public class ServerEntityManager$ListenerMixin {
    @Unique
    private static final String updateLoadStatusMethod = "updateLoadStatus(Lnet/minecraft/world/entity/EntityTrackingStatus;Lnet/minecraft/world/entity/EntityTrackingStatus;)V";
    @Unique
    private static final String EntityManager_stopTickingMethod = "Lnet/minecraft/server/world/ServerEntityManager;stopTicking(Lnet/minecraft/world/entity/EntityLike;)V";

    @Final
    @Shadow
    private EntityLike entity;

    @Inject(method = updateLoadStatusMethod, at = @At(value = "INVOKE", target = EntityManager_stopTickingMethod, shift = At.Shift.AFTER))
    private void updateLoadStatusStopTicking(EntityTrackingStatus oldStatus, EntityTrackingStatus newStatus, CallbackInfo ci) {
        if (entity instanceof WitherSkullEntity skull) {
            skull.discard();
        }
    }
}