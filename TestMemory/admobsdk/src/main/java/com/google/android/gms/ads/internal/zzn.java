package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzy.zza;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;

@zzhb
public class zzn extends zzy.zza
{
  private final Context mContext;
  private static final Object zzqy = new Object();
  private static zzn zzqz;
  private final Object zzpV = new Object();
  private boolean zzqA;
  private float zzqB = -1.0F;

  public static zzn zzr(Context paramContext)
  {
    synchronized (zzqy)
    {
      if (zzqz == null)
        zzqz = new zzn(paramContext.getApplicationContext());
      return zzqz;
    }
  }

  public static zzn zzbs()
  {
    synchronized (zzqy)
    {
      return zzqz;
    }
  }

  zzn(Context paramContext)
  {
    this.mContext = paramContext;
    this.zzqA = false;
  }

  public void zza()
  {
    synchronized (zzqy)
    {
      if (this.zzqA)
      {
        zzin.zzaK("Mobile ads is initialized already.");
        return;
      }
      this.zzqA = true;
    }
  }

  public void setAppVolume(float volume)
  {
    synchronized (this.zzpV)
    {
      this.zzqB = volume;
    }
  }

  public float zzbt()
  {
    synchronized (this.zzpV)
    {
      return this.zzqB;
    }
  }

  public boolean zzbu()
  {
    synchronized (this.zzpV)
    {
      return this.zzqB >= 0.0F;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzn
 * JD-Core Version:    0.6.0
 */