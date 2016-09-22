package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import hf;
import java.lang.reflect.Method;

public final class a extends r
{
  public a(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 3);
  }

  protected final void a()
  {
    synchronized (this.b)
    {
      this.b.c = Long.valueOf(-1L);
      d locald2 = this.b;
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.a;
      locald2.c = ((Long)localMethod.invoke(null, arrayOfObject));
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.a
 * JD-Core Version:    0.6.0
 */