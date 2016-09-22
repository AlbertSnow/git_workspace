package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ContentPackage$Type
  implements ProtoEnum
{
  private final int value;

  static
  {
    EBOOK = new Type("EBOOK", 2, 2);
    GAME = new Type("GAME", 3, 3);
    WALLPAPER = new Type("WALLPAPER", 4, 4);
    PERSON = new Type("PERSON", 5, 5);
    MUSIC_SONG = new Type("MUSIC_SONG", 6, 6);
    MUSIC_ALBUM = new Type("MUSIC_ALBUM", 7, 7);
    MUSIC_PLAY_LIST = new Type("MUSIC_PLAY_LIST", 8, 8);
    MUSIC_RANKING_LIST = new Type("MUSIC_RANKING_LIST", 9, 9);
    MUSIC_RANK_ISSUE = new Type("MUSIC_RANK_ISSUE", 10, 10);
    SINGER = new Type("SINGER", 11, 11);
    IAS = new Type("IAS", 12, 12);
    TRIGGER = new Type("TRIGGER", 13, 13);
    STORY = new Type("STORY", 14, 14);
    SUGGESTION = new Type("SUGGESTION", 15, 15);
    ACTION = new Type("ACTION", 16, 16);
    Type[] arrayOfType = new Type[17];
    arrayOfType[0] = APP;
    arrayOfType[1] = VIDEO;
    arrayOfType[2] = EBOOK;
    arrayOfType[3] = GAME;
    arrayOfType[4] = WALLPAPER;
    arrayOfType[5] = PERSON;
    arrayOfType[6] = MUSIC_SONG;
    arrayOfType[7] = MUSIC_ALBUM;
    arrayOfType[8] = MUSIC_PLAY_LIST;
    arrayOfType[9] = MUSIC_RANKING_LIST;
    arrayOfType[10] = MUSIC_RANK_ISSUE;
    arrayOfType[11] = SINGER;
    arrayOfType[12] = IAS;
    arrayOfType[13] = TRIGGER;
    arrayOfType[14] = STORY;
    arrayOfType[15] = SUGGESTION;
    arrayOfType[16] = ACTION;
    $VALUES = arrayOfType;
  }

  private ContentPackage$Type(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ContentPackage.Type
 * JD-Core Version:    0.6.0
 */