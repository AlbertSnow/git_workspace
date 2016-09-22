package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;

final class u
  implements Runnable
{
  u(o paramo, a parama)
  {
  }

  public final void run()
  {
    synchronized (this.b.c.a)
    {
      if ((this.b.b.b() == -1) || (this.b.b.b() == 1))
        return;
      this.b.b.c_();
      y.a(new v(this));
      c.a("Could not receive loaded message in a timely manner. Rejecting.");
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.u
 * JD-Core Version:    0.6.0
 */