package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.as;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.w;
import com.google.android.gms.internal.z;

public class CampaignTrackingService extends Service
{
  private static Boolean b;
  private Handler a;

  public static boolean a(Context paramContext)
  {
    android.support.v4.app.d.a(paramContext);
    if (b != null)
      return b.booleanValue();
    boolean bool = m.a(paramContext, CampaignTrackingService.class);
    b = Boolean.valueOf(bool);
    return bool;
  }

  protected final void a(g paramg, Handler paramHandler, int paramInt)
  {
    paramHandler.post(new e(this, paramInt, paramg));
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    w.a(this).e().c("CampaignTrackingService is starting up");
  }

  public void onDestroy()
  {
    w.a(this).e().c("CampaignTrackingService is shutting down");
    super.onDestroy();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    try
    {
      synchronized (CampaignTrackingReceiver.a)
      {
        PowerManager.WakeLock localWakeLock = CampaignTrackingReceiver.b;
        if ((localWakeLock != null) && (localWakeLock.isHeld()))
          localWakeLock.release();
        label34: localw = w.a(this);
        localg = localw.e();
        str = paramIntent.getStringExtra("referrer");
        localHandler = this.a;
        if (localHandler == null)
        {
          localHandler = new Handler(getMainLooper());
          this.a = localHandler;
        }
        if (TextUtils.isEmpty(str))
        {
          localg.f("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
          localw.g().a(new c(this, localg, localHandler, paramInt2));
          return 2;
        }
      }
    }
    catch (SecurityException localSecurityException)
    {
      w localw;
      g localg;
      String str;
      Handler localHandler;
      break label34;
      int i = as.c();
      if (str.length() > i)
      {
        localg.c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(str.length()), Integer.valueOf(i));
        str = str.substring(0, i);
      }
      localg.a("CampaignTrackingService called. startId, campaign", Integer.valueOf(paramInt2), str);
      localw.h().a(str, new d(this, localg, localHandler, paramInt2));
    }
    return 2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.CampaignTrackingService
 * JD-Core Version:    0.6.0
 */