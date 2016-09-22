package com.google.android.gms.ads.internal.renderer.nativeads;

import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.state.b;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.future.a;
import org.json.JSONException;
import org.json.JSONObject;

final class g extends e
{
  g(f paramf, o paramo, a parama, String paramString)
  {
  }

  public final void a()
  {
    this.b.b(null);
  }

  public final void a(ak paramak)
  {
    h localh = new h(this, paramak);
    this.a.a = localh;
    paramak.a("/nativeAdPreProcess", localh);
    try
    {
      JSONObject localJSONObject = new JSONObject(this.c.b.b.c);
      localJSONObject.put("ads_id", this.d);
      paramak.a("google.afma.nativeAds.preProcessJsonGmsg", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      c.c("Exception occurred while invoking javascript", localJSONException);
      this.b.b(null);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.nativeads.g
 * JD-Core Version:    0.6.0
 */