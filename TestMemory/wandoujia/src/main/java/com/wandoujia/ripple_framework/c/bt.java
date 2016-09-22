package com.wandoujia.ripple_framework.c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.AppDetail.AppPlatform;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.StatefulButton;

final class bt extends h
{
  bt(bs parambs, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if (this.a == null)
      return false;
    if ((this.a.F().app_platform != null) && (this.a.F().app_platform == AppDetail.AppPlatform.IOS))
    {
      Toast.makeText(paramView.getContext(), R.string.ios_app_can_not_install, 0).show();
      return false;
    }
    Intent localIntent;
    if ("google_play".equals(Config.f()))
    {
      String str = "https://play.google.com/store/apps/details?id=" + bs.a(this.b);
      localIntent = new Intent();
      localIntent.setAction("android.intent.action.VIEW");
      localIntent.setData(Uri.parse(str));
      if (AppManager.a().h("com.android.vending"))
        localIntent.setPackage("com.android.vending");
    }
    try
    {
      paramView.getContext().startActivity(localIntent);
      label145: i.k().h().a(paramView, Logger.Module.UI, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "google_play", null).c(paramView);
      return true;
      switch (by.a[this.b.h.ordinal()])
      {
      default:
        if (!bs.b(this.b).getContext().getResources().getString(R.string.install).equals(bs.b(this.b).getText()))
          break;
        a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.DOWNLOAD, this.a.F().package_name, null);
      case 1:
      case 2:
      }
      while (true)
      {
        bs.d(this.b);
        this.b.a(paramView.getContext());
        while (true)
        {
          return true;
          a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.PAUSE, this.a.F().package_name, null);
          ((AppTaskManager)i.k().a("app_task")).a(this.a);
          continue;
          a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.OPEN, this.a.F().package_name, null);
          i.k().a("app");
          AppManager.b(this.a.F().package_name);
        }
        if (bs.b(this.b).getContext().getResources().getString(R.string.upgrade).equals(bs.b(this.b).getText()))
        {
          a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.UPGRADE, this.a.F().package_name, null);
          if ((this.a.a(R.id.careful_upgrade) == null) || (!((Boolean)this.a.a(R.id.careful_upgrade)).booleanValue()))
            continue;
          if (Config.h())
          {
            bs.c(this.b);
            return true;
          }
          AppManager.a().b(bs.a(this.b), true);
          continue;
        }
        a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.RESUME, this.a.F().package_name, null);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      break label145;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bt
 * JD-Core Version:    0.6.0
 */