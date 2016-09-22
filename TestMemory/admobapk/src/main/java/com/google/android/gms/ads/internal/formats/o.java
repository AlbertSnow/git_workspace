package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.ads.internal.webview.f;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class o
  implements f
{
  o(n paramn, Map paramMap)
  {
  }

  public final void a(b paramb, boolean paramBoolean)
  {
    this.b.b.a.c = ((String)this.a.get("id"));
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("messageType", "htmlLoaded");
      localJSONObject.put("id", this.b.b.a.c);
      this.b.a.b("sendMessageToNativeJs", localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      c.b("Unable to dispatch sendMessageToNativeJs event", localJSONException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.o
 * JD-Core Version:    0.6.0
 */