package com.wandoujia.p4.connection.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.wandoujia.connection.IConnectionService;
import com.wandoujia.connection.IConnectionService.Stub;
import com.wandoujia.p4.b.l;

final class b
  implements ServiceConnection
{
  b(a parama)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a.a(this.a, IConnectionService.Stub.a(paramIBinder));
    try
    {
      a.b(this.a).a(a.a(this.a));
      a.d();
      a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    a.a(this.a, null);
    l.c().i();
    a.f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.a.b
 * JD-Core Version:    0.6.0
 */