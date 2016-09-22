package com.wandoujia.jupiter.update;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.a;

final class n
  implements ServiceConnection
{
  n(m paramm)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    m.a(this.a, ((a)paramIBinder).a());
    m.a(this.a).a(this.a);
    m.a(this.a).d();
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    m.a(this.a, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.n
 * JD-Core Version:    0.6.0
 */