package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.webview.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class av
  implements Runnable
{
  av(ar paramar, String paramString1, String paramString2, long paramLong)
  {
  }

  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheComplete");
    localHashMap.put("src", this.a);
    localHashMap.put("cachedSrc", this.b);
    localHashMap.put("totalDuration", Long.toString(this.c));
    b localb = (b)this.d.c.get();
    if (localb != null)
      localb.a("onPrecacheEvent", localHashMap);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.av
 * JD-Core Version:    0.6.0
 */