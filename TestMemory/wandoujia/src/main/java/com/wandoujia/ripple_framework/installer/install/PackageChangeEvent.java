package com.wandoujia.ripple_framework.installer.install;

public final class PackageChangeEvent
{
  private String a;
  private PackageChangeEvent.EventType b;

  public PackageChangeEvent(String paramString, PackageChangeEvent.EventType paramEventType)
  {
    this.a = paramString;
    this.b = paramEventType;
  }

  public final String a()
  {
    return this.a;
  }

  public final PackageChangeEvent.EventType b()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.PackageChangeEvent
 * JD-Core Version:    0.6.0
 */