package coda.lifeofcritters.registry;

import coda.lifeofcritters.LifeOfCritters;
import coda.lifeofcritters.common.entities.GrassSnakeEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LOCEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, LifeOfCritters.MOD_ID);

    public static final RegistryObject<EntityType<GrassSnakeEntity>> GRASS_SNAKE = create("grass_snake", EntityType.Builder.of(GrassSnakeEntity::new, MobCategory.CREATURE).sized(1.0f, 0.5f));

    private static <T extends Entity> RegistryObject<EntityType<T>> create(String name, EntityType.Builder<T> builder) {
        return ENTITIES.register(name, () -> builder.build(LifeOfCritters.MOD_ID + "." + name));
    }
}
