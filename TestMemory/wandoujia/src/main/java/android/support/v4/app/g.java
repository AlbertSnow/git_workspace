package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class g
  implements ViewTreeObserver.OnPreDrawListener
{
  g(e parame, View paramView, i parami, int paramInt, Object paramObject)
  {
  }

  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    e.a(this.e, this.b, this.c, this.d);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.g
 * JD-Core Version:    0.6.0
 */