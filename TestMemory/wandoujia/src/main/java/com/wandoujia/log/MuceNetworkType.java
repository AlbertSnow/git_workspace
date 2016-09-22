package com.wandoujia.log;

public enum MuceNetworkType
{
  private int intValue;

  static
  {
    MOBILE = new MuceNetworkType("MOBILE", 2, 2);
    MuceNetworkType[] arrayOfMuceNetworkType = new MuceNetworkType[3];
    arrayOfMuceNetworkType[0] = NONE;
    arrayOfMuceNetworkType[1] = WIFI;
    arrayOfMuceNetworkType[2] = MOBILE;
    $VALUES = arrayOfMuceNetworkType;
  }

  private MuceNetworkType(int paramInt)
  {
    this.intValue = paramInt;
  }

  public final int getIntValue()
  {
    return this.intValue;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.MuceNetworkType
 * JD-Core Version:    0.6.0
 */