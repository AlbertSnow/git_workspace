package android.support.v7.internal.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

final class f extends e
{
  public f(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }

  public final void getOutline(Outline paramOutline)
  {
    if (this.a.d)
      if (this.a.c != null)
        this.a.c.getOutline(paramOutline);
    do
      return;
    while (this.a.a == null);
    this.a.a.getOutline(paramOutline);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.f
 * JD-Core Version:    0.6.0
 */