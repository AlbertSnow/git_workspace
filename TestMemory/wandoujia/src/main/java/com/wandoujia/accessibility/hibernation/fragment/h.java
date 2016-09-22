package com.wandoujia.accessibility.hibernation.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.wandoujia.accessibility.hibernation.view.FlowLayout;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.ripple_framework.accessibility.R.drawable;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class h
  implements View.OnClickListener
{
  h(BoosterHomeFragment paramBoosterHomeFragment)
  {
  }

  public final void onClick(View paramView)
  {
    long l;
    if (BoosterHomeFragment.k(this.a).getVisibility() == 0)
    {
      ((ImageView)paramView).setImageResource(R.drawable.ic_arrow_up_grey);
      BoosterHomeFragment.k(this.a).setVisibility(8);
      BoosterHomeFragment.l(this.a).setVisibility(0);
      l = 1L;
    }
    while (true)
    {
      v.b().a(paramView, Logger.Module.APP_LAUNCHER.name()).a(paramView, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.EXPAND, "KillList isExpand", Long.valueOf(l)).d(paramView);
      return;
      ((ImageView)paramView).setImageResource(R.drawable.ic_arrow_down_grey);
      BoosterHomeFragment.k(this.a).setVisibility(0);
      BoosterHomeFragment.l(this.a).setVisibility(8);
      l = 0L;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.h
 * JD-Core Version:    0.6.0
 */