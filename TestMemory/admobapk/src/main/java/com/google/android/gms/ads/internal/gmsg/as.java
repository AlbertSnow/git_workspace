package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.webview.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class as
  implements Runnable
{
  as(ar paramar, String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "precacheProgress");
    localHashMap.put("src", this.a);
    localHashMap.put("cachedSrc", this.b);
    localHashMap.put("bytesLoaded", Integer.toString(this.c));
    localHashMap.put("totalBytes", Integer.toString(this.d));
    if (this.e);
    for (String str = "1"; ; str = "0")
    {
      localHashMap.put("cacheReady", str);
      b localb = (b)this.f.c.get();
      if (localb != null)
        localb.a("onPrecacheEvent", localHashMap);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.gmsg.as
 * JD-Core Version:    0.6.0
 */