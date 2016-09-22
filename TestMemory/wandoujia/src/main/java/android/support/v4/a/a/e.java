package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

class e extends d
{
  public final void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    paramDrawable.setHotspot(paramFloat1, paramFloat2);
  }

  public final void a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable instanceof l))
    {
      g.a(paramDrawable, paramInt);
      return;
    }
    paramDrawable.setTint(paramInt);
  }

  public final void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    if ((paramDrawable instanceof l))
    {
      g.a(paramDrawable, paramColorStateList);
      return;
    }
    paramDrawable.setTintList(paramColorStateList);
  }

  public final void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    if ((paramDrawable instanceof l))
    {
      g.a(paramDrawable, paramMode);
      return;
    }
    paramDrawable.setTintMode(paramMode);
  }

  public Drawable c(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof GradientDrawable))
      paramDrawable = new l(paramDrawable);
    return paramDrawable;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.a.a.e
 * JD-Core Version:    0.6.0
 */