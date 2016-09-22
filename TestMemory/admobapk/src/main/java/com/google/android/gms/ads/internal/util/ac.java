package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class ac extends BroadcastReceiver
{
  public ac(y paramy)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction()))
      this.a.c = true;
    do
      return;
    while (!"android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()));
    this.a.c = false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.ac
 * JD-Core Version:    0.6.0
 */