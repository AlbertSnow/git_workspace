package com.google.android.gms.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@zzhb
public class zzdy
{
  private final Map<zzdz, zzea> zzAx = new HashMap();
  private final LinkedList<zzdz> zzAy = new LinkedList();
  private zzdv zzAz;

  void zza(zzdv paramzzdv)
  {
    if (this.zzAz == null)
    {
      this.zzAz = paramzzdv;
      restore();
    }
  }

  zzea.zza zza(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    MutableContextWrapper localMutableContextWrapper = this.zzAz.zzed();
    zzhj localzzhj = new zzhj.zza(localMutableContextWrapper).zzgI();
    int i = localzzhj.zzKc;
    zzdz localzzdz = new zzdz(paramAdRequestParcel, paramString, i);
    zzea localzzea1 = (zzea)this.zzAx.get(localzzdz);
    if (localzzea1 == null)
    {
      zza("Interstitial pool created at %s.", localzzdz);
      localzzea1 = new zzea(paramAdRequestParcel, paramString, i);
      this.zzAx.put(localzzdz, localzzea1);
    }
    this.zzAy.remove(localzzdz);
    this.zzAy.add(localzzdz);
    localzzdz.zzeg();
    Object localObject;
    while (this.zzAy.size() > ((Integer)zzbt.zzwG.get()).intValue())
    {
      localObject = (zzdz)this.zzAy.remove();
      zzea localzzea2 = (zzea)this.zzAx.get(localObject);
      zza("Evicting interstitial queue for %s.", (zzdz)localObject);
      while (localzzea2.size() > 0)
      {
        zzea.zza localzza = localzzea2.zzej();
        localzza.zzAD.zzbp();
      }
      this.zzAx.remove(localObject);
    }
    while (localzzea1.size() > 0)
    {
      localObject = localzzea1.zzej();
      if (((zzea.zza)localObject).zzAG)
      {
        long l = zzr.zzbG().currentTimeMillis() - ((zzea.zza)localObject).zzAF;
        if (l > 1000L * ((Integer)zzbt.zzwI.get()).intValue())
        {
          zza("Expired interstitial at %s.", localzzdz);
          continue;
        }
      }
      zza("Pooled interstitial returned at %s.", localzzdz);
      return localObject;
    }
    return (zzea.zza)null;
  }

  void zzee()
  {
    if (this.zzAz == null)
      return;
    Iterator localIterator = this.zzAx.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      zzdz localzzdz = (zzdz)localEntry.getKey();
      zzea localzzea = (zzea)localEntry.getValue();
      while (localzzea.size() < ((Integer)zzbt.zzwH.get()).intValue())
      {
        zza("Pooling one interstitial for %s.", localzzdz);
        localzzea.zzb(this.zzAz);
      }
    }
    save();
  }

  void save()
  {
    if (this.zzAz == null)
      return;
    MutableContextWrapper localMutableContextWrapper = this.zzAz.zzed();
    SharedPreferences localSharedPreferences = localMutableContextWrapper.getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.clear();
    Iterator localIterator = this.zzAx.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      zzdz localzzdz = (zzdz)localEntry.getKey();
      if (localzzdz.zzeh())
      {
        zzea localzzea = (zzea)localEntry.getValue();
        zzec localzzec = new zzec(localzzea);
        String str1 = localzzec.zzem();
        String str2 = localzzdz.toString();
        localEditor.putString(str2, str1);
        zza("Saved interstitial queue for %s.", localzzdz);
      }
    }
    localEditor.putString("PoolKeys", zzef());
    localEditor.commit();
  }

  void restore()
  {
    if (this.zzAz == null)
      return;
    MutableContextWrapper localMutableContextWrapper = this.zzAz.zzed();
    SharedPreferences localSharedPreferences = localMutableContextWrapper.getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
    flush();
    HashMap localHashMap = new HashMap();
    Object localObject1 = localSharedPreferences.getAll().entrySet().iterator();
    Object localObject2;
    zzec localzzec;
    zzdz localzzdz;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      try
      {
        String str1 = (String)((Map.Entry)localObject2).getKey();
        if (str1.equals("PoolKeys"))
          continue;
        String str2 = (String)((Map.Entry)localObject2).getValue();
        localzzec = new zzec(str2);
        localzzdz = new zzdz(localzzec.zzqH, localzzec.zzpS, localzzec.zzAC);
        if (!this.zzAx.containsKey(localzzdz))
        {
          zzea localzzea = new zzea(localzzec.zzqH, localzzec.zzpS, localzzec.zzAC);
          this.zzAx.put(localzzdz, localzzea);
          localHashMap.put(localzzdz.toString(), localzzdz);
          zza("Restored interstitial queue for %s.", localzzdz);
        }
      }
      catch (ClassCastException localClassCastException)
      {
        zzin.zzd("Malformed preferences value for InterstitialAdPool.", localClassCastException);
      }
    }
    localObject1 = zzY(localSharedPreferences.getString("PoolKeys", ""));
    for (localzzec : localObject1)
    {
      localzzdz = (zzdz)localHashMap.get(localzzec);
      if (!this.zzAx.containsKey(localzzdz))
        continue;
      this.zzAy.add(localzzdz);
    }
  }

  void flush()
  {
    while (this.zzAy.size() > 0)
    {
      zzdz localzzdz = (zzdz)this.zzAy.remove();
      zzea localzzea = (zzea)this.zzAx.get(localzzdz);
      zza("Flushing interstitial queue for %s.", localzzdz);
      while (localzzea.size() > 0)
      {
        zzea.zza localzza = localzzea.zzej();
        localzza.zzAD.zzbp();
      }
      this.zzAx.remove(localzzdz);
    }
  }

  private String zzef()
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.zzAy.iterator();
      while (localIterator.hasNext())
      {
        String str = ((zzdz)localIterator.next()).toString();
        localStringBuilder.append(Base64.encodeToString(str.getBytes("UTF-8"), 0));
        if (localIterator.hasNext())
          localStringBuilder.append("");
      }
      return localStringBuilder.toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return "";
  }

  private String[] zzY(String paramString)
  {
    try
    {
      String[] arrayOfString = paramString.split("");
      for (int i = 0; i < arrayOfString.length; i++)
        arrayOfString[i] = new String(Base64.decode(arrayOfString[i], 0), "UTF-8");
      return arrayOfString;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return new String[0];
  }

  private static void zza(String paramString, zzdz paramzzdz)
  {
    if (zzin.zzQ(2))
      zzin.v(String.format(paramString, new Object[] { paramzzdz }));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdy
 * JD-Core Version:    0.6.0
 */