package com.nispok.snackbar;

import android.view.View;
import android.view.View.OnClickListener;
import com.nispok.snackbar.a.a;

final class h
  implements View.OnClickListener
{
  h(Snackbar paramSnackbar)
  {
  }

  public final void onClick(View paramView)
  {
    if ((Snackbar.a(this.a) != null) && (!Snackbar.b(this.a)) && (!Snackbar.c(this.a)))
    {
      Snackbar.a(this.a).a(this.a);
      Snackbar.d(this.a);
    }
    if (Snackbar.e(this.a))
      this.a.g();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.h
 * JD-Core Version:    0.6.0
 */