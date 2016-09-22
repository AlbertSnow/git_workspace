package com.wandoujia.p4.app_launcher.fragment;

import android.support.v4.app.b;
import android.view.View;
import com.wandoujia.launcher_base.launcher.c.m;

final class a
  implements m
{
  a(ALHomeFragment paramALHomeFragment)
  {
  }

  public final void a(int paramInt)
  {
    View localView = ALHomeFragment.a(this.a);
    b.a(localView, "apps/app_launcher/pages/" + paramInt);
    b.q(localView.getContext());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.fragment.a
 * JD-Core Version:    0.6.0
 */