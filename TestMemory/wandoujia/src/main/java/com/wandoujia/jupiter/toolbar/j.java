package com.wandoujia.jupiter.toolbar;

import android.view.View;
import com.wandoujia.api.proto.Action.Builder;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class j extends h
{
  j(MythingMenuView paramMythingMenuView)
  {
  }

  public final boolean a(View paramView)
  {
    if (((DownloadManager)i.k().a("download")).e() > 0)
    {
      ((NavigationManager)i.k().a("navigation")).a(this.a.getContext(), new Action.Builder().intent("wdj://me/downloads").build());
      a(paramView, Logger.Module.UI, ViewLogPackage.Element.MENU_ITEM, "wdj://me/downloads");
    }
    while (true)
    {
      return true;
      if (MythingMenuView.a(this.a) > 0)
      {
        ((NavigationManager)i.k().a("navigation")).a(this.a.getContext(), new Action.Builder().intent("wdj://me/upgrade_apps").build());
        a(paramView, Logger.Module.UI, ViewLogPackage.Element.MENU_ITEM, "wdj://me/upgrade_apps");
        continue;
      }
      ((NavigationManager)i.k().a("navigation")).a(this.a.getContext(), new Action.Builder().intent("wdj://me/apps").build());
      a(paramView, Logger.Module.UI, ViewLogPackage.Element.MENU_ITEM, "wdj://me/apps");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.j
 * JD-Core Version:    0.6.0
 */