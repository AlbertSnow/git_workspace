package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.f;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public final class i
{
  i(a parama)
  {
  }

  public final void a(View paramView, Object paramObject)
  {
    this.a.a(paramView, new f(paramObject));
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return this.a.a(paramView, paramInt, paramBundle);
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
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.i
 * JD-Core Version:    0.6.0
 */