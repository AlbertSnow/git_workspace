package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class aj
  implements t
{
  aj(CountDownLatch paramCountDownLatch)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    c.e("Adapter returned an ad, but assets substitution failed");
    this.a.countDown();
    paramb.destroy();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.aj
 * JD-Core Version:    0.6.0
 */