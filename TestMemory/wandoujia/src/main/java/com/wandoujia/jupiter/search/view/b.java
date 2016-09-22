package com.wandoujia.jupiter.search.view;

import android.text.TextUtils;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.j;
import com.wandoujia.jupiter.search.model.SearchTypeForHint;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class b
  implements DataLoadListener<Model>
{
  b(a parama, SearchTypeForHint paramSearchTypeForHint)
  {
  }

  public final void a(DataLoadListener.Op paramOp)
  {
  }

  public final void a(DataLoadListener.Op paramOp, g<Model> paramg)
  {
    List localList = paramg.e;
    HashSet localHashSet;
    Iterator localIterator;
    if (!CollectionUtils.isEmpty(localList))
    {
      localHashSet = new HashSet();
      localIterator = localList.iterator();
    }
    while (true)
    {
      Model localModel;
      if (localIterator.hasNext())
      {
        localModel = (Model)localIterator.next();
        if ((a.a(this.b)) && (!TextUtils.isEmpty(localModel.q())))
        {
          localHashSet.clear();
          localHashSet.add(localModel.q());
          a.a(this.b, localModel.n());
        }
      }
      else
      {
        a.a(this.b, localHashSet);
        j.a().i().a(this.a, localHashSet);
        return;
      }
      localHashSet.add(localModel.n());
    }
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.b
 * JD-Core Version:    0.6.0
 */