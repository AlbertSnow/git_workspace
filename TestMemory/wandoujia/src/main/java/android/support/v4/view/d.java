package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.f;
import android.support.v4.view.a.o;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;

class d
{
  private static Field a;
  private static boolean b;

  static void a(LayoutInflater paramLayoutInflater, aa paramaa)
  {
    if (paramaa != null);
    for (z localz = new z(paramaa); ; localz = null)
    {
      paramLayoutInflater.setFactory2(localz);
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if (!(localFactory instanceof LayoutInflater.Factory2))
        break;
      a(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
      return;
    }
    a(paramLayoutInflater, localz);
  }

  private static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!b);
    try
    {
      Field localField = LayoutInflater.class.getDeclaredField("mFactory2");
      a = localField;
      localField.setAccessible(true);
      b = true;
      if (a == null);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      try
      {
        a.set(paramLayoutInflater, paramFactory2);
        return;
        localNoSuchFieldException = localNoSuchFieldException;
        new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ").append(LayoutInflater.class.getName()).append("; inflation may have unexpected results.");
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ").append(paramLayoutInflater).append("; inflation may have unexpected results.");
      }
    }
  }

  public o a(Object paramObject, View paramView)
  {
    return null;
  }

  public Object a()
  {
    return null;
  }

  public Object a(a parama)
  {
    return null;
  }

  public void a(Object paramObject, View paramView, int paramInt)
  {
  }

  public void a(Object paramObject, View paramView, f paramf)
  {
  }

  public boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }

  public boolean a(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }

  public boolean a(Object paramObject, ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }

  public void b(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }

  public void c(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }

  public void d(Object paramObject, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.d
 * JD-Core Version:    0.6.0
 */