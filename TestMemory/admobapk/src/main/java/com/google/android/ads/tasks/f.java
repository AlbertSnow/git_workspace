package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import hf;
import java.lang.reflect.Method;

public final class f extends r
{
  public f(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 5);
  }

  protected final void a()
  {
    this.b.d = Long.valueOf(-1L);
    this.b.e = Long.valueOf(-1L);
    Method localMethod = this.c;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a.a;
    int[] arrayOfInt = (int[])localMethod.invoke(null, arrayOfObject);
    synchronized (this.b)
    {
      this.b.d = Long.valueOf(arrayOfInt[0]);
      this.b.e = Long.valueOf(arrayOfInt[1]);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.f
 * JD-Core Version:    0.6.0
 */