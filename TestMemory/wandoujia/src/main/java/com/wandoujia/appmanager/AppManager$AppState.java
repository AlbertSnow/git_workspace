package com.wandoujia.appmanager;

public enum AppManager$AppState
{
  static
  {
    INSTALLED = new AppState("INSTALLED", 1);
    NOT_EXIST = new AppState("NOT_EXIST", 2);
    INSTALLING = new AppState("INSTALLING", 3);
    UNINSTALLING = new AppState("UNINSTALLING", 4);
    PATCHING = new AppState("PATCHING", 5);
    AppState[] arrayOfAppState = new AppState[6];
    arrayOfAppState[0] = WAITING_INSTALL;
    arrayOfAppState[1] = INSTALLED;
    arrayOfAppState[2] = NOT_EXIST;
    arrayOfAppState[3] = INSTALLING;
    arrayOfAppState[4] = UNINSTALLING;
    arrayOfAppState[5] = PATCHING;
    $VALUES = arrayOfAppState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.AppManager.AppState
 * JD-Core Version:    0.6.0
 */