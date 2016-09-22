package com.google.android.gms.internal;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

@zzhb
public class zziw
{
  private static zzl zzMy;
  private static final Object zzqy = new Object();
  public static final zza<Void> zzMz = new zza()
  {
    public Void zzi(InputStream paramInputStream)
    {
      return null;
    }

    public Void zzhB()
    {
      return null;
    }
  };

  public zziw(Context paramContext)
  {
    zzMy = zzS(paramContext);
  }

  public <T> zzjg<T> zza(String paramString, zza<T> paramzza)
  {
    zzc localzzc = new zzc(null);
    zzMy.zze(new zzb(paramString, paramzza, localzzc));
    return localzzc;
  }

  public zzjg<String> zzb(String paramString, Map<String, String> paramMap)
  {
    zzc localzzc = new zzc(null);
    2 local2 = new zzm.zza(paramString, localzzc)
    {
      public void zze(zzr paramzzr)
      {
        zzin.zzaK("Failed to load URL: " + this.zzzP + "\n" + paramzzr.toString());
        this.zzMA.zzb(null);
      }
    };
    3 local3 = new zzab(paramString, localzzc, local2, paramMap)
    {
      public Map<String, String> getHeaders()
        throws zza
      {
        return this.zzMC == null ? super.getHeaders() : this.zzMC;
      }
    };
    zzMy.zze(local3);
    return localzzc;
  }

  private static zzl zzS(Context paramContext)
  {
    synchronized (zzqy)
    {
      if (zzMy == null)
        zzMy = zzac.zza(paramContext.getApplicationContext());
      return zzMy;
    }
  }

  private class zzc<T> extends zzjd<T>
    implements zzm.zzb<T>
  {
    private zzc()
    {
    }

    public void zzb(T paramT)
    {
      super.zzg(paramT);
    }
  }

  private static class zzb<T> extends zzk<InputStream>
  {
    private final zziw.zza<T> zzMD;
    private final zzm.zzb<T> zzaG;

    public zzb(String paramString, zziw.zza<T> paramzza, zzm.zzb<T> paramzzb)
    {
      super(paramString, new zzm.zza(paramzza)
      {
        public void zze(zzr paramzzr)
        {
          zziw.zzb.this.zzb(this.zzMF.zzgp());
        }
      });
      this.zzMD = paramzza;
      this.zzaG = paramzzb;
    }

    protected zzm<InputStream> zza(zzi paramzzi)
    {
      return zzm.zza(new ByteArrayInputStream(paramzzi.data), zzx.zzb(paramzzi));
    }

    protected void zzj(InputStream paramInputStream)
    {
      this.zzaG.zzb(this.zzMD.zzh(paramInputStream));
    }
  }

  public static abstract interface zza<T>
  {
    public abstract T zzh(InputStream paramInputStream);

    public abstract T zzgp();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zziw
 * JD-Core Version:    0.6.0
 */