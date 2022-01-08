package coda.lifeofcritters.client.model;

import coda.lifeofcritters.LifeOfCritters;
import net.minecraft.resources.ResourceLocation;
import software.bernie.finsandtails.geckolib3.model.AnimatedTickingGeoModel;

public class SmallSnakeModel extends AnimatedTickingGeoModel {
    
    @Override
    public ResourceLocation getModelLocation(Object o) {
        return new ResourceLocation(LifeOfCritters.MOD_ID, "geo/entity/small_snake.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object o) {
        return new ResourceLocation(LifeOfCritters.MOD_ID, "textures/entity/grass_snake.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object o) {
        return new ResourceLocation(LifeOfCritters.MOD_ID, "animations/entity/grass_snake.animation.json");
    }
}
