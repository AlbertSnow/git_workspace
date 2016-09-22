package com.google.android.gms.ads.internal.mediation;

import com.google.android.gms.ads.internal.util.c;

final class g
  implements Runnable
{
  g(f paramf, e parame)
  {
  }

  public final void run()
  {
    synchronized (this.b.b)
    {
      if (this.b.d != -2)
        return;
      this.b.c = this.b.b();
      if (this.b.c == null)
      {
        this.b.a(4);
        return;
      }
    }
    if ((this.b.c()) && (!this.b.b(1)))
    {
      String str = this.b.a;
      c.e(56 + String.valueOf(str).length() + "Ignoring adapter " + str + " as delayed impression is not supported");
      this.b.a(2);
      monitorexit;
      return;
    }
    e locale = this.a;
    f localf = this.b;
    synchronized (locale.a)
    {
      locale.b = localf;
      this.b.a(this.a);
      monitorexit;
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.g
 * JD-Core Version:    0.6.0
 */