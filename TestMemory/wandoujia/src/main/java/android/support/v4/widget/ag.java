package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

final class ag
  implements Drawable.Callback
{
  ag(ad paramad)
  {
  }

  public final void invalidateDrawable(Drawable paramDrawable)
  {
    this.a.invalidateSelf();
  }

  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    this.a.scheduleSelf(paramRunnable, paramLong);
  }

  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    this.a.unscheduleSelf(paramRunnable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ag
 * JD-Core Version:    0.6.0
 */