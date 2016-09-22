package com.wandoujia.phoenix2.videoplayer;

 enum BasePlayerFragment$SourceType
{
  static
  {
    LOCAL_FILE = new SourceType("LOCAL_FILE", 1);
    SourceType[] arrayOfSourceType = new SourceType[2];
    arrayOfSourceType[0] = URL;
    arrayOfSourceType[1] = LOCAL_FILE;
    $VALUES = arrayOfSourceType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.BasePlayerFragment.SourceType
 * JD-Core Version:    0.6.0
 */