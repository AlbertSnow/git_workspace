package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;

@zzhb
public final class zzc
{
  public static zzit zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji<AdRequestInfoParcel> paramzzji, zza paramzza)
  {
    return zza(paramContext, paramVersionInfoParcel, paramzzji, paramzza, new zzb(paramContext)
    {
      public boolean zza(VersionInfoParcel paramVersionInfoParcel)
      {
        return (paramVersionInfoParcel.zzNb) || ((zze.zzap(this.zzxh)) && (!((Boolean)zzbt.zzwb.get()).booleanValue()));
      }
    });
  }

  static zzit zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji<AdRequestInfoParcel> paramzzji, zza paramzza, zzb paramzzb)
  {
    if (paramzzb.zza(paramVersionInfoParcel))
      return zza(paramContext, paramzzji, paramzza);
    return zzb(paramContext, paramVersionInfoParcel, paramzzji, paramzza);
  }

  private static zzit zza(Context paramContext, zzji<AdRequestInfoParcel> paramzzji, zza paramzza)
  {
    zzin.zzaI("Fetching ad response from local ad request service.");
    zzd.zza localzza = new zzd.zza(paramContext, paramzzji, paramzza);
    localzza.zzga();
    return localzza;
  }

  private static zzit zzb(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzji<AdRequestInfoParcel> paramzzji, zza paramzza)
  {
    zzin.zzaI("Fetching ad response from remote ad request service.");
    if (!zzn.zzcS().zzU(paramContext))
    {
      zzin.zzaK("Failed to connect to remote ad request service.");
      return null;
    }
    zzd.zzb localzzb = new zzd.zzb(paramContext, paramVersionInfoParcel, paramzzji, paramzza);
    return localzzb;
  }

  static abstract interface zzb
  {
    public abstract boolean zza(VersionInfoParcel paramVersionInfoParcel);
  }

  public static abstract interface zza
  {
    public abstract void zzb(AdResponseParcel paramAdResponseParcel);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzc
 * JD-Core Version:    0.6.0
 */