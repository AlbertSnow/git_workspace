package com.wandoujia.jupiter.search.model;

public enum SearchTypeForHint
{
  public static final String KEY_SEARCH_TYPE_FOR_HINT = "KEY_SEARCH_TYPE_FOR_HINT";
  private int pattern;

  static
  {
    APP = new SearchTypeForHint("APP", 2, 1);
    GAME = new SearchTypeForHint("GAME", 3, 2);
    SearchTypeForHint[] arrayOfSearchTypeForHint = new SearchTypeForHint[4];
    arrayOfSearchTypeForHint[0] = ALL;
    arrayOfSearchTypeForHint[1] = STARTPAGE;
    arrayOfSearchTypeForHint[2] = APP;
    arrayOfSearchTypeForHint[3] = GAME;
    $VALUES = arrayOfSearchTypeForHint;
  }

  private SearchTypeForHint(int paramInt)
  {
    this.pattern = paramInt;
  }

  public final int getPattern()
  {
    return this.pattern;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.model.SearchTypeForHint
 * JD-Core Version:    0.6.0
 */