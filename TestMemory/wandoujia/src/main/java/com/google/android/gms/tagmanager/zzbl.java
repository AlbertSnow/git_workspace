package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class zzbl extends BroadcastReceiver
{
  private static String a = zzbl.class.getName();
  private final ac b;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    boolean bool;
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str))
    {
      Bundle localBundle = paramIntent.getExtras();
      Boolean localBoolean = Boolean.FALSE;
      if (localBundle != null)
        localBoolean = Boolean.valueOf(paramIntent.getExtras().getBoolean("noConnectivity"));
      ac localac = this.b;
      if (!localBoolean.booleanValue())
      {
        bool = true;
        localac.a(bool);
      }
    }
    do
    {
      return;
      bool = false;
      break;
    }
    while ((!"com.google.analytics.RADIO_POWERED".equals(str)) || (paramIntent.hasExtra(a)));
    this.b.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.zzbl
 * JD-Core Version:    0.6.0
 */