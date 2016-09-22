package com.google.android.gms.ads.internal.request;

final class d
  implements Runnable
{
  d(c paramc)
  {
  }

  public final void run()
  {
    synchronized (this.a.b)
    {
      if (this.a.e == null)
        return;
      this.a.b();
      this.a.a(2, "Timed out waiting for ad response.");
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.request.d
 * JD-Core Version:    0.6.0
 */