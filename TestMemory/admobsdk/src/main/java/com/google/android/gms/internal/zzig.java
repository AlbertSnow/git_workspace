package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@zzhb
public class zzig
{
  private final zzih zzqV;
  private final LinkedList<zza> zzLf;
  private final Object zzpV = new Object();
  private final String zzLg;
  private final String zzLh;
  private long zzLi = -1L;
  private long zzLj = -1L;
  private boolean zzJu = false;
  private long zzLk = -1L;
  private long zzLl = 0L;
  private long zzLm = -1L;
  private long zzLn = -1L;

  public zzig(String paramString1, String paramString2)
  {
    this(zzr.zzbF(), paramString1, paramString2);
  }

  public zzig(zzih paramzzih, String paramString1, String paramString2)
  {
    this.zzqV = paramzzih;
    this.zzLg = paramString1;
    this.zzLh = paramString2;
    this.zzLf = new LinkedList();
  }

  public void zzk(AdRequestParcel paramAdRequestParcel)
  {
    synchronized (this.zzpV)
    {
      this.zzLm = SystemClock.elapsedRealtime();
      this.zzqV.zzha().zzb(paramAdRequestParcel, this.zzLm);
    }
  }

  public void zzl(long paramLong)
  {
    synchronized (this.zzpV)
    {
      this.zzLn = paramLong;
      if (this.zzLn != -1L)
        this.zzqV.zza(this);
    }
  }

  public void zzm(long paramLong)
  {
    synchronized (this.zzpV)
    {
      if (this.zzLn != -1L)
      {
        this.zzLi = paramLong;
        this.zzqV.zza(this);
      }
    }
  }

  public void zzgS()
  {
    synchronized (this.zzpV)
    {
      if ((this.zzLn != -1L) && (this.zzLj == -1L))
      {
        this.zzLj = SystemClock.elapsedRealtime();
        this.zzqV.zza(this);
      }
      this.zzqV.zzha().zzgS();
    }
  }

  public void zzgT()
  {
    synchronized (this.zzpV)
    {
      if (this.zzLn != -1L)
      {
        zza localzza = new zza();
        localzza.zzgX();
        this.zzLf.add(localzza);
        this.zzLl += 1L;
        this.zzqV.zzha().zzgT();
        this.zzqV.zza(this);
      }
    }
  }

  public void zzgU()
  {
    synchronized (this.zzpV)
    {
      if ((this.zzLn != -1L) && (!this.zzLf.isEmpty()))
      {
        zza localzza = (zza)this.zzLf.getLast();
        if (localzza.zzgV() == -1L)
        {
          localzza.zzgW();
          this.zzqV.zza(this);
        }
      }
    }
  }

  public void zzz(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      if (this.zzLn != -1L)
      {
        this.zzLk = SystemClock.elapsedRealtime();
        if (!paramBoolean)
        {
          this.zzLj = this.zzLk;
          this.zzqV.zza(this);
        }
      }
    }
  }

  public void zzA(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      if (this.zzLn != -1L)
      {
        this.zzJu = paramBoolean;
        this.zzqV.zza(this);
      }
    }
  }

  public Bundle toBundle()
  {
    synchronized (this.zzpV)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("seq_num", this.zzLg);
      localBundle.putString("slotid", this.zzLh);
      localBundle.putBoolean("ismediation", this.zzJu);
      localBundle.putLong("treq", this.zzLm);
      localBundle.putLong("tresponse", this.zzLn);
      localBundle.putLong("timp", this.zzLj);
      localBundle.putLong("tload", this.zzLk);
      localBundle.putLong("pcc", this.zzLl);
      localBundle.putLong("tfetch", this.zzLi);
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.zzLf.iterator();
      while (localIterator.hasNext())
      {
        zza localzza = (zza)localIterator.next();
        localArrayList.add(localzza.toBundle());
      }
      localBundle.putParcelableArrayList("tclick", localArrayList);
      return localBundle;
    }
  }

  @zzhb
  private static final class zza
  {
    private long zzLo = -1L;
    private long zzLp = -1L;

    public long zzgV()
    {
      return this.zzLp;
    }

    public void zzgW()
    {
      this.zzLp = SystemClock.elapsedRealtime();
    }

    public void zzgX()
    {
      this.zzLo = SystemClock.elapsedRealtime();
    }

    public Bundle toBundle()
    {
      Bundle localBundle = new Bundle();
      localBundle.putLong("topen", this.zzLo);
      localBundle.putLong("tclose", this.zzLp);
      return localBundle;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzig
 * JD-Core Version:    0.6.0
 */