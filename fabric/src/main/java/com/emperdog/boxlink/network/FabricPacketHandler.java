package com.emperdog.boxlink.network;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public final class FabricPacketHandler {
    private FabricPacketHandler() {
    }

    public static void registerPackets() {
        ServerPlayNetworking.registerGlobalReceiver(RequestOpenPCPacket.ID,
                (server, player, handler, buf, responseSender) ->
                        server.execute(() -> BoxLinkServerPayloadHandler.handlePCPacket(player)));
    }

    public static void requestOpenPC() {
        ClientPlayNetworking.send(RequestOpenPCPacket.ID, PacketByteBufs.empty());
    }
}
