package com.wandoujia.update.protocol;

public enum UpdateInfo$SelfUpdatePriority
{
  static
  {
    NORMAL = new SelfUpdatePriority("NORMAL", 1);
    STRONG = new SelfUpdatePriority("STRONG", 2);
    EXTREME = new SelfUpdatePriority("EXTREME", 3);
    SelfUpdatePriority[] arrayOfSelfUpdatePriority = new SelfUpdatePriority[4];
    arrayOfSelfUpdatePriority[0] = WEAK;
    arrayOfSelfUpdatePriority[1] = NORMAL;
    arrayOfSelfUpdatePriority[2] = STRONG;
    arrayOfSelfUpdatePriority[3] = EXTREME;
    $VALUES = arrayOfSelfUpdatePriority;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.protocol.UpdateInfo.SelfUpdatePriority
 * JD-Core Version:    0.6.0
 */