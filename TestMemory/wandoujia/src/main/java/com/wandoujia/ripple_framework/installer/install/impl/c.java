package com.wandoujia.ripple_framework.installer.install.impl;

import com.wandoujia.ripple_framework.i;
import java.util.Map;

final class c
  implements Runnable
{
  c(a parama, String paramString)
  {
  }

  public final void run()
  {
    a.a(this.b).remove(this.a);
    if (a.a(this.b).size() == 0)
      ((de.greenrobot.event.c)i.k().a("event_bus")).c(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.impl.c
 * JD-Core Version:    0.6.0
 */