package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjq.zza;
import com.google.android.gms.internal.zzjr;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzi
  implements zzh
{
  private final Object zzpV = new Object();
  private final zzp zzyn;
  private final Context mContext;
  private final JSONObject zzyq;
  private final zzed zzyr;
  private final zzh.zza zzys;
  private final zzan zzyt;
  private final VersionInfoParcel zzpT;
  private boolean zzyu;
  private zzjp zzpD;
  private String zzyv;
  private WeakReference<View> zzyw = null;

  public zzi(Context paramContext, zzp paramzzp, zzed paramzzed, zzan paramzzan, JSONObject paramJSONObject, zzh.zza paramzza, VersionInfoParcel paramVersionInfoParcel)
  {
    this.mContext = paramContext;
    this.zzyn = paramzzp;
    this.zzyr = paramzzed;
    this.zzyt = paramzzan;
    this.zzyq = paramJSONObject;
    this.zzys = paramzza;
    this.zzpT = paramVersionInfoParcel;
  }

  public zzb zza(View.OnClickListener paramOnClickListener)
  {
    zza localzza = this.zzys.zzdN();
    if (localzza == null)
      return null;
    zzb localzzb = new zzb(this.mContext, localzza);
    localzzb.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    localzzb.zzdI().setOnClickListener(paramOnClickListener);
    localzzb.zzdI().setContentDescription("Ad attribution icon");
    return localzzb;
  }

  public void zza(String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    zzx.zzcD("performClick must be called on the main UI thread.");
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      localJSONObject1.put("asset", paramString);
      localJSONObject1.put("template", this.zzys.zzdM());
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("ad", this.zzyq);
      localJSONObject2.put("click", localJSONObject1);
      localJSONObject2.put("has_custom_click_handler", this.zzyn.zzs(this.zzys.getCustomTemplateId()) != null);
      if (paramJSONObject1 != null)
        localJSONObject2.put("view_rectangles", paramJSONObject1);
      if (paramJSONObject2 != null)
        localJSONObject2.put("click_point", paramJSONObject2);
      if (paramJSONObject3 != null)
        localJSONObject2.put("native_view_rectangle", paramJSONObject3);
      this.zzyr.zza("google.afma.nativeAds.handleClickGmsg", localJSONObject2);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Unable to create click JSON.", localJSONException);
    }
  }

  public void zza(View paramView, Map<String, WeakReference<View>> paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3)
  {
    zzx.zzcD("performClick must be called on the main UI thread.");
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      View localView = (View)((WeakReference)localEntry.getValue()).get();
      if (paramView.equals(localView))
      {
        zza((String)localEntry.getKey(), paramJSONObject1, paramJSONObject2, paramJSONObject3);
        break;
      }
    }
  }

  public void zzb(MotionEvent paramMotionEvent)
  {
    this.zzyt.zza(paramMotionEvent);
  }

  public void zzh(View paramView)
  {
    synchronized (this.zzpV)
    {
      if (this.zzyu)
        return;
      if (!paramView.isShown())
        return;
      if (!paramView.getGlobalVisibleRect(new Rect(), null))
        return;
      recordImpression();
    }
  }

  public void recordImpression()
  {
    zzx.zzcD("recordImpression must be called on the main UI thread.");
    zzn(true);
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("ad", this.zzyq);
      this.zzyr.zza("google.afma.nativeAds.handleImpressionPing", localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      zzin.zzb("Unable to create impression JSON.", localJSONException);
    }
    this.zzyn.zza(this);
  }

  public View zzdS()
  {
    return this.zzyw != null ? (View)this.zzyw.get() : null;
  }

  public void zzi(View paramView)
  {
    this.zzyw = new WeakReference(paramView);
  }

  public void zzg(View paramView)
  {
  }

  public zzjp zzdR()
  {
    this.zzpD = zzdT();
    this.zzpD.getView().setVisibility(8);
    this.zzyr.zza("/loadHtml", new zzdf()
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        zzi.zzc(zzi.this).zzhU().zza(new zzjq.zza(paramMap)
        {
          public void zza(zzjp paramzzjp, boolean paramBoolean)
          {
            zzi.zza(zzi.this, (String)this.zzyy.get("id"));
            JSONObject localJSONObject = new JSONObject();
            try
            {
              localJSONObject.put("messageType", "htmlLoaded");
              localJSONObject.put("id", zzi.zza(zzi.this));
              zzi.zzb(zzi.this).zzb("sendMessageToNativeJs", localJSONObject);
            }
            catch (JSONException localJSONException)
            {
              zzin.zzb("Unable to dispatch sendMessageToNativeJsevent", localJSONException);
            }
          }
        });
        String str1 = (String)paramMap.get("overlayHtml");
        String str2 = (String)paramMap.get("baseUrl");
        if (TextUtils.isEmpty(str2))
          zzi.zzc(zzi.this).loadData(str1, "text/html", "UTF-8");
        else
          zzi.zzc(zzi.this).loadDataWithBaseURL(str2, str1, "text/html", "UTF-8", null);
      }
    });
    this.zzyr.zza("/showOverlay", new zzdf()
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        zzi.zzc(zzi.this).getView().setVisibility(0);
      }
    });
    this.zzyr.zza("/hideOverlay", new zzdf()
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        zzi.zzc(zzi.this).getView().setVisibility(8);
      }
    });
    this.zzpD.zzhU().zza("/hideOverlay", new zzdf()
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        zzi.zzc(zzi.this).getView().setVisibility(8);
      }
    });
    this.zzpD.zzhU().zza("/sendMessageToSdk", new zzdf()
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        JSONObject localJSONObject = new JSONObject();
        try
        {
          Iterator localIterator = paramMap.keySet().iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            localJSONObject.put(str, paramMap.get(str));
          }
          localJSONObject.put("id", zzi.zza(zzi.this));
          zzi.zzb(zzi.this).zzb("sendMessageToNativeJs", localJSONObject);
        }
        catch (JSONException localJSONException)
        {
          zzin.zzb("Unable to dispatch sendMessageToNativeJs event", localJSONException);
        }
      }
    });
    return this.zzpD;
  }

  protected void zzn(boolean paramBoolean)
  {
    this.zzyu = paramBoolean;
  }

  zzjp zzdT()
  {
    return zzr.zzbD().zza(this.mContext, AdSizeParcel.zzt(this.mContext), false, false, this.zzyt, this.zzpT);
  }

  public Context getContext()
  {
    return this.mContext;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzi
 * JD-Core Version:    0.6.0
 */