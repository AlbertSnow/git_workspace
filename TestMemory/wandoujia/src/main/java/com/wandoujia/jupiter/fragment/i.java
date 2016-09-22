package com.wandoujia.jupiter.fragment;

import android.support.v7.widget.Toolbar;
import android.view.View;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class i extends com.wandoujia.ripple_framework.log.h
{
  i(h paramh, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if ((DetailFragment.q(this.b.a.a) == null) || (DetailFragment.r(this.b.a.a).getTitle() == null))
      return false;
    com.wandoujia.jupiter.h.k().a("navigation");
    NavigationManager.a(this.b.f(), this.a, ShareUtil.ShareContentType.APP);
    a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.SHARE, DetailFragment.d(this.b.a.a), null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.i
 * JD-Core Version:    0.6.0
 */