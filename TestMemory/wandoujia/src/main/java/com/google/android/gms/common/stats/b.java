package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public final class b
{
  private static final Object a = new Object();
  private static b b;

  static
  {
    new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
  }

  public static b a()
  {
    synchronized (a)
    {
      if (b == null)
        b = new b();
      return b;
    }
  }

  public static boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    paramContext.getClass().getName();
    ComponentName localComponentName = paramIntent.getComponent();
    if (localComponentName == null);
    for (boolean bool = false; bool; bool = android.support.v4.app.b.b(paramContext, localComponentName.getPackageName()))
      return false;
    return paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.stats.b
 * JD-Core Version:    0.6.0
 */