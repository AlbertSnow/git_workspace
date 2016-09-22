package com.wandoujia.ripple_framework.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

final class m
  implements Drawable.Callback
{
  m(j paramj)
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

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.m
 * JD-Core Version:    0.6.0
 */