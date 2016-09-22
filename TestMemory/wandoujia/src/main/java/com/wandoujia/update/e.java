package com.wandoujia.update;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.wandoujia.base.log.Log;
import com.wandoujia.update.aidl.IUpdateRemoteService;
import com.wandoujia.update.aidl.IUpdateRemoteService.Stub;

final class e
  implements ServiceConnection
{
  public IUpdateRemoteService a = null;

  e(LocalUpdateService paramLocalUpdateService)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.a = IUpdateRemoteService.Stub.a(paramIBinder);
    Log.d(LocalUpdateService.g(), "UpdateServiceConnection.onServiceConnected()", new Object[0]);
    LocalUpdateService.a(this.b);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    Log.d(LocalUpdateService.g(), "UpdateServiceConnection.onServiceDisconnected()", new Object[0]);
    this.a = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.e
 * JD-Core Version:    0.6.0
 */