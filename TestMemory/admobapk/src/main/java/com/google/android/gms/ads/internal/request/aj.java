package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.js.aa;

final class aj
  implements Runnable
{
  aj(ae paramae)
  {
  }

  public final void run()
  {
    if (this.a.d != null)
    {
      this.a.d.a_();
      this.a.d = null;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.aj
 * JD-Core Version:    0.6.0
 */