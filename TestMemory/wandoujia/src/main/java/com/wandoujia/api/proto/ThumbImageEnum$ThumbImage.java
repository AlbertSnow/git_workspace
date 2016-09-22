package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum ThumbImageEnum$ThumbImage
  implements ProtoEnum
{
  private final int value;

  static
  {
    COVER = new ThumbImage("COVER", 1, 2);
    ThumbImage[] arrayOfThumbImage = new ThumbImage[2];
    arrayOfThumbImage[0] = ICON;
    arrayOfThumbImage[1] = COVER;
    $VALUES = arrayOfThumbImage;
  }

  private ThumbImageEnum$ThumbImage(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.ThumbImageEnum.ThumbImage
 * JD-Core Version:    0.6.0
 */