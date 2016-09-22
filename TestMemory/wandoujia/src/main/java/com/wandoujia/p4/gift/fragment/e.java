package com.wandoujia.p4.gift.fragment;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.wandoujia.p4.gift.b.a;

final class e
  implements AbsListView.OnScrollListener
{
  e(MyGiftListFragment paramMyGiftListFragment)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 + paramInt1 != paramInt3) || (MyGiftListFragment.d(this.a).getCount() <= 0) || (paramInt3 == MyGiftListFragment.i(this.a)))
      return;
    MyGiftListFragment.a(this.a, paramInt3);
    MyGiftListFragment.j(this.a);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.fragment.e
 * JD-Core Version:    0.6.0
 */