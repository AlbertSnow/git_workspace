package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

@zzhb
public class zzfr extends zzfs
  implements zzdf
{
  private final zzjp zzpD;
  private final Context mContext;
  private final WindowManager zzsb;
  private final zzbl zzDz;
  DisplayMetrics zzDA;
  private float zzDB;
  int zzDC = -1;
  int zzDD = -1;
  private int zzDE;
  int zzDF = -1;
  int zzDG = -1;
  int zzDH = -1;
  int zzDI = -1;

  public zzfr(zzjp paramzzjp, Context paramContext, zzbl paramzzbl)
  {
    super(paramzzjp);
    this.zzpD = paramzzjp;
    this.mContext = paramContext;
    this.zzDz = paramzzbl;
    this.zzsb = ((WindowManager)paramContext.getSystemService("window"));
  }

  private void zzeQ()
  {
    this.zzDA = new DisplayMetrics();
    Display localDisplay = this.zzsb.getDefaultDisplay();
    localDisplay.getMetrics(this.zzDA);
    this.zzDB = this.zzDA.density;
    this.zzDE = localDisplay.getRotation();
  }

  void zzeR()
  {
    this.zzDC = zzn.zzcS().zzb(this.zzDA, this.zzDA.widthPixels);
    this.zzDD = zzn.zzcS().zzb(this.zzDA, this.zzDA.heightPixels);
    Activity localActivity = this.zzpD.zzhP();
    if ((localActivity == null) || (localActivity.getWindow() == null))
    {
      this.zzDF = this.zzDC;
      this.zzDG = this.zzDD;
    }
    else
    {
      int[] arrayOfInt = zzr.zzbC().zze(localActivity);
      this.zzDF = zzn.zzcS().zzb(this.zzDA, arrayOfInt[0]);
      this.zzDG = zzn.zzcS().zzb(this.zzDA, arrayOfInt[1]);
    }
  }

  void zzeS()
  {
    if (this.zzpD.zzaN().zzui)
    {
      this.zzDH = this.zzDC;
      this.zzDI = this.zzDD;
    }
    else
    {
      this.zzpD.measure(0, 0);
      this.zzDH = zzn.zzcS().zzc(this.mContext, this.zzpD.getMeasuredWidth());
      this.zzDI = zzn.zzcS().zzc(this.mContext, this.zzpD.getMeasuredHeight());
    }
  }

  public void zzeT()
  {
    zzeQ();
    zzeR();
    zzeS();
    zzeW();
    zzeX();
    zzeV();
    zzeU();
  }

  void zzeU()
  {
    if (zzin.zzQ(2))
      zzin.zzaJ("Dispatching Ready Event.");
    zzan(this.zzpD.zzhX().afmaVersion);
  }

  private void zzeV()
  {
    int[] arrayOfInt = new int[2];
    this.zzpD.getLocationOnScreen(arrayOfInt);
    zzf(zzn.zzcS().zzc(this.mContext, arrayOfInt[0]), zzn.zzcS().zzc(this.mContext, arrayOfInt[1]));
  }

  public void zzf(int paramInt1, int paramInt2)
  {
    int i = 0;
    if ((this.mContext instanceof Activity))
      i = zzr.zzbC().zzh((Activity)this.mContext)[0];
    zzc(paramInt1, paramInt2 - i, this.zzDH, this.zzDI);
    this.zzpD.zzhU().zze(paramInt1, paramInt2);
  }

  void zzeW()
  {
    zza(this.zzDC, this.zzDD, this.zzDF, this.zzDG, this.zzDB, this.zzDE);
  }

  void zzeX()
  {
    zzfq localzzfq = zzeY();
    this.zzpD.zzb("onDeviceFeaturesReceived", localzzfq.toJson());
  }

  private zzfq zzeY()
  {
    return new zzfq.zza().zzr(this.zzDz.zzdj()).zzq(this.zzDz.zzdk()).zzs(this.zzDz.zzdo()).zzt(this.zzDz.zzdl()).zzu(this.zzDz.zzdm()).zzeP();
  }

  public void zza(zzjp paramzzjp, Map<String, String> paramMap)
  {
    zzeT();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfr
 * JD-Core Version:    0.6.0
 */