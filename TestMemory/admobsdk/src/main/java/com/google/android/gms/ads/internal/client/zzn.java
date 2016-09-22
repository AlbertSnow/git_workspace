package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.client.zzf;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzn
{
  private static final Object zzqy = new Object();
  private static zzn zzur;
  private final zza zzus = new zza();
  private final zze zzut = new zze();
  private final zzl zzuu = new zzl();
  private final zzaf zzuv = new zzaf();
  private final zzcv zzuw = new zzcv();
  private final zzf zzux = new zzf();

  protected static void zza(zzn paramzzn)
  {
    synchronized (zzqy)
    {
      zzur = paramzzn;
    }
  }

  private static zzn zzcR()
  {
    synchronized (zzqy)
    {
      return zzur;
    }
  }

  public static zza zzcS()
  {
    return zzcR().zzus;
  }

  public static zze zzcT()
  {
    return zzcR().zzut;
  }

  public static zzl zzcU()
  {
    return zzcR().zzuu;
  }

  public static zzaf zzcV()
  {
    return zzcR().zzuv;
  }

  public static zzcv zzcW()
  {
    return zzcR().zzuw;
  }

  public static zzf zzcX()
  {
    return zzcR().zzux;
  }

  static
  {
    zza(new zzn());
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzn
 * JD-Core Version:    0.6.0
 */