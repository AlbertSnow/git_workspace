package com.wandoujia.jupiter.subscribe;

import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.a.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class o extends a
{
  public final List<Model> a(List<Model> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      Model localModel1 = (Model)localIterator1.next();
      switch (p.a[localModel1.g().ordinal()])
      {
      default:
        localArrayList.add(localModel1);
        break;
      case 1:
        localArrayList.add(localModel1);
        List localList = localModel1.B();
        if (CollectionUtils.isEmpty(localList))
          continue;
        Iterator localIterator2 = localList.iterator();
        while (localIterator2.hasNext())
        {
          Model localModel2 = (Model)localIterator2.next();
          localModel2.O();
          localArrayList.add(localModel2);
        }
      }
    }
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.o
 * JD-Core Version:    0.6.0
 */