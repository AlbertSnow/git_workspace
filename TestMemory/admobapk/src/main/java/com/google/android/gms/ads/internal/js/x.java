package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.promise.b;

final class x
  implements b
{
  x(n paramn, ae paramae)
  {
  }

  public final void a()
  {
    synchronized (this.b.a)
    {
      this.b.g = 1;
      c.a("Failed loading new engine. Marking new engine destroyable.");
      this.a.c();
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.x
 * JD-Core Version:    0.6.0
 */