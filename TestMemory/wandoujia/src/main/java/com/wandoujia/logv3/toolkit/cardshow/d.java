package com.wandoujia.logv3.toolkit.cardshow;

import android.os.Handler;

final class d
  implements Runnable
{
  d(CardShowHorizontalScrollView paramCardShowHorizontalScrollView)
  {
  }

  public final void run()
  {
    if (this.a.getScrollX() == CardShowHorizontalScrollView.a(this.a))
    {
      CardShowHorizontalScrollView.a(this.a, CardShowHorizontalScrollView.ScrollType.IDLE);
      if (CardShowHorizontalScrollView.b(this.a) != null)
        CardShowHorizontalScrollView.b(this.a).a(CardShowHorizontalScrollView.c(this.a));
      CardShowHorizontalScrollView.d(this.a).removeCallbacks(this);
      return;
    }
    CardShowHorizontalScrollView.a(this.a, CardShowHorizontalScrollView.ScrollType.FLING);
    if (CardShowHorizontalScrollView.b(this.a) != null)
      CardShowHorizontalScrollView.b(this.a).a(CardShowHorizontalScrollView.c(this.a));
    CardShowHorizontalScrollView.a(this.a, this.a.getScrollX());
    CardShowHorizontalScrollView.d(this.a).postDelayed(this, CardShowHorizontalScrollView.e(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.d
 * JD-Core Version:    0.6.0
 */