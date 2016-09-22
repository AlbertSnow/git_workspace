package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

@zzhb
public class zzee
{
  public Future<zzed> zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, zzan paramzzan)
  {
    zza localzza = new zza(null);
    zzir.zzMc.post(new Runnable(paramContext, paramVersionInfoParcel, localzza, paramzzan, paramString)
    {
      public void run()
      {
        zzee.zza(zzee.this, this.zzxh, this.zzAM, this.zzAN, this.zzAO).zzaa(this.zzAP);
      }
    });
    return localzza;
  }

  private zzed zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel, zza<zzed> paramzza, zzan paramzzan)
  {
    zzef localzzef = new zzef(paramContext, paramVersionInfoParcel, paramzzan);
    paramzza.zzAR = localzzef;
    localzzef.zza(new zzed.zza(paramzza)
    {
      public void zzeo()
      {
        this.zzAN.zzg(this.zzAN.zzAR);
      }
    });
    return localzzef;
  }

  private static class zza<JavascriptEngine> extends zzjd<JavascriptEngine>
  {
    JavascriptEngine zzAR;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzee
 * JD-Core Version:    0.6.0
 */