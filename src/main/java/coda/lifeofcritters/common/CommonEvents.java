package coda.lifeofcritters.common;

import coda.lifeofcritters.LifeOfCritters;
import coda.lifeofcritters.common.entities.base.SmallSnakeEntity;
import coda.lifeofcritters.registry.LOCEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LifeOfCritters.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {

    @SubscribeEvent
    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(LOCEntities.GRASS_SNAKE.get(), SmallSnakeEntity.createAttributes().build());
    }
}
