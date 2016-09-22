package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import com.google.android.gms.ads.identifier.a;
import com.google.android.gms.ads.identifier.c;
import hf;
import hi;
import java.io.IOException;
import java.lang.reflect.Method;

public final class i extends r
{
  public i(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 24);
  }

  protected final void a()
  {
    if (this.a.j)
    {
      a locala = this.a.c();
      if (locala != null)
        try
        {
          c localc = locala.a();
          String str = hi.a(localc.a);
          if (str == null)
            return;
          synchronized (this.b)
          {
            this.b.D = str;
            this.b.F = Boolean.valueOf(localc.b);
            this.b.E = Integer.valueOf(5);
            return;
          }
        }
        catch (IOException localIOException)
        {
          return;
        }
    }
    else
    {
      synchronized (this.b)
      {
        d locald2 = this.b;
        Method localMethod = this.c;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.a.a;
        locald2.D = ((String)localMethod.invoke(null, arrayOfObject));
        return;
      }
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.i
 * JD-Core Version:    0.6.0
 */