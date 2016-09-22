package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import gd;
import hf;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class c extends r
{
  private static volatile String d = null;
  private static final Object e = new Object();

  public c(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 27);
  }

  protected final void a()
  {
    this.b.n = "E";
    if (d == null)
      synchronized (e)
      {
        if (d == null)
        {
          Method localMethod = this.c;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.a.a;
          d = gd.a(((ByteBuffer)localMethod.invoke(null, arrayOfObject)).array(), true);
        }
      }
    synchronized (this.b)
    {
      this.b.n = d;
      return;
      localObject3 = finally;
      monitorexit;
      throw localObject3;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.c
 * JD-Core Version:    0.6.0
 */