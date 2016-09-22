package com.wandoujia.p4.app.view.model;

public enum CardViewModelAppImpl$AppType
{
  static
  {
    FREE_TRAFFIC = new AppType("FREE_TRAFFIC", 2);
    RANKING = new AppType("RANKING", 3);
    CHOICE_MUST_HAVE = new AppType("CHOICE_MUST_HAVE", 4);
    DETAIL_RECOMMEND = new AppType("DETAIL_RECOMMEND", 5);
    SEARCH = new AppType("SEARCH", 6);
    AppType[] arrayOfAppType = new AppType[7];
    arrayOfAppType[0] = DOWNLOADED_RECOMMEND;
    arrayOfAppType[1] = NORMAL;
    arrayOfAppType[2] = FREE_TRAFFIC;
    arrayOfAppType[3] = RANKING;
    arrayOfAppType[4] = CHOICE_MUST_HAVE;
    arrayOfAppType[5] = DETAIL_RECOMMEND;
    arrayOfAppType[6] = SEARCH;
    $VALUES = arrayOfAppType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.view.model.CardViewModelAppImpl.AppType
 * JD-Core Version:    0.6.0
 */