package com.wandoujia.image;

import android.graphics.Bitmap;
import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

final class ac
{
  private final CachedThreadPoolExecutorWithCapacity a = new CachedThreadPoolExecutorWithCapacity(1, 60000L);

  public final Future<Bitmap> a(Callable<Bitmap> paramCallable)
  {
    return this.a.submit(paramCallable);
  }

  public final void a(Runnable paramRunnable)
  {
    this.a.execute(paramRunnable);
  }

  public final boolean b(Runnable paramRunnable)
  {
    return this.a.cancel(paramRunnable, true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.ac
 * JD-Core Version:    0.6.0
 */