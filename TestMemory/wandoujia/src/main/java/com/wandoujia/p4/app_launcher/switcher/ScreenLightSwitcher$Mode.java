package com.wandoujia.p4.app_launcher.switcher;

 enum ScreenLightSwitcher$Mode
{
  private long value;

  static
  {
    low = new Mode("low", 3, 3L);
    Mode[] arrayOfMode = new Mode[4];
    arrayOfMode[0] = auto;
    arrayOfMode[1] = high;
    arrayOfMode[2] = normal;
    arrayOfMode[3] = low;
    $VALUES = arrayOfMode;
  }

  private ScreenLightSwitcher$Mode(long paramLong)
  {
    this.value = paramLong;
  }

  public final long getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.ScreenLightSwitcher.Mode
 * JD-Core Version:    0.6.0
 */