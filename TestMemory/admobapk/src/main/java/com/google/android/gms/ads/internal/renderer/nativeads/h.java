package com.google.android.gms.ads.internal.renderer.nativeads;

import android.text.TextUtils;
import anw;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.future.a;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class h
  implements t
{
  h(g paramg, ak paramak)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    this.a.b("/nativeAdPreProcess", this.b.a.a);
    try
    {
      String str = (String)paramMap.get("success");
      if (!TextUtils.isEmpty(str))
      {
        this.b.b.b(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      c.b("Malformed native JSON response.", localJSONException);
      this.b.c.a(0);
      anw.a(this.b.c.a(), "Unable to set the ad state error!");
      this.b.b.b(null);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.nativeads.h
 * JD-Core Version:    0.6.0
 */