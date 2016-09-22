package android.support.v4.a.a;

import android.graphics.drawable.Drawable;

class d extends c
{
  public final void a(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }

  public final boolean b(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }

  public Drawable c(Drawable paramDrawable)
  {
    if (!(paramDrawable instanceof k))
      paramDrawable = new k(paramDrawable);
    return paramDrawable;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.a.a.d
 * JD-Core Version:    0.6.0
 */