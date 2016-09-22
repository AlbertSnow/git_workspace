package com.wandoujia.entities.app;

public enum IAppLiteInfo$AppType
{
  private String appType;

  static
  {
    AppType[] arrayOfAppType = new AppType[2];
    arrayOfAppType[0] = APP;
    arrayOfAppType[1] = GAME;
    $VALUES = arrayOfAppType;
  }

  private IAppLiteInfo$AppType(String paramString)
  {
    this.appType = paramString;
  }

  public final String getAppType()
  {
    return this.appType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.IAppLiteInfo.AppType
 * JD-Core Version:    0.6.0
 */