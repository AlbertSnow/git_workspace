package com.wandoujia.jupiter.search.manage;

import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.Preferences;
import com.wandoujia.base.utils.Preferences.CustomEditor;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class a
{
  private Preferences a = Preferences.getById(com.wandoujia.p4.a.a(), "pref_search_hint");
  private Map<SearchTypeForHint, Set<String>> b = new HashMap();

  public final Set<String> a(SearchTypeForHint paramSearchTypeForHint)
  {
    monitorenter;
    while (true)
    {
      int j;
      try
      {
        if (this.b != null)
          continue;
        SearchTypeForHint[] arrayOfSearchTypeForHint = SearchTypeForHint.values();
        int i = arrayOfSearchTypeForHint.length;
        j = 0;
        if (j >= i)
          continue;
        SearchTypeForHint localSearchTypeForHint = arrayOfSearchTypeForHint[j];
        Set localSet2 = this.a.getStringSet(localSearchTypeForHint.name(), null);
        if (!CollectionUtils.isEmpty(localSet2))
        {
          this.b.put(localSearchTypeForHint, localSet2);
          break label99;
          Set localSet1 = (Set)this.b.get(paramSearchTypeForHint);
          return localSet1;
        }
      }
      finally
      {
        monitorexit;
      }
      label99: j++;
    }
  }

  public final void a(SearchTypeForHint paramSearchTypeForHint, Set<String> paramSet)
  {
    monitorenter;
    try
    {
      this.b.put(paramSearchTypeForHint, paramSet);
      this.a.edit().putStringSet(paramSearchTypeForHint.name(), paramSet);
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
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.manage.a
 * JD-Core Version:    0.6.0
 */