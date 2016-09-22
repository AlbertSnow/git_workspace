package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import hf;
import java.lang.reflect.Method;

public final class g extends r
{
  private static volatile Long d = null;
  private static final Object e = new Object();

  public g(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 44);
  }

  protected final void a()
  {
    if (d == null)
      synchronized (e)
      {
        if (d == null)
          d = (Long)this.c.invoke(null, new Object[0]);
      }
    synchronized (this.b)
    {
      this.b.A = d;
      return;
      localObject3 = finally;
      monitorexit;
      throw localObject3;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.g
 * JD-Core Version:    0.6.0
 */