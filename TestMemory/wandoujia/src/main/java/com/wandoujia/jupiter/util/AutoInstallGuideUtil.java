package com.wandoujia.jupiter.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Html;
import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.view.AutoInstallRecoverView;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.p4.settings.MainSettingActivity;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.util.BadgeUtil;

public final class AutoInstallGuideUtil
{
  private static AutoInstallRecoverView a;
  private static com.wandoujia.ripple_framework.l b = new c();

  public static void a(Context paramContext)
  {
    if ((a()) && (com.wandoujia.accessibility.a.b()))
      if ((!SystemUtil.aboveApiLevel(21)) && (!BadgeUtil.b(paramContext)) && (!com.wandoujia.p4.configs.Config.B()) && (a()))
      {
        String str2 = Boolean.TRUE.toString();
        com.wandoujia.online_config.c.a();
        if (str2.equalsIgnoreCase(ConfigStorage.a("auto_install_package_installer_guide_enable")))
        {
          new com.wandoujia.ripple_framework.view.a.h(paramContext).a(2131624227).b(2131624225).a(2131624233, new e(paramContext)).b(2131624613, new d()).a(new m()).a().show();
          b("popup_on_terminated", AutoInstallGuideUtil.DialogAction.SHOW);
          com.wandoujia.p4.configs.Config.a(true);
        }
      }
    String str1;
    do
    {
      do
      {
        return;
        if (com.wandoujia.p4.configs.Config.y())
          continue;
        ReceiverMonitor.a().a(b);
      }
      while ((com.wandoujia.p4.configs.Config.D()) || (BadgeUtil.b(paramContext)) || (!com.wandoujia.p4.configs.Config.w()) || (com.wandoujia.p4.configs.Config.y()) || (!d()));
      str1 = Boolean.TRUE.toString();
      com.wandoujia.online_config.c.a();
    }
    while (!str1.equalsIgnoreCase(ConfigStorage.a("auto_install_first_install_guide_enable")));
    new com.wandoujia.ripple_framework.view.a.h(paramContext).a(2131624212).b(2131624208).a(2131624209, new h(paramContext)).b(2131624613, new g()).a(new f()).a().show();
    b("first_install_dialog", AutoInstallGuideUtil.DialogAction.SHOW);
    com.wandoujia.p4.configs.Config.z();
  }

  public static void a(Context paramContext, int paramInt, n paramn)
  {
    if (com.wandoujia.p4.configs.Config.D())
    {
      paramn.a();
      return;
    }
    try
    {
      com.wandoujia.online_config.c.a();
      int n = Integer.parseInt(ConfigStorage.a("auto_install_batch_update_guide_count"));
      i = n;
      int j = com.wandoujia.p4.configs.Config.A();
      if ((!BadgeUtil.b(paramContext)) && (paramInt >= 5) && (d()) && (i > 0) && (j < i))
      {
        String str = System.getProperty("java.vm.version");
        if ((str != null) && (str.startsWith("2")))
        {
          k = 1;
          if (k == 0)
            break label232;
          m = paramInt / 2;
          com.wandoujia.ripple_framework.view.a.h localh = new com.wandoujia.ripple_framework.view.a.h(paramContext).a(2131624212);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(paramInt);
          arrayOfObject[1] = Integer.valueOf(paramInt * 3);
          arrayOfObject[2] = Integer.valueOf(m);
          localh.b(Html.fromHtml(paramContext.getString(2131624200, arrayOfObject))).a(2131624209, new k(paramContext, paramn)).b(2131624201, new j(j, paramn)).a(new i()).a().show();
          b("batch_update_dialog", AutoInstallGuideUtil.DialogAction.SHOW);
          return;
        }
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        int i = 0;
        continue;
        int k = 0;
        continue;
        label232: int m = paramInt / 5;
      }
      paramn.a();
    }
  }

  public static boolean a()
  {
    return (!AccessibilityManager.a()) && (!com.wandoujia.ripple_framework.Config.l()) && (!BadgeUtil.b(GlobalConfig.getAppContext())) && (!com.wandoujia.p4.configs.Config.D());
  }

  public static void b()
  {
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.AUTO_INSTALL_UNBIND).status(TaskEvent.Status.END).result(TaskEvent.Result.FAIL);
    v.b().a(localBuilder, new ExtraPackage.Builder());
  }

  public static void b(Context paramContext)
  {
    if ((SystemUtil.aboveApiLevel(21)) && (com.wandoujia.accessibility.a.b()) && (!BadgeUtil.b(paramContext)) && (!com.wandoujia.p4.configs.Config.B()) && (a()))
    {
      String str = Boolean.TRUE.toString();
      com.wandoujia.online_config.c.a();
      if ((str.equalsIgnoreCase(ConfigStorage.a("auto_install_package_installer_guide_enable"))) && (a == null))
      {
        AutoInstallRecoverView localAutoInstallRecoverView = AutoInstallRecoverView.a(paramContext);
        a = localAutoInstallRecoverView;
        localAutoInstallRecoverView.setActionListener(new l(paramContext));
        android.support.v4.app.d.a(com.wandoujia.ripple_framework.i.k().g(), a, false, false, true, false, paramContext.getResources().getDimensionPixelSize(2131427498), paramContext.getResources().getDimensionPixelSize(2131427497));
        com.wandoujia.p4.configs.Config.a(true);
        b("popup_on_terminated", AutoInstallGuideUtil.DialogAction.SHOW);
      }
    }
  }

  private static void b(String paramString, AutoInstallGuideUtil.DialogAction paramDialogAction)
  {
    ViewLogPackage.Builder localBuilder = new ViewLogPackage.Builder().module("auto_install_guide").name(paramString).value(Long.valueOf(paramDialogAction.ordinal()));
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().view_log_package(localBuilder.build()).status(TaskEvent.Status.READY);
    v.b().a(localBuilder1, new ExtraPackage.Builder());
  }

  public static void c(Context paramContext)
  {
    try
    {
      paramContext.startActivity(new Intent(paramContext, MainSettingActivity.class));
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }

  private static boolean d()
  {
    return (SystemUtil.aboveApiLevel(16)) && (!com.wandoujia.accessibility.a.c()) && ((!AccessibilityManager.a()) || ((AccessibilityManager.a()) && (!com.wandoujia.accessibility.a.d())));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.AutoInstallGuideUtil
 * JD-Core Version:    0.6.0
 */