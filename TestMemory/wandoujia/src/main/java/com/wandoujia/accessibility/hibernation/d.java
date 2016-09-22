package com.wandoujia.accessibility.hibernation;

import com.wandoujia.accessibility.hibernation.view.AppHibernatingView;

final class d
  implements Runnable
{
  d(HibernationManager paramHibernationManager)
  {
  }

  public final void run()
  {
    if (HibernationManager.e(this.a) != null)
    {
      AppHibernatingView localAppHibernatingView = HibernationManager.e(this.a);
      android.support.v4.app.d.a(HibernationManager.i(this.a), localAppHibernatingView);
    }
    HibernationManager.j(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.d
 * JD-Core Version:    0.6.0
 */