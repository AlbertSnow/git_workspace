package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum LaunchSourcePackage$Source
  implements ProtoEnum
{
  private final int value;

  static
  {
    SHORTCUT = new Source("SHORTCUT", 2, 2);
    WIDGET = new Source("WIDGET", 3, 3);
    MARKET = new Source("MARKET", 4, 4);
    START = new Source("START", 5, 5);
    NOTIFICATION_DOWNLOAD = new Source("NOTIFICATION_DOWNLOAD", 6, 6);
    NOTIFICATION_SELF_UPGRADE = new Source("NOTIFICATION_SELF_UPGRADE", 7, 7);
    NOTIFICATION_XIBAIBAI = new Source("NOTIFICATION_XIBAIBAI", 8, 8);
    NOTIFICATION_CLEAN = new Source("NOTIFICATION_CLEAN", 9, 9);
    NOTIFICATION_PUSH = new Source("NOTIFICATION_PUSH", 10, 10);
    NOTIFICATION_PUSH_APP = new Source("NOTIFICATION_PUSH_APP", 11, 11);
    NOTIFICATION_APP = new Source("NOTIFICATION_APP", 12, 12);
    NOTIFICATION_VIDEO = new Source("NOTIFICATION_VIDEO", 13, 13);
    NOTIFICATION_EBOOK = new Source("NOTIFICATION_EBOOK", 14, 14);
    NOTIFICATION_WALLPAPER = new Source("NOTIFICATION_WALLPAPER", 15, 15);
    NOTIFICATION_FREE_TRAFFIC = new Source("NOTIFICATION_FREE_TRAFFIC", 16, 16);
    NOTIFICATION_SYNC = new Source("NOTIFICATION_SYNC", 17, 17);
    GAME_LAUNCHER = new Source("GAME_LAUNCHER", 18, 18);
    NOTIFICATION_WALKMAN = new Source("NOTIFICATION_WALKMAN", 19, 19);
    FLOAT_WALKMAN = new Source("FLOAT_WALKMAN", 20, 20);
    RECEIVER_HEADSET_PLUG = new Source("RECEIVER_HEADSET_PLUG", 21, 21);
    RECEIVER_BLUETOOTH_HEADSET_CONNECT = new Source("RECEIVER_BLUETOOTH_HEADSET_CONNECT", 22, 22);
    NOTIFICATION_PUSH_GAMEPOPUP = new Source("NOTIFICATION_PUSH_GAMEPOPUP", 23, 23);
    Source[] arrayOfSource = new Source[24];
    arrayOfSource[0] = UNKNOWN;
    arrayOfSource[1] = WELCOME;
    arrayOfSource[2] = SHORTCUT;
    arrayOfSource[3] = WIDGET;
    arrayOfSource[4] = MARKET;
    arrayOfSource[5] = START;
    arrayOfSource[6] = NOTIFICATION_DOWNLOAD;
    arrayOfSource[7] = NOTIFICATION_SELF_UPGRADE;
    arrayOfSource[8] = NOTIFICATION_XIBAIBAI;
    arrayOfSource[9] = NOTIFICATION_CLEAN;
    arrayOfSource[10] = NOTIFICATION_PUSH;
    arrayOfSource[11] = NOTIFICATION_PUSH_APP;
    arrayOfSource[12] = NOTIFICATION_APP;
    arrayOfSource[13] = NOTIFICATION_VIDEO;
    arrayOfSource[14] = NOTIFICATION_EBOOK;
    arrayOfSource[15] = NOTIFICATION_WALLPAPER;
    arrayOfSource[16] = NOTIFICATION_FREE_TRAFFIC;
    arrayOfSource[17] = NOTIFICATION_SYNC;
    arrayOfSource[18] = GAME_LAUNCHER;
    arrayOfSource[19] = NOTIFICATION_WALKMAN;
    arrayOfSource[20] = FLOAT_WALKMAN;
    arrayOfSource[21] = RECEIVER_HEADSET_PLUG;
    arrayOfSource[22] = RECEIVER_BLUETOOTH_HEADSET_CONNECT;
    arrayOfSource[23] = NOTIFICATION_PUSH_GAMEPOPUP;
    $VALUES = arrayOfSource;
  }

  private LaunchSourcePackage$Source(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.LaunchSourcePackage.Source
 * JD-Core Version:    0.6.0
 */