package com.wandoujia.logv3.toolkit;

import android.support.v4.app.Fragment;
import android.support.v4.view.at;
import android.support.v4.view.ck;

final class af
  implements ck
{
  af(LogViewPager paramLogViewPager)
  {
  }

  public final void a(int paramInt)
  {
    at localat = this.a.getAdapter();
    if (((localat instanceof ai)) && (LogViewPager.b(this.a) != paramInt))
    {
      Fragment localFragment1 = ((ai)localat).e(LogViewPager.b(this.a));
      if ((localFragment1 instanceof aj))
        ((aj)localFragment1).j();
      LogViewPager.a(this.a, paramInt);
      Fragment localFragment2 = ((ai)localat).e(LogViewPager.b(this.a));
      if ((localFragment2 instanceof aj))
        ((aj)localFragment2).i();
    }
    if (LogViewPager.a(this.a) != null)
      LogViewPager.a(this.a).a(paramInt);
    LogViewPager.c(this.a);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (LogViewPager.a(this.a) != null)
      LogViewPager.a(this.a).a(paramInt1, paramFloat, paramInt2);
  }

  public final void b(int paramInt)
  {
    if (LogViewPager.a(this.a) != null)
      LogViewPager.a(this.a).b(paramInt);
    if (paramInt == 0)
      LogViewPager.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.af
 * JD-Core Version:    0.6.0
 */