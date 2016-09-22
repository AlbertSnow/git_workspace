package com.wandoujia.game_launcher.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.widget.Toast;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.game_launcher.lib.R.string;
import com.wandoujia.launcher.LauncherConfig;
import com.wandoujia.launcher.LauncherConfig.LauncherType;
import com.wandoujia.launcher.launcher.b.c;
import com.wandoujia.launcher_base.download.receiver.ReceiverMonitor;
import com.wandoujia.ripple_framework.Config;
import java.util.ArrayList;
import java.util.List;

public class GameLauncherReceiver extends BroadcastReceiver
{
  private static void b()
  {
    if (("xiaomi".equals(Config.c())) || ("xiaomi".equals(Config.f())));
    for (boolean bool = false; bool; bool = OemUtil.canCreateShortcut())
    {
      com.wandoujia.launcher.e.a.a();
      return;
    }
    d.d(true);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (GlobalConfig.getAppContext() == null));
    String str1;
    do
      while (true)
      {
        return;
        str1 = paramIntent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str1))
        {
          ThreadPool.execute(new a(paramContext));
          if ((!"android.net.conn.CONNECTIVITY_CHANGE".equals(str1)) || ((NetworkInfo)paramIntent.getParcelableExtra("networkInfo") == null))
            continue;
          ReceiverMonitor.a().d();
          return;
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(str1))
        {
          if ((paramIntent.getData() != null) && (!TextUtils.isEmpty(paramIntent.getData().getSchemeSpecificPart())))
          {
            String str3 = paramIntent.getData().getSchemeSpecificPart();
            c.a().b(str3);
            if ("com.wandoujia.phoenix2".equals(str3))
              b();
            if (paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false))
              continue;
            new ArrayList().add(str3);
            ReceiverMonitor localReceiverMonitor3 = ReceiverMonitor.a();
            localReceiverMonitor3.b();
            return;
          }
          c.a().f();
          return;
        }
        if ("android.intent.action.PACKAGE_ADDED".equals(str1))
        {
          if ((paramIntent.getData() != null) && (!TextUtils.isEmpty(paramIntent.getData().getSchemeSpecificPart())))
          {
            String str2 = paramIntent.getData().getSchemeSpecificPart();
            c.a().c(str2);
            if (("com.wandoujia.game_launcher".equals(str2)) && (LauncherConfig.b() == LauncherConfig.LauncherType.NATIVE_GL))
            {
              com.wandoujia.launcher.launcher.utils.b.a();
              Toast.makeText(GlobalConfig.getAppContext(), R.string.wan_gamefolder_shortcut_create_success, 0).show();
            }
            if (paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false))
              continue;
            new ArrayList().add(str2);
            ReceiverMonitor localReceiverMonitor2 = ReceiverMonitor.a();
            localReceiverMonitor2.b();
            return;
          }
          c.a().i();
          return;
        }
        if ("android.intent.action.MEDIA_MOUNTED".equals(str1))
        {
          ReceiverMonitor localReceiverMonitor1 = ReceiverMonitor.a();
          localReceiverMonitor1.c();
          return;
        }
        if (!"android.intent.action.BOOT_COMPLETED".equals(str1))
          break;
        if ((!com.wandoujia.launcher.e.a.b(paramContext)) || (android.support.v4.app.b.h(paramContext, com.wandoujia.launcher.e.a.a(paramContext))) || (AppManager.a().h("com.wandoujia.phoenix2")))
          continue;
        d.d(false);
        b();
        return;
      }
    while ((!"launcher.intent.action.SHORTCUT_CREATED".equals(str1)) || (LauncherConfig.b() != LauncherConfig.LauncherType.NATIVE_GL));
    com.wandoujia.launcher.launcher.utils.b.a(paramContext);
    d.d(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.receivers.GameLauncherReceiver
 * JD-Core Version:    0.6.0
 */