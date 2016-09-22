package com.wandoujia.ripple_framework.util;

import com.wandoujia.ripple_framework.R.drawable;

public enum BadgeUtil$BadgeType
{
  private int imageResId;

  static
  {
    GIFT = new BadgeType("GIFT", 1, R.drawable.ic_explore_badge_gift);
    DESIGN_AWARD = new BadgeType("DESIGN_AWARD", 2, R.drawable.ic_explore_badge_design);
    PUBLISH = new BadgeType("PUBLISH", 3, R.drawable.ic_explore_badge_new);
    BadgeType[] arrayOfBadgeType = new BadgeType[4];
    arrayOfBadgeType[0] = NEW_PRODUCT;
    arrayOfBadgeType[1] = GIFT;
    arrayOfBadgeType[2] = DESIGN_AWARD;
    arrayOfBadgeType[3] = PUBLISH;
    $VALUES = arrayOfBadgeType;
  }

  private BadgeUtil$BadgeType(int paramInt)
  {
    this.imageResId = paramInt;
  }

  public final int getImageResId()
  {
    return this.imageResId;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.BadgeUtil.BadgeType
 * JD-Core Version:    0.6.0
 */