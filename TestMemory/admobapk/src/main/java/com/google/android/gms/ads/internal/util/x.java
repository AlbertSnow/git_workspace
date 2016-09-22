package com.google.android.gms.ads.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class x
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(1);

  x(String paramString)
  {
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    String str = this.b;
    int i = this.a.getAndIncrement();
    return new Thread(paramRunnable, 23 + String.valueOf(str).length() + "AdWorker(" + str + ") #" + i);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.x
 * JD-Core Version:    0.6.0
 */