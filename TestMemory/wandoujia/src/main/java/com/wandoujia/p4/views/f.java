package com.wandoujia.p4.views;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class f
  implements AbsListView.OnScrollListener
{
  f(ContentListView paramContentListView)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    View localView = paramAbsListView.getChildAt(0);
    if (localView != null)
    {
      if ((paramInt1 != 0) || (localView.getTop() != 0))
        break label41;
      ContentListView.a(this.a, false);
      ContentListView.a(this.a);
    }
    label41: 
    do
      return;
    while (ContentListView.b(this.a));
    ContentListView.a(this.a, true);
    ContentListView.c(this.a);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.f
 * JD-Core Version:    0.6.0
 */