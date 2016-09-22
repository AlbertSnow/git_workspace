package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.zze;
import java.util.concurrent.Callable;

@zzhb
public class zzbs
{
  private final Object zzpV = new Object();
  private boolean zzqA = false;
  private SharedPreferences zzvx = null;

  public void initialize(Context context)
  {
    synchronized (this.zzpV)
    {
      if (this.zzqA)
        return;
      Context localContext = zze.getRemoteContext(context);
      if (localContext == null)
        return;
      this.zzvx = zzr.zzbJ().zzw(localContext);
      this.zzqA = true;
    }
  }

  public <T> T zzd(zzbp<T> paramzzbp)
  {
    synchronized (this.zzpV)
    {
      if (!this.zzqA)
        return paramzzbp.zzdq();
    }
    return zzjb.zzb(new Callable(paramzzbp)
    {
      public T call()
      {
        return this.zzvy.zza(zzbs.zza(zzbs.this));
      }
    });
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbs
 * JD-Core Version:    0.6.0
 */