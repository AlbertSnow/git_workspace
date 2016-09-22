package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import aof;
import com.google.android.gms.ads.internal.purchase.client.p;
import com.google.android.gms.ads.internal.util.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.google.android.gms.ads.internal.report.client.a
public final class c extends com.google.android.gms.ads.internal.util.a
  implements ServiceConnection
{
  Context a;
  p b;
  n c;
  private final Object d = new Object();
  private boolean e = false;
  private b f;
  private i g;
  private List h = null;

  public c(Context paramContext, p paramp, n paramn)
  {
    this(paramContext, paramp, paramn, new b(paramContext), i.a(paramContext.getApplicationContext()));
  }

  private c(Context paramContext, p paramp, n paramn, b paramb, i parami)
  {
    this.a = paramContext;
    this.b = paramp;
    this.c = paramn;
    this.f = paramb;
    this.g = parami;
    this.h = this.g.a(10L);
  }

  private final void a(long paramLong)
  {
    do
    {
      if (b(paramLong))
        continue;
      com.google.android.gms.ads.internal.util.c.a("Timeout waiting for pending transaction to be processed.");
    }
    while (!this.e);
  }

  private final boolean b(long paramLong)
  {
    long l = 60000L - (SystemClock.elapsedRealtime() - paramLong);
    if (l <= 0L)
      return false;
    try
    {
      this.d.wait(l);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.e("waitWithTimeout_lock interrupted");
    }
  }

  public final void a()
  {
    synchronized (this.d)
    {
      Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      localIntent.setPackage("com.android.vending");
      aof.a().a(this.a, localIntent, this, 1);
      a(SystemClock.elapsedRealtime());
      aof.a().a(this.a, this);
      this.f.a = null;
      return;
    }
  }

  public final void b()
  {
    synchronized (this.d)
    {
      aof.a().a(this.a, this);
      this.f.a = null;
      return;
    }
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    HashMap localHashMap;
    synchronized (this.d)
    {
      this.f.a(paramIBinder);
      if (this.h.isEmpty())
        break label428;
      localHashMap = new HashMap();
      Iterator localIterator1 = this.h.iterator();
      if (localIterator1.hasNext())
      {
        g localg2 = (g)localIterator1.next();
        localHashMap.put(localg2.c, localg2);
      }
    }
    Object localObject3 = null;
    Bundle localBundle = this.f.b(this.a.getPackageName(), (String)localObject3);
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    ArrayList localArrayList3;
    String str2;
    if ((localBundle != null) && (k.a(localBundle) == 0))
    {
      localArrayList1 = localBundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
      localArrayList2 = localBundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
      localArrayList3 = localBundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
      str2 = localBundle.getString("INAPP_CONTINUATION_TOKEN");
    }
    for (int i = 0; ; i++)
      if (i < localArrayList1.size())
      {
        if (!localHashMap.containsKey(localArrayList1.get(i)))
          continue;
        String str3 = (String)localArrayList1.get(i);
        String str4 = (String)localArrayList2.get(i);
        String str5 = (String)localArrayList3.get(i);
        g localg1 = (g)localHashMap.get(str3);
        String str6 = k.a(str4);
        if (!localg1.b.equals(str6))
          continue;
        Intent localIntent = new Intent();
        localIntent.putExtra("RESPONSE_CODE", 0);
        localIntent.putExtra("INAPP_PURCHASE_DATA", str4);
        localIntent.putExtra("INAPP_DATA_SIGNATURE", str5);
        y.a.post(new d(this, localg1, localIntent));
        localHashMap.remove(str3);
      }
      else
      {
        if ((str2 == null) || (localHashMap.isEmpty()))
        {
          Iterator localIterator2 = localHashMap.keySet().iterator();
          while (localIterator2.hasNext())
          {
            String str1 = (String)localIterator2.next();
            this.g.a((g)localHashMap.get(str1));
          }
          label428: this.e = true;
          this.d.notify();
          monitorexit;
          return;
        }
        localObject3 = str2;
        break;
      }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    com.google.android.gms.ads.internal.util.c.d("In-app billing service disconnected.");
    this.f.a = null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.c
 * JD-Core Version:    0.6.0
 */