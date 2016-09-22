package com.google.android.gms.ads.internal.mraid;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import org.json.JSONException;
import org.json.JSONObject;

@a
public class m
{
  private final String a;
  final b s;

  public m(b paramb)
  {
    this(paramb, "");
  }

  public m(b paramb, String paramString)
  {
    this.s = paramb;
    this.a = paramString;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("width", paramInt1).put("height", paramInt2).put("maxSizeWidth", paramInt3).put("maxSizeHeight", paramInt4).put("density", paramFloat).put("rotation", paramInt5);
      this.s.b("onScreenInfoChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      c.b("Error occured while obtaining screen information.", localJSONException);
    }
  }

  public final void a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("message", paramString).put("action", this.a);
      this.s.b("onError", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      c.b("Error occurred while dispatching error event.", localJSONException);
    }
  }

  public final void b(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("js", paramString);
      this.s.b("onReadyEventReceived", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      c.b("Error occured while dispatching ready Event.", localJSONException);
    }
  }

  public final void c(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject().put("state", paramString);
      this.s.b("onStateChanged", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      c.b("Error occured while dispatching state change.", localJSONException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mraid.m
 * JD-Core Version:    0.6.0
 */