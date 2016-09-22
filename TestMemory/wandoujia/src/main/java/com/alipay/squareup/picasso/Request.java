package com.alipay.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.widget.ImageView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Future;

class Request
  implements Runnable
{
  final Picasso a;
  final Uri b;
  final int c;
  final g d;
  final List<Transformation> e;
  final boolean f;
  final String g;
  Future<?> h;
  Bitmap i;
  Request.LoadedFrom j;
  int k;
  boolean l;
  private WeakReference<ImageView> m;

  Request(Picasso paramPicasso, Uri paramUri, int paramInt)
  {
    this.a = paramPicasso;
    this.b = paramUri;
    this.c = 0;
    this.m = new WeakReference(null);
    this.d = null;
    this.e = null;
    this.f = false;
    this.k = 2;
    this.g = p.a(this);
  }

  Object a()
  {
    return this.m.get();
  }

  void b()
  {
    if (this.i == null)
      throw new AssertionError(String.format("Attempted to complete request with no result!\n%s", new Object[] { this }));
    ImageView localImageView = (ImageView)this.m.get();
    if (localImageView != null)
      h.a(localImageView, this.a.b, this.i, this.j);
  }

  void c()
  {
    if ((ImageView)this.m.get() == null);
  }

  public void run()
  {
    try
    {
      Thread localThread = Thread.currentThread();
      StringBuilder localStringBuilder = new StringBuilder("Picasso-");
      Uri localUri = this.b;
      Object localObject2;
      if (localUri != null)
        localObject2 = localUri.getPath();
      while (true)
      {
        localThread.setName((String)localObject2);
        Picasso localPicasso = this.a;
        try
        {
          Bitmap localBitmap = localPicasso.b(this);
          if (localBitmap == null)
            localPicasso.a.sendMessage(localPicasso.a.obtainMessage(3, this));
          while (true)
          {
            Thread.currentThread().setName("Picasso-Idle");
            return;
            String str = Integer.toString(this.c);
            localObject2 = str;
            break;
            this.i = localBitmap;
            localPicasso.a.sendMessage(localPicasso.a.obtainMessage(1, this));
          }
        }
        catch (IOException localIOException)
        {
          while (true)
            localPicasso.a.sendMessageDelayed(localPicasso.a.obtainMessage(2, this), 500L);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      this.a.a.post(new i(localThrowable));
      return;
    }
    finally
    {
      Thread.currentThread().setName("Picasso-Idle");
    }
    throw localObject1;
  }

  public String toString()
  {
    return "Request[hashCode=" + hashCode() + ", picasso=" + this.a + ", uri=" + this.b + ", resourceId=" + this.c + ", target=" + this.m + ", options=" + null + ", transformations=" + "[], future=" + this.h + ", result=" + this.i + ", retryCount=" + this.k + ", loadedFrom=" + this.j + ']';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.Request
 * JD-Core Version:    0.6.0
 */