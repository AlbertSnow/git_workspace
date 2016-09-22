package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.s;
import gv;
import gz;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@com.google.android.gms.ads.internal.report.client.a
final class w
  implements gv, Runnable
{
  private final List a = new Vector();
  private final AtomicReference b = new AtomicReference();
  private bd c;
  private CountDownLatch d = new CountDownLatch(1);

  public w(bd parambd)
  {
    this.c = parambd;
    if (com.google.android.gms.ads.internal.util.client.a.b())
    {
      s.a(this);
      return;
    }
    run();
  }

  private boolean a()
  {
    try
    {
      this.d.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      c.c("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }

  private static Context b(Context paramContext)
  {
    d locald = m.f;
    if (!((Boolean)bc.a().n.a(locald)).booleanValue());
    Context localContext;
    do
    {
      return paramContext;
      localContext = paramContext.getApplicationContext();
    }
    while (localContext == null);
    return localContext;
  }

  private final void b()
  {
    if (this.a.isEmpty())
      return;
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Object[] arrayOfObject = (Object[])localIterator.next();
      if (arrayOfObject.length == 1)
      {
        ((Runnable)this.b.get()).a((MotionEvent)arrayOfObject[0]);
        continue;
      }
      if (arrayOfObject.length != 3)
        continue;
      ((Runnable)this.b.get()).a(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
    }
    this.a.clear();
  }

  public final String a(Context paramContext)
  {
    if (a())
    {
      gv localgv = (Runnable)this.b.get();
      if (localgv != null)
      {
        b();
        return localgv.a(b(paramContext));
      }
    }
    return "";
  }

  public final String a(Context paramContext, String paramString)
  {
    if (a())
    {
      gv localgv = (Runnable)this.b.get();
      if (localgv != null)
      {
        b();
        return localgv.a(b(paramContext), paramString);
      }
    }
    return "";
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    gv localgv = (Runnable)this.b.get();
    if (localgv != null)
    {
      b();
      localgv.a(paramInt1, paramInt2, paramInt3);
      return;
    }
    List localList = this.a;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    localList.add(arrayOfObject);
  }

  public final void a(MotionEvent paramMotionEvent)
  {
    gv localgv = (Runnable)this.b.get();
    if (localgv != null)
    {
      b();
      localgv.a(paramMotionEvent);
      return;
    }
    this.a.add(new Object[] { paramMotionEvent });
  }

  public final void run()
  {
    while (true)
    {
      try
      {
        d locald = m.p;
        if (((Boolean)bc.a().n.a(locald)).booleanValue())
        {
          if (!this.c.e.e)
            continue;
          break label107;
          gz localgz = gz.a(this.c.e.b, b(this.c.c), bool);
          this.b.set(localgz);
          return;
          bool = false;
          continue;
        }
      }
      finally
      {
        this.d.countDown();
        this.c = null;
      }
      label107: boolean bool = true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.w
 * JD-Core Version:    0.6.0
 */