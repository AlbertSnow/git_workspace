package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@zzhb
class zzdz
{
  private final Object[] mParams;
  private boolean zzAA;

  zzdz(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    this.mParams = zza(paramAdRequestParcel, paramString, paramInt);
  }

  public boolean equals(Object o)
  {
    if (!(o instanceof zzdz))
      return false;
    zzdz localzzdz = (zzdz)o;
    return Arrays.equals(this.mParams, localzzdz.mParams);
  }

  public int hashCode()
  {
    return Arrays.hashCode(this.mParams);
  }

  public String toString()
  {
    return "[InterstitialAdPoolKey " + Arrays.toString(this.mParams) + "]";
  }

  void zzeg()
  {
    this.zzAA = true;
  }

  boolean zzeh()
  {
    return this.zzAA;
  }

  private static Object[] zza(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    String str = (String)zzbt.zzwF.get();
    HashSet localHashSet = new HashSet(Arrays.asList(str.split(",")));
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    if (localHashSet.contains("networkType"))
      localArrayList.add(Integer.valueOf(paramInt));
    if (localHashSet.contains("birthday"))
      localArrayList.add(Long.valueOf(paramAdRequestParcel.zztC));
    if (localHashSet.contains("extras"))
      localArrayList.add(zzc(paramAdRequestParcel.extras));
    if (localHashSet.contains("gender"))
      localArrayList.add(Integer.valueOf(paramAdRequestParcel.zztD));
    if (localHashSet.contains("keywords"))
      if (paramAdRequestParcel.zztE != null)
        localArrayList.add(paramAdRequestParcel.zztE.toString());
      else
        localArrayList.add(null);
    if (localHashSet.contains("isTestDevice"))
      localArrayList.add(Boolean.valueOf(paramAdRequestParcel.zztF));
    if (localHashSet.contains("tagForChildDirectedTreatment"))
      localArrayList.add(Integer.valueOf(paramAdRequestParcel.zztG));
    if (localHashSet.contains("manualImpressionsEnabled"))
      localArrayList.add(Boolean.valueOf(paramAdRequestParcel.zztH));
    if (localHashSet.contains("publisherProvidedId"))
      localArrayList.add(paramAdRequestParcel.zztI);
    if (localHashSet.contains("location"))
      if (paramAdRequestParcel.zztK != null)
        localArrayList.add(paramAdRequestParcel.zztK.toString());
      else
        localArrayList.add(null);
    if (localHashSet.contains("contentUrl"))
      localArrayList.add(paramAdRequestParcel.zztL);
    if (localHashSet.contains("networkExtras"))
      localArrayList.add(zzc(paramAdRequestParcel.zztM));
    if (localHashSet.contains("customTargeting"))
      localArrayList.add(zzc(paramAdRequestParcel.zztN));
    if (localHashSet.contains("categoryExclusions"))
      if (paramAdRequestParcel.zztO != null)
        localArrayList.add(paramAdRequestParcel.zztO.toString());
      else
        localArrayList.add(null);
    if (localHashSet.contains("requestAgent"))
      localArrayList.add(paramAdRequestParcel.zztP);
    if (localHashSet.contains("requestPackage"))
      localArrayList.add(paramAdRequestParcel.zztQ);
    return localArrayList.toArray();
  }

  private static String zzc(Bundle paramBundle)
  {
    if (paramBundle == null)
      return null;
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = new ArrayList(paramBundle.keySet());
    Collections.sort(localArrayList);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      Object localObject = paramBundle.get(str1);
      String str2;
      if (localObject == null)
        str2 = "null";
      else if ((localObject instanceof Bundle))
        str2 = zzc((Bundle)localObject);
      else
        str2 = localObject.toString();
      localStringBuilder.append(str2);
    }
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdz
 * JD-Core Version:    0.6.0
 */