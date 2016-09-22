package com.alipay.android.app;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class j
  implements ServiceConnection
{
  j(i parami)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (i.a)
    {
      i.a(this.a, IAlixPay.Stub.a(paramIBinder));
      i.a.notify();
      return;
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    i.a(this.a, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.j
 * JD-Core Version:    0.6.0
 */