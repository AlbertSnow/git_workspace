package com.wandoujia.shared_storage;

public class SharedSettings$SettingLine extends StorageLine
{
  private final String key;
  private final String value;

  public SharedSettings$SettingLine()
  {
    this(null, null);
  }

  public SharedSettings$SettingLine(String paramString1, String paramString2)
  {
    this.key = paramString1;
    this.value = paramString2;
  }

  public String getKey()
  {
    return this.key;
  }

  public String getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.SharedSettings.SettingLine
 * JD-Core Version:    0.6.0
 */