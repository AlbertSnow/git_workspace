package com.google.android.gms.ads.internal.renderer;

import com.google.android.gms.ads.internal.af;
import java.util.concurrent.CountDownLatch;

final class o
  implements Runnable
{
  o(n paramn, CountDownLatch paramCountDownLatch)
  {
  }

  public final void run()
  {
    synchronized (this.b.d)
    {
      this.b.i = af.a(this.b.h, this.b.g, this.a);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.o
 * JD-Core Version:    0.6.0
 */