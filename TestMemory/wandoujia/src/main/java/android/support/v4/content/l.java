package android.support.v4.content;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class l
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(1);

  public final Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, "ModernAsyncTask #" + this.a.getAndIncrement());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.l
 * JD-Core Version:    0.6.0
 */