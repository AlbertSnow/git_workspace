package com.wandoujia.p4.app_launcher.switcher;

 enum RingerModeSwitcher$Mode
{
  private long value;

  static
  {
    Mode[] arrayOfMode = new Mode[3];
    arrayOfMode[0] = normal;
    arrayOfMode[1] = silent;
    arrayOfMode[2] = vibrate;
    $VALUES = arrayOfMode;
  }

  private RingerModeSwitcher$Mode(long paramLong)
  {
    this.value = paramLong;
  }

  public final long getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.RingerModeSwitcher.Mode
 * JD-Core Version:    0.6.0
 */