package com.sina.weibo.sdk.auth.sso;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.sina.sso.RemoteSSO;
import com.sina.sso.RemoteSSO.Stub;

final class a
  implements ServiceConnection
{
  a(SsoHandler paramSsoHandler)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    RemoteSSO localRemoteSSO = RemoteSSO.Stub.a(paramIBinder);
    try
    {
      String str1 = localRemoteSSO.a();
      String str2 = localRemoteSSO.b();
      SsoHandler.c(this.a).getApplicationContext().unbindService(SsoHandler.d(this.a));
      if (!SsoHandler.a(this.a, str1, str2))
        SsoHandler.a(this.a).a(SsoHandler.b(this.a));
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    SsoHandler.a(this.a).a(SsoHandler.b(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.auth.sso.a
 * JD-Core Version:    0.6.0
 */