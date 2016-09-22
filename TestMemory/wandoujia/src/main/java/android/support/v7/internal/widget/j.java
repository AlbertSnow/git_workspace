package android.support.v7.internal.widget;

import android.support.v4.view.bg;
import android.support.v4.view.cu;

final class j
  implements Runnable
{
  j(ActionBarOverlayLayout paramActionBarOverlayLayout)
  {
  }

  public final void run()
  {
    ActionBarOverlayLayout.b(this.a);
    ActionBarOverlayLayout.a(this.a, bg.q(ActionBarOverlayLayout.d(this.a)).c(0.0F).a(ActionBarOverlayLayout.c(this.a)));
    if ((ActionBarOverlayLayout.e(this.a) != null) && (ActionBarOverlayLayout.e(this.a).getVisibility() != 8))
      ActionBarOverlayLayout.b(this.a, bg.q(ActionBarOverlayLayout.e(this.a)).c(0.0F).a(ActionBarOverlayLayout.f(this.a)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.j
 * JD-Core Version:    0.6.0
 */