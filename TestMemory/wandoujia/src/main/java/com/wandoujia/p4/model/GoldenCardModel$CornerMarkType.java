package com.wandoujia.p4.model;

public enum GoldenCardModel$CornerMarkType
{
  private int imageResId;

  static
  {
    GIFT = new CornerMarkType("GIFT", 2, 2130838165);
    AWARD = new CornerMarkType("AWARD", 3, 2130838164);
    CornerMarkType[] arrayOfCornerMarkType = new CornerMarkType[4];
    arrayOfCornerMarkType[0] = EMPTY;
    arrayOfCornerMarkType[1] = NEW;
    arrayOfCornerMarkType[2] = GIFT;
    arrayOfCornerMarkType[3] = AWARD;
    $VALUES = arrayOfCornerMarkType;
  }

  private GoldenCardModel$CornerMarkType(int paramInt)
  {
    this.imageResId = paramInt;
  }

  public final int getImageResId()
  {
    return this.imageResId;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.model.GoldenCardModel.CornerMarkType
 * JD-Core Version:    0.6.0
 */