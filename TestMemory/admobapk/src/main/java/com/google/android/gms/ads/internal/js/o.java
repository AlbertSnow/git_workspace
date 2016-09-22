package com.google.android.gms.ads.internal.js;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.bi;
import ha;

final class o
  implements Runnable
{
  o(n paramn, ha paramha, ae paramae)
  {
  }

  public final void run()
  {
    g localg = new g(this.c.b, this.c.d, this.a);
    localg.a(new p(this, localg));
    localg.a("/jsLoaded", new s(this, localg));
    bi localbi = new bi();
    t localt = new t(this, localg, localbi);
    localbi.a = localt;
    localg.a("/requestReload", localt);
    if (this.c.c.endsWith(".js"))
      localg.a(this.c.c);
    while (true)
    {
      com.google.android.gms.ads.internal.util.y.a.postDelayed(new u(this, localg), y.a);
      return;
      if (this.c.c.startsWith("<html>"))
      {
        localg.c(this.c.c);
        continue;
      }
      localg.b(this.c.c);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.o
 * JD-Core Version:    0.6.0
 */