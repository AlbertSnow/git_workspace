package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.Nullable;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzne;

public abstract class zzj
{
  @Nullable
  public abstract zzi zza(Context paramContext, zzjp paramzzjp, int paramInt, zzcb paramzzcb, zzbz paramzzbz);

  protected boolean zzx(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    return (zzne.zzsg()) && ((localApplicationInfo == null) || (localApplicationInfo.targetSdkVersion >= 11));
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzj
 * JD-Core Version:    0.6.0
 */