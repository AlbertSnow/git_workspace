package com.google.android.ads.tasks;

import hf;
import java.lang.reflect.Method;

public final class d extends r
{
  private static volatile Long d = null;
  private static final Object e = new Object();

  public d(hf paramhf, String paramString1, String paramString2, com.google.ads.afma.nano.d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 35);
  }

  protected final void a()
  {
    this.b.t = Long.valueOf(-1L);
    if (d == null)
      synchronized (e)
      {
        if (d == null)
        {
          Method localMethod = this.c;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.a.a;
          d = (Long)localMethod.invoke(null, arrayOfObject);
        }
      }
    synchronized (this.b)
    {
      this.b.t = d;
      return;
      localObject3 = finally;
      monitorexit;
      throw localObject3;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.d
 * JD-Core Version:    0.6.0
 */