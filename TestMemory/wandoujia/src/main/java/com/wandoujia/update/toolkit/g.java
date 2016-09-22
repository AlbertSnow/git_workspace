package com.wandoujia.update.toolkit;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.support.v4.app.aw;
import android.support.v4.app.b;
import com.wandoujia.gson.c;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.LocalUpdateService.UpdateParams;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.protocol.UpdateInfo.SelfUpdatePriority;
import java.io.File;

public final class g
{
  private static int a = -1;
  private static Class<? extends LocalUpdateService> b;

  public static ComponentName a(Context paramContext, LocalUpdateService.UpdateParams paramUpdateParams)
  {
    Intent localIntent = new Intent(paramContext, b);
    c localc = new c();
    try
    {
      localIntent.putExtra("UPDATE_PARAMS", localc.a(paramUpdateParams));
      return paramContext.startService(localIntent);
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static SelfUpdateResult a()
  {
    String str = b.S();
    return (SelfUpdateResult)new c().a(str, new h().getType());
  }

  public static void a(int paramInt)
  {
    a = paramInt;
  }

  public static void a(Context paramContext, Intent paramIntent, UpdateInfo paramUpdateInfo)
  {
    PendingIntent localPendingIntent = PendingIntent.getService(paramContext, 0, paramIntent, 0);
    aw localaw1 = new aw(paramContext).a(paramUpdateInfo.getUpdateTitle()).b(paramUpdateInfo.getUpdateSubTitle());
    if (a == -1);
    for (int i = paramContext.getApplicationInfo().icon; ; i = a)
    {
      aw localaw2 = localaw1.a(i).a().a(localPendingIntent);
      ((NotificationManager)paramContext.getSystemService("notification")).notify(100, localaw2.b());
      a(paramUpdateInfo.getVersion());
      return;
    }
  }

  public static void a(Context paramContext, Intent paramIntent, UpdateInfo paramUpdateInfo, boolean paramBoolean)
  {
    UpdateInfo.SelfUpdatePriority localSelfUpdatePriority = paramUpdateInfo.getPriority();
    String str = paramUpdateInfo.getVersion();
    int i;
    if (!paramBoolean)
    {
      int k = localSelfUpdatePriority.compareTo(UpdateInfo.SelfUpdatePriority.NORMAL);
      i = 0;
      if (k >= 0);
    }
    while (i == 0)
    {
      return;
      if (System.currentTimeMillis() - b.R() < 259200000L)
      {
        boolean bool = b.Q().equals(str);
        i = 0;
        if (bool)
          continue;
      }
      i = 1;
    }
    try
    {
      PendingIntent localPendingIntent = PendingIntent.getService(paramContext, 0, paramIntent, 0);
      aw localaw1 = new aw(paramContext).a(paramUpdateInfo.getUpdateTitle()).b(paramUpdateInfo.getUpdateSubTitle());
      if (a == -1);
      for (int j = paramContext.getApplicationInfo().icon; ; j = a)
      {
        aw localaw2 = localaw1.a(j).a().a(localPendingIntent);
        ((NotificationManager)paramContext.getSystemService("notification")).notify(100, localaw2.b());
        a(paramUpdateInfo.getVersion());
        return;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
    }
  }

  public static void a(SelfUpdateResult paramSelfUpdateResult)
  {
    b.O(new c().a(paramSelfUpdateResult, new i().getType()));
  }

  public static void a(Class<? extends LocalUpdateService> paramClass)
  {
    b = paramClass;
  }

  public static void a(String paramString)
  {
    b.c(System.currentTimeMillis());
    b.N(paramString);
  }

  public static boolean a(Context paramContext, ServiceConnection paramServiceConnection, LocalUpdateService.UpdateParams paramUpdateParams)
  {
    Intent localIntent = new Intent(paramContext, b);
    c localc = new c();
    try
    {
      localIntent.putExtra("UPDATE_PARAMS", localc.a(paramUpdateParams));
      return paramContext.bindService(localIntent, paramServiceConnection, 1);
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean a(UpdateInfo.SelfUpdatePriority paramSelfUpdatePriority, String paramString)
  {
    if (paramSelfUpdatePriority.compareTo(UpdateInfo.SelfUpdatePriority.NORMAL) < 0);
    do
      return false;
    while ((System.currentTimeMillis() - b.R() < 259200000L) && (b.Q().equals(paramString)));
    return true;
  }

  public static SelfUpdateResult b()
  {
    SelfUpdateResult localSelfUpdateResult = a();
    if ((localSelfUpdateResult == null) || (localSelfUpdateResult.updateInfo == null) || (localSelfUpdateResult.installerPath == null) || (!localSelfUpdateResult.updateInfo.isValid()) || (!localSelfUpdateResult.updateInfo.hasNewVersion()) || (!new File(localSelfUpdateResult.installerPath).exists()))
      localSelfUpdateResult = null;
    return localSelfUpdateResult;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.toolkit.g
 * JD-Core Version:    0.6.0
 */