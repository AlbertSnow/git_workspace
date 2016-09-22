package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.a.f;
import android.support.v4.view.a.o;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a
{
  private static final d b;
  private static final Object c;
  final Object a = b.a(this);

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
      b = new e();
    while (true)
    {
      c = b.a();
      return;
      if (Build.VERSION.SDK_INT >= 14)
      {
        b = new b();
        continue;
      }
      b = new d();
    }
  }

  public static o a(View paramView)
  {
    return b.a(c, paramView);
  }

  public static void a(View paramView, int paramInt)
  {
    b.a(c, paramView, paramInt);
  }

  public static void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.d(c, paramView, paramAccessibilityEvent);
  }

  public static void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.c(c, paramView, paramAccessibilityEvent);
  }

  public void a(View paramView, f paramf)
  {
    b.a(c, paramView, paramf);
  }

  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return b.a(c, paramView, paramInt, paramBundle);
  }

  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return b.a(c, paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public boolean b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return b.a(c, paramView, paramAccessibilityEvent);
  }

  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b(c, paramView, paramAccessibilityEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a
 * JD-Core Version:    0.6.0
 */