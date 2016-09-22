package android.support.v4.a.a;

import android.graphics.drawable.Drawable;

class c extends b
{
  public final void a(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }

  public Drawable c(Drawable paramDrawable)
  {
    if (!(paramDrawable instanceof j))
      paramDrawable = new j(paramDrawable);
    return paramDrawable;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.a.a.c
 * JD-Core Version:    0.6.0
 */