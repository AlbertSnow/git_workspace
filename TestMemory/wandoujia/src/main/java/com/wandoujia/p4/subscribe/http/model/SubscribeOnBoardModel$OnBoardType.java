package com.wandoujia.p4.subscribe.http.model;

import com.wandoujia.gson.a.a;

public enum SubscribeOnBoardModel$OnBoardType
{
  static
  {
    BUNDLE = new OnBoardType("BUNDLE", 1);
    BUNDLE_PUBLISHER = new OnBoardType("BUNDLE_PUBLISHER", 2);
    OnBoardType[] arrayOfOnBoardType = new OnBoardType[3];
    arrayOfOnBoardType[0] = PUBLISHER;
    arrayOfOnBoardType[1] = BUNDLE;
    arrayOfOnBoardType[2] = BUNDLE_PUBLISHER;
    $VALUES = arrayOfOnBoardType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.model.SubscribeOnBoardModel.OnBoardType
 * JD-Core Version:    0.6.0
 */