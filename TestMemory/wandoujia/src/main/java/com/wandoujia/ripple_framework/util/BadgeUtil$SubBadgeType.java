package com.wandoujia.ripple_framework.util;

import com.wandoujia.ripple_framework.R.drawable;

public enum BadgeUtil$SubBadgeType
{
  private int imageResId;

  static
  {
    QUALITY = new SubBadgeType("QUALITY", 1, R.drawable.ic_explore_meta_good);
    SPREAD = new SubBadgeType("SPREAD", 2, R.drawable.ic_explore_meta_promotion);
    VERIFIED = new SubBadgeType("VERIFIED", 3, R.drawable.verified);
    SubBadgeType[] arrayOfSubBadgeType = new SubBadgeType[4];
    arrayOfSubBadgeType[0] = WANDOU_COIN;
    arrayOfSubBadgeType[1] = QUALITY;
    arrayOfSubBadgeType[2] = SPREAD;
    arrayOfSubBadgeType[3] = VERIFIED;
    $VALUES = arrayOfSubBadgeType;
  }

  private BadgeUtil$SubBadgeType(int paramInt)
  {
    this.imageResId = paramInt;
  }

  public final int getImageResId()
  {
    return this.imageResId;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.BadgeUtil.SubBadgeType
 * JD-Core Version:    0.6.0
 */