package com.wandoujia.jupiter.fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ce;
import android.support.v7.widget.cf;
import android.view.View;

final class bj extends cf
{
  bj(ReviewTopicFragment paramReviewTopicFragment)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt)
  {
    super.a(paramRecyclerView, paramInt);
    if ((paramInt == 0) && (paramRecyclerView.getLayoutManager().b(0) == null) && (paramRecyclerView.getLayoutManager().p() > 0))
      ReviewTopicFragment.a(this.a, 255);
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    int i = 255;
    super.a(paramRecyclerView, paramInt1, paramInt2);
    View localView = paramRecyclerView.getLayoutManager().b(0);
    if ((localView == null) || (localView.getTop() > 0))
      return;
    int j = 255 * -localView.getTop() / ReviewTopicFragment.a(this.a).getMeasuredHeight();
    if (j > i);
    while (true)
    {
      ReviewTopicFragment.a(this.a, i);
      return;
      i = j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bj
 * JD-Core Version:    0.6.0
 */