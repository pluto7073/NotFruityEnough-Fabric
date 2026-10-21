package xyz.plutonia.fruity;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotFruityEnough implements ModInitializer {

    public static final String MOD_ID = "fruity";
    public static final Logger LOGGER = LogManager.getLogger("NotFruityEnough");

    @Override
    public void onInitialize() {
        LOGGER.info("I can say fruity I'm gay");
    }

    public static ResourceLocation asId(String id) {
        return new ResourceLocation(MOD_ID, id);
    }

}
