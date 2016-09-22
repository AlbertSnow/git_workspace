package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum ContentPlatformEnum$ContentPlatform
  implements ProtoEnum
{
  private final int value;

  static
  {
    ContentPlatform[] arrayOfContentPlatform = new ContentPlatform[2];
    arrayOfContentPlatform[0] = NATIVE;
    arrayOfContentPlatform[1] = WEBVIEW;
    $VALUES = arrayOfContentPlatform;
  }

  private ContentPlatformEnum$ContentPlatform(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ContentPlatformEnum.ContentPlatform
 * JD-Core Version:    0.6.0
 */