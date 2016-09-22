package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzj.zza;
import com.google.android.gms.ads.internal.request.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public final class zzhd extends zzj.zza
{
  private static final Object zzqy = new Object();
  private static zzhd zzIQ;
  private final Context mContext;
  private final zzhc zzIR;
  private final zzbm zzIS;
  private final zzeg zzIT;

  public static zzhd zza(Context paramContext, zzbm paramzzbm, zzhc paramzzhc)
  {
    synchronized (zzqy)
    {
      if (zzIQ == null)
        zzIQ = new zzhd(paramContext.getApplicationContext() != null ? paramContext.getApplicationContext() : paramContext, paramzzbm, paramzzhc);
      return zzIQ;
    }
  }

  private static AdResponseParcel zza(Context paramContext, zzeg paramzzeg, zzbm paramzzbm, zzhc paramzzhc, AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    zzin.zzaI("Starting ad request from service.");
    zzbt.initialize(paramContext);
    zzcb localzzcb = new zzcb(((Boolean)zzbt.zzwg.get()).booleanValue(), "load_ad", paramAdRequestInfoParcel.zzrp.zzuh);
    if ((paramAdRequestInfoParcel.versionCode > 10) && (paramAdRequestInfoParcel.zzHL != -1L))
    {
      localzzbz1 = localzzcb.zzb(paramAdRequestInfoParcel.zzHL);
      localzzcb.zza(localzzbz1, new String[] { "cts" });
    }
    zzbz localzzbz1 = localzzcb.zzdB();
    Bundle localBundle = null;
    if ((paramAdRequestInfoParcel.versionCode >= 4) && (paramAdRequestInfoParcel.zzHA != null))
      localBundle = paramAdRequestInfoParcel.zzHA;
    zzjg localzzjg = null;
    if ((((Boolean)zzbt.zzwp.get()).booleanValue()) && (paramzzhc.zzIP != null))
    {
      if ((localBundle == null) && (((Boolean)zzbt.zzwq.get()).booleanValue()))
      {
        zzin.v("contentInfo is not present, but we'll still launch the app index task");
        localBundle = new Bundle();
      }
      if (localBundle != null)
      {
        localObject1 = localBundle;
        localzzjg = zziq.zza(new Callable(paramzzhc, paramContext, paramAdRequestInfoParcel, (Bundle)localObject1)
        {
          public Void zzdt()
            throws Exception
          {
            this.zzIU.zzIP.zza(this.zzxh, this.zzIV.zzHu.packageName, this.zzIW);
            return null;
          }
        });
      }
    }
    paramzzhc.zzIK.zzex();
    Object localObject1 = zzr.zzbI().zzE(paramContext);
    if (((zzhj)localObject1).zzKc == -1)
    {
      zzin.zzaI("Device is offline.");
      return new AdResponseParcel(2);
    }
    String str1;
    if (paramAdRequestInfoParcel.versionCode >= 7)
      str1 = paramAdRequestInfoParcel.zzHI;
    else
      str1 = UUID.randomUUID().toString();
    zzhf localzzhf = new zzhf(str1, paramAdRequestInfoParcel.applicationInfo.packageName);
    if (paramAdRequestInfoParcel.zzHt.extras != null)
    {
      localObject2 = paramAdRequestInfoParcel.zzHt.extras.getString("_ad");
      if (localObject2 != null)
        return zzhe.zza(paramContext, paramAdRequestInfoParcel, (String)localObject2);
    }
    Object localObject2 = paramzzhc.zzIK.zzd(250L);
    String str2 = paramzzhc.zzIL.getToken(paramContext, paramAdRequestInfoParcel.zzrj, paramAdRequestInfoParcel.zzHu.packageName);
    List localList = paramzzhc.zzII.zza(paramAdRequestInfoParcel);
    String str3 = paramzzhc.zzIM.zzf(paramAdRequestInfoParcel);
    zzhn.zza localzza = paramzzhc.zzIN.zzF(paramContext);
    if (localzzjg != null)
      try
      {
        zzin.v("Waiting for app index fetching task.");
        localzzjg.get(((Long)zzbt.zzwr.get()).longValue(), TimeUnit.MILLISECONDS);
        zzin.v("App index fetching task completed.");
      }
      catch (InterruptedException localInterruptedException)
      {
        zzin.zzd("Failed to fetch app index signal", localInterruptedException);
      }
      catch (TimeoutException localTimeoutException)
      {
        zzin.zzaI("Timed out waiting for app index fetching task");
      }
    JSONObject localJSONObject = zzhe.zza(paramContext, paramAdRequestInfoParcel, (zzhj)localObject1, localzza, (Location)localObject2, paramzzbm, str2, str3, localList, localBundle);
    if (paramAdRequestInfoParcel.versionCode < 7)
      try
      {
        localJSONObject.put("request_id", str1);
      }
      catch (JSONException localJSONException)
      {
      }
    if (localJSONObject == null)
      return new AdResponseParcel(0);
    String str4 = localJSONObject.toString();
    localzzcb.zza(localzzbz1, new String[] { "arc" });
    zzbz localzzbz2 = localzzcb.zzdB();
    if (((Boolean)zzbt.zzvC.get()).booleanValue())
      zzir.zzMc.post(new Runnable(paramzzeg, localzzhf, localzzcb, localzzbz2, str4)
      {
        public void run()
        {
          zzeg.zzd localzzd = this.zzIX.zzer();
          this.zzIY.zzb(localzzd);
          this.zzpt.zza(this.zzIZ, new String[] { "rwc" });
          zzbz localzzbz = this.zzpt.zzdB();
          localzzd.zza(new zzji.zzc(localzzbz)
          {
            public void zzd(zzeh paramzzeh)
            {
              zzhd.2.this.zzpt.zza(this.zzJb, new String[] { "jsf" });
              zzhd.2.this.zzpt.zzdC();
              paramzzeh.zza("/invalidRequest", zzhd.2.this.zzIY.zzJk);
              paramzzeh.zza("/loadAdURL", zzhd.2.this.zzIY.zzJl);
              try
              {
                paramzzeh.zze("AFMA_buildAdURL", zzhd.2.this.zzJa);
              }
              catch (Exception localException)
              {
                zzin.zzb("Error requesting an ad url", localException);
              }
            }
          }
          , new zzji.zza()
          {
            public void run()
            {
            }
          });
        }
      });
    else
      zzir.zzMc.post(new Runnable(paramContext, paramAdRequestInfoParcel, localzzhf, localzzcb, localzzbz2, str4, paramzzbm)
      {
        public void run()
        {
          zzjp localzzjp = zzr.zzbD().zza(this.zzxh, new AdSizeParcel(), false, false, null, this.zzIV.zzrl);
          if (zzr.zzbF().zzhi())
            localzzjp.clearCache(true);
          localzzjp.getWebView().setWillNotDraw(true);
          this.zzIY.zzh(localzzjp);
          this.zzpt.zza(this.zzIZ, new String[] { "rwc" });
          zzbz localzzbz = this.zzpt.zzdB();
          zzjq.zza localzza = zzhd.zzb(this.zzJa, this.zzpt, localzzbz);
          zzjq localzzjq = localzzjp.zzhU();
          localzzjq.zza("/invalidRequest", this.zzIY.zzJk);
          localzzjq.zza("/loadAdURL", this.zzIY.zzJl);
          localzzjq.zza("/log", zzde.zzzf);
          localzzjq.zza(localzza);
          zzin.zzaI("Loading the JS library.");
          localzzjp.loadUrl(this.zzJd.zzdp());
        }
      });
    try
    {
      zzhi localzzhi;
      try
      {
        localzzhi = (zzhi)localzzhf.zzgC().get(10L, TimeUnit.SECONDS);
      }
      catch (Exception localException)
      {
        localAdResponseParcel1 = new AdResponseParcel(0);
        zzir.zzMc.post(new Runnable(paramzzhc, paramContext, localzzhf, paramAdRequestInfoParcel)
        {
          public void run()
          {
            this.zzIU.zzIJ.zza(this.zzxh, this.zzIY, this.zzIV.zzrl);
          }
        });
        return localAdResponseParcel1;
      }
      if (localzzhi == null)
      {
        localObject3 = new AdResponseParcel(0);
        return localObject3;
      }
      if (localzzhi.getErrorCode() != -2)
      {
        localObject3 = new AdResponseParcel(localzzhi.getErrorCode());
        return localObject3;
      }
      if (localzzcb.zzdE() != null)
        localzzcb.zza(localzzcb.zzdE(), new String[] { "rur" });
      Object localObject3 = null;
      if (localzzhi.zzgG())
        localObject3 = paramzzhc.zzIH.zzaz(paramAdRequestInfoParcel.zzHu.packageName);
      AdResponseParcel localAdResponseParcel1 = zza(paramAdRequestInfoParcel, paramContext, paramAdRequestInfoParcel.zzrl.afmaVersion, localzzhi.getUrl(), (String)localObject3, localzzhi.zzgH() ? str2 : null, localzzhi, localzzcb, paramzzhc);
      if (localAdResponseParcel1.zzIf == 1)
        paramzzhc.zzIL.clearToken(paramContext, paramAdRequestInfoParcel.zzHu.packageName);
      localzzcb.zza(localzzbz1, new String[] { "tts" });
      localAdResponseParcel1.zzIh = localzzcb.zzdD();
      AdResponseParcel localAdResponseParcel2 = localAdResponseParcel1;
      return localAdResponseParcel2;
    }
    finally
    {
      zzir.zzMc.post(new Runnable(paramzzhc, paramContext, localzzhf, paramAdRequestInfoParcel)
      {
        public void run()
        {
          this.zzIU.zzIJ.zza(this.zzxh, this.zzIY, this.zzIV.zzrl);
        }
      });
    }
    throw localObject4;
  }

  private static zzjq.zza zza(String paramString, zzcb paramzzcb, zzbz paramzzbz)
  {
    return new zzjq.zza(paramzzcb, paramzzbz, paramString)
    {
      public void zza(zzjp paramzzjp, boolean paramBoolean)
      {
        this.zzpt.zza(this.zzJb, new String[] { "jsf" });
        this.zzpt.zzdC();
        paramzzjp.zze("AFMA_buildAdURL", this.zzJa);
      }
    };
  }

  private static void zza(String paramString1, Map<String, List<String>> paramMap, String paramString2, int paramInt)
  {
    if (zzin.zzQ(2))
    {
      zzin.v("Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        Iterator localIterator1 = paramMap.keySet().iterator();
        while (localIterator1.hasNext())
        {
          String str1 = (String)localIterator1.next();
          zzin.v("    " + str1 + ":");
          Iterator localIterator2 = ((List)paramMap.get(str1)).iterator();
          while (localIterator2.hasNext())
          {
            String str2 = (String)localIterator2.next();
            zzin.v("      " + str2);
          }
        }
      }
      zzin.v("  Body:");
      if (paramString2 != null)
        for (int i = 0; i < Math.min(paramString2.length(), 100000); i += 1000)
          zzin.v(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
      else
        zzin.v("    null");
      zzin.v("  Response Code:\n    " + paramInt + "\n}");
    }
  }

  public static AdResponseParcel zza(AdRequestInfoParcel paramAdRequestInfoParcel, Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, zzhi paramzzhi, zzcb paramzzcb, zzhc paramzzhc)
  {
    zzbz localzzbz = paramzzcb != null ? paramzzcb.zzdB() : null;
    try
    {
      zzhg localzzhg = new zzhg(paramAdRequestInfoParcel);
      zzin.zzaI("AdRequestServiceImpl: Sending request: " + paramString2);
      URL localURL = new URL(paramString2);
      int j = 0;
      long l = zzr.zzbG().elapsedRealtime();
      while (true)
      {
        if (paramzzhc != null)
          paramzzhc.zzIO.zzgJ();
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
        try
        {
          zzr.zzbC().zza(paramContext, paramString1, false, localHttpURLConnection);
          if (!TextUtils.isEmpty(paramString3))
            localHttpURLConnection.addRequestProperty("x-afma-drt-cookie", paramString3);
          Object localObject1;
          if (!TextUtils.isEmpty(paramString4))
          {
            localObject1 = "Bearer " + paramString4;
            localHttpURLConnection.addRequestProperty("Authorization", (String)localObject1);
          }
          Object localObject2;
          if ((paramzzhi != null) && (!TextUtils.isEmpty(paramzzhi.zzgF())))
          {
            localHttpURLConnection.setDoOutput(true);
            localObject1 = paramzzhi.zzgF().getBytes();
            localHttpURLConnection.setFixedLengthStreamingMode(localObject1.length);
            localObject2 = null;
            try
            {
              localObject2 = new BufferedOutputStream(localHttpURLConnection.getOutputStream());
              ((BufferedOutputStream)localObject2).write(localObject1);
            }
            finally
            {
              zzna.zzb((Closeable)localObject2);
            }
          }
          int i = localHttpURLConnection.getResponseCode();
          Map localMap = localHttpURLConnection.getHeaderFields();
          if ((i >= 200) && (i < 300))
          {
            localObject1 = localURL.toString();
            localObject2 = null;
            String str;
            try
            {
              localObject2 = new InputStreamReader(localHttpURLConnection.getInputStream());
              str = zzr.zzbC().zza((InputStreamReader)localObject2);
            }
            finally
            {
              zzna.zzb((Closeable)localObject2);
            }
            zza((String)localObject1, localMap, str, i);
            localzzhg.zzb((String)localObject1, localMap, str);
            if (paramzzcb != null)
              paramzzcb.zza(localzzbz, new String[] { "ufe" });
            AdResponseParcel localAdResponseParcel = localzzhg.zzj(l);
            return localAdResponseParcel;
          }
          zza(localURL.toString(), localMap, null, i);
          if ((i >= 300) && (i < 400))
          {
            localObject1 = localHttpURLConnection.getHeaderField("Location");
            if (TextUtils.isEmpty((CharSequence)localObject1))
            {
              zzin.zzaK("No location header to follow redirect.");
              localObject2 = new AdResponseParcel(0);
              return localObject2;
            }
            localURL = new URL((String)localObject1);
            j++;
          }
          else
          {
            zzin.zzaK("Received error HTTP response code: " + i);
            localObject1 = new AdResponseParcel(0);
            return localObject1;
          }
          if (j > 5)
          {
            zzin.zzaK("Too many redirects.");
            localObject1 = new AdResponseParcel(0);
            return localObject1;
          }
          localzzhg.zzj(localMap);
        }
        finally
        {
          localHttpURLConnection.disconnect();
          if (paramzzhc != null)
            paramzzhc.zzIO.zzgK();
        }
      }
    }
    catch (IOException localIOException)
    {
      zzin.zzaK("Error while connecting to ad server: " + localIOException.getMessage());
    }
    return (AdResponseParcel)(AdResponseParcel)new AdResponseParcel(2);
  }

  zzhd(Context paramContext, zzbm paramzzbm, zzhc paramzzhc)
  {
    this.mContext = paramContext;
    this.zzIR = paramzzhc;
    this.zzIS = paramzzbm;
    this.zzIT = new zzeg(paramContext.getApplicationContext() != null ? paramContext.getApplicationContext() : paramContext, new VersionInfoParcel(8487000, 8487000, true), paramzzbm.zzdp(), new zzeg.zzb()
    {
      public void zza(zzed paramzzed)
      {
        paramzzed.zza("/log", zzde.zzzf);
      }
    }
    , new zzeg.zzc());
  }

  public AdResponseParcel zzd(AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    return zza(this.mContext, this.zzIT, this.zzIS, this.zzIR, paramAdRequestInfoParcel);
  }

  public void zza(AdRequestInfoParcel paramAdRequestInfoParcel, zzk paramzzk)
  {
    zzr.zzbF().zzb(this.mContext, paramAdRequestInfoParcel.zzrl);
    zziq.zza(new Runnable(paramAdRequestInfoParcel, paramzzk)
    {
      public void run()
      {
        AdResponseParcel localAdResponseParcel = null;
        try
        {
          localAdResponseParcel = zzhd.this.zzd(this.zzIV);
        }
        catch (Exception localException)
        {
          zzr.zzbF().zzb(localException, true);
          zzin.zzd("Could not fetch ad response due to an Exception.", localException);
        }
        if (localAdResponseParcel == null)
          localAdResponseParcel = new AdResponseParcel(0);
        try
        {
          this.zzJf.zzb(localAdResponseParcel);
        }
        catch (RemoteException localRemoteException)
        {
          zzin.zzd("Fail to forward ad response.", localRemoteException);
        }
      }
    });
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhd
 * JD-Core Version:    0.6.0
 */