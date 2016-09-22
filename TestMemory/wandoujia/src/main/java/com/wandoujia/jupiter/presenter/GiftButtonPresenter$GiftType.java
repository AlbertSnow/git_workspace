package com.wandoujia.jupiter.presenter;

public enum GiftButtonPresenter$GiftType
{
  private String giftType;

  static
  {
    GiftType[] arrayOfGiftType = new GiftType[2];
    arrayOfGiftType[0] = CDKEY;
    arrayOfGiftType[1] = OTHER;
    $VALUES = arrayOfGiftType;
  }

  private GiftButtonPresenter$GiftType(String paramString)
  {
    this.giftType = paramString;
  }

  public final String getGiftType()
  {
    return this.giftType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.GiftButtonPresenter.GiftType
 * JD-Core Version:    0.6.0
 */