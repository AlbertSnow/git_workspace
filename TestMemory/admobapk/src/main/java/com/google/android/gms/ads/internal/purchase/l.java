package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.state.h;

public final class l
  implements ServiceConnection
{
  public l(k paramk, Context paramContext)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    b localb = new b(this.a.getApplicationContext(), false);
    localb.a(paramIBinder);
    int i = localb.a(3, this.a.getPackageName(), "inapp");
    h localh = bc.a().h;
    boolean bool = false;
    if (i == 0)
      bool = true;
    synchronized (localh.a)
    {
      localh.g = bool;
      this.a.unbindService(this);
      localb.a = null;
      return;
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.l
 * JD-Core Version:    0.6.0
 */