package com.google.android.gms.ads.internal.gmsg;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;
import org.json.JSONObject;

final class v
  implements Runnable
{
  v(u paramu, Map paramMap, b paramb)
  {
  }

  public final void run()
  {
    c.b("Received Http request.");
    String str = (String)this.b.get("http_request");
    JSONObject localJSONObject = this.c.a(str);
    if (localJSONObject == null)
    {
      c.c("Response should not be null.");
      return;
    }
    y.a.post(new w(this, localJSONObject));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.v
 * JD-Core Version:    0.6.0
 */