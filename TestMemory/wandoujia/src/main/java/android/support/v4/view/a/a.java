package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a
{
  private static final d a;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new b();
      return;
    }
    a = new d();
  }

  public static w a(AccessibilityEvent paramAccessibilityEvent)
  {
    return new w(paramAccessibilityEvent);
  }

  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    a.a(paramAccessibilityEvent, paramInt);
  }

  public static int b(AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(paramAccessibilityEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.a
 * JD-Core Version:    0.6.0
 */