package com.google.android.gms.ads.internal.util.future;

import com.google.android.gms.ads.internal.report.client.a;
import java.util.concurrent.TimeUnit;

@a
public final class b
  implements g
{
  private final Object a;
  private final h b;

  public b(Object paramObject)
  {
    this.a = paramObject;
    this.b = new h();
    this.b.a();
  }

  public final void a(Runnable paramRunnable)
  {
    this.b.a(paramRunnable);
  }

  public final boolean cancel(boolean paramBoolean)
  {
    return false;
  }

  public final Object get()
  {
    return this.a;
  }

  public final Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.a;
  }

  public final boolean isCancelled()
  {
    return false;
  }

  public final boolean isDone()
  {
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.future.b
 * JD-Core Version:    0.6.0
 */