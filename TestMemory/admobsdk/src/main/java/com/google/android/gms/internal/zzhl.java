package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

@zzhb
public abstract class zzhl
{
  public abstract void zza(Context paramContext, zzhf paramzzhf, VersionInfoParcel paramVersionInfoParcel);

  protected void zze(zzhf paramzzhf)
  {
    paramzzhf.zzgD();
    if (paramzzhf.zzgB() != null)
      paramzzhf.zzgB().release();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhl
 * JD-Core Version:    0.6.0
 */