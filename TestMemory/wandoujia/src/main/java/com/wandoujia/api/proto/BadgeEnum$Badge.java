package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum BadgeEnum$Badge
  implements ProtoEnum
{
  private final int value;

  static
  {
    GIFT = new Badge("GIFT", 1, 2);
    AWARD = new Badge("AWARD", 2, 4);
    WANDOU_COIN = new Badge("WANDOU_COIN", 3, 8);
    QUALITY = new Badge("QUALITY", 4, 16);
    SPREAD = new Badge("SPREAD", 5, 32);
    UPDATE = new Badge("UPDATE", 6, 64);
    PUBLISH = new Badge("PUBLISH", 7, 128);
    VERIFIED = new Badge("VERIFIED", 8, 256);
    FAVORITE = new Badge("FAVORITE", 9, 512);
    Badge[] arrayOfBadge = new Badge[10];
    arrayOfBadge[0] = NEW_PRODUCT;
    arrayOfBadge[1] = GIFT;
    arrayOfBadge[2] = AWARD;
    arrayOfBadge[3] = WANDOU_COIN;
    arrayOfBadge[4] = QUALITY;
    arrayOfBadge[5] = SPREAD;
    arrayOfBadge[6] = UPDATE;
    arrayOfBadge[7] = PUBLISH;
    arrayOfBadge[8] = VERIFIED;
    arrayOfBadge[9] = FAVORITE;
    $VALUES = arrayOfBadge;
  }

  private BadgeEnum$Badge(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.BadgeEnum.Badge
 * JD-Core Version:    0.6.0
 */