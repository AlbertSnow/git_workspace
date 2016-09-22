package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzch.zza;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzen;
import com.google.android.gms.internal.zzes;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjq.zza;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzm
{
  public static View zzf(zzif paramzzif)
  {
    if (paramzzif == null)
    {
      zzin.e("AdState is null");
      return null;
    }
    if (zzg(paramzzif))
      return paramzzif.zzED.getView();
    try
    {
      com.google.android.gms.dynamic.zzd localzzd = paramzzif.zzCq.getView();
      if (localzzd == null)
      {
        zzin.zzaK("View in mediation adapter is null.");
        return null;
      }
      return (View)com.google.android.gms.dynamic.zze.zzp(localzzd);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not get View from mediation adapter.", localRemoteException);
    }
    return null;
  }

  public static void zza(zzif paramzzif, zzf.zza paramzza)
  {
    if (zzg(paramzzif))
    {
      zzjp localzzjp = paramzzif.zzED;
      View localView = localzzjp.getView();
      if (localView == null)
      {
        zzin.zzaK("AdWebView is null");
        return;
      }
      try
      {
        List localList = paramzzif.zzCp.zzBM;
        if ((localList == null) || (localList.isEmpty()))
        {
          zzin.zzaK("No template ids present in mediation response");
          return;
        }
        zzfb localzzfb = paramzzif.zzCq.zzeF();
        zzfc localzzfc = paramzzif.zzCq.zzeG();
        if ((localList.contains("2")) && (localzzfb != null))
        {
          localzzfb.zzd(com.google.android.gms.dynamic.zze.zzC(localView));
          if (!localzzfb.getOverrideImpressionRecording())
            localzzfb.recordImpression();
          localzzjp.zzhU().zza("/nativeExpressViewClicked", zza(localzzfb, null, paramzza));
        }
        else if ((localList.contains("1")) && (localzzfc != null))
        {
          localzzfc.zzd(com.google.android.gms.dynamic.zze.zzC(localView));
          if (!localzzfc.getOverrideImpressionRecording())
            localzzfc.recordImpression();
          localzzjp.zzhU().zza("/nativeExpressViewClicked", zza(null, localzzfc, paramzza));
        }
        else
        {
          zzin.zzaK("No matching template id and mapper");
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Error occurred while recording impression and registering for clicks", localRemoteException);
        return;
      }
    }
  }

  public static boolean zza(zzjp paramzzjp, zzes paramzzes, CountDownLatch paramCountDownLatch)
  {
    boolean bool = false;
    try
    {
      bool = zzb(paramzzjp, paramzzes, paramCountDownLatch);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Unable to invoke load assets", localRemoteException);
    }
    catch (RuntimeException localRuntimeException)
    {
      paramCountDownLatch.countDown();
      throw localRuntimeException;
    }
    if (!bool)
      paramCountDownLatch.countDown();
    return bool;
  }

  private static boolean zzb(zzjp paramzzjp, zzes paramzzes, CountDownLatch paramCountDownLatch)
    throws RemoteException
  {
    View localView = paramzzjp.getView();
    if (localView == null)
    {
      zzin.zzaK("AdWebView is null");
      return false;
    }
    localView.setVisibility(4);
    List localList = paramzzes.zzCp.zzBM;
    if ((localList == null) || (localList.isEmpty()))
    {
      zzin.zzaK("No template ids present in mediation response");
      return false;
    }
    zza(paramzzjp, paramCountDownLatch);
    zzfb localzzfb = paramzzes.zzCq.zzeF();
    zzfc localzzfc = paramzzes.zzCq.zzeG();
    if ((localList.contains("2")) && (localzzfb != null))
    {
      localObject = zza(localzzfb);
      zza(paramzzjp, (com.google.android.gms.ads.internal.formats.zzd)localObject, paramzzes.zzCp.zzBL);
    }
    else if ((localList.contains("1")) && (localzzfc != null))
    {
      localObject = zza(localzzfc);
      zza(paramzzjp, (com.google.android.gms.ads.internal.formats.zze)localObject, paramzzes.zzCp.zzBL);
    }
    else
    {
      zzin.zzaK("No matching template id and mapper");
      return false;
    }
    Object localObject = paramzzes.zzCp.zzBJ;
    String str = paramzzes.zzCp.zzBK;
    if (str != null)
      paramzzjp.loadDataWithBaseURL(str, (String)localObject, "text/html", "UTF-8", null);
    else
      paramzzjp.loadData((String)localObject, "text/html", "UTF-8");
    return true;
  }

  public static boolean zzg(zzif paramzzif)
  {
    return (paramzzif != null) && (paramzzif.zzHT) && (paramzzif.zzCp != null) && (paramzzif.zzCp.zzBJ != null);
  }

  private static com.google.android.gms.ads.internal.formats.zzd zza(zzfb paramzzfb)
    throws RemoteException
  {
    return new com.google.android.gms.ads.internal.formats.zzd(paramzzfb.getHeadline(), paramzzfb.getImages(), paramzzfb.getBody(), paramzzfb.zzdK(), paramzzfb.getCallToAction(), paramzzfb.getStarRating(), paramzzfb.getStore(), paramzzfb.getPrice(), null, paramzzfb.getExtras());
  }

  private static com.google.android.gms.ads.internal.formats.zze zza(zzfc paramzzfc)
    throws RemoteException
  {
    return new com.google.android.gms.ads.internal.formats.zze(paramzzfc.getHeadline(), paramzzfc.getImages(), paramzzfc.getBody(), paramzzfc.zzdO(), paramzzfc.getCallToAction(), paramzzfc.getAdvertiser(), null, paramzzfc.getExtras());
  }

  private static void zza(zzjp paramzzjp, com.google.android.gms.ads.internal.formats.zzd paramzzd, String paramString)
  {
    paramzzjp.zzhU().zza(new zzjq.zza(paramzzd, paramString, paramzzjp)
    {
      public void zza(zzjp paramzzjp, boolean paramBoolean)
      {
        try
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("headline", this.zzqq.getHeadline());
          localJSONObject.put("body", this.zzqq.getBody());
          localJSONObject.put("call_to_action", this.zzqq.getCallToAction());
          localJSONObject.put("price", this.zzqq.getPrice());
          localJSONObject.put("star_rating", String.valueOf(this.zzqq.getStarRating()));
          localJSONObject.put("store", this.zzqq.getStore());
          localJSONObject.put("icon", zzm.zza(this.zzqq.zzdK()));
          JSONArray localJSONArray = new JSONArray();
          List localList = this.zzqq.getImages();
          if (localList != null)
          {
            localObject1 = localList.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              Object localObject2 = ((Iterator)localObject1).next();
              zzch localzzch = zzm.zzd(localObject2);
              localJSONArray.put(zzm.zza(localzzch));
            }
          }
          localJSONObject.put("images", localJSONArray);
          localJSONObject.put("extras", zzm.zzb(this.zzqq.getExtras(), this.zzqr));
          Object localObject1 = new JSONObject();
          ((JSONObject)localObject1).put("assets", localJSONObject);
          ((JSONObject)localObject1).put("template_id", "2");
          this.zzqs.zza("google.afma.nativeExpressAds.loadAssets", (JSONObject)localObject1);
        }
        catch (JSONException localJSONException)
        {
          zzin.zzd("Exception occurred when loading assets", localJSONException);
        }
      }
    });
  }

  private static void zza(zzjp paramzzjp, com.google.android.gms.ads.internal.formats.zze paramzze, String paramString)
  {
    paramzzjp.zzhU().zza(new zzjq.zza(paramzze, paramString, paramzzjp)
    {
      public void zza(zzjp paramzzjp, boolean paramBoolean)
      {
        try
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("headline", this.zzqt.getHeadline());
          localJSONObject.put("body", this.zzqt.getBody());
          localJSONObject.put("call_to_action", this.zzqt.getCallToAction());
          localJSONObject.put("advertiser", this.zzqt.getAdvertiser());
          localJSONObject.put("logo", zzm.zza(this.zzqt.zzdO()));
          JSONArray localJSONArray = new JSONArray();
          List localList = this.zzqt.getImages();
          if (localList != null)
          {
            localObject1 = localList.iterator();
            while (((Iterator)localObject1).hasNext())
            {
              Object localObject2 = ((Iterator)localObject1).next();
              zzch localzzch = zzm.zzd(localObject2);
              localJSONArray.put(zzm.zza(localzzch));
            }
          }
          localJSONObject.put("images", localJSONArray);
          localJSONObject.put("extras", zzm.zzb(this.zzqt.getExtras(), this.zzqr));
          Object localObject1 = new JSONObject();
          ((JSONObject)localObject1).put("assets", localJSONObject);
          ((JSONObject)localObject1).put("template_id", "1");
          this.zzqs.zza("google.afma.nativeExpressAds.loadAssets", (JSONObject)localObject1);
        }
        catch (JSONException localJSONException)
        {
          zzin.zzd("Exception occurred when loading assets", localJSONException);
        }
      }
    });
  }

  private static void zza(zzjp paramzzjp, CountDownLatch paramCountDownLatch)
  {
    paramzzjp.zzhU().zza("/nativeExpressAssetsLoaded", zza(paramCountDownLatch));
    paramzzjp.zzhU().zza("/nativeExpressAssetsLoadingFailed", zzb(paramCountDownLatch));
  }

  static zzdf zza(CountDownLatch paramCountDownLatch)
  {
    return new zzdf(paramCountDownLatch)
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        this.zzqu.countDown();
        View localView = paramzzjp.getView();
        if (localView == null)
          return;
        localView.setVisibility(0);
      }
    };
  }

  static zzdf zzb(CountDownLatch paramCountDownLatch)
  {
    return new zzdf(paramCountDownLatch)
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        zzin.zzaK("Adapter returned an ad, but assets substitution failed");
        this.zzqu.countDown();
        paramzzjp.destroy();
      }
    };
  }

  static zzdf zza(zzfb paramzzfb, zzfc paramzzfc, zzf.zza paramzza)
  {
    return new zzdf(paramzzfb, paramzza, paramzzfc)
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        View localView = paramzzjp.getView();
        if (localView == null)
          return;
        try
        {
          if (this.zzqv != null)
          {
            if (!this.zzqv.getOverrideClickHandling())
            {
              this.zzqv.zzc(com.google.android.gms.dynamic.zze.zzC(localView));
              this.zzqw.onClick();
            }
            else
            {
              zzm.zzb(paramzzjp);
            }
          }
          else if (this.zzqx != null)
            if (!this.zzqx.getOverrideClickHandling())
            {
              this.zzqx.zzc(com.google.android.gms.dynamic.zze.zzC(localView));
              this.zzqw.onClick();
            }
            else
            {
              zzm.zzb(paramzzjp);
            }
        }
        catch (RemoteException localRemoteException)
        {
          zzin.zzd("Unable to call handleClick on mapper", localRemoteException);
        }
      }
    };
  }

  private static void zza(zzjp paramzzjp)
  {
    View.OnClickListener localOnClickListener = paramzzjp.zzif();
    if (localOnClickListener != null)
      localOnClickListener.onClick(paramzzjp.getView());
  }

  private static JSONObject zza(Bundle paramBundle, String paramString)
    throws JSONException
  {
    JSONObject localJSONObject1 = new JSONObject();
    if ((paramBundle == null) || (TextUtils.isEmpty(paramString)))
      return localJSONObject1;
    JSONObject localJSONObject2 = new JSONObject(paramString);
    Iterator localIterator = localJSONObject2.keys();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (!paramBundle.containsKey(str1))
        continue;
      String str2 = localJSONObject2.getString(str1);
      Object localObject;
      if ("image".equals(str2))
      {
        localObject = paramBundle.get(str1);
        if ((localObject instanceof Bitmap))
        {
          String str3 = zza((Bitmap)localObject);
          localJSONObject1.put(str1, str3);
        }
        else
        {
          zzin.zzaK("Invalid type. An image type extra should return a bitmap");
        }
      }
      else
      {
        localObject = paramBundle.get(str1);
        if ((localObject instanceof Bitmap))
          zzin.zzaK("Invalid asset type. Bitmap should be returned only for image type");
        else
          localJSONObject1.put(str1, String.valueOf(paramBundle.get(str1)));
      }
    }
    return localJSONObject1;
  }

  static String zza(zzch paramzzch)
  {
    if (paramzzch == null)
    {
      zzin.zzaK("Image is null. Returning empty string");
      return "";
    }
    Uri localUri = null;
    try
    {
      localUri = paramzzch.getUri();
      if (localUri != null)
        return localUri.toString();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Unable to get image uri. Trying data uri next");
    }
    return zzb(paramzzch);
  }

  private static String zzb(zzch paramzzch)
  {
    Drawable localDrawable = null;
    try
    {
      com.google.android.gms.dynamic.zzd localzzd = paramzzch.zzdJ();
      if (localzzd == null)
      {
        zzin.zzaK("Drawable is null. Returning empty string");
        return "";
      }
      localDrawable = (Drawable)com.google.android.gms.dynamic.zze.zzp(localzzd);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Unable to get drawable. Returning empty string");
      return "";
    }
    if (!(localDrawable instanceof BitmapDrawable))
    {
      zzin.zzaK("Drawable is not an instance of BitmapDrawable. Returning empty string");
      return "";
    }
    BitmapDrawable localBitmapDrawable = (BitmapDrawable)localDrawable;
    Bitmap localBitmap = localBitmapDrawable.getBitmap();
    return zza(localBitmap);
  }

  private static String zza(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    if (paramBitmap == null)
    {
      zzin.zzaK("Bitmap is null. Returning empty string");
      return "";
    }
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    String str = Base64.encodeToString(arrayOfByte, 0);
    return "data:image/png;base64," + str;
  }

  private static zzch zzc(Object paramObject)
  {
    if ((paramObject instanceof IBinder))
      return zzch.zza.zzt((IBinder)paramObject);
    return null;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzm
 * JD-Core Version:    0.6.0
 */