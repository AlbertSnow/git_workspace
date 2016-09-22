package com.wandoujia.clean.model;

public enum GarbageType
{
  static
  {
    GarbageType[] arrayOfGarbageType = new GarbageType[2];
    arrayOfGarbageType[0] = MEMORY;
    arrayOfGarbageType[1] = SYSTEM_CACHE;
    $VALUES = arrayOfGarbageType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.model.GarbageType
 * JD-Core Version:    0.6.0
 */