package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.future.a;
import java.util.concurrent.Future;

final class w
  implements Runnable
{
  w(a parama, Future paramFuture)
  {
  }

  public final void run()
  {
    if (this.a.isCancelled())
      this.b.cancel(true);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.w
 * JD-Core Version:    0.6.0
 */