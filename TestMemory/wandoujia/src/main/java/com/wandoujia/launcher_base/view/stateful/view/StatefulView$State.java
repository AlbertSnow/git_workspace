package com.wandoujia.launcher_base.view.stateful.view;

public enum StatefulView$State
{
  static
  {
    DOWNLOADING = new State("DOWNLOADING", 1);
    PAUSING = new State("PAUSING", 2);
    DOWNLOADED = new State("DOWNLOADED", 3);
    READY = new State("READY", 4);
    UNZIPPING = new State("UNZIPPING", 5);
    INSTALLING = new State("INSTALLING", 6);
    INSTALLED = new State("INSTALLED", 7);
    State[] arrayOfState = new State[8];
    arrayOfState[0] = INIT;
    arrayOfState[1] = DOWNLOADING;
    arrayOfState[2] = PAUSING;
    arrayOfState[3] = DOWNLOADED;
    arrayOfState[4] = READY;
    arrayOfState[5] = UNZIPPING;
    arrayOfState[6] = INSTALLING;
    arrayOfState[7] = INSTALLED;
    $VALUES = arrayOfState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.stateful.view.StatefulView.State
 * JD-Core Version:    0.6.0
 */