package android.support.v4.view;

import android.support.v4.view.a.f;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class c
  implements g
{
  private static Field b;
  private static boolean c;
  private static Field d;
  private static boolean e;
  private static Method f;

  c(a parama)
  {
  }

  static int a(View paramView)
  {
    if (!c);
    try
    {
      Field localField = View.class.getDeclaredField("mMinWidth");
      b = localField;
      localField.setAccessible(true);
      label26: c = true;
      if (b != null)
        try
        {
          int i = ((Integer)b.get(paramView)).intValue();
          return i;
        }
        catch (Exception localException)
        {
        }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label26;
    }
  }

  public static void a(ViewGroup paramViewGroup)
  {
    if (f == null);
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      f = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", arrayOfClass);
      label31: f.setAccessible(true);
      try
      {
        Method localMethod = f;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(true);
        localMethod.invoke(paramViewGroup, arrayOfObject);
        return;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        return;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        return;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label31;
    }
  }

  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    try
    {
      boolean bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
      return bool;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedPreFling");
    }
    return false;
  }

  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    try
    {
      boolean bool = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
      return bool;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onNestedFling");
    }
    return false;
  }

  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      boolean bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
      return bool;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      new StringBuilder("ViewParent ").append(paramViewParent).append(" does not implement interface method onStartNestedScroll");
    }
    return false;
  }

  static int b(View paramView)
  {
    if (!e);
    try
    {
      Field localField = View.class.getDeclaredField("mMinHeight");
      d = localField;
      localField.setAccessible(true);
      label26: e = true;
      if (d != null)
        try
        {
          int i = ((Integer)d.get(paramView)).intValue();
          return i;
        }
        catch (Exception localException)
        {
        }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label26;
    }
  }

  public final void a(View paramView, int paramInt)
  {
    a.a(paramView, paramInt);
  }

  public final void a(View paramView, Object paramObject)
  {
    this.a.a(paramView, new f(paramObject));
  }

  public final boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.b(paramView, paramAccessibilityEvent);
  }

  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.a(paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public final void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.d(paramView, paramAccessibilityEvent);
  }

  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.c(paramView, paramAccessibilityEvent);
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.a(paramView, paramAccessibilityEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.c
 * JD-Core Version:    0.6.0
 */