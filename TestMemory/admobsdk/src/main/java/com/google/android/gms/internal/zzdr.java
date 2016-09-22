package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@zzhb
public abstract class zzdr
  implements Releasable
{
  protected Context mContext;
  protected String zzzN;
  protected WeakReference<zzjp> zzzO;

  public zzdr(zzjp paramzzjp)
  {
    this.mContext = paramzzjp.getContext();
    this.zzzN = zzr.zzbC().zze(this.mContext, paramzzjp.zzhX().afmaVersion);
    this.zzzO = new WeakReference(paramzzjp);
  }

  public abstract boolean zzU(String paramString);

  public abstract void abort();

  public void release()
  {
  }

  protected void zza(String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    zza.zzMS.post(new Runnable(paramString1, paramString2, paramInt1, paramInt2, paramBoolean)
    {
      public void run()
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("event", "precacheProgress");
        localHashMap.put("src", this.zzzP);
        localHashMap.put("cachedSrc", this.zzzQ);
        localHashMap.put("bytesLoaded", Integer.toString(this.zzzR));
        localHashMap.put("totalBytes", Integer.toString(this.zzzS));
        localHashMap.put("cacheReady", this.zzzT ? "1" : "0");
        zzdr.zza(zzdr.this, "onPrecacheEvent", localHashMap);
      }
    });
  }

  protected void zza(String paramString1, String paramString2, int paramInt)
  {
    zza.zzMS.post(new Runnable(paramString1, paramString2, paramInt)
    {
      public void run()
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("event", "precacheComplete");
        localHashMap.put("src", this.zzzP);
        localHashMap.put("cachedSrc", this.zzzQ);
        localHashMap.put("totalBytes", Integer.toString(this.zzzS));
        zzdr.zza(zzdr.this, "onPrecacheEvent", localHashMap);
      }
    });
  }

  protected void zza(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    zza.zzMS.post(new Runnable(paramString1, paramString2, paramString3, paramString4)
    {
      public void run()
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("event", "precacheCanceled");
        localHashMap.put("src", this.zzzP);
        if (!TextUtils.isEmpty(this.zzzQ))
          localHashMap.put("cachedSrc", this.zzzQ);
        localHashMap.put("type", zzdr.zza(zzdr.this, this.zzzV));
        localHashMap.put("reason", this.zzzV);
        if (!TextUtils.isEmpty(this.zzzW))
          localHashMap.put("message", this.zzzW);
        zzdr.zza(zzdr.this, "onPrecacheEvent", localHashMap);
      }
    });
  }

  protected String zzV(String paramString)
  {
    return zzn.zzcS().zzaH(paramString);
  }

  private String zzW(String paramString)
  {
    String str1 = "internal";
    switch (paramString)
    {
    case "contentLengthMissing":
    case "error":
    case "inProgress":
    case "playerFailed":
      str1 = "internal";
      break;
    case "expireFailed":
    case "noCacheDir":
      str1 = "io";
      break;
    case "badUrl":
    case "downloadTimeout":
      str1 = "network";
      break;
    case "externalAbort":
    case "sizeExceeded":
      str1 = "policy";
    }
    return str1;
  }

  private void zza(String paramString, Map<String, String> paramMap)
  {
    zzjp localzzjp = (zzjp)this.zzzO.get();
    if (localzzjp != null)
      localzzjp.zza(paramString, paramMap);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdr
 * JD-Core Version:    0.6.0
 */