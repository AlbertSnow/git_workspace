package com.wandoujia.p4.settings;

public enum SettingActivityHelper$SettingActivityLabel
{
  private Class c;

  static
  {
    ABOUT = new SettingActivityLabel("ABOUT", 2, AboutSettingActivity.class);
    SettingActivityLabel[] arrayOfSettingActivityLabel = new SettingActivityLabel[3];
    arrayOfSettingActivityLabel[0] = MAIN;
    arrayOfSettingActivityLabel[1] = NOTIFY;
    arrayOfSettingActivityLabel[2] = ABOUT;
    $VALUES = arrayOfSettingActivityLabel;
  }

  private SettingActivityHelper$SettingActivityLabel(Class paramClass)
  {
    this.c = paramClass;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.SettingActivityHelper.SettingActivityLabel
 * JD-Core Version:    0.6.0
 */