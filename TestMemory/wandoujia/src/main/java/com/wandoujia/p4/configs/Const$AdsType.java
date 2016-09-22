package com.wandoujia.p4.configs;

public enum Const$AdsType
{
  static
  {
    EMBEDED = new AdsType("EMBEDED", 1);
    POP = new AdsType("POP", 2);
    BOTH = new AdsType("BOTH", 3);
    AdsType[] arrayOfAdsType = new AdsType[4];
    arrayOfAdsType[0] = NONE;
    arrayOfAdsType[1] = EMBEDED;
    arrayOfAdsType[2] = POP;
    arrayOfAdsType[3] = BOTH;
    $VALUES = arrayOfAdsType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.configs.Const.AdsType
 * JD-Core Version:    0.6.0
 */