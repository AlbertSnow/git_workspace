package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzjg<Lcom.google.android.gms.ads.internal.formats.zza;>;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzgw
  implements Callable<zzif>
{
  private static final long zzGF = TimeUnit.SECONDS.toMillis(60L);
  private final Context mContext;
  private final zziw zzGG;
  private final zzp zzGH;
  private final zzan zzyt;
  private final zzee zzGI;
  private final Object zzpV = new Object();
  private final zzif.zza zzGd;
  private boolean zzGJ;
  private int zzGu;
  private List<String> zzGK;
  private JSONObject zzGL;

  public zzgw(Context paramContext, zzp paramzzp, zzee paramzzee, zziw paramzziw, zzan paramzzan, zzif.zza paramzza)
  {
    this.mContext = paramContext;
    this.zzGH = paramzzp;
    this.zzGG = paramzziw;
    this.zzGI = paramzzee;
    this.zzGd = paramzza;
    this.zzyt = paramzzan;
    this.zzGJ = false;
    this.zzGu = -2;
    this.zzGK = null;
  }

  public zzif zzgl()
  {
    try
    {
      zzed localzzed = zzgm();
      JSONObject localJSONObject = zzb(localzzed);
      zza localzza = zze(localJSONObject);
      zzh.zza localzza1 = zza(localzzed, localzza, localJSONObject);
      zza(localzza1, localzzed);
      zzif localzzif = zza(localzza1);
      return localzzif;
    }
    catch (CancellationException localCancellationException)
    {
    }
    catch (ExecutionException localExecutionException)
    {
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    catch (JSONException localJSONException)
    {
      zzin.zzd("Malformed native JSON response.", localJSONException);
    }
    catch (TimeoutException localTimeoutException)
    {
      zzin.zzd("Timeout when loading native ad.", localTimeoutException);
    }
    if (!this.zzGJ)
      zzF(0);
    return zza(null);
  }

  private zzed zzgm()
    throws CancellationException, ExecutionException, InterruptedException, TimeoutException
  {
    if (zzgn())
      return null;
    String str1 = (String)zzbt.zzwC.get();
    String str2 = this.zzGd.zzLe.zzEF.indexOf("https") == 0 ? "https:" : "http:";
    String str3 = str2 + str1;
    zzed localzzed = (zzed)this.zzGI.zza(this.mContext, this.zzGd.zzLd.zzrl, str3, this.zzyt).get(zzGF, TimeUnit.MILLISECONDS);
    localzzed.zza(this.zzGH, this.zzGH, this.zzGH, this.zzGH, false, null, null, null, null);
    return localzzed;
  }

  private JSONObject zzb(zzed paramzzed)
    throws TimeoutException, JSONException
  {
    if (zzgn())
      return null;
    zzjd localzzjd = new zzjd();
    zzb localzzb = new zzb();
    1 local1 = new zzdf(paramzzed, localzzb, localzzjd)
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        this.zzGM.zzb("/nativeAdPreProcess", this.zzGN.zzHb);
        try
        {
          String str = (String)paramMap.get("success");
          if (!TextUtils.isEmpty(str))
          {
            this.zzGO.zzg(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
            return;
          }
        }
        catch (JSONException localJSONException)
        {
          zzin.zzb("Malformed native JSON response.", localJSONException);
        }
        zzgw.this.zzF(0);
        zzx.zza(zzgw.this.zzgn(), "Unable to set the ad state error!");
        this.zzGO.zzg(null);
      }
    };
    localzzb.zzHb = local1;
    paramzzed.zza("/nativeAdPreProcess", local1);
    JSONObject localJSONObject = new JSONObject(this.zzGd.zzLe.body);
    paramzzed.zza("google.afma.nativeAds.preProcessJsonGmsg", localJSONObject);
    return (JSONObject)localzzjd.get(zzGF, TimeUnit.MILLISECONDS);
  }

  protected zza zze(JSONObject paramJSONObject)
    throws JSONException, TimeoutException
  {
    if (zzgn())
      return null;
    String str1 = paramJSONObject.getString("template_id");
    boolean bool1 = this.zzGd.zzLd.zzrD != null ? this.zzGd.zzLd.zzrD.zzyA : false;
    boolean bool2 = this.zzGd.zzLd.zzrD != null ? this.zzGd.zzLd.zzrD.zzyC : false;
    if ("2".equals(str1))
      return new zzgx(bool1, bool2);
    if ("1".equals(str1))
      return new zzgy(bool1, bool2);
    if ("3".equals(str1))
    {
      String str2 = paramJSONObject.getString("custom_template_id");
      zzjd localzzjd = new zzjd();
      zzir.zzMc.post(new Runnable(localzzjd, str2)
      {
        public void run()
        {
          this.zzGQ.zzg(zzgw.zza(zzgw.this).zzbv().get(this.zzGR));
        }
      });
      if (localzzjd.get(zzGF, TimeUnit.MILLISECONDS) != null)
        return new zzgz(bool1);
      zzin.e("No handler for custom template: " + paramJSONObject.getString("custom_template_id"));
    }
    else
    {
      zzF(0);
    }
    return null;
  }

  private void zza(zzh.zza paramzza, zzed paramzzed)
  {
    if (!(paramzza instanceof zzf))
      return;
    zzf localzzf = (zzf)paramzza;
    zzb localzzb = new zzb();
    3 local3 = new zzdf(localzzf)
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        String str = (String)paramMap.get("asset");
        zzgw.zza(zzgw.this, this.zzGS, str);
      }
    };
    localzzb.zzHb = local3;
    paramzzed.zza("/nativeAdCustomClick", local3);
  }

  private void zzb(zzcp paramzzcp, String paramString)
  {
    try
    {
      zzct localzzct = this.zzGH.zzs(paramzzcp.getCustomTemplateId());
      if (localzzct != null)
        localzzct.zza(paramzzcp, paramString);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Failed to call onCustomClick for asset " + paramString + ".", localRemoteException);
    }
  }

  private zzh.zza zza(zzed paramzzed, zza paramzza, JSONObject paramJSONObject)
    throws ExecutionException, InterruptedException, JSONException
  {
    if (zzgn())
      return null;
    JSONObject localJSONObject = paramJSONObject.getJSONObject("tracking_urls_and_actions");
    String[] arrayOfString = zzc(localJSONObject, "impression_tracking_urls");
    this.zzGK = (arrayOfString == null ? null : Arrays.asList(arrayOfString));
    this.zzGL = localJSONObject.optJSONObject("active_view");
    zzh.zza localzza = paramzza.zza(this, paramJSONObject);
    if (localzza == null)
    {
      zzin.e("Failed to retrieve ad assets.");
      return null;
    }
    localzza.zzb(new zzi(this.mContext, this.zzGH, paramzzed, this.zzyt, paramJSONObject, localzza, this.zzGd.zzLd.zzrl));
    return localzza;
  }

  private zzif zza(zzh.zza paramzza)
  {
    int i;
    synchronized (this.zzpV)
    {
      i = this.zzGu;
      if ((paramzza == null) && (this.zzGu == -2))
        i = 0;
    }
    if (i != -2)
      paramzza = null;
    return new zzif(this.zzGd.zzLd.zzHt, null, this.zzGd.zzLe.zzBQ, i, this.zzGd.zzLe.zzBR, this.zzGK, this.zzGd.zzLe.orientation, this.zzGd.zzLe.zzBU, this.zzGd.zzLd.zzHw, false, null, null, null, null, null, 0L, this.zzGd.zzrp, this.zzGd.zzLe.zzHS, this.zzGd.zzKY, this.zzGd.zzKZ, this.zzGd.zzLe.zzHY, this.zzGL, paramzza, null, null, null, this.zzGd.zzLe.zzIm);
  }

  public zzjg<zza> zzf(JSONObject paramJSONObject)
    throws JSONException
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject("attribution");
    if (localJSONObject == null)
      return new zzje(null);
    String str = localJSONObject.optString("text");
    int i = localJSONObject.optInt("text_size", -1);
    Integer localInteger1 = zzb(localJSONObject, "text_color");
    Integer localInteger2 = zzb(localJSONObject, "bg_color");
    int j = localJSONObject.optInt("animation_ms", 1000);
    int k = localJSONObject.optInt("presentation_ms", 4000);
    Object localObject = new ArrayList();
    if (localJSONObject.optJSONArray("images") != null)
      localObject = zza(localJSONObject, "images", false, false, true);
    else
      ((List)localObject).add(zza(localJSONObject, "image", false, false));
    zzjg localzzjg = zzjf.zzl((List)localObject);
    return (zzjg<zza>)zzjf.zza(localzzjg, new zzjf.zza(str, localInteger2, localInteger1, i, k, j)
    {
      public zza zzh(List<zzc> paramList)
      {
        try
        {
          return (paramList == null) || (paramList.isEmpty()) ? null : new zza(this.zzGT, zzgw.zzg(paramList), this.zzGU, this.zzGV, this.zzGW > 0 ? Integer.valueOf(this.zzGW) : null, this.zzGX + this.zzGY);
        }
        catch (RemoteException localRemoteException)
        {
          zzin.zzb("Could not get attribution icon", localRemoteException);
        }
        return null;
      }
    });
  }

  private Integer zzb(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);
      int i = localJSONObject.getInt("r");
      int j = localJSONObject.getInt("g");
      int k = localJSONObject.getInt("b");
      return Integer.valueOf(Color.rgb(i, j, k));
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public Future<zzc> zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
    throws JSONException
  {
    JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString);
    boolean bool = localJSONObject.optBoolean("require", true);
    localJSONObject = localJSONObject == null ? new JSONObject() : localJSONObject;
    return zza(localJSONObject, bool, paramBoolean);
  }

  public zzjg<zzc> zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws JSONException
  {
    JSONObject localJSONObject = paramBoolean1 ? paramJSONObject.getJSONObject(paramString) : paramJSONObject.optJSONObject(paramString);
    localJSONObject = localJSONObject == null ? new JSONObject() : localJSONObject;
    return zza(localJSONObject, paramBoolean1, paramBoolean2);
  }

  public List<zzjg<zzc>> zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    throws JSONException
  {
    JSONArray localJSONArray = paramBoolean1 ? paramJSONObject.getJSONArray(paramString) : paramJSONObject.optJSONArray(paramString);
    ArrayList localArrayList = new ArrayList();
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
    {
      zza(0, paramBoolean1);
      return localArrayList;
    }
    int i = paramBoolean3 ? localJSONArray.length() : 1;
    for (int j = 0; j < i; j++)
    {
      JSONObject localJSONObject = localJSONArray.getJSONObject(j);
      localJSONObject = localJSONObject == null ? new JSONObject() : localJSONObject;
      localArrayList.add(zza(localJSONObject, paramBoolean1, paramBoolean2));
    }
    return localArrayList;
  }

  private zzjg<zzc> zza(JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
    throws JSONException
  {
    String str = paramBoolean1 ? paramJSONObject.getString("url") : paramJSONObject.optString("url");
    double d = paramJSONObject.optDouble("scale", 1.0D);
    if (TextUtils.isEmpty(str))
    {
      zza(0, paramBoolean1);
      return new zzje(null);
    }
    if (paramBoolean2)
      return new zzje(new zzc(null, Uri.parse(str), d));
    return this.zzGG.zza(str, new zziw.zza(paramBoolean1, d, str)
    {
      public zzc zzgo()
      {
        zzgw.this.zza(2, this.zzGZ);
        return null;
      }

      public zzc zzg(InputStream paramInputStream)
      {
        byte[] arrayOfByte = null;
        try
        {
          arrayOfByte = zzna.zzk(paramInputStream);
        }
        catch (IOException localIOException)
        {
        }
        if (arrayOfByte == null)
        {
          zzgw.this.zza(2, this.zzGZ);
          return null;
        }
        Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
        if (localBitmap == null)
        {
          zzgw.this.zza(2, this.zzGZ);
          return null;
        }
        localBitmap.setDensity((int)(160.0D * this.zzHa));
        return new zzc(new BitmapDrawable(Resources.getSystem(), localBitmap), Uri.parse(this.zzDr), this.zzHa);
      }
    });
  }

  public boolean zzgn()
  {
    synchronized (this.zzpV)
    {
      return this.zzGJ;
    }
  }

  public void zzF(int paramInt)
  {
    synchronized (this.zzpV)
    {
      this.zzGJ = true;
      this.zzGu = paramInt;
    }
  }

  public void zza(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
      zzF(paramInt);
  }

  private String[] zzc(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    if (localJSONArray == null)
      return null;
    String[] arrayOfString = new String[localJSONArray.length()];
    for (int i = 0; i < localJSONArray.length(); i++)
      arrayOfString[i] = localJSONArray.getString(i);
    return arrayOfString;
  }

  private static List<Drawable> zzf(List<zzc> paramList)
    throws RemoteException
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zzc localzzc = (zzc)localIterator.next();
      localArrayList.add((Drawable)zze.zzp(localzzc.zzdJ()));
    }
    return localArrayList;
  }

  class zzb
  {
    public zzdf zzHb;

    zzb()
    {
    }
  }

  public static abstract interface zza<T extends zzh.zza>
  {
    public abstract T zza(zzgw paramzzgw, JSONObject paramJSONObject)
      throws JSONException, InterruptedException, ExecutionException;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgw
 * JD-Core Version:    0.6.0
 */