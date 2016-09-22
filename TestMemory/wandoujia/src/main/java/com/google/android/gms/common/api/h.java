package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class h
  implements Runnable
{
  h(g paramg, ConnectionResult paramConnectionResult)
  {
  }

  public final void run()
  {
    g.a(this.b).lock();
    try
    {
      g.a(this.b, this.a);
      return;
    }
    finally
    {
      g.a(this.b).unlock();
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.h
 * JD-Core Version:    0.6.0
 */