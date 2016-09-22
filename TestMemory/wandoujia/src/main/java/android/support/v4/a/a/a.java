package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public final class a
{
  private static b a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 22)
    {
      a = new f();
      return;
    }
    if (i >= 21)
    {
      a = new e();
      return;
    }
    if (i >= 19)
    {
      a = new d();
      return;
    }
    if (i >= 11)
    {
      a = new c();
      return;
    }
    a = new b();
  }

  public static void a(Drawable paramDrawable)
  {
    a.a(paramDrawable);
  }

  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    a.a(paramDrawable, paramFloat1, paramFloat2);
  }

  public static void a(Drawable paramDrawable, int paramInt)
  {
    a.a(paramDrawable, paramInt);
  }

  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    a.a(paramDrawable, paramColorStateList);
  }

  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    a.a(paramDrawable, paramMode);
  }

  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    a.a(paramDrawable, paramBoolean);
  }

  public static boolean b(Drawable paramDrawable)
  {
    return a.b(paramDrawable);
  }

  public static Drawable c(Drawable paramDrawable)
  {
    return a.c(paramDrawable);
  }

  public static <T extends Drawable> T d(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof h))
      paramDrawable = ((h)paramDrawable).a();
    return paramDrawable;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.a.a.a
 * JD-Core Version:    0.6.0
 */