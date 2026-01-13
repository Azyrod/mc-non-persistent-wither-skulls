package net.azyrod.nonPersistentWitherSkulls.mixins;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(WitherSkullEntity.class)
abstract class WitherSkullEntityMixin extends Entity {
    public WitherSkullEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Override
    public boolean shouldSave() {
        return false;
    }
}
