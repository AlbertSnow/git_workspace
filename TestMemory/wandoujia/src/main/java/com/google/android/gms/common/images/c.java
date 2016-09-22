package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class c
  implements Runnable
{
  private final Uri a;
  private final Bitmap b;
  private final CountDownLatch c;
  private boolean d;

  public c(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.a = paramUri;
    this.b = paramBitmap;
    this.d = paramBoolean;
    this.c = paramCountDownLatch;
  }

  private void a(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
  {
    ArrayList localArrayList = ImageManager.ImageReceiver.a(paramImageReceiver);
    int i = localArrayList.size();
    int j = 0;
    if (j < i)
    {
      d locald = (d)localArrayList.get(j);
      if (paramBoolean)
        locald.a(ImageManager.b(this.e), this.b);
      while (true)
      {
        if (!(locald instanceof f))
          ImageManager.a(this.e).remove(locald);
        j++;
        break;
        ImageManager.d(this.e).put(this.a, Long.valueOf(SystemClock.elapsedRealtime()));
        ImageManager.b(this.e);
        ImageManager.c(this.e);
        locald.a();
      }
    }
  }

  public final void run()
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      new StringBuilder("checkMainThread: current thread ").append(Thread.currentThread()).append(" IS NOT the main thread ").append(Looper.getMainLooper().getThread()).append("!");
      throw new IllegalStateException("OnBitmapLoadedRunnable must be executed in the main thread");
    }
    boolean bool;
    if (this.b != null)
      bool = true;
    while (ImageManager.g(this.e) != null)
    {
      if (this.d)
      {
        ImageManager.g(this.e).a(-1);
        System.gc();
        this.d = false;
        ImageManager.f(this.e).post(this);
        return;
        bool = false;
        continue;
      }
      if (!bool)
        break;
      ImageManager.g(this.e).a(new e(this.a), this.b);
    }
    ImageManager.ImageReceiver localImageReceiver = (ImageManager.ImageReceiver)ImageManager.e(this.e).remove(this.a);
    if (localImageReceiver != null)
      a(localImageReceiver, bool);
    this.c.countDown();
    synchronized (ImageManager.a())
    {
      ImageManager.b().remove(this.a);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.images.c
 * JD-Core Version:    0.6.0
 */