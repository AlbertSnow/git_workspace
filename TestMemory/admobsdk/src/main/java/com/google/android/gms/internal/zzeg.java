package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;

@zzhb
public class zzeg
{
  private final Object zzpV = new Object();
  private final Context mContext;
  private final String zzAY;
  private final VersionInfoParcel zzpT;
  private zzb<zzed> zzAZ;
  private zzb<zzed> zzBa;
  private zze zzBb;
  private int zzBc = 1;

  public zzeg(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString)
  {
    this.zzAY = paramString;
    this.mContext = paramContext.getApplicationContext();
    this.zzpT = paramVersionInfoParcel;
    this.zzAZ = new zzc();
    this.zzBa = new zzc();
  }

  public zzeg(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, zzb<zzed> paramzzb1, zzb<zzed> paramzzb2)
  {
    this(paramContext, paramVersionInfoParcel, paramString);
    this.zzAZ = paramzzb1;
    this.zzBa = paramzzb2;
  }

  protected zzed zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    return new zzef(paramContext, paramVersionInfoParcel, null);
  }

  private zze zzep()
  {
    zze localzze = new zze(this.zzBa);
    zzir.runOnUiThread(new Runnable(localzze)
    {
      public void run()
      {
        zzed localzzed = zzeg.this.zza(zzeg.zza(zzeg.this), zzeg.zzb(zzeg.this));
        localzzed.zza(new zzed.zza(localzzed)
        {
          public void zzeo()
          {
            zzir.zzMc.postDelayed(new Runnable()
            {
              public void run()
              {
                synchronized (zzeg.zzc(zzeg.this))
                {
                  if ((zzeg.1.this.zzBd.getStatus() == -1) || (zzeg.1.this.zzBd.getStatus() == 1))
                    return;
                  zzeg.1.this.zzBd.reject();
                  zzir.runOnUiThread(new Runnable()
                  {
                    public void run()
                    {
                      zzeg.1.1.this.zzBf.destroy();
                    }
                  });
                  zzin.v("Could not receive loaded message in a timely manner. Rejecting.");
                }
              }
            }
            , zzeg.zza.zzBn);
          }
        });
        localzzed.zza("/jsLoaded", new zzdf(localzzed)
        {
          public void zza(zzjp paramzzjp, Map<String, String> paramMap)
          {
            synchronized (zzeg.zzc(zzeg.this))
            {
              if ((zzeg.1.this.zzBd.getStatus() == -1) || (zzeg.1.this.zzBd.getStatus() == 1))
                return;
              zzeg.zza(zzeg.this, 0);
              zzeg.zzd(zzeg.this).zze(this.zzBf);
              zzeg.1.this.zzBd.zzh(this.zzBf);
              zzeg.zza(zzeg.this, zzeg.1.this.zzBd);
              zzin.v("Successfully loaded JS Engine.");
            }
          }
        });
        zzja localzzja = new zzja();
        3 local3 = new zzdf(localzzed, localzzja)
        {
          public void zza(zzjp paramzzjp, Map<String, String> paramMap)
          {
            synchronized (zzeg.zzc(zzeg.this))
            {
              zzin.zzaJ("JS Engine is requesting an update");
              if (zzeg.zze(zzeg.this) == 0)
              {
                zzin.zzaJ("Starting reload.");
                zzeg.zza(zzeg.this, 2);
                zzeg.this.zzeq();
              }
              this.zzBf.zzb("/requestReload", (zzdf)this.zzBj.get());
            }
          }
        };
        localzzja.set(local3);
        localzzed.zza("/requestReload", local3);
        if (zzeg.zzf(zzeg.this).endsWith(".js"))
          localzzed.zzZ(zzeg.zzf(zzeg.this));
        else if (zzeg.zzf(zzeg.this).startsWith("<html>"))
          localzzed.zzab(zzeg.zzf(zzeg.this));
        else
          localzzed.zzaa(zzeg.zzf(zzeg.this));
        zzir.zzMc.postDelayed(new Runnable(localzzed)
        {
          public void run()
          {
            synchronized (zzeg.zzc(zzeg.this))
            {
              if ((zzeg.1.this.zzBd.getStatus() == -1) || (zzeg.1.this.zzBd.getStatus() == 1))
                return;
              zzeg.1.this.zzBd.reject();
              zzir.runOnUiThread(new Runnable()
              {
                public void run()
                {
                  zzeg.1.4.this.zzBf.destroy();
                }
              });
              zzin.v("Could not receive loaded message in a timely manner. Rejecting.");
            }
          }
        }
        , zzeg.zza.zzBm);
      }
    });
    return localzze;
  }

  protected zze zzeq()
  {
    zze localzze = zzep();
    localzze.zza(new zzji.zzc(localzze)
    {
      public void zza(zzed paramzzed)
      {
        synchronized (zzeg.zzc(zzeg.this))
        {
          zzeg.zza(zzeg.this, 0);
          if ((zzeg.zzg(zzeg.this) != null) && (this.zzBl != zzeg.zzg(zzeg.this)))
          {
            zzin.v("New JS engine is loaded, marking previous one as destroyable.");
            zzeg.zzg(zzeg.this).zzeu();
          }
          zzeg.zza(zzeg.this, this.zzBl);
        }
      }
    }
    , new zzji.zza(localzze)
    {
      public void run()
      {
        synchronized (zzeg.zzc(zzeg.this))
        {
          zzeg.zza(zzeg.this, 1);
          zzin.v("Failed loading new engine. Marking new engine destroyable.");
          this.zzBl.zzeu();
        }
      }
    });
    return localzze;
  }

  public zzd zzer()
  {
    synchronized (this.zzpV)
    {
      if ((this.zzBb == null) || (this.zzBb.getStatus() == -1))
      {
        this.zzBc = 2;
        this.zzBb = zzeq();
        return this.zzBb.zzes();
      }
      if (this.zzBc == 0)
        return this.zzBb.zzes();
      if (this.zzBc == 1)
      {
        this.zzBc = 2;
        zzeq();
        return this.zzBb.zzes();
      }
      if (this.zzBc == 2)
        return this.zzBb.zzes();
      return this.zzBb.zzes();
    }
  }

  static class zza
  {
    static int zzBm = 60000;
    static int zzBn = 10000;
  }

  public static class zzd extends zzjj<zzeh>
  {
    private final Object zzpV = new Object();
    private final zzeg.zze zzBo;
    private boolean zzBp;

    public zzd(zzeg.zze paramzze)
    {
      this.zzBo = paramzze;
    }

    public void release()
    {
      synchronized (this.zzpV)
      {
        if (this.zzBp)
          return;
        this.zzBp = true;
        zza(new zzji.zzc()
        {
          public void zzd(zzeh paramzzeh)
          {
            zzin.v("Ending javascript session.");
            ((zzei)paramzzeh).zzew();
          }
        }
        , new zzji.zzb());
        zza(new zzji.zzc()
        {
          public void zzd(zzeh paramzzeh)
          {
            zzin.v("Releasing engine reference.");
            zzeg.zzd.zza(zzeg.zzd.this).zzet();
          }
        }
        , new zzji.zza()
        {
          public void run()
          {
            zzeg.zzd.zza(zzeg.zzd.this).zzet();
          }
        });
      }
    }
  }

  public static class zze extends zzjj<zzed>
  {
    private final Object zzpV = new Object();
    private zzeg.zzb<zzed> zzBa;
    private boolean zzBr;
    private int zzBs;

    public zze(zzeg.zzb<zzed> paramzzb)
    {
      this.zzBa = paramzzb;
      this.zzBr = false;
      this.zzBs = 0;
    }

    public zzeg.zzd zzes()
    {
      zzeg.zzd localzzd = new zzeg.zzd(this);
      synchronized (this.zzpV)
      {
        zza(new zzji.zzc(localzzd)
        {
          public void zza(zzed paramzzed)
          {
            zzin.v("Getting a new session for JS Engine.");
            this.zzBt.zzh(paramzzed.zzen());
          }
        }
        , new zzji.zza(localzzd)
        {
          public void run()
          {
            zzin.v("Rejecting reference for JS Engine.");
            this.zzBt.reject();
          }
        });
        zzx.zzab(this.zzBs >= 0);
        this.zzBs += 1;
      }
      return localzzd;
    }

    protected void zzet()
    {
      synchronized (this.zzpV)
      {
        zzx.zzab(this.zzBs >= 1);
        zzin.v("Releasing 1 reference for JS Engine");
        this.zzBs -= 1;
        zzev();
      }
    }

    public void zzeu()
    {
      synchronized (this.zzpV)
      {
        zzx.zzab(this.zzBs >= 0);
        zzin.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
        this.zzBr = true;
        zzev();
      }
    }

    protected void zzev()
    {
      synchronized (this.zzpV)
      {
        zzx.zzab(this.zzBs >= 0);
        if ((this.zzBr) && (this.zzBs == 0))
        {
          zzin.v("No reference is left (including root). Cleaning up engine.");
          zza(new zzji.zzc()
          {
            public void zza(zzed paramzzed)
            {
              zzir.runOnUiThread(new Runnable(paramzzed)
              {
                public void run()
                {
                  zzeg.zze.zza(zzeg.zze.this).zze(this.zzBv);
                  this.zzBv.destroy();
                }
              });
            }
          }
          , new zzji.zzb());
        }
        else
        {
          zzin.v("There are still references to the engine. Not destroying.");
        }
      }
    }
  }

  public static class zzc<T>
    implements zzeg.zzb<T>
  {
    public void zze(T paramT)
    {
    }
  }

  public static abstract interface zzb<T>
  {
    public abstract void zze(T paramT);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzeg
 * JD-Core Version:    0.6.0
 */