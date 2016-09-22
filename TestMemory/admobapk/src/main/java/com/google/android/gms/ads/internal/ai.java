package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.webview.b;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class ai
  implements t
{
  ai(CountDownLatch paramCountDownLatch)
  {
  }

  public final void a(b paramb, Map paramMap)
  {
    this.a.countDown();
    View localView = paramb.b();
    if (localView == null)
      return;
    localView.setVisibility(0);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ai
 * JD-Core Version:    0.6.0
 */