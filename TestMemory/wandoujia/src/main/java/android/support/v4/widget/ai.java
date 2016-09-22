package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.a.f;
import android.support.v4.view.a.w;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

final class ai extends android.support.v4.view.a
{
  public final void a(View paramView, f paramf)
  {
    super.a(paramView, paramf);
    NestedScrollView localNestedScrollView = (NestedScrollView)paramView;
    paramf.b(ScrollView.class.getName());
    if (localNestedScrollView.isEnabled())
    {
      int i = NestedScrollView.a(localNestedScrollView);
      if (i > 0)
      {
        paramf.i(true);
        if (localNestedScrollView.getScrollY() > 0)
          paramf.a(8192);
        if (localNestedScrollView.getScrollY() < i)
          paramf.a(4096);
      }
    }
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    NestedScrollView localNestedScrollView = (NestedScrollView)paramView;
    if (!localNestedScrollView.isEnabled())
      return false;
    switch (paramInt)
    {
    default:
      return false;
    case 4096:
      int k = Math.min(localNestedScrollView.getHeight() - localNestedScrollView.getPaddingBottom() - localNestedScrollView.getPaddingTop() + localNestedScrollView.getScrollY(), NestedScrollView.a(localNestedScrollView));
      if (k != localNestedScrollView.getScrollY())
      {
        localNestedScrollView.a(k);
        return true;
      }
      return false;
    case 8192:
    }
    int i = localNestedScrollView.getHeight() - localNestedScrollView.getPaddingBottom() - localNestedScrollView.getPaddingTop();
    int j = Math.max(localNestedScrollView.getScrollY() - i, 0);
    if (j != localNestedScrollView.getScrollY())
    {
      localNestedScrollView.a(j);
      return true;
    }
    return false;
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    NestedScrollView localNestedScrollView = (NestedScrollView)paramView;
    paramAccessibilityEvent.setClassName(ScrollView.class.getName());
    w localw = android.support.v4.view.a.a.a(paramAccessibilityEvent);
    if (NestedScrollView.a(localNestedScrollView) > 0);
    for (boolean bool = true; ; bool = false)
    {
      localw.a(bool);
      localw.d(localNestedScrollView.getScrollX());
      localw.e(localNestedScrollView.getScrollY());
      localw.f(localNestedScrollView.getScrollX());
      localw.g(NestedScrollView.a(localNestedScrollView));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ai
 * JD-Core Version:    0.6.0
 */