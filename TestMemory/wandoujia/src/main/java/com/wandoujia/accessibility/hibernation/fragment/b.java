package com.wandoujia.accessibility.hibernation.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class b
  implements View.OnClickListener
{
  b(BoosterHomeFragment paramBoosterHomeFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (BoosterHomeFragment.b(this.a) != null)
    {
      BoosterHomeFragment.b(this.a).a();
      v.b().a(paramView, Logger.Module.APP_LAUNCHER.name()).a(paramView, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.INFORMATION, "").d(paramView);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.b
 * JD-Core Version:    0.6.0
 */