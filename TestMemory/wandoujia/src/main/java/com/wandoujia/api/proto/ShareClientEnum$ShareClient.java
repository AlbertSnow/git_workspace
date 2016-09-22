package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum ShareClientEnum$ShareClient
  implements ProtoEnum
{
  private final int value;

  static
  {
    LAUNCHERLITE = new ShareClient("LAUNCHERLITE", 2, 3);
    ShareClient[] arrayOfShareClient = new ShareClient[3];
    arrayOfShareClient[0] = RIPPLE;
    arrayOfShareClient[1] = SHUFFLE;
    arrayOfShareClient[2] = LAUNCHERLITE;
    $VALUES = arrayOfShareClient;
  }

  private ShareClientEnum$ShareClient(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ShareClientEnum.ShareClient
 * JD-Core Version:    0.6.0
 */