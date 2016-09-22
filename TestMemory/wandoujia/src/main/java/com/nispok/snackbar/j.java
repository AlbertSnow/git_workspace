package com.nispok.snackbar;

import android.view.View;
import com.nispok.snackbar.a.d;

final class j
  implements d
{
  j(Snackbar paramSnackbar)
  {
  }

  public final void a(View paramView)
  {
    if (paramView != null)
      Snackbar.g(this.a);
  }

  public final void a(boolean paramBoolean)
  {
    if (Snackbar.h(this.a))
      return;
    if (paramBoolean)
    {
      this.a.removeCallbacks(Snackbar.i(this.a));
      Snackbar.a(this.a, System.currentTimeMillis());
      return;
    }
    Snackbar.b(this.a, Snackbar.j(this.a) - Snackbar.k(this.a));
    Snackbar.c(this.a, Snackbar.l(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.j
 * JD-Core Version:    0.6.0
 */