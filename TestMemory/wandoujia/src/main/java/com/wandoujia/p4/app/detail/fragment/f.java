package com.wandoujia.p4.app.detail.fragment;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class f extends h
{
  f(AppCommentsFragment paramAppCommentsFragment)
  {
  }

  public final boolean a(View paramView)
  {
    boolean bool = AppCommentsFragment.d(this.a);
    AppCommentsFragment.e(this.a);
    Logger.Module localModule;
    ViewLogPackage.Element localElement;
    ViewLogPackage.Action localAction;
    String str;
    long l;
    if (bool)
    {
      localModule = Logger.Module.COMMENTS;
      localElement = ViewLogPackage.Element.BUTTON;
      localAction = ViewLogPackage.Action.SUBMIT;
      str = AppCommentsFragment.f(this.a);
      if (AppCommentsFragment.g(this.a) != null)
        break label75;
      l = 1L;
    }
    while (true)
    {
      a(paramView, localModule, localElement, localAction, str, Long.valueOf(l));
      return bool;
      label75: if (AppCommentsFragment.g(this.a).booleanValue())
      {
        l = 2L;
        continue;
      }
      l = 0L;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.fragment.f
 * JD-Core Version:    0.6.0
 */