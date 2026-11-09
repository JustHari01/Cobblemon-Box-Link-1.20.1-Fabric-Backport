package com.emperdog.boxlink.network;

import com.emperdog.boxlink.BoxLinkCommon;
import net.minecraft.resources.ResourceLocation;

/** Channel identifier used by the Fabric 1.20.1 networking API. */
public final class RequestOpenPCPacket {
    public static final ResourceLocation ID = new ResourceLocation(BoxLinkCommon.MOD_ID, "open_pc");

    private RequestOpenPCPacket() {
    }
}
