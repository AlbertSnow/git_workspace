package com.wandoujia.shared_storage;

public class AppIgnoreUpdateStorage$IgnoreUpdateApp extends StorageLine
{
  private final String pkgName;

  public AppIgnoreUpdateStorage$IgnoreUpdateApp()
  {
    this(null);
  }

  public AppIgnoreUpdateStorage$IgnoreUpdateApp(String paramString)
  {
    this.pkgName = paramString;
  }

  public String getKey()
  {
    return this.pkgName;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.AppIgnoreUpdateStorage.IgnoreUpdateApp
 * JD-Core Version:    0.6.0
 */