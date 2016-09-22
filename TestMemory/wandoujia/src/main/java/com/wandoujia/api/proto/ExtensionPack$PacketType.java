package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum ExtensionPack$PacketType
  implements ProtoEnum
{
  private final int value;

  static
  {
    DPK = new PacketType("DPK", 1, 1);
    GPK = new PacketType("GPK", 2, 2);
    PacketType[] arrayOfPacketType = new PacketType[3];
    arrayOfPacketType[0] = WPK;
    arrayOfPacketType[1] = DPK;
    arrayOfPacketType[2] = GPK;
    $VALUES = arrayOfPacketType;
  }

  private ExtensionPack$PacketType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ExtensionPack.PacketType
 * JD-Core Version:    0.6.0
 */