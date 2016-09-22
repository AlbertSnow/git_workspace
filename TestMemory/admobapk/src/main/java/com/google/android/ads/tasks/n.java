package com.google.android.ads.tasks;

import com.google.ads.afma.nano.d;
import hf;
import java.lang.reflect.Method;
import java.util.List;

public final class n extends r
{
  private List d = null;

  public n(hf paramhf, String paramString1, String paramString2, d paramd, int paramInt1, int paramInt2)
  {
    super(paramhf, paramString1, paramString2, paramd, paramInt1, 31);
  }

  protected final void a()
  {
    this.b.p = Long.valueOf(-1L);
    this.b.q = Long.valueOf(-1L);
    if (this.d == null)
    {
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.a;
      this.d = ((List)localMethod.invoke(null, arrayOfObject));
    }
    if ((this.d != null) && (this.d.size() == 2))
      synchronized (this.b)
      {
        this.b.p = Long.valueOf(((Long)this.d.get(0)).longValue());
        this.b.q = Long.valueOf(((Long)this.d.get(1)).longValue());
        return;
      }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.n
 * JD-Core Version:    0.6.0
 */