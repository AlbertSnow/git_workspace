package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.overlay.ab;
import com.google.android.gms.ads.internal.overlay.ar;
import com.google.android.gms.ads.internal.overlay.as;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;
import org.json.JSONObject;

final class n
  implements t
{
  public final void a(b paramb, Map paramMap)
  {
    boolean bool;
    JSONObject localJSONObject;
    if ("checkSupport".equals(paramMap.get("action")))
    {
      c.d("Received support message, responding.");
      m localm = paramb.h();
      bool = false;
      if (localm != null)
      {
        as localas = localm.c;
        bool = false;
        if (localas != null)
          bool = localas.a(paramb.getContext());
      }
      localJSONObject = new JSONObject();
    }
    try
    {
      localJSONObject.put("event", "checkSupport");
      localJSONObject.put("supports", bool);
      paramb.b("appStreaming", localJSONObject);
      ab localab;
      do
      {
        return;
        localab = paramb.i();
      }
      while (localab == null);
      localab.i.a(paramb, paramMap);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.n
 * JD-Core Version:    0.6.0
 */