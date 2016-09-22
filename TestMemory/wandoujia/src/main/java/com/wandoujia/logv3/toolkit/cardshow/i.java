package com.wandoujia.logv3.toolkit.cardshow;

import android.content.Context;
import android.view.View;
import com.wandoujia.logv3.toolkit.v;
import java.util.List;

final class i
  implements Runnable
{
  private View a;
  private long b;

  i(h paramh)
  {
  }

  public final i a(long paramLong)
  {
    this.b = paramLong;
    return this;
  }

  public final i a(View paramView)
  {
    this.a = paramView;
    return this;
  }

  public final void run()
  {
    if (!h.a(this.c));
    do
      return;
    while (h.b(this.c).contains(Long.valueOf(this.b)));
    Context localContext = this.a.getContext();
    if ((localContext instanceof com.wandoujia.logv3.toolkit.h))
      ((com.wandoujia.logv3.toolkit.h)localContext).onLogCardShow(this.a);
    while (true)
    {
      h.b(this.c).add(Long.valueOf(this.b));
      return;
      v.b().c(this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.cardshow.i
 * JD-Core Version:    0.6.0
 */