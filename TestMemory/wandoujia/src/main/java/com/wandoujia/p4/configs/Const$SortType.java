package com.wandoujia.p4.configs;

public enum Const$SortType
{
  static
  {
    LATEST = new SortType("LATEST", 2);
    SortType[] arrayOfSortType = new SortType[3];
    arrayOfSortType[0] = DEFAULT;
    arrayOfSortType[1] = WEEKLY;
    arrayOfSortType[2] = LATEST;
    $VALUES = arrayOfSortType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.configs.Const.SortType
 * JD-Core Version:    0.6.0
 */