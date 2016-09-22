package com.wandoujia.game_launcher.views;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

final class o
  implements Drawable.Callback
{
  o(l paraml)
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
 * Qualified Name:     com.wandoujia.game_launcher.views.o
 * JD-Core Version:    0.6.0
 */