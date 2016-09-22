package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.report.client.a;
import java.util.Map;
import org.json.JSONObject;

@a
public abstract interface h
{
  public abstract void a();

  public abstract void a(MotionEvent paramMotionEvent);

  public abstract void a(View paramView);

  public abstract void a(View paramView, Map paramMap);

  public abstract void a(View paramView, Map paramMap, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3);

  public abstract void a(String paramString, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3);

  public abstract void b(View paramView);

  public abstract View e();

  public abstract Context f();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.h
 * JD-Core Version:    0.6.0
 */