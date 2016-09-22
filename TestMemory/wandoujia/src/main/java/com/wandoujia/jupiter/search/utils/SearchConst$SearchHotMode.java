package com.wandoujia.jupiter.search.utils;

public enum SearchConst$SearchHotMode
{
  private String modeKey;

  static
  {
    DAILY = new SearchHotMode("DAILY", 1, "DAILY");
    SearchHotMode[] arrayOfSearchHotMode = new SearchHotMode[2];
    arrayOfSearchHotMode[0] = WEEKLY;
    arrayOfSearchHotMode[1] = DAILY;
    $VALUES = arrayOfSearchHotMode;
  }

  private SearchConst$SearchHotMode(String paramString)
  {
    this.modeKey = paramString;
  }

  public final String getModeKey()
  {
    return this.modeKey;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.utils.SearchConst.SearchHotMode
 * JD-Core Version:    0.6.0
 */