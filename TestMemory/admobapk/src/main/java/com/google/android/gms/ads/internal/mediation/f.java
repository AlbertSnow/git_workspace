package com.google.android.gms.ads.internal.mediation;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import aom;
import apn;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.mediation.client.k;
import com.google.android.gms.ads.internal.mediation.client.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.y;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class f
  implements j
{
  final String a;
  final Object b = new Object();
  com.google.android.gms.ads.internal.mediation.client.e c;
  int d = -2;
  private final com.google.android.gms.ads.internal.mediation.client.b e;
  private final long f;
  private final c g;
  private final b h;
  private AdRequestParcel i;
  private final AdSizeParcel j;
  private final Context k;
  private final VersionInfoParcel l;
  private final boolean m;
  private final NativeAdOptionsParcel n;
  private final List o;
  private final boolean p;
  private k q;

  public f(Context paramContext, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, c paramc, b paramb1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, VersionInfoParcel paramVersionInfoParcel, boolean paramBoolean1, boolean paramBoolean2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
    this.k = paramContext;
    this.e = paramb;
    this.h = paramb1;
    long l1;
    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
    {
      this.a = d();
      this.g = paramc;
      if (paramc.b == -1L)
        break label136;
      l1 = paramc.b;
    }
    while (true)
    {
      this.f = l1;
      this.i = paramAdRequestParcel;
      this.j = paramAdSizeParcel;
      this.l = paramVersionInfoParcel;
      this.m = paramBoolean1;
      this.p = paramBoolean2;
      this.n = paramNativeAdOptionsParcel;
      this.o = paramList;
      return;
      this.a = paramString;
      break;
      label136: l1 = 10000L;
    }
  }

  private static com.google.android.gms.ads.internal.mediation.client.e a(com.google.android.gms.ads.mediation.b paramb)
  {
    return new u(paramb);
  }

  private final String a(String paramString)
  {
    if ((paramString == null) || (!c()) || (b(2)))
      return paramString;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localJSONObject.remove("cpm_floor_cents");
      String str = localJSONObject.toString();
      return str;
    }
    catch (JSONException localJSONException)
    {
      com.google.android.gms.ads.internal.util.c.e("Could not remove field. Returning the original value");
    }
    return paramString;
  }

  private final void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = paramLong2 - (l1 - paramLong1);
    long l3 = paramLong4 - (l1 - paramLong3);
    if ((l2 <= 0L) || (l3 <= 0L))
    {
      com.google.android.gms.ads.internal.util.c.d("Timed out waiting for adapter.");
      this.d = 3;
      return;
    }
    try
    {
      this.b.wait(Math.min(l2, l3));
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      this.d = -1;
    }
  }

  private static com.google.android.gms.ads.formats.c b(String paramString)
  {
    com.google.android.gms.ads.formats.d locald = new com.google.android.gms.ads.formats.d();
    if (paramString == null)
      return locald.a();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      locald.c = localJSONObject.optBoolean("multiple_images", false);
      locald.a = localJSONObject.optBoolean("only_urls", false);
      String str = localJSONObject.optString("native_image_orientation", "any");
      int i1;
      if ("landscape".equals(str))
        i1 = 2;
      while (true)
      {
        locald.b = i1;
        return locald.a();
        boolean bool = "portrait".equals(str);
        i1 = 0;
        if (!bool)
          continue;
        i1 = 1;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
        com.google.android.gms.ads.internal.util.c.c("Exception occurred when creating native ad options", localJSONException);
    }
  }

  private final String d()
  {
    try
    {
      if (!TextUtils.isEmpty(this.h.e))
      {
        if (this.e.b(this.h.e))
          return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.e("Fail to determine the custom event's version, assuming the old one.");
    }
    return "com.google.ads.mediation.customevent.CustomEventAdapter";
  }

  private final k e()
  {
    if ((this.d != 0) || (!c()))
      return null;
    try
    {
      if ((b(4)) && (this.q != null) && (this.q.a() != 0))
      {
        k localk = this.q;
        return localk;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.e("Could not get cpm value from MediationResponseMetadata");
    }
    return new h(f());
  }

  private final int f()
  {
    int i1;
    if (this.h.i == null)
      i1 = 0;
    while (true)
    {
      return i1;
      JSONObject localJSONObject;
      try
      {
        localJSONObject = new JSONObject(this.h.i);
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a))
          return localJSONObject.optInt("cpm_cents", 0);
      }
      catch (JSONException localJSONException)
      {
        com.google.android.gms.ads.internal.util.c.e("Could not convert to json. Returning 0");
        return 0;
      }
      if (b(2));
      for (i1 = localJSONObject.optInt("cpm_floor_cents", 0); i1 == 0; i1 = 0)
        return localJSONObject.optInt("penalized_average_cpm_cents", 0);
    }
  }

  public final i a(long paramLong1, long paramLong2)
  {
    synchronized (this.b)
    {
      long l1 = SystemClock.elapsedRealtime();
      e locale = new e();
      y.a.post(new g(this, locale));
      long l2 = this.f;
      if (this.d != -2)
      {
        long l3 = bc.a().i.b() - l1;
        i locali = new i(this.h, this.c, this.a, locale, this.d, e(), l3);
        return locali;
      }
      a(l1, l2, paramLong1, paramLong2);
    }
  }

  public final void a()
  {
    synchronized (this.b)
    {
      try
      {
        if (this.c != null)
          this.c.c();
        this.d = -1;
        this.b.notify();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          com.google.android.gms.ads.internal.util.c.c("Could not destroy mediation adapter.", localRemoteException);
      }
    }
  }

  public final void a(int paramInt)
  {
    synchronized (this.b)
    {
      this.d = paramInt;
      this.b.notify();
      return;
    }
  }

  public final void a(int paramInt, k paramk)
  {
    synchronized (this.b)
    {
      this.d = 0;
      this.q = paramk;
      this.b.notify();
      return;
    }
  }

  final void a(e parame)
  {
    if ("com.google.ads.mediation.AdUrlAdapter".equals(this.a))
    {
      if (this.i.m == null)
      {
        com.google.android.gms.ads.internal.client.f localf = new com.google.android.gms.ads.internal.client.f(this.i);
        localf.b = new Bundle();
        this.i = localf.a();
      }
      Bundle localBundle = this.i.m.getBundle(this.a);
      if (localBundle == null)
        localBundle = new Bundle();
      localBundle.putString("sdk_less_network_id", this.h.b);
      this.i.m.putBundle(this.a, localBundle);
    }
    String str = a(this.h.i);
    try
    {
      if (this.l.d < 4100000)
      {
        if (this.j.e)
        {
          this.c.a(apn.a(this.k), this.i, str, parame);
          return;
        }
        this.c.a(apn.a(this.k), this.j, this.i, str, parame);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.c("Could not request ad from mediation adapter.", localRemoteException);
      a(5);
      return;
    }
    if (this.m)
    {
      this.c.a(apn.a(this.k), this.i, str, this.h.a, parame, this.n, this.o);
      return;
    }
    if (this.j.e)
    {
      this.c.a(apn.a(this.k), this.i, str, this.h.a, parame);
      return;
    }
    if (this.p)
    {
      if (this.h.l != null)
      {
        this.c.a(apn.a(this.k), this.i, str, this.h.a, parame, new NativeAdOptionsParcel(b(this.h.p)), this.h.o);
        return;
      }
      this.c.a(apn.a(this.k), this.j, this.i, str, this.h.a, parame);
      return;
    }
    this.c.a(apn.a(this.k), this.j, this.i, str, this.h.a, parame);
  }

  final com.google.android.gms.ads.internal.mediation.client.e b()
  {
    String str1 = String.valueOf(this.a);
    String str2;
    if (str1.length() != 0)
      str2 = "Instantiating mediation adapter: ".concat(str1);
    while (true)
    {
      com.google.android.gms.ads.internal.util.c.d(str2);
      if (this.m)
        break;
      if ((((Boolean)m.ag.a()).booleanValue()) && ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.a)))
      {
        return a(new AdMobAdapter());
        str2 = new String("Instantiating mediation adapter: ");
        continue;
      }
      if ((((Boolean)m.ah.a()).booleanValue()) && ("com.google.ads.mediation.AdUrlAdapter".equals(this.a)))
        return a(new AdUrlAdapter());
      if (!"com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.a))
        break;
      return new u(new com.google.android.gms.ads.internal.mediation.customtabs.a());
    }
    String str3;
    try
    {
      com.google.android.gms.ads.internal.mediation.client.e locale = this.e.a(this.a);
      return locale;
    }
    catch (RemoteException localRemoteException)
    {
      str3 = String.valueOf(this.a);
      if (str3.length() == 0);
    }
    for (String str4 = "Could not instantiate mediation adapter: ".concat(str3); ; str4 = new String("Could not instantiate mediation adapter: "))
    {
      com.google.android.gms.ads.internal.util.c.a(str4, localRemoteException);
      return null;
    }
  }

  final boolean b(int paramInt)
  {
    try
    {
      Object localObject;
      if (this.m)
      {
        Bundle localBundle2 = this.c.l();
        localObject = localBundle2;
      }
      while (true)
      {
        int i1 = 0;
        if (localObject != null)
        {
          int i2 = paramInt & ((Bundle)localObject).getInt("capabilities", 0);
          i1 = 0;
          if (i2 == paramInt)
            i1 = 1;
        }
        return i1;
        if (this.j.e)
        {
          localObject = this.c.k();
          continue;
        }
        Bundle localBundle1 = this.c.j();
        localObject = localBundle1;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.e("Could not get adapter info. Returning false");
    }
    return false;
  }

  final boolean c()
  {
    return this.g.l != -1;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.f
 * JD-Core Version:    0.6.0
 */