package com.wandoujia.entities.game;

public enum GameDetailInfoType$InAppPurchaseType
{
  private int purchase;

  static
  {
    NO = new InAppPurchaseType("NO", 1, 0);
    UNKNOWN = new InAppPurchaseType("UNKNOWN", 2, -1);
    InAppPurchaseType[] arrayOfInAppPurchaseType = new InAppPurchaseType[3];
    arrayOfInAppPurchaseType[0] = YES;
    arrayOfInAppPurchaseType[1] = NO;
    arrayOfInAppPurchaseType[2] = UNKNOWN;
    $VALUES = arrayOfInAppPurchaseType;
  }

  private GameDetailInfoType$InAppPurchaseType(int paramInt)
  {
    this.purchase = paramInt;
  }

  public final int getPurchase()
  {
    return this.purchase;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.GameDetailInfoType.InAppPurchaseType
 * JD-Core Version:    0.6.0
 */