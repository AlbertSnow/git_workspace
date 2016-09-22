package com.wandoujia.jupiter.downloadreminder;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import java.util.HashSet;
import java.util.Set;

public class NotInstallAppReceiver extends BroadcastReceiver
{
  private static void a(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    int i = paramString.hashCode();
    ((NotificationManager)paramContext.getSystemService("notification")).cancel(i);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    do
    {
      while (true)
      {
        return;
        if ("phoenix.intent.action.PromoteNotInstallApp".equals(paramIntent.getAction()))
        {
          String str3 = paramIntent.getStringExtra("PACKAGE_NAME_ARGU");
          i.k().h().a(Logger.Module.NOTIFICATION, ViewLogPackage.Action.REDIRECT, "notinstall_apps_notification_click", Long.valueOf(1L), str3);
          JupiterApplication.a().post(new h(str3));
          a(paramContext, str3);
          paramContext.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
          return;
        }
        if (!"android.intent.action.PACKAGE_REMOVED".equalsIgnoreCase(paramIntent.getAction()))
          break;
        String str2 = paramIntent.getData().getSchemeSpecificPart();
        if (TextUtils.isEmpty(str2))
          continue;
        HashSet localHashSet = new HashSet();
        localHashSet.add(str2);
        Config.b(localHashSet);
        return;
      }
      if (!"android.intent.action.PACKAGE_ADDED".equalsIgnoreCase(paramIntent.getAction()))
        continue;
      a(paramContext, paramIntent.getData().getSchemeSpecificPart());
      return;
    }
    while (!"phoenix.intent.action.HidePromote".equalsIgnoreCase(paramIntent.getAction()));
    String str1 = paramIntent.getStringExtra("PACKAGE_NAME_ARGU");
    i.k().h().a(Logger.Module.NOTIFICATION, ViewLogPackage.Action.REDIRECT, "notinstall_apps_notification_cancel", Long.valueOf(1L), str1);
    a(paramContext, str1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.downloadreminder.NotInstallAppReceiver
 * JD-Core Version:    0.6.0
 */