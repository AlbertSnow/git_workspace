package com.google.android.gms.analytics.internal;

import android.os.Looper;
import com.google.android.gms.internal.z;

final class av
  implements Runnable
{
  av(au paramau)
  {
  }

  public final void run()
  {
    if (Looper.myLooper() == Looper.getMainLooper())
      au.a(this.a).g().a(this);
    boolean bool;
    do
    {
      return;
      bool = this.a.c();
      au.b(this.a);
    }
    while (!bool);
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.av
 * JD-Core Version:    0.6.0
 */