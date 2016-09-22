package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

@zzhb
public class zzgp extends zzgn
{
  private zzgo zzGs;

  zzgp(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    super(paramContext, paramzza, paramzzjp, paramzza1);
  }

  protected void zzgb()
  {
    AdSizeParcel localAdSizeParcel = this.zzpD.zzaN();
    int i;
    int j;
    if (localAdSizeParcel.zzui)
    {
      DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
      i = localDisplayMetrics.widthPixels;
      j = localDisplayMetrics.heightPixels;
    }
    else
    {
      i = localAdSizeParcel.widthPixels;
      j = localAdSizeParcel.heightPixels;
    }
    this.zzGs = new zzgo(this, this.zzpD, i, j);
    this.zzpD.zzhU().zza(this);
    this.zzGs.zza(this.zzGe);
  }

  protected int zzgc()
  {
    if (this.zzGs.zzgg())
    {
      zzin.zzaI("Ad-Network indicated no fill with passback URL.");
      return 3;
    }
    if (!this.zzGs.zzgh())
      return 2;
    return -2;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgp
 * JD-Core Version:    0.6.0
 */