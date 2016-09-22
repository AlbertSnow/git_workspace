package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;

final class q
  implements Runnable
{
  q(p paramp)
  {
  }

  public final void run()
  {
    synchronized (this.a.b.c.a)
    {
      if ((this.a.b.b.b() == -1) || (this.a.b.b.b() == 1))
        return;
      this.a.b.b.c_();
      y.a(new r(this));
      c.a("Could not receive loaded message in a timely manner. Rejecting.");
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.q
 * JD-Core Version:    0.6.0
 */