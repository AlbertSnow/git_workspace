package com.google.android.gms.ads.internal.util;

import aom;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.report.client.a;

@a
public final class bh
{
  private long a;
  private long b = -9223372036854775808L;
  private Object c = new Object();

  public bh(long paramLong)
  {
    this.a = paramLong;
  }

  public final boolean a()
  {
    synchronized (this.c)
    {
      long l = bc.a().i.b();
      if (this.b + this.a > l)
        return false;
      this.b = l;
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.bh
 * JD-Core Version:    0.6.0
 */