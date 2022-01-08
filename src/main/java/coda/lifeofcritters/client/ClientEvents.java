package coda.lifeofcritters.client;

import coda.lifeofcritters.LifeOfCritters;
import coda.lifeofcritters.client.render.GrassSnakeRenderer;
import coda.lifeofcritters.registry.LOCEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LifeOfCritters.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(LOCEntities.GRASS_SNAKE.get(), GrassSnakeRenderer::new);
    }
}
