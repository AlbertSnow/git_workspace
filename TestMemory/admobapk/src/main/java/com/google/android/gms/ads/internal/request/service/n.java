package com.google.android.gms.ads.internal.request.service;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.util.future.a;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;

final class n
  implements t
{
  n(k paramk)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    q localq;
    synchronized (this.a.a)
    {
      if (this.a.d.isDone())
        return;
      localq = new q(-2, paramMap);
      if (!this.a.b.equals(localq.e))
        return;
    }
    this.a.d.b(localq);
    monitorexit;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.service.n
 * JD-Core Version:    0.6.0
 */