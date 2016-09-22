package com.wandoujia.jupiter.app.model;

public enum AppType
{
  private String name;

  static
  {
    APP = new AppType("APP", 1, "app");
    AppType[] arrayOfAppType = new AppType[2];
    arrayOfAppType[0] = GAME;
    arrayOfAppType[1] = APP;
    $VALUES = arrayOfAppType;
  }

  private AppType(String paramString)
  {
    this.name = paramString;
  }

  public final String getName()
  {
    return this.name;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.app.model.AppType
 * JD-Core Version:    0.6.0
 */