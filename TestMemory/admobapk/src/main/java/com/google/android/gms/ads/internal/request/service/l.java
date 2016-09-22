package com.google.android.gms.ads.internal.request.service;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.future.a;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class l
  implements t
{
  l(k paramk)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    synchronized (this.a.a)
    {
      if (this.a.d.isDone())
        return;
      if (!this.a.b.equals(paramMap.get("request_id")))
        return;
    }
    q localq = new q(1, paramMap);
    String str1 = String.valueOf(localq.c);
    String str2 = String.valueOf(localq.a);
    c.e(24 + String.valueOf(str1).length() + String.valueOf(str2).length() + "Invalid " + str1 + " request error: " + str2);
    this.a.d.b(localq);
    monitorexit;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.l
 * JD-Core Version:    0.6.0
 */