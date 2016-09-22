package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzr;

@zzhb
public class zzdp extends zzim
{
  final zzjp zzpD;
  final zzdr zzzJ;
  private final String zzzK;

  zzdp(zzjp paramzzjp, zzdr paramzzdr, String paramString)
  {
    this.zzpD = paramzzjp;
    this.zzzJ = paramzzdr;
    this.zzzK = paramString;
    zzr.zzbR().zza(this);
  }

  public void zzbr()
  {
    try
    {
      this.zzzJ.zzU(this.zzzK);
    }
    finally
    {
      zzir.zzMc.post(new Runnable()
      {
        public void run()
        {
          zzdq localzzdq = zzr.zzbR();
          localzzdq.zzb(zzdp.this);
        }
      });
    }
  }

  public void onStop()
  {
    this.zzzJ.abort();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdp
 * JD-Core Version:    0.6.0
 */