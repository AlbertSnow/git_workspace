package com.wandoujia.update.aidl;

import android.os.IInterface;
import com.wandoujia.update.protocol.UpdateInfo;

public abstract interface IUpdateRemoteService extends IInterface
{
  public abstract void a();

  public abstract void a(IUpdateCallback paramIUpdateCallback, UpdateParams paramUpdateParams);

  public abstract void a(UpdateInfo paramUpdateInfo, UpdateParams paramUpdateParams);

  public abstract void b();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.aidl.IUpdateRemoteService
 * JD-Core Version:    0.6.0
 */