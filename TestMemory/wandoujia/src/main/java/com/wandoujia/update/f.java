package com.wandoujia.update;

import android.content.Intent;
import android.os.RemoteException;
import android.support.v4.app.d;
import com.wandoujia.update.aidl.IUpdateCallback.Stub;
import com.wandoujia.update.aidl.IUpdateRemoteService.Stub;
import com.wandoujia.update.protocol.EventReportProtocol.EventStatus;
import com.wandoujia.update.protocol.EventReportProtocol.EventType;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.toolkit.g;

final class f extends IUpdateCallback.Stub
{
  f(RemoteUpdateService paramRemoteUpdateService)
  {
  }

  public final void a()
  {
  }

  public final void a(int paramInt)
  {
  }

  public final void a(UpdateInfo paramUpdateInfo)
  {
  }

  public final void a(UpdateInfo paramUpdateInfo, String paramString)
  {
    Intent localIntent = d.a(this.a.getApplicationContext(), RemoteUpdateService.class, paramString);
    g.a(this.a.getApplicationContext(), localIntent, paramUpdateInfo, true);
    RemoteUpdateService.a(this.a).a(EventReportProtocol.EventType.NOTIFICATION_SHOW, EventReportProtocol.EventStatus.OK, null, null);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean);
    try
    {
      RemoteUpdateService.b(this.a).downloadInstallerOnlyOnWifi = false;
      RemoteUpdateService.d(this.a).a(RemoteUpdateService.c(this.a), RemoteUpdateService.b(this.a));
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.f
 * JD-Core Version:    0.6.0
 */