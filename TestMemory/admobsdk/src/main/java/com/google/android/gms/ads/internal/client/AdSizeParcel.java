package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhb;

@zzhb
public class AdSizeParcel
  implements SafeParcelable
{
  public static final zzi CREATOR = new zzi();
  public final int versionCode;
  public final String zzuh;
  public final int height;
  public final int heightPixels;
  public final boolean zzui;
  public final int width;
  public final int widthPixels;
  public final AdSizeParcel[] zzuj;
  public final boolean zzuk;
  public final boolean zzul;
  public boolean zzum;

  public static int zza(DisplayMetrics paramDisplayMetrics)
  {
    return paramDisplayMetrics.widthPixels;
  }

  public static int zzb(DisplayMetrics paramDisplayMetrics)
  {
    return (int)(zzc(paramDisplayMetrics) * paramDisplayMetrics.density);
  }

  private static int zzc(DisplayMetrics paramDisplayMetrics)
  {
    int i = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    if (i <= 400)
      return 32;
    if (i <= 720)
      return 50;
    return 90;
  }

  public static AdSizeParcel zzt(Context paramContext)
  {
    return new AdSizeParcel(5, "320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
  }

  public static AdSizeParcel zzcP()
  {
    return new AdSizeParcel(5, "reward_mb", 0, 0, true, 0, 0, null, false, false, false);
  }

  public AdSizeParcel()
  {
    this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
  }

  public AdSizeParcel(Context context, AdSize adSize)
  {
    this(context, new AdSize[] { adSize });
  }

  public AdSizeParcel(Context context, AdSize[] adSizes)
  {
    AdSize localAdSize = adSizes[0];
    this.versionCode = 5;
    this.zzui = false;
    this.zzul = localAdSize.isFluid();
    if (this.zzul)
    {
      this.width = AdSize.BANNER.getWidth();
      this.height = AdSize.BANNER.getHeight();
    }
    else
    {
      this.width = localAdSize.getWidth();
      this.height = localAdSize.getHeight();
    }
    int i = this.width == -1 ? 1 : 0;
    int j = this.height == -2 ? 1 : 0;
    DisplayMetrics localDisplayMetrics = context.getResources().getDisplayMetrics();
    int k;
    if (i != 0)
    {
      if ((zzn.zzcS().zzV(context)) && (zzn.zzcS().zzW(context)))
        this.widthPixels = (zza(localDisplayMetrics) - zzn.zzcS().zzX(context));
      else
        this.widthPixels = zza(localDisplayMetrics);
      double d = this.widthPixels / localDisplayMetrics.density;
      k = (int)d;
      if (d - (int)d >= 0.01D)
        k++;
    }
    else
    {
      k = this.width;
      this.widthPixels = zzn.zzcS().zza(localDisplayMetrics, this.width);
    }
    int m;
    if (j != 0)
      m = zzc(localDisplayMetrics);
    else
      m = this.height;
    this.heightPixels = zzn.zzcS().zza(localDisplayMetrics, m);
    if ((i != 0) || (j != 0))
      this.zzuh = (k + "x" + m + "_as");
    else if (this.zzul)
      this.zzuh = "320x50_mb";
    else
      this.zzuh = localAdSize.toString();
    if (adSizes.length > 1)
    {
      this.zzuj = new AdSizeParcel[adSizes.length];
      for (int n = 0; n < adSizes.length; n++)
        this.zzuj[n] = new AdSizeParcel(context, adSizes[n]);
    }
    else
    {
      this.zzuj = null;
    }
    this.zzuk = false;
    this.zzum = false;
  }

  public AdSizeParcel(AdSizeParcel adSize, AdSizeParcel[] supportedAdSizes)
  {
    this(5, adSize.zzuh, adSize.height, adSize.heightPixels, adSize.zzui, adSize.width, adSize.widthPixels, supportedAdSizes, adSize.zzuk, adSize.zzul, adSize.zzum);
  }

  AdSizeParcel(int versionCode, String formatString, int height, int heightPixels, boolean isInterstitial, int width, int widthPixels, AdSizeParcel[] supportedAdSizes, boolean isNative, boolean isFluid, boolean isNativeExpress)
  {
    this.versionCode = versionCode;
    this.zzuh = formatString;
    this.height = height;
    this.heightPixels = heightPixels;
    this.zzui = isInterstitial;
    this.width = width;
    this.widthPixels = widthPixels;
    this.zzuj = supportedAdSizes;
    this.zzuk = isNative;
    this.zzul = isFluid;
    this.zzum = isNativeExpress;
  }

  public int describeContents()
  {
    return 0;
  }

  public AdSize zzcQ()
  {
    return com.google.android.gms.ads.zza.zza(this.width, this.height, this.zzuh);
  }

  public void writeToParcel(Parcel out, int flags)
  {
    zzi.zza(this, out, flags);
  }

  public void zzi(boolean paramBoolean)
  {
    this.zzum = paramBoolean;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.AdSizeParcel
 * JD-Core Version:    0.6.0
 */