package com.google.android.gms.ads.internal.interstitial;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@a
final class ad
{
  private final Object[] a;

  ad(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    HashSet localHashSet = new HashSet(Arrays.asList(((String)m.Q.a()).split(",")));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    if (localHashSet.contains("networkType"))
      localArrayList.add(Integer.valueOf(paramInt));
    if (localHashSet.contains("birthday"))
      localArrayList.add(Long.valueOf(paramAdRequestParcel.b));
    if (localHashSet.contains("extras"))
      localArrayList.add(a(paramAdRequestParcel.c));
    if (localHashSet.contains("gender"))
      localArrayList.add(Integer.valueOf(paramAdRequestParcel.d));
    if (localHashSet.contains("keywords"))
    {
      if (paramAdRequestParcel.e != null)
        localArrayList.add(paramAdRequestParcel.e.toString());
    }
    else
    {
      if (localHashSet.contains("isTestDevice"))
        localArrayList.add(Boolean.valueOf(paramAdRequestParcel.f));
      if (localHashSet.contains("tagForChildDirectedTreatment"))
        localArrayList.add(Integer.valueOf(paramAdRequestParcel.g));
      if (localHashSet.contains("manualImpressionsEnabled"))
        localArrayList.add(Boolean.valueOf(paramAdRequestParcel.h));
      if (localHashSet.contains("publisherProvidedId"))
        localArrayList.add(paramAdRequestParcel.i);
      if (localHashSet.contains("location"))
      {
        if (paramAdRequestParcel.k == null)
          break label472;
        localArrayList.add(paramAdRequestParcel.k.toString());
      }
      label304: if (localHashSet.contains("contentUrl"))
        localArrayList.add(paramAdRequestParcel.l);
      if (localHashSet.contains("networkExtras"))
        localArrayList.add(a(paramAdRequestParcel.m));
      if (localHashSet.contains("customTargeting"))
        localArrayList.add(a(paramAdRequestParcel.n));
      if (localHashSet.contains("categoryExclusions"))
      {
        if (paramAdRequestParcel.o == null)
          break label482;
        localArrayList.add(paramAdRequestParcel.o.toString());
      }
    }
    while (true)
    {
      if (localHashSet.contains("requestAgent"))
        localArrayList.add(paramAdRequestParcel.p);
      if (localHashSet.contains("requestPackage"))
        localArrayList.add(paramAdRequestParcel.q);
      this.a = localArrayList.toArray();
      return;
      localArrayList.add(null);
      break;
      label472: localArrayList.add(null);
      break label304;
      label482: localArrayList.add(null);
    }
  }

  private static String a(Bundle paramBundle)
  {
    if (paramBundle == null)
      return null;
    StringBuilder localStringBuilder = new StringBuilder();
    Collections.sort(new ArrayList(paramBundle.keySet()));
    Iterator localIterator = paramBundle.keySet().iterator();
    if (localIterator.hasNext())
    {
      Object localObject = paramBundle.get((String)localIterator.next());
      String str;
      if (localObject == null)
        str = "null";
      while (true)
      {
        localStringBuilder.append(str);
        break;
        if ((localObject instanceof Bundle))
        {
          str = a((Bundle)localObject);
          continue;
        }
        str = localObject.toString();
      }
    }
    return localStringBuilder.toString();
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ad))
      return false;
    ad localad = (ad)paramObject;
    return Arrays.equals(this.a, localad.a);
  }

  public final int hashCode()
  {
    return Arrays.hashCode(this.a);
  }

  public final String toString()
  {
    String str = String.valueOf(Arrays.toString(this.a));
    return 24 + String.valueOf(str).length() + "[InterstitialAdPoolKey " + str + "]";
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.interstitial.ad
 * JD-Core Version:    0.6.0
 */