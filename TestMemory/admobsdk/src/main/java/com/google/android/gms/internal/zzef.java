package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zze;
import com.google.android.gms.ads.internal.zzr;
import org.json.JSONObject;

@zzhb
public class zzef
  implements zzed
{
  private final zzjp zzpD;

  public zzef(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zzan paramzzan)
  {
    this.zzpD = zzr.zzbD().zza(paramContext, new AdSizeParcel(), false, false, paramzzan, paramVersionInfoParcel);
    this.zzpD.getWebView().setWillNotDraw(true);
  }

  private void runOnUiThread(Runnable runnable)
  {
    if (zzn.zzcS().zzhJ())
      runnable.run();
    else
      zzir.zzMc.post(runnable);
  }

  public void zza(String paramString, JSONObject paramJSONObject)
  {
    runOnUiThread(new Runnable(paramString, paramJSONObject)
    {
      public void run()
      {
        zzef.zza(zzef.this).zza(this.zzAS, this.zzAT);
      }
    });
  }

  public void zze(String paramString1, String paramString2)
  {
    runOnUiThread(new Runnable(paramString1, paramString2)
    {
      public void run()
      {
        zzef.zza(zzef.this).zze(this.zzAS, this.zzAV);
      }
    });
  }

  public void zzZ(String paramString)
  {
    String str = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] { paramString });
    runOnUiThread(new Runnable(str)
    {
      public void run()
      {
        zzef.zza(zzef.this).loadData(this.zzAW, "text/html", "UTF-8");
      }
    });
  }

  public void zzab(String paramString)
  {
    runOnUiThread(new Runnable(paramString)
    {
      public void run()
      {
        zzef.zza(zzef.this).loadData(this.zzAW, "text/html", "UTF-8");
      }
    });
  }

  public void zzaa(String paramString)
  {
    runOnUiThread(new Runnable(paramString)
    {
      public void run()
      {
        zzef.zza(zzef.this).loadUrl(this.zzAP);
      }
    });
  }

  public void zza(String paramString, zzdf paramzzdf)
  {
    this.zzpD.zzhU().zza(paramString, paramzzdf);
  }

  public void zzb(String paramString, zzdf paramzzdf)
  {
    this.zzpD.zzhU().zzb(paramString, paramzzdf);
  }

  public void zza(zzed.zza paramzza)
  {
    this.zzpD.zzhU().zza(new zzjq.zza(paramzza)
    {
      public void zza(zzjp paramzzjp, boolean paramBoolean)
      {
        this.zzAX.zzeo();
      }
    });
  }

  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    this.zzpD.zzb(paramString, paramJSONObject);
  }

  public void zza(com.google.android.gms.ads.internal.client.zza paramzza, zzg paramzzg, zzdb paramzzdb, zzp paramzzp, boolean paramBoolean, zzdh paramzzdh, zzdj paramzzdj, zze paramzze, zzft paramzzft)
  {
    this.zzpD.zzhU().zzb(paramzza, paramzzg, paramzzdb, paramzzp, paramBoolean, paramzzdh, paramzzdj, new zze(false), paramzzft);
  }

  public zzei zzen()
  {
    return new zzej(this);
  }

  public void destroy()
  {
    this.zzpD.destroy();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzef
 * JD-Core Version:    0.6.0
 */