package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.bg;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ba
{
  private static Method a;

  static
  {
    if (Build.VERSION.SDK_INT >= 18);
    try
    {
      Method localMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
      a = localMethod;
      if (!localMethod.isAccessible())
        a.setAccessible(true);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
  }

  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }

  public static void a(View paramView, Rect paramRect1, Rect paramRect2)
  {
    if (a != null);
    try
    {
      a.invoke(paramView, new Object[] { paramRect1, paramRect2 });
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static boolean a(View paramView)
  {
    return bg.h(paramView) == 1;
  }

  public static void b(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16);
    try
    {
      Method localMethod = paramView.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
      if (!localMethod.isAccessible())
        localMethod.setAccessible(true);
      localMethod.invoke(paramView, new Object[0]);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ba
 * JD-Core Version:    0.6.0
 */