package com.wandoujia.jupiter.category.fragment;

public enum CategoryListFragment$CategoryType
{
  private String uri;
  private String url;

  static
  {
    CategoryType[] arrayOfCategoryType = new CategoryType[3];
    arrayOfCategoryType[0] = ALL;
    arrayOfCategoryType[1] = APPS;
    arrayOfCategoryType[2] = GAMES;
    $VALUES = arrayOfCategoryType;
  }

  private CategoryListFragment$CategoryType(String paramString1, String paramString2)
  {
    this.uri = paramString1;
    this.url = paramString2;
  }

  public static CategoryType parseFromString(String paramString)
  {
    if (ALL.uri.equals(paramString))
      return ALL;
    if (APPS.uri.equals(paramString))
      return APPS;
    if (GAMES.uri.equals(paramString))
      return GAMES;
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.fragment.CategoryListFragment.CategoryType
 * JD-Core Version:    0.6.0
 */