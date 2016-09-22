package com.wandoujia.jupiter.search.manage;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.wandoujia.base.utils.Preferences;
import com.wandoujia.base.utils.Preferences.CustomEditor;
import com.wandoujia.jupiter.search.utils.SearchConst.SearchType;
import com.wandoujia.p4.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class SearchHistoryManager
{
  private Preferences a = Preferences.getById(a.a(), "pref_search_history");
  private SearchHistoryManager.SearchHistory b;
  private Set<WeakReference<c>> c = new HashSet();

  private SearchHistoryManager.SearchHistory a()
  {
    monitorenter;
    try
    {
      if (this.b == null)
      {
        this.b = ((SearchHistoryManager.SearchHistory)this.a.getObject("key_search_history_v2", SearchHistoryManager.SearchHistory.class, new SearchHistoryManager.SearchHistory()));
        this.b.normalize();
        SearchHistoryManager.SearchHistory localSearchHistory2 = b();
        if (localSearchHistory2 != null)
        {
          SearchHistoryManager.SearchHistory.access$000(this.b).addAll(SearchHistoryManager.SearchHistory.access$000(localSearchHistory2));
          this.a.edit().putObject("key_search_history_v2", this.b).commit();
        }
      }
      SearchHistoryManager.SearchHistory localSearchHistory1 = this.b;
      return localSearchHistory1;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private SearchHistoryManager.SearchHistory b()
  {
    if (this.a.contains("key_search_history"))
    {
      SearchHistoryManager.SearchHistory localSearchHistory;
      try
      {
        SearchHistoryManager.OldSearchHistory localOldSearchHistory = (SearchHistoryManager.OldSearchHistory)this.a.getObject("key_search_history", SearchHistoryManager.OldSearchHistory.class, new SearchHistoryManager.OldSearchHistory());
        localSearchHistory = new SearchHistoryManager.SearchHistory();
        if (localOldSearchHistory != null)
        {
          ArrayList localArrayList = new ArrayList(localOldSearchHistory.getHistory().entrySet());
          Collections.sort(localArrayList, new b());
          Iterator localIterator = localArrayList.iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            SearchHistoryManager.SearchHistory.access$000(localSearchHistory).add(new SearchHistoryManager.SearchHistory.SearchHistoryItem((String)localEntry.getKey(), SearchConst.SearchType.ALL));
          }
        }
      }
      catch (Exception localException1)
      {
        return null;
      }
      try
      {
        this.a.edit().remove("key_search_history").commit();
        return localSearchHistory;
      }
      catch (Exception localException2)
      {
        return localSearchHistory;
      }
    }
    return null;
  }

  private void b(String paramString, SearchConst.SearchType paramSearchType)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      while (true)
      {
        return;
        this.a.edit().putObject("key_search_history_v2", a().addSearchHistory(paramString, paramSearchType)).commit();
        c();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void c()
  {
    while (true)
    {
      Iterator localIterator;
      synchronized (this.c)
      {
        localIterator = this.c.iterator();
        if (!localIterator.hasNext())
          break;
        c localc = (c)((WeakReference)localIterator.next()).get();
        if (localc != null)
          localc.a();
      }
      localIterator.remove();
    }
    monitorexit;
  }

  public final List<SearchHistoryManager.SearchHistory.SearchHistoryItem> a(SearchConst.SearchType paramSearchType)
  {
    monitorenter;
    try
    {
      List localList = a().getSearchHistories(paramSearchType, 10);
      monitorexit;
      return localList;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final List<String> a(String paramString, SearchConst.SearchType paramSearchType)
  {
    monitorenter;
    try
    {
      List localList = a().getHistorySuggestions(paramString, paramSearchType, 10);
      monitorexit;
      return localList;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(c paramc)
  {
    synchronized (this.c)
    {
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
        if (paramc.equals((c)((WeakReference)localIterator.next()).get()))
          return;
      this.c.add(new WeakReference(paramc));
      return;
    }
  }

  public final void a(String paramString)
  {
    monitorenter;
    try
    {
      b(paramString, SearchConst.SearchType.ALL);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void b(SearchConst.SearchType paramSearchType)
  {
    monitorenter;
    try
    {
      if (paramSearchType == SearchConst.SearchType.ALL)
      {
        this.b = null;
        this.a.edit().remove("key_search_history_v2").commit();
      }
      while (true)
      {
        c();
        return;
        this.b = a();
        this.b.clear(paramSearchType);
        this.a.edit().putObject("key_search_history_v2", this.b).commit();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.manage.SearchHistoryManager
 * JD-Core Version:    0.6.0
 */