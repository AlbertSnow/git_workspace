package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum ShareContentTypeEnum$ShareContentType
  implements ProtoEnum
{
  private final int value;

  static
  {
    IMAGE = new ShareContentType("IMAGE", 1, 2);
    VIDEO = new ShareContentType("VIDEO", 2, 3);
    ShareContentType[] arrayOfShareContentType = new ShareContentType[3];
    arrayOfShareContentType[0] = TEXT;
    arrayOfShareContentType[1] = IMAGE;
    arrayOfShareContentType[2] = VIDEO;
    $VALUES = arrayOfShareContentType;
  }

  private ShareContentTypeEnum$ShareContentType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ShareContentTypeEnum.ShareContentType
 * JD-Core Version:    0.6.0
 */