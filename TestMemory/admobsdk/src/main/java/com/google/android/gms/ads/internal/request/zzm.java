package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzbm;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzdg;
import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzeg.zzb;
import com.google.android.gms.internal.zzeg.zzd;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzhe;
import com.google.android.gms.internal.zzhk;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzji.zza;
import com.google.android.gms.internal.zzji.zzc;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzm extends zzim
{
  static final long zzIw = TimeUnit.SECONDS.toMillis(10L);
  private static final Object zzqy = new Object();
  private static boolean zzIx = false;
  private static zzeg zzIy = null;
  private static zzdg zzIz = null;
  private static zzdk zzIA = null;
  private static zzdf zzIB = null;
  private final zza.zza zzHg;
  private final AdRequestInfoParcel.zza zzHh;
  private final Object zzGg = new Object();
  private final Context mContext;
  private zzeg.zzd zzIC;

  public zzm(Context paramContext, AdRequestInfoParcel.zza paramzza, zza.zza paramzza1)
  {
    super(true);
    this.zzHg = paramzza1;
    this.mContext = paramContext;
    this.zzHh = paramzza;
    synchronized (zzqy)
    {
      if (!zzIx)
      {
        zzIA = new zzdk();
        zzIz = new zzdg(paramContext.getApplicationContext(), paramzza.zzrl);
        zzIB = new zzc();
        zzIy = new zzeg(this.mContext.getApplicationContext(), this.zzHh.zzrl, (String)zzbt.zzvB.get(), new zzb(), new zza());
        zzIx = true;
      }
    }
  }

  protected static void zzc(zzed paramzzed)
  {
    paramzzed.zza("/loadAd", zzIA);
    paramzzed.zza("/fetchHttpRequest", zzIz);
    paramzzed.zza("/invalidRequest", zzIB);
  }

  protected static void zzd(zzed paramzzed)
  {
    paramzzed.zzb("/loadAd", zzIA);
    paramzzed.zzb("/fetchHttpRequest", zzIz);
    paramzzed.zzb("/invalidRequest", zzIB);
  }

  public void zzbr()
  {
    zzin.zzaI("SdkLessAdLoaderBackgroundTask started.");
    AdRequestInfoParcel localAdRequestInfoParcel = new AdRequestInfoParcel(this.zzHh, null, -1L);
    AdResponseParcel localAdResponseParcel = zze(localAdRequestInfoParcel);
    long l = zzr.zzbG().elapsedRealtime();
    zzif.zza localzza = new zzif.zza(localAdRequestInfoParcel, localAdResponseParcel, null, null, localAdResponseParcel.errorCode, l, localAdResponseParcel.zzHX, null);
    zza.zzMS.post(new Runnable(localzza)
    {
      public void run()
      {
        zzm.zza(zzm.this).zza(this.zzps);
        if (zzm.zzb(zzm.this) != null)
        {
          zzm.zzb(zzm.this).release();
          zzm.zza(zzm.this, null);
        }
      }
    });
  }

  private AdResponseParcel zze(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    String str = UUID.randomUUID().toString();
    JSONObject localJSONObject1 = zza(paramAdRequestInfoParcel, str);
    if (localJSONObject1 == null)
      return new AdResponseParcel(0);
    long l1 = zzr.zzbG().elapsedRealtime();
    Future localFuture = zzIA.zzR(str);
    zza.zzMS.post(new Runnable(localJSONObject1, str)
    {
      public void run()
      {
        zzm.zza(zzm.this, zzm.zzgy().zzer());
        zzm.zzb(zzm.this).zza(new zzji.zzc()
        {
          public void zzd(zzeh paramzzeh)
          {
            try
            {
              paramzzeh.zza("AFMA_getAdapterLessMediationAd", zzm.2.this.zzIE);
            }
            catch (Exception localException)
            {
              zzin.zzb("Error requesting an ad url", localException);
              zzm.zzgx().zzS(zzm.2.this.zzIF);
            }
          }
        }
        , new zzji.zza()
        {
          public void run()
          {
            zzm.zzgx().zzS(zzm.2.this.zzIF);
          }
        });
      }
    });
    long l2 = zzIw - (zzr.zzbG().elapsedRealtime() - l1);
    JSONObject localJSONObject2;
    try
    {
      localJSONObject2 = (JSONObject)localFuture.get(l2, TimeUnit.MILLISECONDS);
    }
    catch (InterruptedException localInterruptedException)
    {
      return new AdResponseParcel(-1);
    }
    catch (TimeoutException localTimeoutException)
    {
      return new AdResponseParcel(2);
    }
    catch (ExecutionException localExecutionException)
    {
      return new AdResponseParcel(0);
    }
    if (localJSONObject2 == null)
      return new AdResponseParcel(-1);
    AdResponseParcel localAdResponseParcel = zzhe.zza(this.mContext, paramAdRequestInfoParcel, localJSONObject2.toString());
    if ((localAdResponseParcel.errorCode != -3) && (TextUtils.isEmpty(localAdResponseParcel.body)))
      return new AdResponseParcel(3);
    return localAdResponseParcel;
  }

  private JSONObject zza(AdRequestInfoParcel paramAdRequestInfoParcel, String paramString)
  {
    Bundle localBundle = paramAdRequestInfoParcel.zzHt.extras.getBundle("sdk_less_server_data");
    String str = paramAdRequestInfoParcel.zzHt.extras.getString("sdk_less_network_id");
    if (localBundle == null)
      return null;
    JSONObject localJSONObject = zzhe.zza(this.mContext, paramAdRequestInfoParcel, zzr.zzbI().zzE(this.mContext), null, null, new zzbm((String)zzbt.zzvB.get()), null, null, new ArrayList(), null);
    if (localJSONObject == null)
      return null;
    AdvertisingIdClient.Info localInfo = null;
    try
    {
      localInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.mContext);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      zzin.zzd("Cannot get advertising id info", localIllegalStateException);
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("request_id", paramString);
    localHashMap.put("network_id", str);
    localHashMap.put("request_param", localJSONObject);
    localHashMap.put("data", localBundle);
    if (localInfo != null)
    {
      localHashMap.put("adid", localInfo.getId());
      localHashMap.put("lat", Integer.valueOf(localInfo.isLimitAdTrackingEnabled() ? 1 : 0));
    }
    try
    {
      return zzr.zzbC().zzG(localHashMap);
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public void onStop()
  {
    synchronized (this.zzGg)
    {
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          if (zzm.zzb(zzm.this) != null)
          {
            zzm.zzb(zzm.this).release();
            zzm.zza(zzm.this, null);
          }
        }
      });
    }
  }

  public static class zza
    implements zzeg.zzb<zzed>
  {
    public void zza(zzed paramzzed)
    {
      zzm.zzd(paramzzed);
    }
  }

  public static class zzb
    implements zzeg.zzb<zzed>
  {
    public void zza(zzed paramzzed)
    {
      zzm.zzc(paramzzed);
    }
  }

  public static class zzc
    implements zzdf
  {
    public void zza(zzjp paramzzjp, Map<String, String> paramMap)
    {
      String str1 = (String)paramMap.get("request_id");
      String str2 = (String)paramMap.get("errors");
      zzin.zzaK("Invalid request: " + str2);
      zzm.zzgx().zzS(str1);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzm
 * JD-Core Version:    0.6.0
 */