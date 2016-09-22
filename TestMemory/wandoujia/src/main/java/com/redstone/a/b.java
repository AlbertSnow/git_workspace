package com.redstone.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.redstone.sdk.enabler.remote.IRsSystemService.Stub;

final class b
  implements ServiceConnection
{
  b(a parama)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    a.a(this.a, IRsSystemService.Stub.a(paramIBinder));
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    a.a(this.a, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.redstone.a.b
 * JD-Core Version:    0.6.0
 */