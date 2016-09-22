package com.wandoujia.p4.search.utils;

public enum SearchConst$SearchMode
{
  private String modeKey;

  static
  {
    SearchMode[] arrayOfSearchMode = new SearchMode[2];
    arrayOfSearchMode[0] = MIXED;
    arrayOfSearchMode[1] = VERTICAL;
    $VALUES = arrayOfSearchMode;
  }

  private SearchConst$SearchMode(String paramString)
  {
    this.modeKey = paramString;
  }

  public final String getModeKey()
  {
    return this.modeKey;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.search.utils.SearchConst.SearchMode
 * JD-Core Version:    0.6.0
 */