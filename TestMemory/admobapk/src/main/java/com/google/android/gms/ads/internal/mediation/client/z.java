package com.google.android.gms.ads.internal.mediation.client;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import apj;
import apn;
import com.google.ads.mediation.i;
import com.google.ads.mediation.j;
import com.google.ads.mediation.l;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class z extends f
{
  private final i a;
  private final com.google.ads.mediation.q b;

  public z(i parami, com.google.ads.mediation.q paramq)
  {
    this.a = parami;
    this.b = paramq;
  }

  private final com.google.ads.mediation.n a(String paramString)
  {
    HashMap localHashMap;
    if (paramString != null)
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        localHashMap = new HashMap(localJSONObject.length());
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localHashMap.put(str, localJSONObject.getString(str));
        }
      }
      catch (Throwable localThrowable)
      {
        e.c("Could not get MediationServerParameters.", localThrowable);
        throw new RemoteException();
      }
    else
      localHashMap = new HashMap(0);
    com.google.ads.mediation.n localn = (com.google.ads.mediation.n)this.a.b().newInstance();
    localn.a(localHashMap);
    return localn;
  }

  public final apj a()
  {
    if (!(this.a instanceof j))
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
      apj localapj = apn.a(((j)this.a).c());
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
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString, h paramh)
  {
    a(paramapj, paramAdRequestParcel, paramString, null, paramh);
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, com.google.android.gms.ads.internal.reward.mediation.client.a parama, String paramString2)
  {
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh)
  {
    if (!(this.a instanceof l))
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
    try
    {
      l locall = (l)this.a;
      aa localaa = new aa(paramh);
      Activity localActivity = (Activity)apn.a(paramapj);
      locall.a(localaa, localActivity, a(paramString1), ad.a(paramAdRequestParcel), this.b);
      return;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not request interstitial ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void a(apj paramapj, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList)
  {
  }

  public final void a(apj paramapj, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, h paramh)
  {
    a(paramapj, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramh);
  }

  public final void a(apj paramapj, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, h paramh)
  {
    if (!(this.a instanceof j))
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
    try
    {
      j localj = (j)this.a;
      aa localaa = new aa(paramh);
      Activity localActivity = (Activity)apn.a(paramapj);
      localj.a(localaa, localActivity, a(paramString1), ad.a(paramAdSizeParcel), ad.a(paramAdRequestParcel), this.b);
      return;
    }
    catch (Throwable localThrowable)
    {
      e.c("Could not request banner ad from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public final void a(AdRequestParcel paramAdRequestParcel, String paramString)
  {
  }

  public final void a(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
  {
  }

  public final void b()
  {
    if (!(this.a instanceof l))
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
  }

  public final void c()
  {
  }

  public final void d()
  {
    throw new RemoteException();
  }

  public final void e()
  {
    throw new RemoteException();
  }

  public final void f()
  {
  }

  public final boolean g()
  {
    return true;
  }

  public final n h()
  {
    return null;
  }

  public final q i()
  {
    return null;
  }

  public final Bundle j()
  {
    return new Bundle();
  }

  public final Bundle k()
  {
    return new Bundle();
  }

  public final Bundle l()
  {
    return new Bundle();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.z
 * JD-Core Version:    0.6.0
 */