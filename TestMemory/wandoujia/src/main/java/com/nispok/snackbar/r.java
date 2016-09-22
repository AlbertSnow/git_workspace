package com.nispok.snackbar;

import android.app.Activity;
import java.lang.ref.WeakReference;

final class r
  implements Runnable
{
  r(Snackbar paramSnackbar, Activity paramActivity)
  {
  }

  public final void run()
  {
    Snackbar localSnackbar = q.b();
    if (localSnackbar != null)
    {
      if ((localSnackbar.j()) && (!localSnackbar.k()))
      {
        localSnackbar.e();
        localSnackbar.f();
        q.a(new WeakReference(this.a));
        this.a.d();
        this.a.a(this.b);
        return;
      }
      localSnackbar.g();
    }
    q.a(new WeakReference(this.a));
    this.a.b(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.r
 * JD-Core Version:    0.6.0
 */