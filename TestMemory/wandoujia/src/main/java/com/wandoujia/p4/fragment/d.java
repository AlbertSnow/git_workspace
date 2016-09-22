package com.wandoujia.p4.fragment;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.wandoujia.p4.adapter.h;

final class d
  implements AbsListView.OnScrollListener
{
  d(NetworkListAsyncloadFragment paramNetworkListAsyncloadFragment)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    NetworkListAsyncloadFragment.p();
    if ((paramInt2 + paramInt1 != paramInt3) || (this.a.b.getCount() <= 0) || (!this.a.a(paramInt3)))
      return;
    NetworkListAsyncloadFragment.a(this.a);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    NetworkListAsyncloadFragment.p();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.d
 * JD-Core Version:    0.6.0
 */