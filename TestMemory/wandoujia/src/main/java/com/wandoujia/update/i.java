package com.wandoujia.update;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.wandoujia.update.aidl.IUpdateCallback;
import com.wandoujia.update.aidl.UpdateParams;
import com.wandoujia.update.protocol.EventReportProtocol.EventStatus;
import com.wandoujia.update.protocol.EventReportProtocol.EventType;
import com.wandoujia.update.protocol.UpdateInfo;
import java.util.ArrayList;

final class i extends Handler
{
  public i(RemoteUpdateService paramRemoteUpdateService)
  {
    super(Looper.getMainLooper());
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
      UpdateInfo localUpdateInfo;
      do
      {
        return;
        ArrayList localArrayList2 = (ArrayList)paramMessage.obj;
        RemoteUpdateService.a(this.a, (IUpdateCallback)localArrayList2.get(0));
        RemoteUpdateService.a(this.a, (UpdateParams)localArrayList2.get(1));
        RemoteUpdateService.a(this.a, RemoteUpdateService.b(this.a).updateDelayMs);
        return;
        ArrayList localArrayList1 = (ArrayList)paramMessage.obj;
        localUpdateInfo = (UpdateInfo)localArrayList1.get(0);
        RemoteUpdateService.a(this.a, (UpdateParams)localArrayList1.get(1));
      }
      while (RemoteUpdateService.e(this.a));
      RemoteUpdateService.a(this.a, true);
      RemoteUpdateService.a(this.a).a(localUpdateInfo, RemoteUpdateService.j(this.a), RemoteUpdateService.b(this.a).downloadInstallerOnlyOnWifi);
      return;
    case 3:
      RemoteUpdateService.a(this.a).a(EventReportProtocol.EventType.INSTALL_START, EventReportProtocol.EventStatus.OK, null, null);
      return;
    case 4:
    }
    RemoteUpdateService.a(this.a, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.i
 * JD-Core Version:    0.6.0
 */