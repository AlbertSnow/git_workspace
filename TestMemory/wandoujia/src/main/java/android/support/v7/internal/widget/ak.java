package android.support.v7.internal.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class ak
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  ak(SpinnerCompat paramSpinnerCompat)
  {
  }

  public final void onGlobalLayout()
  {
    if (!SpinnerCompat.a(this.a).b())
      SpinnerCompat.a(this.a).c();
    ViewTreeObserver localViewTreeObserver = this.a.getViewTreeObserver();
    if (localViewTreeObserver != null)
      localViewTreeObserver.removeGlobalOnLayoutListener(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ak
 * JD-Core Version:    0.6.0
 */