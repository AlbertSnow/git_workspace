package com.wandoujia.jupiter.search.manage;

import com.wandoujia.jupiter.search.utils.SearchConst.SearchType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SearchHistoryManager$SearchHistory
  implements Serializable
{
  private List<SearchHistoryManager.SearchHistory.SearchHistoryItem> items = new LinkedList();

  public SearchHistory addSearchHistory(String paramString, SearchConst.SearchType paramSearchType)
  {
    SearchHistoryManager.SearchHistory.SearchHistoryItem localSearchHistoryItem = new SearchHistoryManager.SearchHistory.SearchHistoryItem(paramString, paramSearchType);
    this.items.remove(localSearchHistoryItem);
    this.items.add(0, localSearchHistoryItem);
    if (this.items.size() > 100)
      this.items.remove(-1 + this.items.size());
    return this;
  }

  public SearchHistory clear(SearchConst.SearchType paramSearchType)
  {
    if (paramSearchType == SearchConst.SearchType.ALL)
      this.items.clear();
    while (true)
    {
      return this;
      Iterator localIterator = this.items.iterator();
      while (localIterator.hasNext())
      {
        SearchHistoryManager.SearchHistory.SearchHistoryItem localSearchHistoryItem = (SearchHistoryManager.SearchHistory.SearchHistoryItem)localIterator.next();
        if (!paramSearchType.name().equals(localSearchHistoryItem.searchType))
          continue;
        localIterator.remove();
      }
    }
  }

  public List<String> getHistorySuggestions(String paramString, SearchConst.SearchType paramSearchType, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.items.iterator();
    while (localIterator.hasNext())
    {
      SearchHistoryManager.SearchHistory.SearchHistoryItem localSearchHistoryItem = (SearchHistoryManager.SearchHistory.SearchHistoryItem)localIterator.next();
      if (localArrayList.size() >= paramInt)
        break;
      if (((paramSearchType != SearchConst.SearchType.ALL) && (!paramSearchType.name().equals(localSearchHistoryItem.searchType))) || (!localSearchHistoryItem.query.contains(paramString)) || (localArrayList.contains(localSearchHistoryItem.query)))
        continue;
      localArrayList.add(localSearchHistoryItem.query);
    }
    return localArrayList;
  }

  public List<SearchHistoryManager.SearchHistory.SearchHistoryItem> getSearchHistories(SearchConst.SearchType paramSearchType, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.items.iterator();
    while (localIterator.hasNext())
    {
      SearchHistoryManager.SearchHistory.SearchHistoryItem localSearchHistoryItem = (SearchHistoryManager.SearchHistory.SearchHistoryItem)localIterator.next();
      if (localArrayList.size() >= paramInt)
        break;
      if (((paramSearchType != SearchConst.SearchType.ALL) && (!paramSearchType.name().equals(localSearchHistoryItem.searchType))) || (localHashSet.contains(localSearchHistoryItem.query)))
        continue;
      localArrayList.add(localSearchHistoryItem);
      localHashSet.add(localSearchHistoryItem.query);
    }
    return localArrayList;
  }

  public void normalize()
  {
    Iterator localIterator = this.items.iterator();
    while (localIterator.hasNext())
      ((SearchHistoryManager.SearchHistory.SearchHistoryItem)localIterator.next()).normalize();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.manage.SearchHistoryManager.SearchHistory
 * JD-Core Version:    0.6.0
 */