package com.wandoujia.update;

import android.os.Handler;
import android.os.Message;
import com.wandoujia.update.aidl.IUpdateCallback;
import com.wandoujia.update.aidl.IUpdateRemoteService.Stub;
import com.wandoujia.update.aidl.UpdateParams;
import com.wandoujia.update.protocol.UpdateInfo;
import java.util.ArrayList;

final class h extends IUpdateRemoteService.Stub
{
  h(RemoteUpdateService paramRemoteUpdateService)
  {
  }

  public final void a()
  {
    RemoteUpdateService.m(this.a).obtainMessage(3).sendToTarget();
  }

  public final void a(IUpdateCallback paramIUpdateCallback, UpdateParams paramUpdateParams)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramIUpdateCallback);
    localArrayList.add(paramUpdateParams);
    RemoteUpdateService.m(this.a).obtainMessage(1, localArrayList).sendToTarget();
  }

  public final void a(UpdateInfo paramUpdateInfo, UpdateParams paramUpdateParams)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramUpdateInfo);
    localArrayList.add(paramUpdateParams);
    RemoteUpdateService.m(this.a).obtainMessage(2, localArrayList).sendToTarget();
  }

  public final void b()
  {
    RemoteUpdateService.m(this.a).obtainMessage(4).sendToTarget();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.h
 * JD-Core Version:    0.6.0
 */