package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.js.aa;
import com.google.android.gms.ads.internal.js.n;
import org.json.JSONObject;

final class ag
  implements Runnable
{
  ag(ae paramae, JSONObject paramJSONObject, String paramString)
  {
  }

  public final void run()
  {
    this.c.d = ae.a.b(null);
    this.c.d.a(new ah(this), new ai(this));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.ag
 * JD-Core Version:    0.6.0
 */