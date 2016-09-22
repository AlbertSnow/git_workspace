package com.wandoujia.ripple_framework.util;

import com.wandoujia.appmanager.LocalAppInfo;
import java.util.Comparator;

public enum AppUtils$SortType
{
  static
  {
    POSITION_ASC = new AppUtils.SortType.2("POSITION_ASC", 1);
    SIZE_DECS = new AppUtils.SortType.3("SIZE_DECS", 2);
    PINYIN_ASC = new AppUtils.SortType.4("PINYIN_ASC", 3);
    PINYIN_DESC = new AppUtils.SortType.5("PINYIN_DESC", 4);
    UPDATE_TIME_ASC = new AppUtils.SortType.6("UPDATE_TIME_ASC", 5);
    UPDATE_TIME_DESC = new AppUtils.SortType.7("UPDATE_TIME_DESC", 6);
    SortType[] arrayOfSortType = new SortType[7];
    arrayOfSortType[0] = SIZE_ASC;
    arrayOfSortType[1] = POSITION_ASC;
    arrayOfSortType[2] = SIZE_DECS;
    arrayOfSortType[3] = PINYIN_ASC;
    arrayOfSortType[4] = PINYIN_DESC;
    arrayOfSortType[5] = UPDATE_TIME_ASC;
    arrayOfSortType[6] = UPDATE_TIME_DESC;
    $VALUES = arrayOfSortType;
  }

  protected abstract Comparator<LocalAppInfo> getComparator();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.AppUtils.SortType
 * JD-Core Version:    0.6.0
 */