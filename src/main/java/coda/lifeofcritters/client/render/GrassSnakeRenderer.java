package coda.lifeofcritters.client.render;

import coda.lifeofcritters.client.model.SmallSnakeModel;
import coda.lifeofcritters.common.entities.GrassSnakeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.finsandtails.geckolib3.renderers.geo.GeoEntityRenderer;

public class GrassSnakeRenderer extends GeoEntityRenderer<GrassSnakeEntity> {

    public GrassSnakeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SmallSnakeModel());
        this.shadowRadius = 0.4F;
    }
}