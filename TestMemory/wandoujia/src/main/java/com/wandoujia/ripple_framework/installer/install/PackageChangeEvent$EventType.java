package com.wandoujia.ripple_framework.installer.install;

public enum PackageChangeEvent$EventType
{
  static
  {
    CHANGE = new EventType("CHANGE", 3);
    EventType[] arrayOfEventType = new EventType[4];
    arrayOfEventType[0] = ADD;
    arrayOfEventType[1] = REMOVE;
    arrayOfEventType[2] = REPLACE;
    arrayOfEventType[3] = CHANGE;
    $VALUES = arrayOfEventType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.PackageChangeEvent.EventType
 * JD-Core Version:    0.6.0
 */