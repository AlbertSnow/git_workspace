package com.nispok.snackbar;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class k
  implements ViewTreeObserver.OnPreDrawListener
{
  k(Snackbar paramSnackbar)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.k
 * JD-Core Version:    0.6.0
 */