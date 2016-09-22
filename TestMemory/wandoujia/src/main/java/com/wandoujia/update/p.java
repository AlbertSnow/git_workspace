package com.wandoujia.update;

import android.os.RemoteException;
import com.wandoujia.base.log.Log;
import com.wandoujia.update.aidl.IUpdateCallback;
import com.wandoujia.update.aidl.UpdateParams;
import com.wandoujia.update.protocol.UpdateInfo;

public final class p
{
  p(RemoteUpdateService paramRemoteUpdateService)
  {
  }

  public final void a()
  {
    Log.d(RemoteUpdateService.a(), "onCheckUpdateFailed()", new Object[0]);
    if (RemoteUpdateService.i(this.a) != null);
    try
    {
      RemoteUpdateService.i(this.a).a();
      label34: RemoteUpdateService.k(this.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label34;
    }
  }

  public final void a(UpdateInfo paramUpdateInfo)
  {
    Log.d(RemoteUpdateService.a(), "onCheckUpdateSuccess()", new Object[0]);
    RemoteUpdateService.a(this.a, paramUpdateInfo);
    if (RemoteUpdateService.i(this.a) != null);
    try
    {
      RemoteUpdateService.i(this.a).a(paramUpdateInfo);
      label44: if (!RemoteUpdateService.a(this.a).a(paramUpdateInfo, RemoteUpdateService.j(this.a), RemoteUpdateService.b(this.a).downloadInstallerOnlyOnWifi))
        RemoteUpdateService.k(this.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label44;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.p
 * JD-Core Version:    0.6.0
 */