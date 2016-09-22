package com.wandoujia.update;

import android.app.NotificationManager;
import android.os.RemoteException;
import com.wandoujia.base.log.Log;
import com.wandoujia.update.aidl.IUpdateCallback;
import com.wandoujia.update.protocol.UpdateInfo;

public final class r
{
  private int a = -1;

  r(RemoteUpdateService paramRemoteUpdateService)
  {
  }

  public final void a(int paramInt)
  {
    if (this.a != paramInt)
    {
      this.a = paramInt;
      String str = RemoteUpdateService.a();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      Log.d(str, String.format("onDownloadInstallerProgress() %d%%", arrayOfObject), new Object[0]);
      if (RemoteUpdateService.i(this.b) == null);
    }
    try
    {
      RemoteUpdateService.i(this.b).a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public final void a(UpdateInfo paramUpdateInfo, String paramString)
  {
    Log.d(RemoteUpdateService.a(), "onDownloadInstallerSuccess()", new Object[0]);
    ((NotificationManager)this.b.getSystemService("notification")).cancel(408);
    if (RemoteUpdateService.i(this.b) != null);
    try
    {
      RemoteUpdateService.i(this.b).a(paramUpdateInfo, paramString);
      RemoteUpdateService.k(this.b);
      return;
    }
    catch (RemoteException localRemoteException1)
    {
      while (true)
        try
        {
          RemoteUpdateService.l(this.b).a(paramUpdateInfo, paramString);
        }
        catch (RemoteException localRemoteException2)
        {
        }
    }
  }

  public final void a(boolean paramBoolean)
  {
    Log.d(RemoteUpdateService.a(), "onDownloadInstallerFailed()", new Object[0]);
    if (RemoteUpdateService.i(this.b) != null);
    try
    {
      RemoteUpdateService.i(this.b).a(paramBoolean);
      RemoteUpdateService.k(this.b);
      return;
    }
    catch (RemoteException localRemoteException1)
    {
      while (true)
      {
        RemoteUpdateService.a(this.b, false);
        try
        {
          RemoteUpdateService.l(this.b).a(paramBoolean);
        }
        catch (RemoteException localRemoteException2)
        {
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.r
 * JD-Core Version:    0.6.0
 */