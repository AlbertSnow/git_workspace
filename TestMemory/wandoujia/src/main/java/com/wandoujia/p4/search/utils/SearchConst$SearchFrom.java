package com.wandoujia.p4.search.utils;

public enum SearchConst$SearchFrom
{
  private String fromKey;

  static
  {
    HOT = new SearchFrom("HOT", 3, "HOT");
    SUGGESTION = new SearchFrom("SUGGESTION", 4, "SUGGESTION");
    HISTORY = new SearchFrom("HISTORY", 5, "HISTORY");
    EBOOK_DETAIL = new SearchFrom("EBOOK_DETAIL", 6, "EBOOK_DETAIL");
    RELATED_TAB = new SearchFrom("RELATED_TAB", 7, "RELATED_TAB");
    GAME_LAUNCHER = new SearchFrom("GAME_LAUNCHER", 8, "GAME_LAUNCHER");
    SearchFrom[] arrayOfSearchFrom = new SearchFrom[9];
    arrayOfSearchFrom[0] = MANUAL;
    arrayOfSearchFrom[1] = MANUAL_REC;
    arrayOfSearchFrom[2] = RECOMMEND;
    arrayOfSearchFrom[3] = HOT;
    arrayOfSearchFrom[4] = SUGGESTION;
    arrayOfSearchFrom[5] = HISTORY;
    arrayOfSearchFrom[6] = EBOOK_DETAIL;
    arrayOfSearchFrom[7] = RELATED_TAB;
    arrayOfSearchFrom[8] = GAME_LAUNCHER;
    $VALUES = arrayOfSearchFrom;
  }

  private SearchConst$SearchFrom(String paramString)
  {
    this.fromKey = paramString;
  }

  public final String getFromKey()
  {
    return this.fromKey;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.search.utils.SearchConst.SearchFrom
 * JD-Core Version:    0.6.0
 */