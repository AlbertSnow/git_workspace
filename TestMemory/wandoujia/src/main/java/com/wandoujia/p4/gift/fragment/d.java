package com.wandoujia.p4.gift.fragment;

import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.c.j;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.gift.http.model.GiftModel;
import com.wandoujia.p4.gift.http.model.GiftModel.GiftViewType;
import com.wandoujia.p4.gift.view.a.e;
import com.wandoujia.p4.gift.view.model.a;
import com.wandoujia.p4.gift.view.model.b;
import com.wandoujia.p4.gift.views.RecommendGiftCardView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class d
  implements j<GiftModel>
{
  d(MyGiftListFragment paramMyGiftListFragment)
  {
  }

  public final void a(int paramInt1, int paramInt2, k<GiftModel> paramk)
  {
    ArrayList localArrayList;
    if ((paramk.a != null) && (!paramk.a.isEmpty()))
    {
      localArrayList = new ArrayList();
      Iterator localIterator = paramk.a.iterator();
      while (localIterator.hasNext())
      {
        GiftModel localGiftModel = (GiftModel)localIterator.next();
        if (localGiftModel.isReceived())
          continue;
        if (localArrayList.size() >= 2)
          break;
        localArrayList.add(new a(localGiftModel.setGiftViewType(GiftModel.GiftViewType.GIFT_RECOMMEND), GiftModel.GiftViewType.GIFT_RECOMMEND));
      }
      if (!localArrayList.isEmpty());
    }
    else
    {
      return;
    }
    if (MyGiftListFragment.h(this.a) == null)
      MyGiftListFragment.a(this.a, RecommendGiftCardView.a(MyGiftListFragment.f(this.a)));
    new e().a(MyGiftListFragment.h(this.a), new b(localArrayList));
    MyGiftListFragment.b(this.a).a(0, MyGiftListFragment.h(this.a));
  }

  public final void a(int paramInt, ExecutionException paramExecutionException)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.fragment.d
 * JD-Core Version:    0.6.0
 */