package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public abstract interface zzh
{
  public abstract void zza(String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3);

  public abstract void zza(View paramView, Map<String, WeakReference<View>> paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3);

  public abstract void zzb(MotionEvent paramMotionEvent);

  public abstract void zzh(View paramView);

  public abstract void recordImpression();

  public abstract View zzdS();

  public abstract void zzi(View paramView);

  public abstract Context getContext();

  public static abstract interface zza
  {
    public abstract void zzb(zzh paramzzh);

    public abstract String zzdM();

    public abstract String getCustomTemplateId();

    public abstract zza zzdN();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.zzh
 * JD-Core Version:    0.6.0
 */