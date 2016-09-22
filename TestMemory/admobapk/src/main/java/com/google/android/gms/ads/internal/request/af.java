package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.js.aa;

final class af
  implements Runnable
{
  af(ae paramae, com.google.android.gms.ads.internal.state.b paramb)
  {
  }

  public final void run()
  {
    this.b.c.a(this.a);
    if (this.b.d != null)
    {
      this.b.d.a_();
      this.b.d = null;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.af
 * JD-Core Version:    0.6.0
 */