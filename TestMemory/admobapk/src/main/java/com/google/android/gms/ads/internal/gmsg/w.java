package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import org.json.JSONObject;

final class w
  implements Runnable
{
  w(v paramv, JSONObject paramJSONObject)
  {
  }

  public final void run()
  {
    this.b.a.b("fetchHttpRequestCompleted", this.a);
    c.b("Dispatched http response.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.w
 * JD-Core Version:    0.6.0
 */