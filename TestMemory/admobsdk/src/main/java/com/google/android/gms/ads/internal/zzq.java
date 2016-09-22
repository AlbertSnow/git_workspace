package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.lang.ref.WeakReference;

@zzhb
public class zzq
{
  private final zza zzqG;
  private final Runnable zzx;
  private AdRequestParcel zzqH;
  private boolean zzqI = false;
  private boolean zzqJ = false;
  private long zzqK = 0L;

  public zzq(zza paramzza)
  {
    this(paramzza, new zza(zzir.zzMc));
  }

  zzq(zza paramzza, zza paramzza1)
  {
    this.zzqG = paramzza1;
    WeakReference localWeakReference = new WeakReference(paramzza);
    this.zzx = new Runnable(localWeakReference)
    {
      public void run()
      {
        zzq.zza(zzq.this, false);
        zza localzza = (zza)this.zzqL.get();
        if (localzza != null)
          localzza.zzd(zzq.zza(zzq.this));
      }
    };
  }

  public void cancel()
  {
    this.zzqI = false;
    this.zzqG.removeCallbacks(this.zzx);
  }

  public void pause()
  {
    this.zzqJ = true;
    if (this.zzqI)
      this.zzqG.removeCallbacks(this.zzx);
  }

  public void resume()
  {
    this.zzqJ = false;
    if (this.zzqI)
    {
      this.zzqI = false;
      zza(this.zzqH, this.zzqK);
    }
  }

  public boolean zzbw()
  {
    return this.zzqI;
  }

  public void zzg(AdRequestParcel paramAdRequestParcel)
  {
    zza(paramAdRequestParcel, 60000L);
  }

  public void zza(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    if (this.zzqI)
    {
      zzin.zzaK("An ad refresh is already scheduled.");
      return;
    }
    this.zzqH = paramAdRequestParcel;
    this.zzqI = true;
    this.zzqK = paramLong;
    if (!this.zzqJ)
    {
      zzin.zzaJ("Scheduling ad refresh " + paramLong + " milliseconds from now.");
      this.zzqG.postDelayed(this.zzx, paramLong);
    }
  }

  public static class zza
  {
    private final Handler mHandler;

    public zza(Handler paramHandler)
    {
      this.mHandler = paramHandler;
    }

    public void removeCallbacks(Runnable runnable)
    {
      this.mHandler.removeCallbacks(runnable);
    }

    public boolean postDelayed(Runnable runnable, long timeFromNowInMillis)
    {
      return this.mHandler.postDelayed(runnable, timeFromNowInMillis);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzq
 * JD-Core Version:    0.6.0
 */