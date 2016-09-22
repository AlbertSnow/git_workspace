package com.wandoujia.accessibility.hibernation;

import com.wandoujia.accessibility.hibernation.view.AppHibernatingView;
import java.util.List;

final class b
  implements Runnable
{
  b(HibernationManager paramHibernationManager)
  {
  }

  public final void run()
  {
    if (!HibernationManager.a(this.a));
    String str;
    do
    {
      return;
      str = (String)HibernationManager.c(this.a).get(-1 + HibernationManager.b(this.a));
      HibernationManager.d(this.a).add(str);
    }
    while (HibernationManager.e(this.a) == null);
    HibernationManager.e(this.a).a(str, false);
    if (HibernationManager.b(this.a) < HibernationManager.c(this.a).size())
    {
      HibernationManager.a(this.a, (String)HibernationManager.c(this.a).get(HibernationManager.f(this.a)));
      return;
    }
    HibernationManager.g(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.b
 * JD-Core Version:    0.6.0
 */