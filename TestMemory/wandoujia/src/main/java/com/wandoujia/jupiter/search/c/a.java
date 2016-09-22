package com.wandoujia.jupiter.search.c;

import android.content.Context;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.search.manage.SearchHistoryManager;
import com.wandoujia.jupiter.search.manage.SearchHistoryManager.SearchHistory.SearchHistoryItem;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.jupiter.search.utils.SearchConst.SearchType;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  implements e<Model>
{
  private SearchTypeForHint a;

  public a(SearchTypeForHint paramSearchTypeForHint)
  {
    this.a = paramSearchTypeForHint;
  }

  private static List<Model> b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = JupiterApplication.d().f().a(SearchConst.SearchType.ALL).iterator();
    while (localIterator.hasNext())
    {
      SearchHistoryManager.SearchHistory.SearchHistoryItem localSearchHistoryItem = (SearchHistoryManager.SearchHistory.SearchHistoryItem)localIterator.next();
      localArrayList.add(new Model(new Entity.Builder().title(localSearchHistoryItem.query).content_type(ContentTypeEnum.ContentType.KEYWORD).template_type(TemplateTypeEnum.TemplateType.QUERY_HISTORY_KEYWORD).action(new Action.Builder().intent("wdj://explore/search/home/" + localSearchHistoryItem.query).build()).build()));
    }
    return localArrayList;
  }

  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList);
    SearchTypeForHint localSearchTypeForHint = this.a;
    localArrayList.add(new Model(new Entity.Builder().title(JupiterApplication.e().getString(2131625699)).content_type(ContentTypeEnum.ContentType.BUTTON).template_type(TemplateTypeEnum.TemplateType.VIEW_ALL_ACTION).action(new Action.Builder().intent("wdj://explore/search/hot?KEY_SEARCH_TYPE_FOR_HINT=" + localSearchTypeForHint.name()).build()).build()));
    List localList = b();
    if (!CollectionUtils.isEmpty(localList))
    {
      localArrayList.addAll(localList);
      localArrayList.add(new Model(new Entity.Builder().title(JupiterApplication.e().getString(2131625242)).content_type(ContentTypeEnum.ContentType.KEYWORD).template_type(TemplateTypeEnum.TemplateType.QUERY_HISTORY_CLEAR_ALL).build()));
    }
    return localArrayList;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.c.a
 * JD-Core Version:    0.6.0
 */