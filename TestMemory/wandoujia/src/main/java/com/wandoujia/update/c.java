package com.wandoujia.update;

import android.os.Handler;
import android.os.Message;
import com.wandoujia.update.aidl.IUpdateCallback.Stub;
import com.wandoujia.update.protocol.UpdateInfo;

final class c extends IUpdateCallback.Stub
{
  c(LocalUpdateService paramLocalUpdateService)
  {
  }

  public final void a()
  {
    LocalUpdateService.b(this.a).obtainMessage(2).sendToTarget();
  }

  public final void a(int paramInt)
  {
    LocalUpdateService.b(this.a).obtainMessage(3, paramInt, 0).sendToTarget();
  }

  public final void a(UpdateInfo paramUpdateInfo)
  {
    LocalUpdateService.a(this.a, paramUpdateInfo);
    LocalUpdateService.b(this.a).obtainMessage(1, paramUpdateInfo).sendToTarget();
  }

  public final void a(UpdateInfo paramUpdateInfo, String paramString)
  {
    LocalUpdateService.a(this.a, paramUpdateInfo);
    LocalUpdateService.a(this.a, paramString);
    LocalUpdateService.h();
    LocalUpdateService.b(this.a).obtainMessage(4).sendToTarget();
  }

  public final void a(boolean paramBoolean)
  {
    Handler localHandler = LocalUpdateService.b(this.a);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localHandler.obtainMessage(5, i, 0).sendToTarget();
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.c
 * JD-Core Version:    0.6.0
 */