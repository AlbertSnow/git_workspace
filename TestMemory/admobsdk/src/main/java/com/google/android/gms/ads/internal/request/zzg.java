package com.google.android.gms.ads.internal.request;

import com.google.android.gms.internal.zzhb;
import java.lang.ref.WeakReference;

@zzhb
public final class zzg extends zzk.zza
{
  private final WeakReference<zzc.zza> zzHR;

  public zzg(zzc.zza paramzza)
  {
    this.zzHR = new WeakReference(paramzza);
  }

  public void zzb(AdResponseParcel paramAdResponseParcel)
  {
    zzc.zza localzza = (zzc.zza)this.zzHR.get();
    if (localzza != null)
      localzza.zzb(paramAdResponseParcel);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzg
 * JD-Core Version:    0.6.0
 */