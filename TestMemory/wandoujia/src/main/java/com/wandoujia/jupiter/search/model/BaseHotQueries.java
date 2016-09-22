package com.wandoujia.jupiter.search.model;

import android.text.TextUtils;
import com.wandoujia.jupiter.search.utils.SearchConst.SearchType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseHotQueries
  implements Serializable
{
  private static final long serialVersionUID = 7897312307032443724L;
  private List<BaseHotQueries.EditorQuery> editorQueries;
  private List<BaseHotQueries.BaseHotQuery> hotQueries;

  private List<BaseHotQueries.BaseHotQuery> getHotQueries(String paramString1, String paramString2, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if ((TextUtils.isEmpty(paramString1)) || (this.hotQueries == null))
      return localArrayList;
    Iterator localIterator = this.hotQueries.iterator();
    while (localIterator.hasNext())
    {
      BaseHotQueries.BaseHotQuery localBaseHotQuery = (BaseHotQueries.BaseHotQuery)localIterator.next();
      if ((!paramString1.equals(localBaseHotQuery.type)) || ((paramString2 != null) && ((paramString2 == null) || (!paramString2.equals(localBaseHotQuery.subType))) && ((paramString2 == null) || (paramBoolean) || (localBaseHotQuery.subType != null))))
        continue;
      localArrayList.add(localBaseHotQuery);
    }
    return localArrayList;
  }

  public List<BaseHotQueries.EditorQuery> getEditorQueries()
  {
    return this.editorQueries;
  }

  public List<BaseHotQueries.BaseHotQuery> getHotQueries()
  {
    return this.hotQueries;
  }

  public List<BaseHotQueries.BaseHotQuery> getHotQueries(SearchConst.SearchType paramSearchType)
  {
    String str1 = paramSearchType.getTypeKey();
    String str2 = paramSearchType.getSubTypeKey();
    if (paramSearchType == SearchConst.SearchType.GAME);
    for (boolean bool = true; ; bool = false)
      return getHotQueries(str1, str2, bool);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.model.BaseHotQueries
 * JD-Core Version:    0.6.0
 */