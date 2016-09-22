package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class av extends h
{
  av(au paramau, Model paramModel)
  {
  }

  public final boolean a(View paramView)
  {
    ((NavigationManager)i.k().a("navigation")).a(this.b.f(), this.a.F().package_name);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.av
 * JD-Core Version:    0.6.0
 */