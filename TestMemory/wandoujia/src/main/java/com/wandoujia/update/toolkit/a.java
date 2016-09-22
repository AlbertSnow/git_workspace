package com.wandoujia.update.toolkit;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.wandoujia.update.LocalUpdateService;

final class a
  implements ServiceConnection
{
  a(UpdateClient paramUpdateClient)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    UpdateClient.a(this.a, ((com.wandoujia.update.a)paramIBinder).a());
    UpdateClient.a(this.a).a(this.a);
    UpdateClient.a(this.a).d();
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    UpdateClient.a(this.a, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.update.toolkit.a
 * JD-Core Version:    0.6.0
 */