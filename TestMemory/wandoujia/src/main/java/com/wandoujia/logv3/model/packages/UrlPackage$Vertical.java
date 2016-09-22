package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum UrlPackage$Vertical
  implements ProtoEnum
{
  private final int value;

  static
  {
    APP = new Vertical("APP", 1, 1);
    SEARCH = new Vertical("SEARCH", 2, 2);
    GAME = new Vertical("GAME", 3, 3);
    VIDEO = new Vertical("VIDEO", 4, 4);
    MUSIC = new Vertical("MUSIC", 5, 5);
    WALLPAPER = new Vertical("WALLPAPER", 6, 6);
    EBOOK = new Vertical("EBOOK", 7, 7);
    MYTHING = new Vertical("MYTHING", 8, 8);
    SYNC = new Vertical("SYNC", 9, 9);
    SETTING = new Vertical("SETTING", 10, 10);
    PLAYER = new Vertical("PLAYER", 11, 11);
    LAUNCHER = new Vertical("LAUNCHER", 12, 12);
    STARTPAGE = new Vertical("STARTPAGE", 13, 13);
    XIBAIBAI = new Vertical("XIBAIBAI", 14, 14);
    CLEAN = new Vertical("CLEAN", 15, 15);
    SUBSCRIBE = new Vertical("SUBSCRIBE", 16, 16);
    COMMUNITY = new Vertical("COMMUNITY", 17, 17);
    MULTIMEDIA = new Vertical("MULTIMEDIA", 18, 18);
    O2O = new Vertical("O2O", 19, 19);
    CATEGORY = new Vertical("CATEGORY", 20, 20);
    ACG = new Vertical("ACG", 21, 21);
    RANKING = new Vertical("RANKING", 22, 22);
    Vertical[] arrayOfVertical = new Vertical[23];
    arrayOfVertical[0] = OTHERS;
    arrayOfVertical[1] = APP;
    arrayOfVertical[2] = SEARCH;
    arrayOfVertical[3] = GAME;
    arrayOfVertical[4] = VIDEO;
    arrayOfVertical[5] = MUSIC;
    arrayOfVertical[6] = WALLPAPER;
    arrayOfVertical[7] = EBOOK;
    arrayOfVertical[8] = MYTHING;
    arrayOfVertical[9] = SYNC;
    arrayOfVertical[10] = SETTING;
    arrayOfVertical[11] = PLAYER;
    arrayOfVertical[12] = LAUNCHER;
    arrayOfVertical[13] = STARTPAGE;
    arrayOfVertical[14] = XIBAIBAI;
    arrayOfVertical[15] = CLEAN;
    arrayOfVertical[16] = SUBSCRIBE;
    arrayOfVertical[17] = COMMUNITY;
    arrayOfVertical[18] = MULTIMEDIA;
    arrayOfVertical[19] = O2O;
    arrayOfVertical[20] = CATEGORY;
    arrayOfVertical[21] = ACG;
    arrayOfVertical[22] = RANKING;
    $VALUES = arrayOfVertical;
  }

  private UrlPackage$Vertical(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.UrlPackage.Vertical
 * JD-Core Version:    0.6.0
 */