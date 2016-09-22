package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

@zzhb
public abstract class zzgq extends zzim
{
  protected final zzgr.zza zzGc;
  protected final Context mContext;
  protected final Object zzpV = new Object();
  protected final Object zzGg = new Object();
  protected final zzif.zza zzGd;
  protected AdResponseParcel zzGe;

  protected zzgq(Context paramContext, zzif.zza paramzza, zzgr.zza paramzza1)
  {
    super(true);
    this.mContext = paramContext;
    this.zzGd = paramzza;
    this.zzGe = paramzza.zzLe;
    this.zzGc = paramzza1;
  }

  public void zzbr()
  {
    synchronized (this.zzpV)
    {
      zzin.zzaI("AdRendererBackgroundTask started.");
      int i = this.zzGd.errorCode;
      try
      {
        zzh(SystemClock.elapsedRealtime());
      }
      catch (zza localzza)
      {
        i = localzza.getErrorCode();
        if ((i == 3) || (i == -1))
          zzin.zzaJ(localzza.getMessage());
        else
          zzin.zzaK(localzza.getMessage());
        if (this.zzGe == null)
          this.zzGe = new AdResponseParcel(i);
        else
          this.zzGe = new AdResponseParcel(i, this.zzGe.zzBU);
        zzir.zzMc.post(new Runnable()
        {
          public void run()
          {
            zzgq.this.onStop();
          }
        });
      }
      zzif localzzif = zzD(i);
      zzir.zzMc.post(new Runnable(localzzif)
      {
        public void run()
        {
          synchronized (zzgq.this.zzpV)
          {
            zzgq.this.zzm(this.zzpF);
          }
        }
      });
    }
  }

  public void onStop()
  {
  }

  protected void zzm(zzif paramzzif)
  {
    this.zzGc.zzb(paramzzif);
  }

  protected abstract void zzh(long paramLong)
    throws zzgq.zza;

  protected abstract zzif zzD(int paramInt);

  protected static final class zza extends Exception
  {
    private final int zzGu;

    public zza(String paramString, int paramInt)
    {
      super();
      this.zzGu = paramInt;
    }

    public int getErrorCode()
    {
      return this.zzGu;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgq
 * JD-Core Version:    0.6.0
 */