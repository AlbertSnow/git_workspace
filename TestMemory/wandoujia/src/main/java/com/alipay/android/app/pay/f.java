package com.alipay.android.app.pay;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v4.app.b;

final class f
  implements ServiceConnection
{
  f(PayTask paramPayTask)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (PayTask.b(this.a))
    {
      PayTask.a(this.a, IAlixPay.Stub.a(paramIBinder));
      b.f();
      PayTask.b(this.a).notify();
      return;
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    PayTask.a(this.a, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.pay.f
 * JD-Core Version:    0.6.0
 */