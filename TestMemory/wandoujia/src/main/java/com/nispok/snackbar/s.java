package com.nispok.snackbar;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;

final class s
  implements Runnable
{
  s(Snackbar paramSnackbar, ViewGroup paramViewGroup, boolean paramBoolean)
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
        this.a.a(this.b, this.c);
        return;
      }
      localSnackbar.g();
    }
    q.a(new WeakReference(this.a));
    this.a.b(this.b, this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.s
 * JD-Core Version:    0.6.0
 */