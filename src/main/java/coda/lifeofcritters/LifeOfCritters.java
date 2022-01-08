package coda.lifeofcritters;

import coda.lifeofcritters.registry.LOCEntities;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LifeOfCritters.MOD_ID)
public class LifeOfCritters {
    public static final String MOD_ID = "lifeofcritters";

    public LifeOfCritters() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        LOCEntities.ENTITIES.register(bus);
    }
}
