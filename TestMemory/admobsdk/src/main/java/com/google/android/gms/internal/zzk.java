package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class zzk<T>
  implements Comparable<zzk<T>>
{
  private final zzs.zza zzD = zzs.zza.zzak ? new zzs.zza() : null;
  private final int zzE;
  private final String zzF;
  private final int zzG;
  private final zzm.zza zzH;
  private Integer zzI;
  private zzl zzJ;
  private boolean zzK = true;
  private boolean zzL = false;
  private boolean zzM = false;
  private long zzN = 0L;
  private zzo zzO;
  private zzb.zza zzP = null;

  public zzk(int paramInt, String paramString, zzm.zza paramzza)
  {
    this.zzE = paramInt;
    this.zzF = paramString;
    this.zzH = paramzza;
    zza(new zzd());
    this.zzG = zzb(paramString);
  }

  public int getMethod()
  {
    return this.zzE;
  }

  public int zzg()
  {
    return this.zzG;
  }

  private static int zzb(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      Uri localUri = Uri.parse(paramString);
      if (localUri != null)
      {
        String str = localUri.getHost();
        if (str != null)
          return str.hashCode();
      }
    }
    return 0;
  }

  public zzk<?> zza(zzo paramzzo)
  {
    this.zzO = paramzzo;
    return this;
  }

  public void zzc(String paramString)
  {
    if (zzs.zza.zzak)
      this.zzD.zza(paramString, Thread.currentThread().getId());
    else if (this.zzN == 0L)
      this.zzN = SystemClock.elapsedRealtime();
  }

  void zzd(String paramString)
  {
    if (this.zzJ != null)
      this.zzJ.zzf(this);
    long l;
    if (zzs.zza.zzak)
    {
      l = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper())
      {
        Handler localHandler = new Handler(Looper.getMainLooper());
        localHandler.post(new Runnable(paramString, l)
        {
          public void run()
          {
            zzk.zzd(zzk.this).zza(this.zzQ, this.zzR);
            zzk.zzd(zzk.this).zzd(toString());
          }
        });
        return;
      }
      this.zzD.zza(paramString, l);
      this.zzD.zzd(toString());
    }
    else
    {
      l = SystemClock.elapsedRealtime() - this.zzN;
      if (l >= 3000L)
        zzs.zzb("%d ms: %s", new Object[] { Long.valueOf(l), toString() });
    }
  }

  public zzk<?> zza(zzl paramzzl)
  {
    this.zzJ = paramzzl;
    return this;
  }

  public final zzk<?> zza(int paramInt)
  {
    this.zzI = Integer.valueOf(paramInt);
    return this;
  }

  public String getUrl()
  {
    return this.zzF;
  }

  public String zzh()
  {
    return getUrl();
  }

  public zzk<?> zza(zzb.zza paramzza)
  {
    this.zzP = paramzza;
    return this;
  }

  public zzb.zza zzi()
  {
    return this.zzP;
  }

  public boolean isCanceled()
  {
    return this.zzL;
  }

  public Map<String, String> getHeaders()
    throws zza
  {
    return Collections.emptyMap();
  }

  @Deprecated
  protected Map<String, String> zzj()
    throws zza
  {
    return zzn();
  }

  @Deprecated
  protected String zzk()
  {
    return zzo();
  }

  @Deprecated
  public String zzl()
  {
    return zzp();
  }

  @Deprecated
  public byte[] zzm()
    throws zza
  {
    Map localMap = zzj();
    if ((localMap != null) && (localMap.size() > 0))
      return zza(localMap, zzk());
    return null;
  }

  protected Map<String, String> zzn()
    throws zza
  {
    return null;
  }

  protected String zzo()
  {
    return "UTF-8";
  }

  public String zzp()
  {
    return "application/x-www-form-urlencoded; charset=" + zzo();
  }

  public byte[] zzq()
    throws zza
  {
    Map localMap = zzn();
    if ((localMap != null) && (localMap.size() > 0))
      return zza(localMap, zzo());
    return null;
  }

  private byte[] zza(Map<String, String> paramMap, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getKey(), paramString));
        localStringBuilder.append('=');
        localStringBuilder.append(URLEncoder.encode((String)localEntry.getValue(), paramString));
        localStringBuilder.append('&');
      }
      return localStringBuilder.toString().getBytes(paramString);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new RuntimeException("Encoding not supported: " + paramString, localUnsupportedEncodingException);
  }

  public final boolean zzr()
  {
    return this.zzK;
  }

  public zza zzs()
  {
    return zza.zzU;
  }

  public final int zzt()
  {
    return this.zzO.zzd();
  }

  public zzo zzu()
  {
    return this.zzO;
  }

  public void zzv()
  {
    this.zzM = true;
  }

  public boolean zzw()
  {
    return this.zzM;
  }

  protected abstract zzm<T> zza(zzi paramzzi);

  protected zzr zzb(zzr paramzzr)
  {
    return paramzzr;
  }

  protected abstract void zza(T paramT);

  public void zzc(zzr paramzzr)
  {
    if (this.zzH != null)
      this.zzH.zze(paramzzr);
  }

  public int zzc(zzk<T> paramzzk)
  {
    zza localzza1 = zzs();
    zza localzza2 = paramzzk.zzs();
    return localzza1 == localzza2 ? this.zzI.intValue() - paramzzk.zzI.intValue() : localzza2.ordinal() - localzza1.ordinal();
  }

  public String toString()
  {
    String str = "0x" + Integer.toHexString(zzg());
    return (this.zzL ? "[X] " : "[ ] ") + getUrl() + " " + str + " " + zzs() + " " + this.zzI;
  }

  public static enum zza
  {
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzk
 * JD-Core Version:    0.6.0
 */