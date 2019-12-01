package com.badcoffee.kaffeine;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Kaffeine.MODID)
public class Kaffeine
{
    public static final String MODID = "kaffeine";

    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public Kaffeine() {
        LOGGER.debug("Hello from Kaffeine !");
    }
}
