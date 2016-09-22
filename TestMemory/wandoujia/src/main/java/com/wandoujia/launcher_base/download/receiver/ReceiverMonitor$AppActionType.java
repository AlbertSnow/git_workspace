package com.wandoujia.launcher_base.download.receiver;

public enum ReceiverMonitor$AppActionType
{
  private final String action;

  static
  {
    ADDED = new AppActionType("ADDED", 2, "android.intent.action.PACKAGE_ADDED");
    CHANGED = new AppActionType("CHANGED", 3, "android.intent.action.PACKAGE_CHANGED");
    READY = new AppActionType("READY", 4, "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
    AppActionType[] arrayOfAppActionType = new AppActionType[5];
    arrayOfAppActionType[0] = REMOVED;
    arrayOfAppActionType[1] = REPLACED;
    arrayOfAppActionType[2] = ADDED;
    arrayOfAppActionType[3] = CHANGED;
    arrayOfAppActionType[4] = READY;
    $VALUES = arrayOfAppActionType;
  }

  private ReceiverMonitor$AppActionType(String paramString)
  {
    this.action = paramString;
  }

  public final String getActionType()
  {
    return this.action;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.download.receiver.ReceiverMonitor.AppActionType
 * JD-Core Version:    0.6.0
 */