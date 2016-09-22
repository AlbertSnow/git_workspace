package com.wandoujia.jupiter.fragment;

import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.jupiter.share.ShareUtil.ShareContentType;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class ap extends com.wandoujia.ripple_framework.log.h
{
  ap(ao paramao, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if ((ReviewFragment.m(this.b.a.a) == null) || (ReviewFragment.n(this.b.a.a).getTitle() == null) || (ReviewFragment.k(this.b.a.a) == null) || (ReviewFragment.k(this.b.a.a).F() == null) || (TextUtils.isEmpty(ReviewFragment.k(this.b.a.a).F().package_name)))
      return false;
    String str = ReviewFragment.k(this.b.a.a).F().package_name;
    com.wandoujia.jupiter.h.k().a("navigation");
    NavigationManager.a(this.b.f(), this.a, ShareUtil.ShareContentType.REVIEW_SINGLE);
    a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.SHARE, str, null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.ap
 * JD-Core Version:    0.6.0
 */