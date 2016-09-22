package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ConsumptionEvent$Type
  implements ProtoEnum
{
  private final int value;

  static
  {
    LOCAL_PLAY = new Type("LOCAL_PLAY", 2, 2);
    READ = new Type("READ", 3, 3);
    SET_AS_WALLPAPER = new Type("SET_AS_WALLPAPER", 4, 4);
    OPEN = new Type("OPEN", 5, 5);
    UPGRADE = new Type("UPGRADE", 6, 6);
    INSTALL = new Type("INSTALL", 7, 7);
    UNINSTALL = new Type("UNINSTALL", 8, 8);
    AUTO_DOWNLOAD = new Type("AUTO_DOWNLOAD", 9, 9);
    Type[] arrayOfType = new Type[10];
    arrayOfType[0] = DOWNLOAD;
    arrayOfType[1] = ONLINE_PLAY;
    arrayOfType[2] = LOCAL_PLAY;
    arrayOfType[3] = READ;
    arrayOfType[4] = SET_AS_WALLPAPER;
    arrayOfType[5] = OPEN;
    arrayOfType[6] = UPGRADE;
    arrayOfType[7] = INSTALL;
    arrayOfType[8] = UNINSTALL;
    arrayOfType[9] = AUTO_DOWNLOAD;
    $VALUES = arrayOfType;
  }

  private ConsumptionEvent$Type(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ConsumptionEvent.Type
 * JD-Core Version:    0.6.0
 */