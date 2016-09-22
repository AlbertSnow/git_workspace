package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import gd;
import hf;
import java.lang.reflect.Method;

public final class b extends r
{
  private static volatile String d = null;
  private static final Object e = new Object();

  public b(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 29);
  }

  protected final void a()
  {
    this.b.o = "E";
    if (d == null)
      synchronized (e)
      {
        if (d == null)
        {
          Method localMethod = this.c;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.a.a;
          d = (String)localMethod.invoke(null, arrayOfObject);
        }
      }
    synchronized (this.b)
    {
      this.b.o = gd.a(d.getBytes(), true);
      return;
      localObject3 = finally;
      monitorexit;
      throw localObject3;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.b
 * JD-Core Version:    0.6.0
 */