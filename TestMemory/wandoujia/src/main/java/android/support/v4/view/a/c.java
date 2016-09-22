package android.support.v4.view.a;

import android.view.accessibility.AccessibilityEvent;

final class c extends b
{
  public final int a(AccessibilityEvent paramAccessibilityEvent)
  {
    return paramAccessibilityEvent.getContentChangeTypes();
  }

  public final void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    paramAccessibilityEvent.setContentChangeTypes(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.c
 * JD-Core Version:    0.6.0
 */