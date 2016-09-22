package com.wandoujia.accessibility.hibernation;

import java.util.List;

final class g
  implements Runnable
{
  g(HibernationManager paramHibernationManager)
  {
  }

  public final void run()
  {
    if (!HibernationManager.a(this.a))
      return;
    HibernationManager.a(this.a, (String)HibernationManager.c(this.a).get(HibernationManager.f(this.a)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.g
 * JD-Core Version:    0.6.0
 */