package com.borthralla.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mixin(AnvilScreenHandler.class)
public class AnvilRebalanceMixin {
    private static final Logger LOGGER = LoggerFactory.getLogger("anvil_rebalance");

    @Overwrite
    public static int getNextCost(int cost) {
        // TODO: Make this return 1 so that its the same behavior as if the item was fresh.
        LOGGER.info("Running mixin for getNextCost, cost will stay at " + cost);
        return cost; // Simply return the original cost
    }
}