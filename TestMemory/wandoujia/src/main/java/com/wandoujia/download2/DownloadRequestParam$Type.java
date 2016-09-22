package com.wandoujia.download2;

public enum DownloadRequestParam$Type
{
  static
  {
    APP = new Type("APP", 1);
    PLAY_EXP = new Type("PLAY_EXP", 2);
    GAME_PACKET = new Type("GAME_PACKET", 3);
    APPV2 = new Type("APPV2", 4);
    Type[] arrayOfType = new Type[5];
    arrayOfType[0] = COMMON;
    arrayOfType[1] = APP;
    arrayOfType[2] = PLAY_EXP;
    arrayOfType[3] = GAME_PACKET;
    arrayOfType[4] = APPV2;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.DownloadRequestParam.Type
 * JD-Core Version:    0.6.0
 */