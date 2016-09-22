package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public final class zzer
  implements zzes.zza
{
  private final String zzCd;
  private final zzex zzpn;
  private final long zzCe;
  private final zzeo zzCf;
  private final zzen zzCg;
  private final AdRequestParcel zzqH;
  private final AdSizeParcel zzCh;
  private final Context mContext;
  private final Object zzpV = new Object();
  private final VersionInfoParcel zzpT;
  private final boolean zzsA;
  private final NativeAdOptionsParcel zzpP;
  private final List<String> zzpQ;
  private final boolean zzuS;
  private zzey zzCi;
  private int zzCj = -2;
  private zzfa zzCk;

  public zzer(Context paramContext, String paramString, zzex paramzzex, zzeo paramzzeo, zzen paramzzen, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, VersionInfoParcel paramVersionInfoParcel, boolean paramBoolean1, boolean paramBoolean2, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList)
  {
    this.mContext = paramContext;
    this.zzpn = paramzzex;
    this.zzCg = paramzzen;
    if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(paramString))
      this.zzCd = zzey();
    else
      this.zzCd = paramString;
    this.zzCf = paramzzeo;
    this.zzCe = (paramzzeo.zzBP != -1L ? paramzzeo.zzBP : 10000L);
    this.zzqH = paramAdRequestParcel;
    this.zzCh = paramAdSizeParcel;
    this.zzpT = paramVersionInfoParcel;
    this.zzsA = paramBoolean1;
    this.zzuS = paramBoolean2;
    this.zzpP = paramNativeAdOptionsParcel;
    this.zzpQ = paramList;
  }

  public void cancel()
  {
    synchronized (this.zzpV)
    {
      try
      {
        if (this.zzCi != null)
          this.zzCi.destroy();
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Could not destroy mediation adapter.", localRemoteException);
      }
      this.zzCj = -1;
      this.zzpV.notify();
    }
  }

  private String zzey()
  {
    try
    {
      if (!TextUtils.isEmpty(this.zzCg.zzBD))
        return this.zzpn.zzag(this.zzCg.zzBD) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Fail to determine the custom event's version, assuming the old one.");
    }
    return "com.google.ads.mediation.customevent.CustomEventAdapter";
  }

  public void zzr(int paramInt)
  {
    synchronized (this.zzpV)
    {
      this.zzCj = paramInt;
      this.zzpV.notify();
    }
  }

  public void zza(int paramInt, zzfa paramzzfa)
  {
    synchronized (this.zzpV)
    {
      this.zzCj = paramInt;
      this.zzCk = paramzzfa;
      this.zzpV.notify();
    }
  }

  public zzes zza(long paramLong1, long paramLong2)
  {
    synchronized (this.zzpV)
    {
      long l = SystemClock.elapsedRealtime();
      zzeq localzzeq = new zzeq();
      zzir.zzMc.post(new Runnable(localzzeq)
      {
        public void run()
        {
          synchronized (zzer.zza(zzer.this))
          {
            if (zzer.zzb(zzer.this) != -2)
              return;
            zzer.zza(zzer.this, zzer.zzc(zzer.this));
            if (zzer.zzd(zzer.this) == null)
            {
              zzer.this.zzr(4);
              return;
            }
            if ((zzer.zze(zzer.this)) && (!zzer.zza(zzer.this, 1)))
            {
              zzin.zzaK("Ignoring adapter " + zzer.zzf(zzer.this) + " as delayed" + " impression is not supported");
              zzer.this.zzr(2);
              return;
            }
            this.zzCl.zza(zzer.this);
            zzer.zza(zzer.this, this.zzCl);
          }
        }
      });
      zza(l, this.zzCe, paramLong1, paramLong2);
      return new zzes(this.zzCg, this.zzCi, this.zzCd, localzzeq, this.zzCj, zzez());
    }
  }

  private zzfa zzez()
  {
    if ((this.zzCj != 0) || (!zzeB()))
      return null;
    try
    {
      if ((zzs(4)) && (this.zzCk != null) && (this.zzCk.zzeD() != 0))
        return this.zzCk;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Could not get cpm value from MediationResponseMetadata");
    }
    return zzt(zzeC());
  }

  private zzey zzeA()
  {
    zzin.zzaJ("Instantiating mediation adapter: " + this.zzCd);
    if ((((Boolean)zzbt.zzwV.get()).booleanValue()) && ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzCd)))
      return new zzfe(new AdMobAdapter());
    if ((((Boolean)zzbt.zzwW.get()).booleanValue()) && ("com.google.ads.mediation.AdUrlAdapter".equals(this.zzCd)))
      return new zzfe(new AdUrlAdapter());
    try
    {
      return this.zzpn.zzaf(this.zzCd);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zza("Could not instantiate mediation adapter: " + this.zzCd, localRemoteException);
    }
    return null;
  }

  private void zza(zzeq paramzzeq)
  {
    if ("com.google.ads.mediation.AdUrlAdapter".equals(this.zzCd))
    {
      localObject = this.zzqH.zztM.getBundle(this.zzCd);
      if (localObject == null)
        localObject = new Bundle();
      ((Bundle)localObject).putString("sdk_less_network_id", this.zzCg.zzBA);
      this.zzqH.zztM.putBundle(this.zzCd, (Bundle)localObject);
    }
    Object localObject = zzac(this.zzCg.zzBG);
    try
    {
      if (this.zzpT.zzNa < 4100000)
      {
        if (this.zzCh.zzui)
          this.zzCi.zza(zze.zzC(this.mContext), this.zzqH, (String)localObject, paramzzeq);
        else
          this.zzCi.zza(zze.zzC(this.mContext), this.zzCh, this.zzqH, (String)localObject, paramzzeq);
      }
      else if (this.zzsA)
        this.zzCi.zza(zze.zzC(this.mContext), this.zzqH, (String)localObject, this.zzCg.zzBz, paramzzeq, this.zzpP, this.zzpQ);
      else if (this.zzCh.zzui)
        this.zzCi.zza(zze.zzC(this.mContext), this.zzqH, (String)localObject, this.zzCg.zzBz, paramzzeq);
      else if (this.zzuS)
      {
        if (this.zzCg.zzBJ != null)
          this.zzCi.zza(zze.zzC(this.mContext), this.zzqH, (String)localObject, this.zzCg.zzBz, paramzzeq, new NativeAdOptionsParcel(zzad(this.zzCg.zzBN)), this.zzCg.zzBM);
        else
          this.zzCi.zza(zze.zzC(this.mContext), this.zzCh, this.zzqH, (String)localObject, this.zzCg.zzBz, paramzzeq);
      }
      else
        this.zzCi.zza(zze.zzC(this.mContext), this.zzCh, this.zzqH, (String)localObject, this.zzCg.zzBz, paramzzeq);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not request ad from mediation adapter.", localRemoteException);
      zzr(5);
    }
  }

  private void zza(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    while (true)
    {
      if (this.zzCj != -2)
        return;
      zzb(paramLong1, paramLong2, paramLong3, paramLong4);
    }
  }

  private void zzb(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = paramLong2 - (l1 - paramLong1);
    long l3 = paramLong4 - (l1 - paramLong3);
    if ((l2 <= 0L) || (l3 <= 0L))
    {
      zzin.zzaJ("Timed out waiting for adapter.");
      this.zzCj = 3;
      return;
    }
    try
    {
      this.zzpV.wait(Math.min(l2, l3));
    }
    catch (InterruptedException localInterruptedException)
    {
      this.zzCj = -1;
    }
  }

  private boolean zzs(int paramInt)
  {
    Bundle localBundle = null;
    try
    {
      if (this.zzsA)
        localBundle = this.zzCi.zzeI();
      else if (this.zzCh.zzui)
        localBundle = this.zzCi.getInterstitialAdapterInfo();
      else
        localBundle = this.zzCi.zzeH();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Could not get adapter info. Returning false");
      return false;
    }
    if (localBundle != null)
    {
      int i = localBundle.getInt("capabilities", 0);
      return (paramInt & i) == paramInt;
    }
    return false;
  }

  private boolean zzeB()
  {
    return this.zzCf.zzBX != -1;
  }

  private String zzac(String paramString)
  {
    if ((paramString == null) || (!zzeB()) || (zzs(2)))
      return paramString;
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localJSONObject.remove("cpm_floor_cents");
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaK("Could not remove field. Returning the original value");
    }
    return paramString;
  }

  private int zzeC()
  {
    if (this.zzCg.zzBG == null)
      return 0;
    JSONObject localJSONObject;
    try
    {
      localJSONObject = new JSONObject(this.zzCg.zzBG);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzaK("Could not convert to json. Returning 0");
      return 0;
    }
    if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzCd))
      return localJSONObject.optInt("cpm_cents", 0);
    int i = 0;
    if (zzs(2))
      i = localJSONObject.optInt("cpm_floor_cents", 0);
    if (i == 0)
      i = localJSONObject.optInt("penalized_average_cpm_cents", 0);
    return i;
  }

  private static zzfa zzt(int paramInt)
  {
    return new zzfa.zza(paramInt)
    {
      public int zzeD()
        throws RemoteException
      {
        return this.zzCn;
      }
    };
  }

  private static NativeAdOptions zzad(String paramString)
  {
    NativeAdOptions.Builder localBuilder = new NativeAdOptions.Builder();
    if (paramString == null)
      return localBuilder.build();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localBuilder.setRequestMultipleImages(localJSONObject.optBoolean("multiple_images", false));
      localBuilder.setReturnUrlsForImageAssets(localJSONObject.optBoolean("only_urls", false));
      String str = localJSONObject.optString("native_image_orientation", "any");
      localBuilder.setImageOrientation(zzae(str));
    }
    catch (JSONException localJSONException)
    {
      zzin.zzd("Exception occurred when creating native ad options", localJSONException);
    }
    return localBuilder.build();
  }

  private static int zzae(String paramString)
  {
    if ("landscape".equals(paramString))
      return 2;
    if ("portrait".equals(paramString))
      return 1;
    return 0;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzer
 * JD-Core Version:    0.6.0
 */