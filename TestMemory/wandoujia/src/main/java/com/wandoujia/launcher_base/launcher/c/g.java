package com.wandoujia.launcher_base.launcher.c;

import com.wandoujia.launcher_base.launcher.a.a;

final class g
  implements Runnable
{
  g(d paramd)
  {
  }

  public final void run()
  {
    if (d.a(this.a) != null)
    {
      if (!d.c(this.a).b())
        break label39;
      d.d(this.a);
    }
    while (true)
    {
      d.f(this.a);
      return;
      label39: d.e(this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.c.g
 * JD-Core Version:    0.6.0
 */