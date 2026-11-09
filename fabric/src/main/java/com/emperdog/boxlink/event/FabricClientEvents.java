package com.emperdog.boxlink.event;

import com.emperdog.boxlink.BoxLinkClient;
import com.emperdog.boxlink.network.FabricPacketHandler;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

public class FabricClientEvents {
    public static void register() {
        ClientTickEvents.START_CLIENT_TICK.register(minecraft -> {
            if (BoxLinkClient.openPCKey.consumeClick()
                    && minecraft.isWindowActive()
                    && minecraft.player != null
                    && minecraft.getConnection() != null) {
                FabricPacketHandler.requestOpenPC();
            }
        });

        KeyBindingHelper.registerKeyBinding(BoxLinkClient.openPCKey);
    }
}
