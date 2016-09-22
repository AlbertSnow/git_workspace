package com.unionpay.pboctransaction.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.unionpay.mobile.tsm.connect.IRemoteApdu;
import com.unionpay.mobile.tsm.connect.IRemoteApdu.Stub;

final class b
  implements ServiceConnection
{
  b(a parama)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    try
    {
      a.a(this.a, IRemoteApdu.Stub.a(paramIBinder));
      a.b(this.a).registerCallback(a.a(this.a));
      a.b(this.a).init();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (this.a.a == null);
      this.a.a.b();
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    a.a(this.a, null);
    if (this.a.a != null)
      this.a.a.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.a.b
 * JD-Core Version:    0.6.0
 */