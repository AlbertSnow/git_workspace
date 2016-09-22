package com.google.android.gms.ads.internal.renderer;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.mediation.c;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class n extends f
{
  public com.google.android.gms.ads.internal.mediation.i g;
  final com.google.android.gms.ads.internal.webview.b h;
  boolean i;
  private com.google.android.gms.ads.internal.mediation.client.b k;
  private com.google.android.gms.ads.internal.mediation.a l;
  private c m;
  private final com.google.android.gms.ads.internal.csi.l n;

  n(Context paramContext, com.google.android.gms.ads.internal.state.b paramb, com.google.android.gms.ads.internal.mediation.client.b paramb1, k paramk, com.google.android.gms.ads.internal.csi.l paraml, com.google.android.gms.ads.internal.webview.b paramb2)
  {
    super(paramContext, paramb, paramk);
    this.k = paramb1;
    this.m = paramb.c;
    this.n = paraml;
    this.h = paramb2;
  }

  private static String a(List paramList)
  {
    if (paramList == null)
      return "".toString();
    Iterator localIterator = paramList.iterator();
    String str1 = "";
    while (localIterator.hasNext())
    {
      com.google.android.gms.ads.internal.mediation.i locali = (com.google.android.gms.ads.internal.mediation.i)localIterator.next();
      if ((locali == null) || (locali.b == null) || (TextUtils.isEmpty(locali.b.d)))
        continue;
      String str2 = String.valueOf(str1);
      String str3 = locali.b.d;
      int j;
      switch (locali.a)
      {
      case 2:
      default:
        j = 6;
      case 0:
      case 1:
      case 3:
      case 4:
      case -1:
      case 5:
      }
      while (true)
      {
        long l1 = locali.g;
        String str4 = String.valueOf(33 + String.valueOf(str3).length() + str3 + "." + j + "." + l1);
        str1 = 1 + String.valueOf(str2).length() + String.valueOf(str4).length() + str2 + str4 + "_";
        break;
        j = 0;
        continue;
        j = 1;
        continue;
        j = 2;
        continue;
        j = 3;
        continue;
        j = 4;
        continue;
        j = 5;
      }
    }
    return str1.substring(0, Math.max(0, -1 + str1.length()));
  }

  protected final com.google.android.gms.ads.internal.state.a a(int paramInt)
  {
    AdRequestInfoParcel localAdRequestInfoParcel = this.e.a;
    AdRequestParcel localAdRequestParcel = localAdRequestInfoParcel.c;
    com.google.android.gms.ads.internal.webview.b localb = this.h;
    List localList1 = this.f.d;
    List localList2 = this.f.f;
    List localList3 = this.f.j;
    int j = this.f.l;
    long l1 = this.f.k;
    String str1 = localAdRequestInfoParcel.i;
    boolean bool1 = this.f.h;
    com.google.android.gms.ads.internal.mediation.b localb1;
    com.google.android.gms.ads.internal.mediation.client.e locale;
    label111: String str2;
    label127: c localc;
    com.google.android.gms.ads.internal.mediation.e locale1;
    label149: long l2;
    AdSizeParcel localAdSizeParcel;
    long l3;
    long l4;
    long l5;
    String str3;
    JSONObject localJSONObject;
    RewardItemParcel localRewardItemParcel;
    List localList4;
    List localList5;
    boolean bool2;
    label255: AutoClickProtectionConfigurationParcel localAutoClickProtectionConfigurationParcel;
    if (this.g != null)
    {
      localb1 = this.g.b;
      if (this.g == null)
        break label361;
      locale = this.g.c;
      if (this.g == null)
        break label367;
      str2 = this.g.d;
      localc = this.m;
      if (this.g == null)
        break label377;
      locale1 = this.g.e;
      l2 = this.f.i;
      localAdSizeParcel = this.e.d;
      l3 = this.f.g;
      l4 = this.e.f;
      l5 = this.f.n;
      str3 = this.f.o;
      localJSONObject = this.e.h;
      localRewardItemParcel = this.f.C;
      localList4 = this.f.D;
      localList5 = this.f.E;
      if (this.m == null)
        break label383;
      bool2 = this.m.n;
      localAutoClickProtectionConfigurationParcel = this.f.G;
      if (this.l == null)
        break label389;
    }
    label389: for (String str4 = a(this.l.b()); ; str4 = null)
    {
      return new com.google.android.gms.ads.internal.state.a(localAdRequestParcel, localb, localList1, paramInt, localList2, localList3, j, l1, str1, bool1, localb1, locale, str2, localc, locale1, l2, localAdSizeParcel, l3, l4, l5, str3, localJSONObject, null, localRewardItemParcel, localList4, localList5, bool2, localAutoClickProtectionConfigurationParcel, str4, this.f.J);
      localb1 = null;
      break;
      label361: locale = null;
      break label111;
      label367: str2 = AdMobAdapter.class.getName();
      break label127;
      label377: locale1 = null;
      break label149;
      label383: bool2 = false;
      break label255;
    }
  }

  protected final void a(long paramLong)
  {
    ArrayList localArrayList;
    synchronized (this.d)
    {
      Object localObject3;
      if (this.m.l != -1)
      {
        localObject3 = new com.google.android.gms.ads.internal.mediation.l(this.b, this.e.a, this.k, this.m, this.f.t, this.f.B, paramLong, ((Long)m.aj.a()).longValue(), 2);
        this.l = ((com.google.android.gms.ads.internal.mediation.a)localObject3);
        localArrayList = new ArrayList(this.m.a);
        Bundle localBundle1 = this.e.a.c.m;
        boolean bool = false;
        if (localBundle1 != null)
        {
          Bundle localBundle2 = localBundle1.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
          bool = false;
          if (localBundle2 != null)
            bool = localBundle2.getBoolean("_skipMediation");
        }
        if (bool)
        {
          ListIterator localListIterator = localArrayList.listIterator();
          while (localListIterator.hasNext())
          {
            if (((com.google.android.gms.ads.internal.mediation.b)localListIterator.next()).c.contains("com.google.ads.mediation.admob.AdMobAdapter"))
              continue;
            localListIterator.remove();
          }
        }
      }
      else
      {
        localObject3 = new com.google.android.gms.ads.internal.mediation.o(this.b, this.e.a, this.k, this.m, this.f.t, this.f.B, paramLong, ((Long)m.aj.a()).longValue(), this.n);
      }
    }
    this.g = this.l.a(localArrayList);
    switch (this.g.a)
    {
    default:
      int j = this.g.a;
      throw new i(40 + "Unexpected mediation result: " + j, 0);
    case 1:
      throw new i("No fill from any mediation ad networks.", 3);
    case 0:
    }
    if ((this.g.b != null) && (this.g.b.l != null))
    {
      CountDownLatch localCountDownLatch = new CountDownLatch(1);
      y.a.post(new o(this, localCountDownLatch));
      try
      {
        localCountDownLatch.await(10L, TimeUnit.SECONDS);
        synchronized (this.d)
        {
          if (!this.i)
            throw new i("View could not be prepared", 0);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        String str = String.valueOf(localInterruptedException);
        throw new i(38 + String.valueOf(str).length() + "Interrupted while waiting for latch : " + str, 0);
      }
      if (this.h.r())
        throw new i("Assets not loaded, web view is destroyed", 0);
      monitorexit;
    }
  }

  public final void b()
  {
    synchronized (this.d)
    {
      super.b();
      if (this.l != null)
        this.l.a();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.n
 * JD-Core Version:    0.6.0
 */