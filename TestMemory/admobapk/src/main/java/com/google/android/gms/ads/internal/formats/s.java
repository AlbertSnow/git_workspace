package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.js.ak;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class s
  implements t
{
  s(m paramm, ak paramak)
  {
  }

  public final void a(b paramb, Map paramMap)
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
    }
    catch (JSONException localJSONException)
    {
      c.b("Unable to dispatch sendMessageToNativeJs event", localJSONException);
      return;
    }
    localJSONObject.put("id", this.b.a.c);
    this.a.b("sendMessageToNativeJs", localJSONObject);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.formats.s
 * JD-Core Version:    0.6.0
 */