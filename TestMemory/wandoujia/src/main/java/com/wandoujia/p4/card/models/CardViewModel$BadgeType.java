package com.wandoujia.p4.card.models;

public enum CardViewModel$BadgeType
{
  private int imageResId;

  static
  {
    NEW_ARRIVAL = new BadgeType("NEW_ARRIVAL", 2, 2130837802);
    EXCLUSIVE = new BadgeType("EXCLUSIVE", 3, 2130837800);
    GIFT = new BadgeType("GIFT", 4, 2130837801);
    AWARD = new BadgeType("AWARD", 5, 2130837799);
    COUPON = new BadgeType("COUPON", 6, 2130837798);
    BadgeType[] arrayOfBadgeType = new BadgeType[7];
    arrayOfBadgeType[0] = UPDATE;
    arrayOfBadgeType[1] = UPDATE_LITE;
    arrayOfBadgeType[2] = NEW_ARRIVAL;
    arrayOfBadgeType[3] = EXCLUSIVE;
    arrayOfBadgeType[4] = GIFT;
    arrayOfBadgeType[5] = AWARD;
    arrayOfBadgeType[6] = COUPON;
    $VALUES = arrayOfBadgeType;
  }

  private CardViewModel$BadgeType(int paramInt)
  {
    this.imageResId = paramInt;
  }

  public final int getImageResId()
  {
    return this.imageResId;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.card.models.CardViewModel.BadgeType
 * JD-Core Version:    0.6.0
 */