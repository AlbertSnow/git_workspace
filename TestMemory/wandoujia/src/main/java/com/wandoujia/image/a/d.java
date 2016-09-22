package com.wandoujia.image.a;

import android.graphics.Bitmap;
import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import java.util.concurrent.Executor;

public final class d
{
  private static final Executor a = new CachedThreadPoolExecutorWithCapacity(1, 60000L);

  public static void a(c paramc, String paramString, Bitmap paramBitmap)
  {
    a.execute(new e(paramc, paramString, paramBitmap));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.a.d
 * JD-Core Version:    0.6.0
 */