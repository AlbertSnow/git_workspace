package com.wandoujia.shared_storage;

public enum IgnoreWashApps$IgnoreType
{
  static
  {
    USELESS_APP = new IgnoreType("USELESS_APP", 1);
    IgnoreType[] arrayOfIgnoreType = new IgnoreType[2];
    arrayOfIgnoreType[0] = WASH;
    arrayOfIgnoreType[1] = USELESS_APP;
    $VALUES = arrayOfIgnoreType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.IgnoreWashApps.IgnoreType
 * JD-Core Version:    0.6.0
 */