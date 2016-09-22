package com.wandoujia.p4.subscribe.core;

import com.wandoujia.gson.a.a;

public enum SubscribeItemType
{
  static
  {
    EBOOK = new SubscribeItemType("EBOOK", 2);
    MUSIC = new SubscribeItemType("MUSIC", 3);
    WALLPAPER = new SubscribeItemType("WALLPAPER", 4);
    GAME = new SubscribeItemType("GAME", 5);
    SubscribeItemType[] arrayOfSubscribeItemType = new SubscribeItemType[6];
    arrayOfSubscribeItemType[0] = APP;
    arrayOfSubscribeItemType[1] = VIDEO;
    arrayOfSubscribeItemType[2] = EBOOK;
    arrayOfSubscribeItemType[3] = MUSIC;
    arrayOfSubscribeItemType[4] = WALLPAPER;
    arrayOfSubscribeItemType[5] = GAME;
    $VALUES = arrayOfSubscribeItemType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.core.SubscribeItemType
 * JD-Core Version:    0.6.0
 */