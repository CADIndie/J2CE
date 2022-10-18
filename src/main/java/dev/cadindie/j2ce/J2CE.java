package dev.cadindie.j2ce;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import 

public class J2CE implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("modid");

    @Override
    public void onInitialize() {
        LOGGER.info("Lets hope this works...");

    }
}
