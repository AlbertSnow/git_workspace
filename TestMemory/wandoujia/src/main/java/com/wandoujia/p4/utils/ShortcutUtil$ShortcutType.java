package com.wandoujia.p4.utils;

public enum ShortcutUtil$ShortcutType
{
  static
  {
    APP = new ShortcutType("APP", 1);
    VIDEO = new ShortcutType("VIDEO", 2);
    MUSIC = new ShortcutType("MUSIC", 3);
    EBOOK = new ShortcutType("EBOOK", 4);
    CLEAN = new ShortcutType("CLEAN", 5);
    MUSIC_FM = new ShortcutType("MUSIC_FM", 6);
    ShortcutType[] arrayOfShortcutType = new ShortcutType[7];
    arrayOfShortcutType[0] = DEFAULT;
    arrayOfShortcutType[1] = APP;
    arrayOfShortcutType[2] = VIDEO;
    arrayOfShortcutType[3] = MUSIC;
    arrayOfShortcutType[4] = EBOOK;
    arrayOfShortcutType[5] = CLEAN;
    arrayOfShortcutType[6] = MUSIC_FM;
    $VALUES = arrayOfShortcutType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.ShortcutUtil.ShortcutType
 * JD-Core Version:    0.6.0
 */