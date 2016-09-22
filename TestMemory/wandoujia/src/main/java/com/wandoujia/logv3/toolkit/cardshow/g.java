package com.wandoujia.logv3.toolkit.cardshow;

import android.view.View;
import android.widget.AbsListView.RecyclerListener;

final class g
  implements AbsListView.RecyclerListener
{
  g(CardShowListView paramCardShowListView)
  {
  }

  public final void onMovedToScrapHeap(View paramView)
  {
    CardShowListView.a(this.a).a(paramView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.g
 * JD-Core Version:    0.6.0
 */