package com.wandoujia.jupiter.library.fragment;

import android.support.v4.app.d;
import android.view.View;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.jupiter.view.l;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.launcher.e.a;
import com.wandoujia.launcher.launcher.utils.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.nirvana.framework.ui.recycler.g;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class k
  implements l
{
  k(AppUpgradeFragment paramAppUpgradeFragment)
  {
  }

  public final void a(View paramView)
  {
    Config.F();
    AppUpgradeFragment.i(this.a).a(false);
    i.k().h().a(paramView, Logger.Module.ME_APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.CLOSE, "close_gl_card", Long.valueOf(0L));
  }

  public final void b(View paramView)
  {
    Config.F();
    if (!AppManager.a().h("com.wandoujia.game_launcher"))
    {
      d.d(false);
      a.a();
    }
    while (true)
    {
      p.a(this.a.getActivity(), 2131624580, p.b).a();
      i.k().h().a(paramView, Logger.Module.ME_APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.OPEN, "generate_gl_shortcut", Long.valueOf(0L));
      return;
      b.a(true);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.k
 * JD-Core Version:    0.6.0
 */