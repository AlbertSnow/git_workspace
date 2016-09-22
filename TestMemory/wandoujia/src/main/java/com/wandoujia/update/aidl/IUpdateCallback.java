package com.wandoujia.update.aidl;

import android.os.IInterface;
import com.wandoujia.update.protocol.UpdateInfo;

public abstract interface IUpdateCallback extends IInterface
{
  public abstract void a();

  public abstract void a(int paramInt);

  public abstract void a(UpdateInfo paramUpdateInfo);

  public abstract void a(UpdateInfo paramUpdateInfo, String paramString);

  public abstract void a(boolean paramBoolean);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.aidl.IUpdateCallback
 * JD-Core Version:    0.6.0
 */