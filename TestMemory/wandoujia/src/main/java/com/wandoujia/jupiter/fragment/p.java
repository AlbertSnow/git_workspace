package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class p extends h
{
  p(o paramo)
  {
  }

  public final boolean a(View paramView)
  {
    AppDetail localAppDetail = this.a.a.a.F();
    ((NavigationManager)i.k().a("navigation")).a(this.a.f(), android.support.v4.app.b.d(localAppDetail.package_name, localAppDetail.title, com.wandoujia.jupiter.util.b.f(localAppDetail), com.wandoujia.jupiter.util.b.d(localAppDetail)), false);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.p
 * JD-Core Version:    0.6.0
 */