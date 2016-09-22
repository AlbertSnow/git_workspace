package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

final class g
{
  public static void a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable instanceof h))
      ((h)paramDrawable).setTint(paramInt);
  }

  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    if ((paramDrawable instanceof h))
      ((h)paramDrawable).setTintList(paramColorStateList);
  }

  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    if ((paramDrawable instanceof h))
      ((h)paramDrawable).setTintMode(paramMode);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.a.a.g
 * JD-Core Version:    0.6.0
 */