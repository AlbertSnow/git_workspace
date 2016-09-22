package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzr;

@zzhb
public abstract class zzbp<T>
{
  private final int zzvr;
  private final String zzvs;
  private final T zzvt;

  private zzbp(int paramInt, String paramString, T paramT)
  {
    this.zzvr = paramInt;
    this.zzvs = paramString;
    this.zzvt = paramT;
    zzr.zzbK().zza(this);
  }

  public String getKey()
  {
    return this.zzvs;
  }

  public T zzdq()
  {
    return this.zzvt;
  }

  public T get()
  {
    return zzr.zzbL().zzd(this);
  }

  public static zzbp<Boolean> zza(int paramInt, String paramString, Boolean paramBoolean)
  {
    return new zzbp(paramInt, paramString, paramBoolean)
    {
      public Boolean zzb(SharedPreferences paramSharedPreferences)
      {
        return Boolean.valueOf(paramSharedPreferences.getBoolean(getKey(), ((Boolean)zzdq()).booleanValue()));
      }
    };
  }

  public static zzbp<Integer> zza(int paramInt1, String paramString, int paramInt2)
  {
    return new zzbp(paramInt1, paramString, Integer.valueOf(paramInt2))
    {
      public Integer zzc(SharedPreferences paramSharedPreferences)
      {
        return Integer.valueOf(paramSharedPreferences.getInt(getKey(), ((Integer)zzdq()).intValue()));
      }
    };
  }

  public static zzbp<Long> zza(int paramInt, String paramString, long paramLong)
  {
    return new zzbp(paramInt, paramString, Long.valueOf(paramLong))
    {
      public Long zzd(SharedPreferences paramSharedPreferences)
      {
        return Long.valueOf(paramSharedPreferences.getLong(getKey(), ((Long)zzdq()).longValue()));
      }
    };
  }

  public static zzbp<String> zza(int paramInt, String paramString1, String paramString2)
  {
    return new zzbp(paramInt, paramString1, paramString2)
    {
      public String zze(SharedPreferences paramSharedPreferences)
      {
        return paramSharedPreferences.getString(getKey(), (String)zzdq());
      }
    };
  }

  public static zzbp<String> zza(int paramInt, String paramString)
  {
    zzbp localzzbp = zza(paramInt, paramString, (String)null);
    zzr.zzbK().zzb(localzzbp);
    return localzzbp;
  }

  public static zzbp<String> zzb(int paramInt, String paramString)
  {
    zzbp localzzbp = zza(paramInt, paramString, (String)null);
    zzr.zzbK().zzc(localzzbp);
    return localzzbp;
  }

  protected abstract T zza(SharedPreferences paramSharedPreferences);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzbp
 * JD-Core Version:    0.6.0
 */