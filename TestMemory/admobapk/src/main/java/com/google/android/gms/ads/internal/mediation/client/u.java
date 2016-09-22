package com.google.android.gms.ads.internal.mediation.client;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import apj;
import apn;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.e;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.l;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mj;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class u extends f
{
  private final com.google.android.gms.ads.mediation.b a;
  private v b;

  public u(com.google.android.gms.ads.mediation.b paramb)
  {
    this.a = paramb;
  }

  private final Bundle a(String paramString1, int paramInt, String paramString2)
  {
    String str1 = String.valueOf(paramString1);
    String str2;
    if (str1.length() != 0)
      str2 = "Server parameters: ".concat(str1);
    Object localObject;
    while (true)
    {
      e.e(str2);
      Bundle localBundle;
      try
      {
        localObject = new Bundle();
        if (paramString1 == null)
          break;
        JSONObject localJSONObject = new JSONObject(paramString1);
        localBundle = new Bundle();
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str3 = (String)localIterator.next();
          localBundle.putString(str3, localJSONObject.getString(str3));
        }
      }
      catch (Throwable localThrowable)
      {
        e.c("Could not get Server Parameters Bundle.", localThrowable);
        throw new RemoteException();
      }
      str2 = new String("Server parameters: ");
      continue;
      localObject = localBundle;
    }
    if ((this.a instanceof AdMobAdapter))
    {
      ((Bundle)localObject).putString("adJson", paramString2);
      ((Bundle)localObject).putInt("tagForChildDirectedTreatment", paramInt);
    }
    return (Bundle)localObject;
  }

  public final apj a()
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.d))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationBannerAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationBannerAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    try
    {
      apj localapj = apn.a(((com.google.android.gms.ads.mediation.d)this.a).d());
      return localapj;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not get banner view from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void a(apj paramapj)
  {
    try
    {
      apn.a(paramapj);
      return;
    }
    catch (Throwable localThrowable)
    {
      e.a("Could not inform adapter of changed context", localThrowable);
    }
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString, h paramh)
  {
    a(paramapj, paramAdRequestParcel, paramString, null, paramh);
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, com.google.android.gms.ads.internal.reward.mediation.client.a parama, String paramString2)
  {
    if (!(this.a instanceof com.google.android.gms.ads.reward.mediation.a))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    e.b("Initialize rewarded video adapter.");
    while (true)
    {
      try
      {
        com.google.android.gms.ads.reward.mediation.a locala = (com.google.android.gms.ads.reward.mediation.a)this.a;
        if (paramAdRequestParcel.e != null)
        {
          localHashSet = new HashSet(paramAdRequestParcel.e);
          boolean bool = paramAdRequestParcel.b < -1L;
          Date localDate = null;
          if (bool)
            continue;
          new t(localDate, paramAdRequestParcel.d, localHashSet, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramAdRequestParcel.r);
          if (paramAdRequestParcel.m == null)
            continue;
          paramAdRequestParcel.m.getBundle(locala.getClass().getName());
          Context localContext = (Context)apn.a(paramapj);
          com.google.android.gms.ads.internal.reward.mediation.client.d locald = new com.google.android.gms.ads.internal.reward.mediation.client.d(parama);
          a(paramString2, paramAdRequestParcel.g, null);
          locala.a(localContext, locald);
          return;
          localDate = new Date(paramAdRequestParcel.b);
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        e.c("Could not initialize rewarded video adapter.", localThrowable);
        throw new RemoteException();
      }
      HashSet localHashSet = null;
    }
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh)
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.f))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationInterstitialAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationInterstitialAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    e.b("Requesting interstitial ad from adapter.");
    while (true)
    {
      try
      {
        com.google.android.gms.ads.mediation.f localf = (com.google.android.gms.ads.mediation.f)this.a;
        if (paramAdRequestParcel.e == null)
          break label252;
        localHashSet = new HashSet(paramAdRequestParcel.e);
        if (paramAdRequestParcel.b != -1L)
          continue;
        Date localDate = null;
        t localt = new t(localDate, paramAdRequestParcel.d, localHashSet, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramAdRequestParcel.r);
        if (paramAdRequestParcel.m != null)
        {
          localBundle = paramAdRequestParcel.m.getBundle(localf.getClass().getName());
          localf.a((Context)apn.a(paramapj), new v(paramh), a(paramString1, paramAdRequestParcel.g, paramString2), localt, localBundle);
          return;
          localDate = new Date(paramAdRequestParcel.b);
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        e.c("Could not request interstitial ad from adapter.", localThrowable);
        throw new RemoteException();
      }
      Bundle localBundle = null;
      continue;
      label252: HashSet localHashSet = null;
    }
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.h))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationNativeAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationNativeAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    while (true)
    {
      try
      {
        com.google.android.gms.ads.mediation.h localh = (com.google.android.gms.ads.mediation.h)this.a;
        if (paramAdRequestParcel.e == null)
          break label259;
        localHashSet = new HashSet(paramAdRequestParcel.e);
        if (paramAdRequestParcel.b != -1L)
          continue;
        Date localDate = null;
        y localy = new y(localDate, paramAdRequestParcel.d, localHashSet, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramNativeAdOptionsParcel, paramList, paramAdRequestParcel.r);
        if (paramAdRequestParcel.m != null)
        {
          localBundle = paramAdRequestParcel.m.getBundle(localh.getClass().getName());
          this.b = new v(paramh);
          localh.a((Context)apn.a(paramapj), this.b, a(paramString1, paramAdRequestParcel.g, paramString2), localy, localBundle);
          return;
          localDate = new Date(paramAdRequestParcel.b);
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        e.c("Could not request native ad from adapter.", localThrowable);
        throw new RemoteException();
      }
      Bundle localBundle = null;
      continue;
      label259: HashSet localHashSet = null;
    }
  }

  public final void a(apj paramapj, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, h paramh)
  {
    a(paramapj, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramh);
  }

  public final void a(apj paramapj, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh)
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.d))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationBannerAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationBannerAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    e.b("Requesting banner ad from adapter.");
    while (true)
    {
      try
      {
        com.google.android.gms.ads.mediation.d locald = (com.google.android.gms.ads.mediation.d)this.a;
        if (paramAdRequestParcel.e == null)
          break label269;
        localHashSet = new HashSet(paramAdRequestParcel.e);
        if (paramAdRequestParcel.b != -1L)
          continue;
        Date localDate = null;
        t localt = new t(localDate, paramAdRequestParcel.d, localHashSet, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramAdRequestParcel.r);
        if (paramAdRequestParcel.m != null)
        {
          localBundle = paramAdRequestParcel.m.getBundle(locald.getClass().getName());
          locald.a((Context)apn.a(paramapj), new v(paramh), a(paramString1, paramAdRequestParcel.g, paramString2), mj.a(paramAdSizeParcel.f, paramAdSizeParcel.c, paramAdSizeParcel.b), localt, localBundle);
          return;
          localDate = new Date(paramAdRequestParcel.b);
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        e.c("Could not request banner ad from adapter.", localThrowable);
        throw new RemoteException();
      }
      Bundle localBundle = null;
      continue;
      label269: HashSet localHashSet = null;
    }
  }

  public final void a(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    a(paramAdRequestParcel, paramString, null);
  }

  public final void a(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
  {
    if (!(this.a instanceof com.google.android.gms.ads.reward.mediation.a))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    e.b("Requesting rewarded video ad from adapter.");
    while (true)
    {
      try
      {
        com.google.android.gms.ads.reward.mediation.a locala = (com.google.android.gms.ads.reward.mediation.a)this.a;
        if (paramAdRequestParcel.e == null)
          break label237;
        localHashSet = new HashSet(paramAdRequestParcel.e);
        if (paramAdRequestParcel.b != -1L)
          continue;
        Date localDate = null;
        t localt = new t(localDate, paramAdRequestParcel.d, localHashSet, paramAdRequestParcel.k, paramAdRequestParcel.f, paramAdRequestParcel.g, paramAdRequestParcel.r);
        if (paramAdRequestParcel.m != null)
        {
          localBundle = paramAdRequestParcel.m.getBundle(locala.getClass().getName());
          locala.a(localt, a(paramString1, paramAdRequestParcel.g, paramString2), localBundle);
          return;
          localDate = new Date(paramAdRequestParcel.b);
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        e.c("Could not load rewarded video ad from adapter.", localThrowable);
        throw new RemoteException();
      }
      Bundle localBundle = null;
      continue;
      label237: HashSet localHashSet = null;
    }
  }

  public final void b()
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.f))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationInterstitialAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationInterstitialAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    e.b("Showing interstitial from adapter.");
    try
    {
      ((com.google.android.gms.ads.mediation.f)this.a).e();
      return;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not show interstitial from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void c()
  {
    try
    {
      this.a.a();
      return;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not destroy adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void d()
  {
    try
    {
      this.a.b();
      return;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not pause adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void e()
  {
    try
    {
      this.a.c();
      return;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not resume adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void f()
  {
    if (!(this.a instanceof com.google.android.gms.ads.reward.mediation.a))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    e.b("Show rewarded video ad from adapter.");
    try
    {
      ((com.google.android.gms.ads.reward.mediation.a)this.a).g();
      return;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not show rewarded video ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final boolean g()
  {
    if (!(this.a instanceof com.google.android.gms.ads.reward.mediation.a))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "))
      {
        e.e(str2);
        throw new RemoteException();
      }
    }
    e.b("Check if adapter is initialized.");
    try
    {
      boolean bool = ((com.google.android.gms.ads.reward.mediation.a)this.a).h();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not check if adapter is initialized.", localThrowable);
    }
    throw new RemoteException();
  }

  public final n h()
  {
    j localj = this.b.a;
    if ((localj instanceof k))
      return new w((k)localj);
    return null;
  }

  public final q i()
  {
    j localj = this.b.a;
    if ((localj instanceof l))
      return new x((l)localj);
    return null;
  }

  public final Bundle j()
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.v2.a))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a v2 MediationBannerAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a v2 MediationBannerAdapter: "))
      {
        e.e(str2);
        return new Bundle();
      }
    }
    return ((com.google.android.gms.ads.mediation.v2.a)this.a).e();
  }

  public final Bundle k()
  {
    if (!(this.a instanceof com.google.android.gms.ads.mediation.v2.b))
    {
      String str1 = String.valueOf(this.a.getClass().getCanonicalName());
      if (str1.length() != 0);
      for (String str2 = "MediationAdapter is not a v2 MediationInterstitialAdapter: ".concat(str1); ; str2 = new String("MediationAdapter is not a v2 MediationInterstitialAdapter: "))
      {
        e.e(str2);
        return new Bundle();
      }
    }
    return ((com.google.android.gms.ads.mediation.v2.b)this.a).f();
  }

  public final Bundle l()
  {
    return new Bundle();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.u
 * JD-Core Version:    0.6.0
 */