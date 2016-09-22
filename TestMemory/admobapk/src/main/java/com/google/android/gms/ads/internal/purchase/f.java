package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.purchase.client.h;
import com.google.android.gms.ads.internal.util.ad;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;

@com.google.android.gms.ads.internal.report.client.a
public final class f extends h
  implements ServiceConnection
{
  private final Activity a;
  private i b;
  private com.google.android.gms.ads.internal.purchase.client.a c;
  private b d;
  private g e;
  private m f;
  private n g;
  private String h = null;

  public f(Activity paramActivity)
  {
    this.a = paramActivity;
    this.b = i.a(this.a.getApplicationContext());
  }

  private void a(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent)
  {
    if (this.f != null)
      this.f.a(paramString, paramBoolean, paramInt, paramIntent, this.e);
  }

  public final void a()
  {
    GInAppPurchaseManagerInfoParcel localGInAppPurchaseManagerInfoParcel = GInAppPurchaseManagerInfoParcel.a(this.a.getIntent());
    this.f = localGInAppPurchaseManagerInfoParcel.e;
    this.g = localGInAppPurchaseManagerInfoParcel.b;
    this.c = localGInAppPurchaseManagerInfoParcel.c;
    this.d = new b(this.a.getApplicationContext());
    if (this.a.getResources().getConfiguration().orientation == 2)
      this.a.setRequestedOrientation(bc.a().g.a());
    while (true)
    {
      Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      localIntent.setPackage("com.android.vending");
      this.a.bindService(localIntent, this, 1);
      return;
      this.a.setRequestedOrientation(bc.a().g.b());
    }
  }

  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1001);
    try
    {
      int i = k.a(paramIntent);
      if ((paramInt2 == -1) && (i == 0))
      {
        boolean bool1 = this.g.a(this.h, paramIntent);
        bool2 = false;
        if (!bool1);
      }
      for (boolean bool2 = true; ; bool2 = false)
      {
        this.c.b(i);
        this.a.finish();
        a(this.c.a(), bool2, paramInt2, paramIntent);
        return;
        this.b.a(this.e);
      }
    }
    catch (RemoteException localRemoteException)
    {
      c.e("Fail to process purchase result.");
      this.a.finish();
      return;
    }
    finally
    {
      this.h = null;
    }
    throw localObject;
  }

  public final void b()
  {
    this.a.unbindService(this);
    this.d.a = null;
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.d.a(paramIBinder);
    try
    {
      this.h = y.b();
      Bundle localBundle = this.d.a(this.a.getPackageName(), this.c.a(), this.h);
      localPendingIntent = (PendingIntent)localBundle.getParcelable("BUY_INTENT");
      if (localPendingIntent == null)
      {
        int i = k.a(localBundle);
        this.c.b(i);
        a(this.c.a(), false, i, null);
        this.a.finish();
        return;
      }
      this.e = new g(this.c.a(), this.h);
      locali = this.b;
      localg = this.e;
      if (localg == null);
    }
    catch (RemoteException localRemoteException)
    {
      synchronized (i.b)
      {
        PendingIntent localPendingIntent;
        i locali;
        g localg;
        SQLiteDatabase localSQLiteDatabase = locali.a();
        if (localSQLiteDatabase == null)
        {
          this.a.startIntentSenderForResult(localPendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
          return;
          localRemoteException = localRemoteException;
          c.c("Error when connecting in-app billing service", localRemoteException);
          this.a.finish();
          return;
        }
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("product_id", localg.c);
        localContentValues.put("developer_payload", localg.b);
        localContentValues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
        localg.a = localSQLiteDatabase.insert("InAppPurchase", null, localContentValues);
        if (locali.b() > 20000L)
          locali.c();
      }
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      label227: break label227;
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    c.d("In-app billing service disconnected.");
    this.d.a = null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.f
 * JD-Core Version:    0.6.0
 */