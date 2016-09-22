package com.google.android.gms.analytics.internal;

final class ac
  implements Runnable
{
  ac(ab paramab, zzac paramzzac)
  {
  }

  public final void run()
  {
    if (!this.b.a.b())
    {
      this.b.a.d("Connected to service after a timeout");
      z.a(this.b.a, this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.ac
 * JD-Core Version:    0.6.0
 */