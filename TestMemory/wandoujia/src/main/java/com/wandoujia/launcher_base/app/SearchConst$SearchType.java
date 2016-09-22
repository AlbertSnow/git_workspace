package com.wandoujia.launcher_base.app;

import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.entities.app.TabCategory;
import com.wandoujia.launcher_base.R.string;

public enum SearchConst$SearchType
  implements TabCategory
{
  private int pattern;
  private String subTypeKey;
  private String tabId;
  private String typeKey;
  private int typeStringId;

  static
  {
    SearchType[] arrayOfSearchType = new SearchType[2];
    arrayOfSearchType[0] = APP;
    arrayOfSearchType[1] = GAME;
    $VALUES = arrayOfSearchType;
  }

  private SearchConst$SearchType(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    this.typeKey = paramString1;
    this.pattern = paramInt1;
    this.tabId = paramString3;
    this.subTypeKey = paramString2;
    this.typeStringId = paramInt2;
  }

  public static SearchType parseFrom(String paramString)
  {
    for (SearchType localSearchType : values())
      if (localSearchType.name().equals(paramString))
        return localSearchType;
    return APP;
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
 * Qualified Name:     com.wandoujia.launcher_base.app.SearchConst.SearchType
 * JD-Core Version:    0.6.0
 */