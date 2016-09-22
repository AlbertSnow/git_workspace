package com.wandoujia.accessibility.hibernation;

import android.view.View;
import com.wandoujia.accessibility.hibernation.view.g;

final class c
  implements g
{
  c(HibernationManager paramHibernationManager)
  {
  }

  public final void a(View paramView)
  {
    paramView.setEnabled(false);
    HibernationManager.h(this.a);
  }

  public final void b(View paramView)
  {
    paramView.setEnabled(false);
    this.a.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.c
 * JD-Core Version:    0.6.0
 */