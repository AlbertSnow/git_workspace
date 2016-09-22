package com.google.android.gms.ads.internal.mraid;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import org.json.JSONException;
import org.json.JSONObject;

@a
public final class j
{
  private final boolean a;
  private final boolean b;
  private final boolean c;
  private final boolean d;
  private final boolean e;

  j(k paramk)
  {
    this.a = paramk.a;
    this.b = paramk.b;
    this.c = paramk.c;
    this.d = paramk.d;
    this.e = paramk.e;
  }

  public final JSONObject a()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("sms", this.a).put("tel", this.b).put("calendar", this.c).put("storePicture", this.d).put("inlineVideo", this.e);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      c.b("Error occured while obtaining the MRAID capabilities.", localJSONException);
    }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mraid.j
 * JD-Core Version:    0.6.0
 */