package com.wandoujia.jupiter.search.fragment;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.nirvana.framework.network.page.g;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class d
  implements DataLoadListener
{
  d(SearchQueryHistoryFragment paramSearchQueryHistoryFragment)
  {
  }

  public final void a(DataLoadListener.Op paramOp)
  {
  }

  public final void a(DataLoadListener.Op paramOp, g paramg)
  {
    SearchQueryHistoryFragment.a(this.a);
    Iterator localIterator = SearchQueryHistoryFragment.b(this.a).c().iterator();
    while ((localIterator.hasNext()) && (((Model)localIterator.next()).b().content_type != ContentTypeEnum.ContentType.BUTTON))
      SearchQueryHistoryFragment.c(this.a);
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.fragment.d
 * JD-Core Version:    0.6.0
 */