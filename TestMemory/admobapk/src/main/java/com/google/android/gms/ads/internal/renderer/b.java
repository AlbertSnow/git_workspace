package com.google.android.gms.ads.internal.renderer;

import com.google.android.gms.ads.internal.util.c;
import java.util.concurrent.atomic.AtomicBoolean;

final class b
  implements Runnable
{
  b(a parama)
  {
  }

  public final void run()
  {
    if (!this.a.d.get())
      return;
    c.c("Timed out waiting for WebView to finish loading.");
    this.a.c();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.b
 * JD-Core Version:    0.6.0
 */