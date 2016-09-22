package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import hf;
import java.lang.reflect.Method;

public final class h extends r
{
  private long d;

  public h(hf paramhf, String paramString1, String paramString2, d paramd, long paramLong, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 25);
    this.d = paramLong;
  }

  protected final void a()
  {
    long l = ((Long)this.c.invoke(null, new Object[0])).longValue();
    synchronized (this.b)
    {
      this.b.G = Long.valueOf(l);
      if (this.d != 0L)
      {
        this.b.j = Long.valueOf(l - this.d);
        this.b.m = Long.valueOf(this.d);
      }
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.h
 * JD-Core Version:    0.6.0
 */