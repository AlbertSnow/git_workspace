package com.wandoujia.image;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class r
{
  private final AtomicBoolean a = new AtomicBoolean(false);
  private final AtomicBoolean b = new AtomicBoolean(false);
  private final String c;
  private final String d;
  private final ae e;
  private Bitmap f;

  r(b paramb, String paramString1, String paramString2, ae paramae)
  {
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramae;
  }

  public final void a()
  {
    if (this.e != null)
      this.e.a(null, true);
  }

  public final void a(Bitmap paramBitmap)
  {
    this.f = paramBitmap;
    if (this.e != null)
      this.e.a(paramBitmap, false);
    synchronized (this.a)
    {
      this.a.set(true);
      this.a.notifyAll();
      return;
    }
  }

  public final Bitmap b()
  {
    try
    {
      synchronized (this.a)
      {
        if (!this.a.get())
          this.a.wait();
      }
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    while (true)
    {
      return this.f;
      monitorexit;
    }
  }

  public final String c()
  {
    return this.c;
  }

  public final boolean d()
  {
    return this.b.get();
  }

  public final void e()
  {
    if (this.b.get());
    while (true)
    {
      return;
      q localq1 = (q)b.i(this.g).get(this.d);
      if (localq1 == null)
        break;
      if (!localq1.b(this))
        continue;
      b.i(this.g).remove(this.d);
      return;
    }
    q localq2 = (q)b.j(this.g).get(this.d);
    if (localq2 != null)
      if (localq2.b(this))
        b.j(this.g).remove(this.d);
    while (true)
    {
      this.b.set(true);
      return;
      q localq3 = (q)b.d(this.g).get(this.d);
      if (localq3 == null)
        continue;
      localq3.b(this);
      if (q.b(localq3).size() != 0)
        continue;
      b.d(this.g).remove(this.d);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.r
 * JD-Core Version:    0.6.0
 */