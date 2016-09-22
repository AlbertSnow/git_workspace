package com.wandoujia.ripple_framework.view;

import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.support.v4.view.bb;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;
import com.wandoujia.ripple_framework.R.id;

public final class bg
  implements bf
{
  public bg(SwipeBackContainer paramSwipeBackContainer)
  {
  }

  public final boolean a(View paramView, int paramInt)
  {
    int i = 1;
    int j;
    ViewPager localViewPager;
    if (paramInt == 0)
    {
      j = i;
      if (!(paramView instanceof ViewPager))
        break label100;
      localViewPager = (ViewPager)paramView;
      if (localViewPager.getAdapter() != null)
        break label40;
      i = 0;
    }
    label40: label100: 
    do
    {
      AbsListView localAbsListView;
      do
      {
        do
        {
          return i;
          j = -1;
          break;
          View localView = ((Fragment)localViewPager.getAdapter().a(this.a, localViewPager.getCurrentItem())).getView();
          if (localView == null)
            return false;
          RecyclerView localRecyclerView = (RecyclerView)localView.findViewById(R.id.recycler_view);
          if (localRecyclerView == null)
            return false;
          return android.support.v4.view.bg.b(localRecyclerView, j);
          if (((paramView instanceof bb)) || (Build.VERSION.SDK_INT >= 14))
            return android.support.v4.view.bg.b(paramView, j);
          if (paramInt != 0)
            break label148;
          if ((paramView instanceof AbsListView))
            return false;
        }
        while (paramView.getScrollY() < paramView.getMeasuredHeight());
        return false;
        if (!(paramView instanceof AbsListView))
          break label196;
        localAbsListView = (AbsListView)paramView;
      }
      while ((localAbsListView.getChildCount() > 0) && ((localAbsListView.getFirstVisiblePosition() > 0) || (localAbsListView.getChildAt(0).getTop() < localAbsListView.getPaddingTop())));
      return false;
    }
    while (paramView.getScrollY() > 0);
    label148: label196: return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.bg
 * JD-Core Version:    0.6.0
 */