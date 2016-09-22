package com.google.android.gms.ads.internal.util;

import android.os.Process;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.state.h;
import com.google.android.gms.ads.internal.util.future.a;
import java.util.concurrent.Callable;

final class v
  implements Runnable
{
  v(a parama, Callable paramCallable)
  {
  }

  public final void run()
  {
    try
    {
      Process.setThreadPriority(10);
      this.a.b(this.b.call());
      return;
    }
    catch (Exception localException)
    {
      bc.a().h.a(localException, true);
      this.a.cancel(true);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.v
 * JD-Core Version:    0.6.0
 */