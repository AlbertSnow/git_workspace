package com.google.android.gms.ads.internal.js;

import anw;
import com.google.android.gms.ads.internal.util.ar;
import com.google.android.gms.ads.internal.util.promise.e;

public final class ae extends e
{
  ar a;
  private final Object b = new Object();
  private boolean c;
  private int d;

  public ae(ar paramar)
  {
    this.a = paramar;
    this.c = false;
    this.d = 0;
  }

  private void d()
  {
    while (true)
    {
      synchronized (this.b)
      {
        if (this.d >= 0)
        {
          bool = true;
          anw.a(bool);
          if ((!this.c) || (this.d != 0))
            continue;
          com.google.android.gms.ads.internal.util.c.a("No reference is left (including root). Cleaning up engine.");
          a(new ah(this), new com.google.android.gms.ads.internal.util.promise.c());
          return;
          com.google.android.gms.ads.internal.util.c.a("There are still references to the engine. Not destroying.");
        }
      }
      boolean bool = false;
    }
  }

  public final aa a()
  {
    aa localaa = new aa(this);
    while (true)
    {
      synchronized (this.b)
      {
        a(new af(this, localaa), new ag(this, localaa));
        if (this.d >= 0)
        {
          bool = true;
          anw.a(bool);
          this.d = (1 + this.d);
          return localaa;
        }
      }
      boolean bool = false;
    }
  }

  protected final void b_()
  {
    while (true)
    {
      synchronized (this.b)
      {
        if (this.d > 0)
        {
          bool = true;
          anw.a(bool);
          com.google.android.gms.ads.internal.util.c.a("Releasing 1 reference for JS Engine");
          this.d = (-1 + this.d);
          d();
          return;
        }
      }
      boolean bool = false;
    }
  }

  public final void c()
  {
    for (boolean bool = true; ; bool = false)
      synchronized (this.b)
      {
        if (this.d < 0)
          continue;
        anw.a(bool);
        com.google.android.gms.ads.internal.util.c.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
        this.c = true;
        d();
        return;
      }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.ae
 * JD-Core Version:    0.6.0
 */