package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.o;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

final class h extends View.AccessibilityDelegate
{
  h(i parami)
  {
  }

  public final boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.a(paramView, paramAccessibilityEvent);
  }

  public final AccessibilityNodeProvider getAccessibilityNodeProvider(View paramView)
  {
    o localo = a.a(paramView);
    if (localo != null);
    for (Object localObject = localo.a(); ; localObject = null)
      return (AccessibilityNodeProvider)localObject;
  }

  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    this.a.b(paramView, paramAccessibilityEvent);
  }

  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.a.a(paramView, paramAccessibilityNodeInfo);
  }

  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.c(paramView, paramAccessibilityEvent);
  }

  public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return this.a.a(paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return this.a.a(paramView, paramInt, paramBundle);
  }

  public final void sendAccessibilityEvent(View paramView, int paramInt)
  {
    a.a(paramView, paramInt);
  }

  public final void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    a.a(paramView, paramAccessibilityEvent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.h
 * JD-Core Version:    0.6.0
 */