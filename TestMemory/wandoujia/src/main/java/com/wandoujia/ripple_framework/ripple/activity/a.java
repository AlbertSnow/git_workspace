package com.wandoujia.ripple_framework.ripple.activity;

import android.support.v4.app.q;
import android.support.v4.app.r;

final class a
  implements r
{
  a(DetailActivity paramDetailActivity)
  {
  }

  public final void onBackStackChanged()
  {
    if (this.a.getSupportFragmentManager().e() == 0)
      this.a.finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.activity.a
 * JD-Core Version:    0.6.0
 */