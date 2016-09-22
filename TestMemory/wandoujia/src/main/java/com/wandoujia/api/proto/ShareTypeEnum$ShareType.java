package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum ShareTypeEnum$ShareType
  implements ProtoEnum
{
  private final int value;

  static
  {
    IMAGE = new ShareType("IMAGE", 1, 2);
    RIPPLE = new ShareType("RIPPLE", 2, 3);
    VIDEO = new ShareType("VIDEO", 3, 4);
    SHUFFLE = new ShareType("SHUFFLE", 4, 5);
    LAUNCHER_LITE = new ShareType("LAUNCHER_LITE", 5, 6);
    LAUNCHER_LITE_APP = new ShareType("LAUNCHER_LITE_APP", 6, 7);
    LAUNCHER_LITE_MIXUP = new ShareType("LAUNCHER_LITE_MIXUP", 7, 8);
    ShareType[] arrayOfShareType = new ShareType[8];
    arrayOfShareType[0] = ITEM;
    arrayOfShareType[1] = IMAGE;
    arrayOfShareType[2] = RIPPLE;
    arrayOfShareType[3] = VIDEO;
    arrayOfShareType[4] = SHUFFLE;
    arrayOfShareType[5] = LAUNCHER_LITE;
    arrayOfShareType[6] = LAUNCHER_LITE_APP;
    arrayOfShareType[7] = LAUNCHER_LITE_MIXUP;
    $VALUES = arrayOfShareType;
  }

  private ShareTypeEnum$ShareType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ShareTypeEnum.ShareType
 * JD-Core Version:    0.6.0
 */