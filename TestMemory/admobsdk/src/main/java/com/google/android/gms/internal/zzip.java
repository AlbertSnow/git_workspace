package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.concurrent.Future;

@zzhb
public final class zzip
{
  public static SharedPreferences zzw(Context paramContext)
  {
    return paramContext.getSharedPreferences("admob", 0);
  }

  public static Future zza(Context paramContext, boolean paramBoolean)
  {
    return new zza(paramContext, paramBoolean)
    {
      public void zzbr()
      {
        SharedPreferences localSharedPreferences = zzip.zzw(this.zzxh);
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putBoolean("use_https", this.zzLP);
        localEditor.apply();
      }
    }
    .zzhn();
  }

  public static Future zza(Context paramContext, zzb paramzzb)
  {
    return new zza(paramContext, paramzzb)
    {
      public void zzbr()
      {
        SharedPreferences localSharedPreferences = zzip.zzw(this.zzxh);
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("use_https", localSharedPreferences.getBoolean("use_https", true));
        if (this.zzLQ != null)
          this.zzLQ.zze(localBundle);
      }
    }
    .zzhn();
  }

  public static Future zza(Context paramContext, int paramInt)
  {
    return new zza(paramContext, paramInt)
    {
      public void zzbr()
      {
        SharedPreferences localSharedPreferences = zzip.zzw(this.zzxh);
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putInt("webview_cache_version", this.zzLR);
        localEditor.apply();
      }
    }
    .zzhn();
  }

  public static Future zzb(Context paramContext, zzb paramzzb)
  {
    return new zza(paramContext, paramzzb)
    {
      public void zzbr()
      {
        SharedPreferences localSharedPreferences = zzip.zzw(this.zzxh);
        Bundle localBundle = new Bundle();
        localBundle.putInt("webview_cache_version", localSharedPreferences.getInt("webview_cache_version", 0));
        if (this.zzLQ != null)
          this.zzLQ.zze(localBundle);
      }
    }
    .zzhn();
  }

  public static Future zzb(Context paramContext, boolean paramBoolean)
  {
    return new zza(paramContext, paramBoolean)
    {
      public void zzbr()
      {
        SharedPreferences localSharedPreferences = zzip.zzw(this.zzxh);
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putBoolean("content_url_opted_out", this.zzLS);
        localEditor.apply();
      }
    }
    .zzhn();
  }

  public static Future zzc(Context paramContext, zzb paramzzb)
  {
    return new zza(paramContext, paramzzb)
    {
      public void zzbr()
      {
        SharedPreferences localSharedPreferences = zzip.zzw(this.zzxh);
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("content_url_opted_out", localSharedPreferences.getBoolean("content_url_opted_out", true));
        if (this.zzLQ != null)
          this.zzLQ.zze(localBundle);
      }
    }
    .zzhn();
  }

  public static Future zzd(Context paramContext, String paramString)
  {
    return new zza(paramContext, paramString)
    {
      public void zzbr()
      {
        SharedPreferences localSharedPreferences = zzip.zzw(this.zzxh);
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putString("content_url_hashes", this.zzLT);
        localEditor.apply();
      }
    }
    .zzhn();
  }

  public static Future zzd(Context paramContext, zzb paramzzb)
  {
    return new zza(paramContext, paramzzb)
    {
      public void zzbr()
      {
        SharedPreferences localSharedPreferences = zzip.zzw(this.zzxh);
        Bundle localBundle = new Bundle();
        localBundle.putString("content_url_hashes", localSharedPreferences.getString("content_url_hashes", ""));
        if (this.zzLQ != null)
          this.zzLQ.zze(localBundle);
      }
    }
    .zzhn();
  }

  private static abstract class zza extends zzim
  {
    public void onStop()
    {
    }
  }

  public static abstract interface zzb
  {
    public abstract void zze(Bundle paramBundle);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzip
 * JD-Core Version:    0.6.0
 */