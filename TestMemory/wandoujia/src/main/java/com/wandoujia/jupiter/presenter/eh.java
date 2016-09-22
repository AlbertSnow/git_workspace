package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.Spinner;
import com.wandoujia.ripple_framework.view.ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class eh extends c
{
  private int a = 0;
  private int g = 0;

  private static List<ay> b(Model paramModel)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramModel == null) || (CollectionUtils.isEmpty(paramModel.B())))
      return localArrayList;
    Iterator localIterator = paramModel.B().iterator();
    while (localIterator.hasNext())
      localArrayList.add(new el((Model)localIterator.next()));
    return localArrayList;
  }

  protected final void a(Model paramModel)
  {
    Object localObject1 = null;
    if (CollectionUtils.isEmpty(paramModel.B()))
    {
      e().setVisibility(8);
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = paramModel.B().iterator();
    Object localObject2 = null;
    if (localIterator.hasNext())
    {
      Object localObject3 = (Model)localIterator.next();
      TemplateTypeEnum.TemplateType localTemplateType = ((Model)localObject3).g();
      switch (ek.a[localTemplateType.ordinal()])
      {
      default:
        localObject3 = localObject1;
      case 1:
      case 2:
      }
      while (true)
      {
        localObject1 = localObject3;
        break;
        List localList2 = ((Model)localObject3).B();
        if (!CollectionUtils.isEmpty(localList2))
          for (int j = 0; j < localList2.size(); j++)
          {
            Model localModel2 = (Model)localList2.get(j);
            localArrayList1.add(localModel2.n());
            if (localModel2.g() != TemplateTypeEnum.TemplateType.SELECTED_SEARCH_FILTER)
              continue;
            this.a = j;
          }
        localObject2 = localObject3;
        break;
        List localList1 = ((Model)localObject3).B();
        if (CollectionUtils.isEmpty(localList1))
          continue;
        for (int i = 0; i < localList1.size(); i++)
        {
          Model localModel1 = (Model)localList1.get(i);
          localArrayList2.add(localModel1.n());
          if (localModel1.g() != TemplateTypeEnum.TemplateType.SELECTED_SEARCH_SORTER)
            continue;
          this.g = i;
        }
      }
    }
    Spinner localSpinner1 = (Spinner)h().b(2131493714).a();
    com.wandoujia.jupiter.search.a.a locala1 = new com.wandoujia.jupiter.search.a.a();
    locala1.a(b(localObject2));
    localSpinner1.setOnMenuSelectListener(new ei(this, localSpinner1));
    localSpinner1.setAdapter(locala1);
    localSpinner1.a(this.a);
    Spinner localSpinner2 = (Spinner)h().b(2131493692).a();
    com.wandoujia.jupiter.search.a.a locala2 = new com.wandoujia.jupiter.search.a.a();
    locala2.a(b(localObject1));
    localSpinner2.setOnMenuSelectListener(new ej(this, localSpinner2));
    localSpinner2.setAdapter(locala2);
    localSpinner2.a(this.g);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.eh
 * JD-Core Version:    0.6.0
 */