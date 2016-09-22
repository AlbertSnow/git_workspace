package com.wandoujia.p4.gift.fragment;

import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.c.j;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.p4.views.ContentListView;
import com.wandoujia.p4.views.FetchMoreFooterView;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class c
  implements j<com.wandoujia.p4.gift.view.model.a>
{
  c(MyGiftListFragment paramMyGiftListFragment)
  {
  }

  public final void a(int paramInt1, int paramInt2, k<com.wandoujia.p4.gift.view.model.a> paramk)
  {
    this.a.a();
    if (paramk.a.isEmpty())
      if (paramInt1 > 0)
      {
        MyGiftListFragment.b(this.a).b(MyGiftListFragment.a(this.a));
        MyGiftListFragment.a(this.a).b();
      }
    do
    {
      do
        return;
      while (MyGiftListFragment.c(this.a));
      com.wandoujia.p4.tips.a.a(this.a.getContentView(), TipsType.NO_GIFT_RESULT);
      return;
      MyGiftListFragment.b(this.a).b(MyGiftListFragment.a(this.a));
      MyGiftListFragment.a(this.a).a();
      List localList = CollectionUtils.replaceFromPosition(MyGiftListFragment.d(this.a).b(), paramk.a, paramInt1);
      MyGiftListFragment.d(this.a).a(localList);
    }
    while (MyGiftListFragment.e(this.a) == null);
    MyGiftListFragment.f(this.a).onRestoreInstanceState(MyGiftListFragment.e(this.a));
    MyGiftListFragment.g(this.a);
  }

  public final void a(int paramInt, ExecutionException paramExecutionException)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.fragment.c
 * JD-Core Version:    0.6.0
 */