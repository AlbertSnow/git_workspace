package com.wandoujia.p4.subscribe.core;

import com.wandoujia.gson.a.a;

public enum SubscribeSubsetType
{
  static
  {
    LIST = new SubscribeSubsetType("LIST", 1);
    SubscribeSubsetType[] arrayOfSubscribeSubsetType = new SubscribeSubsetType[2];
    arrayOfSubscribeSubsetType[0] = SINGLE;
    arrayOfSubscribeSubsetType[1] = LIST;
    $VALUES = arrayOfSubscribeSubsetType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.core.SubscribeSubsetType
 * JD-Core Version:    0.6.0
 */