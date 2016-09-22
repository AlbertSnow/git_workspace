package com.wandoujia.jupiter.search.c;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity.Builder;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.search.manage.SearchHistoryManager;
import com.wandoujia.jupiter.search.utils.SearchConst.SearchType;
import com.wandoujia.nirvana.framework.network.page.e;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  implements e<Model>
{
  private String a;

  public b(String paramString)
  {
    this.a = paramString;
  }

  private List<Model> b(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = JupiterApplication.d().f().a(this.a, SearchConst.SearchType.ALL).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (localArrayList.size() >= 2)
        break;
      if (paramList.contains(str))
        continue;
      localArrayList.add(new Model(new Entity.Builder().title(str).content_type(ContentTypeEnum.ContentType.HISTORY).template_type(TemplateTypeEnum.TemplateType.SUGGESTION_TEXT).build()));
    }
    return localArrayList;
  }

  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList1 = new ArrayList(paramList);
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList2.add(((Model)localIterator.next()).n());
    List localList = b(localArrayList2);
    if ((paramList.size() > 0) && (((Model)paramList.get(0)).g() == TemplateTypeEnum.TemplateType.SINGLE_MICRO))
    {
      localArrayList1.addAll(1, localList);
      return localArrayList1;
    }
    localArrayList1.addAll(0, localList);
    return localArrayList1;
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.c.b
 * JD-Core Version:    0.6.0
 */