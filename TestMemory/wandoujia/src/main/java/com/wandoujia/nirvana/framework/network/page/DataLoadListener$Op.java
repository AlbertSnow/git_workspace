package com.wandoujia.nirvana.framework.network.page;

public enum DataLoadListener$Op
{
  static
  {
    REFRESH = new Op("REFRESH", 3);
    UPDATE_RANGE = new Op("UPDATE_RANGE", 4);
    REMOVE_RANGE = new Op("REMOVE_RANGE", 5);
    Op[] arrayOfOp = new Op[6];
    arrayOfOp[0] = ADD;
    arrayOfOp[1] = REMOVE;
    arrayOfOp[2] = UPDATE;
    arrayOfOp[3] = REFRESH;
    arrayOfOp[4] = UPDATE_RANGE;
    arrayOfOp[5] = REMOVE_RANGE;
    $VALUES = arrayOfOp;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op
 * JD-Core Version:    0.6.0
 */