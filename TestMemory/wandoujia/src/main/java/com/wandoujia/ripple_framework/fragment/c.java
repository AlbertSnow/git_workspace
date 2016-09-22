package com.wandoujia.ripple_framework.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class c extends h
{
  c(BaseFragment paramBaseFragment)
  {
  }

  public final boolean a(View paramView)
  {
    if (this.a.getActivity() != null)
      this.a.getActivity().onBackPressed();
    a(paramView, Logger.Module.UI, ViewLogPackage.Element.MENU_ITEM, ViewLogPackage.Action.CLOSE, "onBackPressed", Long.valueOf(0L));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.fragment.c
 * JD-Core Version:    0.6.0
 */