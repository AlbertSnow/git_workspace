package com.wandoujia.jupiter.search.manage;

import com.wandoujia.jupiter.search.utils.SearchConst.SearchType;
import java.io.Serializable;

public class SearchHistoryManager$SearchHistory$SearchHistoryItem
  implements Serializable
{
  public String query;
  public String searchType;

  public SearchHistoryManager$SearchHistory$SearchHistoryItem(String paramString, SearchConst.SearchType paramSearchType)
  {
    this.query = paramString;
    this.searchType = paramSearchType.name();
  }

  public void normalize()
  {
    for (SearchConst.SearchType localSearchType : SearchConst.SearchType.values())
    {
      if (!localSearchType.getTypeKey().equals(this.searchType))
        continue;
      this.searchType = localSearchType.name();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.manage.SearchHistoryManager.SearchHistory.SearchHistoryItem
 * JD-Core Version:    0.6.0
 */