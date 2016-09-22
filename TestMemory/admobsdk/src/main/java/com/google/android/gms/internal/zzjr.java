package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzr;

@zzhb
public class zzjr
{
  public zzjp zza(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel)
  {
    return zza(paramContext, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, null, null);
  }

  public zzjp zza(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, zzd paramzzd)
  {
    zzjs localzzjs = new zzjs(zzjt.zzb(paramContext, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, paramzzcb, paramzzd));
    localzzjs.setWebViewClient(zzr.zzbE().zzb(localzzjs, paramBoolean2));
    localzzjs.setWebChromeClient(zzr.zzbE().zzk(localzzjs));
    return localzzjs;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjr
 * JD-Core Version:    0.6.0
 */