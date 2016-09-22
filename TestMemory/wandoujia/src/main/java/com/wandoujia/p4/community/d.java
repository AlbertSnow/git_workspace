package com.wandoujia.p4.community;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

final class d
  implements AbsListView.OnScrollListener
{
  d(PullToRefreshAsyncloadFragment paramPullToRefreshAsyncloadFragment, ListView paramListView)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.a.getHeaderViewsCount();
    if ((paramInt1 == 0) && (paramAbsListView.getChildCount() > i))
    {
      View localView1 = paramAbsListView.getChildAt(this.a.getHeaderViewsCount());
      if (localView1 != null)
        PullToRefreshAsyncloadFragment.a(this.b, localView1.getTop());
      View localView2 = paramAbsListView.getChildAt(0);
      if (localView2 != null)
      {
        int j = localView2.getTop() - localView2.getPaddingTop() - this.a.getPaddingTop();
        int k = 0;
        if (j == 0)
          k = 1;
        if (k != 0)
          PullToRefreshAsyncloadFragment.a(this.b, true);
      }
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.d
 * JD-Core Version:    0.6.0
 */