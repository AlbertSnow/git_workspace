package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

class j extends i
{
  public final void b(Object paramObject, int paramInt)
  {
    ((AccessibilityNodeInfo)paramObject).setMovementGranularities(paramInt);
  }

  public final int c(Object paramObject)
  {
    return ((AccessibilityNodeInfo)paramObject).getMovementGranularities();
  }

  public final void c(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityNodeInfo)paramObject).setVisibleToUser(paramBoolean);
  }

  public final void d(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityNodeInfo)paramObject).setAccessibilityFocused(paramBoolean);
  }

  public final boolean h(Object paramObject)
  {
    return ((AccessibilityNodeInfo)paramObject).isVisibleToUser();
  }

  public final boolean i(Object paramObject)
  {
    return ((AccessibilityNodeInfo)paramObject).isAccessibilityFocused();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.a.j
 * JD-Core Version:    0.6.0
 */