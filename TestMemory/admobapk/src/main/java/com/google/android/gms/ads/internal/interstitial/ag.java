package com.google.android.gms.ads.internal.interstitial;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import aom;
import apj;
import com.google.android.gms.ads.internal.ab;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.client.ai;
import com.google.android.gms.ads.internal.client.an;
import com.google.android.gms.ads.internal.client.at;
import com.google.android.gms.ads.internal.client.v;
import com.google.android.gms.ads.internal.purchase.client.p;
import com.google.android.gms.ads.internal.request.service.r;
import com.google.android.gms.ads.internal.reward.client.j;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@com.google.android.gms.ads.internal.report.client.a
public final class ag extends ai
{
  private String a;
  private a b;
  private ab c;
  private aa d;
  private p e;
  private String f;

  public ag(Context paramContext, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.m paramm)
  {
    this(paramString, new a(paramContext, paramb, paramVersionInfoParcel, paramm));
  }

  private ag(String paramString, a parama)
  {
    this.a = paramString;
    this.b = parama;
    this.d = new aa();
    ac localac = com.google.android.gms.ads.internal.bc.a().p;
    SharedPreferences localSharedPreferences;
    HashMap localHashMap;
    Iterator localIterator;
    if (localac.c == null)
    {
      localac.c = new a(parama.a.getApplicationContext(), parama.b, parama.c, parama.d);
      if (localac.c != null)
      {
        localSharedPreferences = localac.c.a.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
        while (localac.b.size() > 0)
        {
          ad localad3 = (ad)localac.b.remove();
          ae localae2 = (ae)localac.a.get(localad3);
          ac.a("Flushing interstitial queue for %s.", localad3);
          while (localae2.a.size() > 0)
            localae2.a(null).a.M();
          localac.a.remove(localad3);
        }
        localHashMap = new HashMap();
        localIterator = localSharedPreferences.getAll().entrySet().iterator();
      }
    }
    while (true)
    {
      Map.Entry localEntry;
      if (localIterator.hasNext())
        localEntry = (Map.Entry)localIterator.next();
      try
      {
        if (((String)localEntry.getKey()).equals("PoolKeys"))
          continue;
        ah localah = new ah((String)localEntry.getValue());
        ad localad2 = new ad(localah.a, localah.b, localah.c);
        if (localac.a.containsKey(localad2))
          continue;
        ae localae1 = new ae(localah.a, localah.b, localah.c);
        localac.a.put(localad2, localae1);
        localHashMap.put(localad2.toString(), localad2);
        ac.a("Restored interstitial queue for %s.", localad2);
      }
      catch (IOException localIOException)
      {
        c.c("Malformed preferences value for InterstitialAdPool.", localIOException);
        continue;
        String[] arrayOfString = ac.a(localSharedPreferences.getString("PoolKeys", ""));
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          ad localad1 = (ad)localHashMap.get(arrayOfString[j]);
          if (!localac.a.containsKey(localad1))
            continue;
          localac.b.add(localad1);
        }
        return;
      }
      catch (ClassCastException localClassCastException)
      {
        label370: break label370;
      }
    }
  }

  private void e()
  {
    if (this.c != null)
      return;
    a locala = this.b;
    String str = this.a;
    this.c = new ab(locala.a, new AdSizeParcel(), str, locala.b, locala.c, locala.d);
    this.d.a(this.c);
    f();
  }

  private final void f()
  {
    if ((this.c != null) && (this.e != null))
      this.c.a(this.e, this.f);
  }

  public final String D()
  {
    if (this.c != null)
      return this.c.D();
    return null;
  }

  public final void E()
  {
    if (this.c != null)
    {
      this.c.E();
      return;
    }
    c.e("Interstitial ad must be loaded before showInterstitial().");
  }

  public final void a()
  {
    if (this.c != null)
      this.c.a();
  }

  public final void a(AdSizeParcel paramAdSizeParcel)
  {
    if (this.c != null)
      this.c.a(paramAdSizeParcel);
  }

  public final void a(VideoOptionsParcel paramVideoOptionsParcel)
  {
    throw new IllegalStateException("getVideoController not implemented for interstitials");
  }

  public final void a(an paraman)
  {
    this.d.b = paraman;
    if (this.c != null)
      this.d.a(this.c);
  }

  public final void a(at paramat)
  {
    e();
    if (this.c != null)
      this.c.a(paramat);
  }

  public final void a(com.google.android.gms.ads.internal.client.s params)
  {
    this.d.e = params;
    if (this.c != null)
      this.d.a(this.c);
  }

  public final void a(v paramv)
  {
    this.d.a = paramv;
    if (this.c != null)
      this.d.a(this.c);
  }

  public final void a(com.google.android.gms.ads.internal.customrenderedad.client.d paramd)
  {
    this.d.d = paramd;
    if (this.c != null)
      this.d.a(this.c);
  }

  public final void a(com.google.android.gms.ads.internal.purchase.client.d paramd)
  {
    this.d.c = paramd;
    if (this.c != null)
      this.d.a(this.c);
  }

  public final void a(p paramp, String paramString)
  {
    this.e = paramp;
    this.f = paramString;
    f();
  }

  public final void a(j paramj)
  {
    this.d.f = paramj;
    if (this.c != null)
      this.d.a(this.c);
  }

  public final void a(String paramString)
  {
  }

  public final void a(boolean paramBoolean)
  {
    e();
    if (this.c != null)
      this.c.a(paramBoolean);
  }

  public final boolean a(AdRequestParcel paramAdRequestParcel)
  {
    Bundle localBundle1 = ac.a(paramAdRequestParcel);
    int i;
    if ((localBundle1 != null) && (localBundle1.containsKey("gw")))
    {
      i = 1;
      if (i == 0)
        e();
      Bundle localBundle2 = paramAdRequestParcel.m;
      if (localBundle2 == null)
        break label110;
      Bundle localBundle4 = localBundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
      if ((localBundle4 == null) || (!localBundle4.containsKey("_skipMediation")))
        break label110;
    }
    label110: for (int j = 1; ; j = 0)
    {
      if (j != 0)
        e();
      if (paramAdRequestParcel.j != null)
        e();
      if (this.c == null)
        break label116;
      return this.c.a(paramAdRequestParcel);
      i = 0;
      break;
    }
    label116: ac localac = com.google.android.gms.ads.internal.bc.a().p;
    Bundle localBundle3 = ac.a(paramAdRequestParcel);
    int k = 0;
    if (localBundle3 != null)
    {
      boolean bool = localBundle3.containsKey("_ad");
      k = 0;
      if (bool)
        k = 1;
    }
    if (k != 0)
    {
      String str3 = this.a;
      if (localac.c != null)
      {
        int n = new com.google.android.gms.ads.internal.request.service.s(localac.c.a.getApplicationContext()).a().m;
        AdRequestParcel localAdRequestParcel2 = ac.b(paramAdRequestParcel);
        ad localad3 = new ad(localAdRequestParcel2, str3, n);
        ae localae5 = (ae)localac.a.get(localad3);
        if (localae5 == null)
        {
          ac.a("Interstitial pool created at %s.", localad3);
          localae5 = new ae(localAdRequestParcel2, str3, n);
          localac.a.put(localad3, localae5);
        }
        af localaf3 = new af(localae5, localac.c, paramAdRequestParcel);
        localae5.a.add(localaf3);
        localae5.e = true;
        ac.a("Inline entry added to the queue at %s.", localad3);
      }
    }
    String str1 = this.a;
    AdRequestParcel localAdRequestParcel1;
    ad localad1;
    ae localae1;
    ae localae4;
    if (!ac.b(str1))
    {
      int m = new com.google.android.gms.ads.internal.request.service.s(localac.c.a.getApplicationContext()).a().m;
      localAdRequestParcel1 = ac.b(paramAdRequestParcel);
      localad1 = new ad(localAdRequestParcel1, str1, m);
      localae1 = (ae)localac.a.get(localad1);
      if (localae1 != null)
        break label807;
      ac.a("Interstitial pool created at %s.", localad1);
      localae4 = new ae(localAdRequestParcel1, str1, m);
      localac.a.put(localad1, localae4);
    }
    label794: label807: for (ae localae2 = localae4; ; localae2 = localae1)
    {
      localac.b.remove(localad1);
      localac.b.add(localad1);
      localae2.e = true;
      while (localac.b.size() > ((Integer)com.google.android.gms.ads.internal.config.m.S.a()).intValue())
      {
        ad localad2 = (ad)localac.b.remove();
        ae localae3 = (ae)localac.a.get(localad2);
        ac.a("Evicting interstitial queue for %s.", localad2);
        while (localae3.a.size() > 0)
          localae3.a(null).a.M();
        localac.a.remove(localad2);
      }
      af localaf2;
      String str2;
      while (true)
        if (localae2.a.size() > 0)
        {
          localaf2 = localae2.a(localAdRequestParcel1);
          if ((localaf2.e) && (com.google.android.gms.ads.internal.bc.a().i.a() - localaf2.d > 1000L * ((Integer)com.google.android.gms.ads.internal.config.m.U.a()).intValue()))
          {
            ac.a("Expired interstitial at %s.", localad1);
            continue;
          }
          if (localaf2.b == null)
            break;
          str2 = " (inline) ";
          ac.a(34 + String.valueOf(str2).length() + "Pooled interstitial" + str2 + "returned at %s.", localad1);
        }
      for (af localaf1 = localaf2; ; localaf1 = null)
      {
        if (localaf1 == null)
          break label794;
        if (!localaf1.e)
          localaf1.a();
        this.c = localaf1.a;
        localaf1.c.a(this.d);
        this.d.a(this.c);
        f();
        return localaf1.f;
        str2 = " ";
        break;
      }
      e();
      return this.c.a(paramAdRequestParcel);
    }
  }

  public final apj b()
  {
    if (this.c != null)
      return this.c.b();
    return null;
  }

  public final AdSizeParcel c()
  {
    if (this.c != null)
      return this.c.c();
    return null;
  }

  public final boolean d()
  {
    return (this.c != null) && (this.c.d());
  }

  public final void g()
  {
    if (this.c != null)
    {
      this.c.g();
      return;
    }
    c.e("Interstitial ad must be loaded before pingManualTrackingUrl().");
  }

  public final void h()
  {
    if (this.c != null)
      this.c.h();
  }

  public final void i()
  {
    if (this.c != null)
      this.c.i();
  }

  public final void j()
  {
    if (this.c != null)
      this.c.j();
  }

  public final boolean k()
  {
    return (this.c != null) && (this.c.k());
  }

  public final com.google.android.gms.ads.internal.client.bc l()
  {
    throw new IllegalStateException("getVideoController not implemented for interstitials");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.interstitial.ag
 * JD-Core Version:    0.6.0
 */