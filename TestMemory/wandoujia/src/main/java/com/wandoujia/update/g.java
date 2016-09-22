package com.wandoujia.update;

import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.update.aidl.UpdateParams;

final class g
  implements Runnable
{
  g(RemoteUpdateService paramRemoteUpdateService)
  {
  }

  public final void run()
  {
    if ((!RemoteUpdateService.e(this.a)) || (RemoteUpdateService.f(this.a) == 0))
    {
      if (NetworkUtil.isNetworkConnected(this.a.getApplicationContext()))
        break label56;
      Log.d(RemoteUpdateService.a(), "Network is not connected", new Object[0]);
      RemoteUpdateService.a(this.a, 5000L);
    }
    label56: 
    do
    {
      return;
      RemoteUpdateService.g(this.a);
      RemoteUpdateService.a(this.a, true);
    }
    while ((RemoteUpdateService.b(this.a) == null) || (RemoteUpdateService.a(this.a) == null));
    RemoteUpdateService.a(this.a).a(RemoteUpdateService.b(this.a).checkUpdateProtocol, RemoteUpdateService.h(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.g
 * JD-Core Version:    0.6.0
 */