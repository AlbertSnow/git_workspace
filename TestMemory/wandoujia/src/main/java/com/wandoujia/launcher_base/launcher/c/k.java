package com.wandoujia.launcher_base.launcher.c;

import com.wandoujia.launcher_base.launcher.view.SlidingTabDot;
import java.lang.ref.WeakReference;

final class k
  implements Runnable
{
  k(d paramd, int paramInt)
  {
  }

  public final void run()
  {
    if (d.a(this.b) == null);
    n localn1;
    int i;
    do
    {
      do
      {
        return;
        localn1 = d.b(this.b, this.a);
      }
      while (localn1 == null);
      i = localn1.a();
    }
    while (d.h(this.b) == i);
    if (d.i(this.b) != null)
    {
      m localm = (m)d.i(this.b).get();
      if (localm != null)
        localm.a(this.a);
    }
    localn1.c();
    n localn2 = d.c(this.b, d.h(this.b));
    if (localn2 != null)
      localn2.d();
    d.d(this.b, i);
    d.j(this.b).setSelect(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.c.k
 * JD-Core Version:    0.6.0
 */