package com.wandoujia.jupiter.homepage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.search.view.a;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class o extends h
{
  o(HomePageFragment paramHomePageFragment)
  {
  }

  public final boolean a(View paramView)
  {
    if (HomePageFragment.g(this.a).a())
    {
      String str = HomePageFragment.g(this.a).b();
      if (TextUtils.isEmpty(str))
        str = HomePageFragment.h(this.a).getHint().toString();
      if (!TextUtils.isEmpty(str.trim()))
      {
        i.k().a("navigation");
        NavigationManager.a(paramView.getContext(), str, "MANUAL_REC");
        a(paramView, Logger.Module.UI, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "wdj://search/result/" + str, null);
        return true;
      }
    }
    HomePageFragment.h(this.a).performClick();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.o
 * JD-Core Version:    0.6.0
 */