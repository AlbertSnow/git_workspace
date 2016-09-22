package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class au
{
  final Handler a;

  public au(Handler paramHandler)
  {
    this.a = paramHandler;
  }

  public final void a(Runnable paramRunnable)
  {
    this.a.removeCallbacks(paramRunnable);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.au
 * JD-Core Version:    0.6.0
 */