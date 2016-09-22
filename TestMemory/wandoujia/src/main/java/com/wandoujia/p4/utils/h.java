package com.wandoujia.p4.utils;

import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.i;

final class h
  implements Runnable
{
  h(g paramg)
  {
  }

  public final void run()
  {
    g.a(this.a);
    ((NavigationManager)i.k().a("navigation")).a(g.b(this.a), g.c(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.h
 * JD-Core Version:    0.6.0
 */