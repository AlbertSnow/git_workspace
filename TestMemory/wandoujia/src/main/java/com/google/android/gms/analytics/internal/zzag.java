package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.support.v4.app.d;

class zzag extends BroadcastReceiver
{
  private static String a = zzag.class.getName();
  private final w b;
  private boolean c;
  private boolean d;

  zzag(w paramw)
  {
    d.a(paramw);
    this.b = paramw;
  }

  private void e()
  {
    this.b.e();
    this.b.h();
  }

  private boolean f()
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)this.b.a().getSystemService("connectivity");
    try
    {
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        boolean bool = localNetworkInfo.isConnected();
        if (bool)
          return true;
      }
      return false;
    }
    catch (SecurityException localSecurityException)
    {
    }
    return false;
  }

  public final void a()
  {
    e();
    if (this.c)
      return;
    Context localContext = this.b.a();
    localContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    IntentFilter localIntentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
    localIntentFilter.addCategory(localContext.getPackageName());
    localContext.registerReceiver(this, localIntentFilter);
    this.d = f();
    this.b.e().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
    this.c = true;
  }

  public final void b()
  {
    if (!this.c)
      return;
    this.b.e().c("Unregistering connectivity change receiver");
    this.c = false;
    this.d = false;
    Context localContext = this.b.a();
    try
    {
      localContext.unregisterReceiver(this);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.b.e().e("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
    }
  }

  public final void c()
  {
    if (Build.VERSION.SDK_INT <= 10)
      return;
    Context localContext = this.b.a();
    Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
    localIntent.addCategory(localContext.getPackageName());
    localIntent.putExtra(a, true);
    localContext.sendOrderedBroadcast(localIntent, null);
  }

  public final boolean d()
  {
    if (!this.c)
      this.b.e().f("Connectivity unknown. Receiver not registered");
    return this.d;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    e();
    String str = paramIntent.getAction();
    this.b.e().a("NetworkBroadcastReceiver received action", str);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(str))
    {
      boolean bool = f();
      if (this.d != bool)
      {
        this.d = bool;
        this.b.h().a(bool);
      }
    }
    while (true)
    {
      return;
      if (!"com.google.analytics.RADIO_POWERED".equals(str))
        break;
      if (paramIntent.hasExtra(a))
        continue;
      o localo = this.b.h();
      localo.c("Radio powered up");
      localo.c();
      return;
    }
    this.b.e().d("NetworkBroadcastReceiver received unknown action", str);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.zzag
 * JD-Core Version:    0.6.0
 */