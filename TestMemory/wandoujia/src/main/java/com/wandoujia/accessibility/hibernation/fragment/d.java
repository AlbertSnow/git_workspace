package com.wandoujia.accessibility.hibernation.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.accessibility.AccessibilityDispatcher;
import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.accessibility.hibernation.view.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.accessibility.R.string;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class d
  implements View.OnClickListener
{
  d(BoosterHomeFragment paramBoosterHomeFragment)
  {
  }

  public final void onClick(View paramView)
  {
    v.b().a(paramView, Logger.Module.APP_LAUNCHER.name()).a(paramView, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.SUBMIT, "").d(paramView);
    if ((com.wandoujia.accessibility.a.a.d()) && (!AccessibilityManager.a()))
    {
      new b(this.a.getActivity()).a(this.a.getString(R.string.accessibility_unable_title)).b(this.a.getString(R.string.accessibility_unable_message)).a(this.a.getString(R.string.accessibility_unable_restart), new e(this)).a().show();
      return;
    }
    if (!AccessibilityManager.a())
    {
      AccessibilityDispatcher.a(BoosterHomeFragment.h(this.a));
      BoosterHomeFragment.g(this.a);
      return;
    }
    BoosterHomeFragment.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.d
 * JD-Core Version:    0.6.0
 */