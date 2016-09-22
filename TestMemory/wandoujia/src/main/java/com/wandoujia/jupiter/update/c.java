package com.wandoujia.jupiter.update;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.wandoujia.update.LocalUpdateService;

final class c
  implements ServiceConnection
{
  c(a parama)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (!(paramIBinder instanceof com.wandoujia.update.a))
      return;
    a.a(this.a, ((com.wandoujia.update.a)paramIBinder).a());
    a.b(this.a).a(this.a);
    a.b(this.a).d();
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    a.a(this.a, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.c
 * JD-Core Version:    0.6.0
 */