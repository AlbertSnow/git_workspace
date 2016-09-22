package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzeo;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zziq;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzmq;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzb extends zzim
  implements zzc.zza
{
  private final zza.zza zzHg;
  private final AdRequestInfoParcel.zza zzHh;
  private final Object zzGg = new Object();
  private final Context mContext;
  private final zzan zzyt;
  private AdRequestInfoParcel zzCu;
  private Runnable zzGf;
  zzit zzHi;
  AdResponseParcel zzGe;
  zzeo zzCf;

  public zzb(Context paramContext, AdRequestInfoParcel.zza paramzza, zzan paramzzan, zza.zza paramzza1)
  {
    this.zzHg = paramzza1;
    this.mContext = paramContext;
    this.zzHh = paramzza;
    this.zzyt = paramzzan;
  }

  zzit zza(VersionInfoParcel paramVersionInfoParcel, zzji<AdRequestInfoParcel> paramzzji)
  {
    return zzc.zza(this.mContext, paramVersionInfoParcel, paramzzji, this);
  }

  public void zzbr()
  {
    zzin.zzaI("AdLoaderBackgroundTask started.");
    this.zzGf = new Runnable()
    {
      public void run()
      {
        synchronized (zzb.zza(zzb.this))
        {
          if (zzb.this.zzHi == null)
            return;
          zzb.this.onStop();
          zzb.zza(zzb.this, 2, "Timed out waiting for ad response.");
        }
      }
    };
    zzir.zzMc.postDelayed(this.zzGf, ((Long)zzbt.zzwX.get()).longValue());
    zzjj localzzjj = new zzjj();
    long l = zzr.zzbG().elapsedRealtime();
    zziq.zza(new Runnable(localzzjj)
    {
      public void run()
      {
        synchronized (zzb.zza(zzb.this))
        {
          zzb.this.zzHi = zzb.this.zza(zzb.zzb(zzb.this).zzrl, this.zzHk);
          if (zzb.this.zzHi == null)
          {
            zzb.zza(zzb.this, 0, "Could not start the ad request service.");
            zzir.zzMc.removeCallbacks(zzb.zzc(zzb.this));
          }
        }
      }
    });
    zzaj localzzaj = this.zzyt.zzab();
    String str = localzzaj.zzb(this.mContext);
    this.zzCu = new AdRequestInfoParcel(this.zzHh, str, l);
    localzzjj.zzh(this.zzCu);
  }

  private void zzc(int paramInt, String paramString)
  {
    if ((paramInt == 3) || (paramInt == -1))
      zzin.zzaJ(paramString);
    else
      zzin.zzaK(paramString);
    if (this.zzGe == null)
      this.zzGe = new AdResponseParcel(paramInt);
    else
      this.zzGe = new AdResponseParcel(paramInt, this.zzGe.zzBU);
    AdRequestInfoParcel localAdRequestInfoParcel;
    if (this.zzCu != null)
      localAdRequestInfoParcel = this.zzCu;
    else
      localAdRequestInfoParcel = new AdRequestInfoParcel(this.zzHh, null, -1L);
    zzif.zza localzza = new zzif.zza(localAdRequestInfoParcel, this.zzGe, this.zzCf, null, paramInt, -1L, this.zzGe.zzHX, null);
    this.zzHg.zza(localzza);
  }

  public void zzb(@NonNull AdResponseParcel paramAdResponseParcel)
  {
    zzin.zzaI("Received ad response.");
    this.zzGe = paramAdResponseParcel;
    long l = zzr.zzbG().elapsedRealtime();
    synchronized (this.zzGg)
    {
      this.zzHi = null;
    }
    ??? = null;
    try
    {
      if ((this.zzGe.errorCode != -2) && (this.zzGe.errorCode != -3))
        throw new zza("There was a problem getting an ad response. ErrorCode: " + this.zzGe.errorCode, this.zzGe.errorCode);
      zzgq();
      if (this.zzCu.zzrp.zzuj != null)
        ??? = zzb(this.zzCu);
    }
    catch (zza localzza)
    {
      zzc(localzza.getErrorCode(), localzza.getMessage());
      zzir.zzMc.removeCallbacks(this.zzGf);
      return;
    }
    zzr.zzbF().zzB(this.zzGe.zzId);
    JSONObject localJSONObject = null;
    if (!TextUtils.isEmpty(this.zzGe.zzIb))
      try
      {
        localJSONObject = new JSONObject(this.zzGe.zzIb);
      }
      catch (Exception localException)
      {
        zzin.zzb("Error parsing the JSON for Active View.", localException);
      }
    zzif.zza localzza1 = new zzif.zza(this.zzCu, this.zzGe, this.zzCf, (AdSizeParcel)???, -2, l, this.zzGe.zzHX, localJSONObject);
    this.zzHg.zza(localzza1);
    zzir.zzMc.removeCallbacks(this.zzGf);
  }

  public void onStop()
  {
    synchronized (this.zzGg)
    {
      if (this.zzHi != null)
        this.zzHi.cancel();
    }
  }

  protected void zzgq()
    throws zzb.zza
  {
    if (this.zzGe.errorCode == -3)
      return;
    if (TextUtils.isEmpty(this.zzGe.body))
      throw new zza("No fill from ad server.", 3);
    zzr.zzbF().zza(this.mContext, this.zzGe.zzHB);
    if (this.zzGe.zzHT)
      try
      {
        this.zzCf = new zzeo(this.zzGe.body);
      }
      catch (JSONException localJSONException)
      {
        throw new zza("Could not parse mediation config: " + this.zzGe.body, 0);
      }
  }

  protected AdSizeParcel zzb(AdRequestInfoParcel paramAdRequestInfoParcel)
    throws zzb.zza
  {
    if (this.zzGe.zzHW == null)
      throw new zza("The ad response must specify one of the supported ad sizes.", 0);
    String[] arrayOfString = this.zzGe.zzHW.split("x");
    if (arrayOfString.length != 2)
      throw new zza("Invalid ad size format from the ad response: " + this.zzGe.zzHW, 0);
    int i;
    int j;
    try
    {
      i = Integer.parseInt(arrayOfString[0]);
      j = Integer.parseInt(arrayOfString[1]);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new zza("Invalid ad size number from the ad response: " + this.zzGe.zzHW, 0);
    }
    for (AdSizeParcel localAdSizeParcel : paramAdRequestInfoParcel.zzrp.zzuj)
    {
      float f = this.mContext.getResources().getDisplayMetrics().density;
      int n = localAdSizeParcel.width == -1 ? (int)(localAdSizeParcel.widthPixels / f) : localAdSizeParcel.width;
      int i1 = localAdSizeParcel.height == -2 ? (int)(localAdSizeParcel.heightPixels / f) : localAdSizeParcel.height;
      if ((i == n) && (j == i1))
        return new AdSizeParcel(localAdSizeParcel, paramAdRequestInfoParcel.zzrp.zzuj);
    }
    throw new zza("The ad size from the ad response was not one of the requested sizes: " + this.zzGe.zzHW, 0);
  }

  @zzhb
  static final class zza extends Exception
  {
    private final int zzGu;

    public zza(String paramString, int paramInt)
    {
      super();
      this.zzGu = paramInt;
    }

    public int getErrorCode()
    {
      return this.zzGu;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzb
 * JD-Core Version:    0.6.0
 */