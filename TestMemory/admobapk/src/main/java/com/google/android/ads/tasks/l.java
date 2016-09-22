package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import hf;
import java.lang.reflect.Method;

public final class l extends r
{
  private long d = -1L;

  public l(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 12);
  }

  protected final void a()
  {
    this.b.f = Long.valueOf(-1L);
    if (this.d == -1L)
    {
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.a;
      this.d = ((Integer)localMethod.invoke(null, arrayOfObject)).intValue();
    }
    synchronized (this.b)
    {
      this.b.f = Long.valueOf(this.d);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.l
 * JD-Core Version:    0.6.0
 */