package com.wandoujia.logv3.toolkit.cardshow;

import android.view.View;
import android.widget.AbsListView.RecyclerListener;

final class c
  implements AbsListView.RecyclerListener
{
  c(CardShowGridView paramCardShowGridView)
  {
  }

  public final void onMovedToScrapHeap(View paramView)
  {
    CardShowGridView.a(this.a).a(paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.c
 * JD-Core Version:    0.6.0
 */