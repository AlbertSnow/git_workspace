package com.wandoujia.p4.search.utils;

import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.entities.app.TabCategory;

public enum SearchConst$SearchType
  implements TabCategory
{
  public static SearchType[] EXPLICIT_SEARCH_TYPES;
  private int pattern;
  private String subTypeKey;
  private String tabId;
  private String typeKey;
  private int typeStringId;

  static
  {
    MUSIC = new SearchType("MUSIC", 3, "MUSIC", 8, "music", 2131625597);
    EBOOK = new SearchType("EBOOK", 4, "EBOOKS", "ebook", 2131625594);
    WALLPAPER = new SearchType("WALLPAPER", 5, "WALLPAPERS", 16, "wallpaper", 2131625602);
    MARKET = new SearchType("MARKET", 6, "ALL", 3, "market", 2131624798);
    ENTERTAINMENT = new SearchType("ENTERTAINMENT", 7, "ENTERTAINMENT", 60, "entertainment", 2131624797);
    WEB = new SearchType("WEB", 8, "WEB", "", 2131625246);
    ALL = new SearchType("ALL", 9, "ALL", "all", 2131624796);
    UNI = new SearchType("UNI", 10, "UNI", "", 2131624937);
    HOMEPAGE = new SearchType("HOMEPAGE", 11, "HOMEPAGE", "home", 2131624930);
    SearchType[] arrayOfSearchType1 = new SearchType[12];
    arrayOfSearchType1[0] = APP;
    arrayOfSearchType1[1] = GAME;
    arrayOfSearchType1[2] = VIDEO;
    arrayOfSearchType1[3] = MUSIC;
    arrayOfSearchType1[4] = EBOOK;
    arrayOfSearchType1[5] = WALLPAPER;
    arrayOfSearchType1[6] = MARKET;
    arrayOfSearchType1[7] = ENTERTAINMENT;
    arrayOfSearchType1[8] = WEB;
    arrayOfSearchType1[9] = ALL;
    arrayOfSearchType1[10] = UNI;
    arrayOfSearchType1[11] = HOMEPAGE;
    $VALUES = arrayOfSearchType1;
    SearchType[] arrayOfSearchType2 = new SearchType[6];
    arrayOfSearchType2[0] = ALL;
    arrayOfSearchType2[1] = APP;
    arrayOfSearchType2[2] = VIDEO;
    arrayOfSearchType2[3] = MUSIC;
    arrayOfSearchType2[4] = EBOOK;
    arrayOfSearchType2[5] = WALLPAPER;
    EXPLICIT_SEARCH_TYPES = arrayOfSearchType2;
  }

  private SearchConst$SearchType(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    this(paramString1, paramInt1, null, paramString2, paramInt2);
  }

  private SearchConst$SearchType(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    this.typeKey = paramString1;
    this.pattern = paramInt1;
    this.tabId = paramString3;
    this.subTypeKey = paramString2;
    this.typeStringId = paramInt2;
  }

  private SearchConst$SearchType(String paramString1, String paramString2, int paramInt)
  {
    this(paramString1, 0, null, paramString2, paramInt);
  }

  public static SearchType getSearchTypeByTabId(String paramString)
  {
    for (SearchType localSearchType : values())
      if (localSearchType.getTabId().equals(paramString))
        return localSearchType;
    return ALL;
  }

  public static SearchType parseExplicitFromTypeKey(String paramString)
  {
    for (SearchType localSearchType : EXPLICIT_SEARCH_TYPES)
      if (localSearchType.getTypeKey().equals(paramString))
        return localSearchType;
    return ALL;
  }

  public static SearchType parseFrom(String paramString)
  {
    for (SearchType localSearchType : values())
      if (localSearchType.name().equals(paramString))
        return localSearchType;
    return ALL;
  }

  public static SearchType parseFrom(String paramString1, String paramString2)
  {
    for (SearchType localSearchType : values())
      if ((localSearchType.typeKey.equals(paramString1)) && ((localSearchType.subTypeKey == null) || (localSearchType.subTypeKey.equals(paramString2)) || ((paramString2 == null) && (APP == localSearchType))))
        return localSearchType;
    return ALL;
  }

  public final int getPattern()
  {
    return this.pattern;
  }

  public final String getSubTypeKey()
  {
    return this.subTypeKey;
  }

  public final String getTabId()
  {
    return this.tabId;
  }

  public final String getTypeKey()
  {
    return this.typeKey;
  }

  public final int getTypeStringId()
  {
    return this.typeStringId;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.search.utils.SearchConst.SearchType
 * JD-Core Version:    0.6.0
 */