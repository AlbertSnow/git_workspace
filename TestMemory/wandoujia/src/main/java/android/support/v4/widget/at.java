package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.support.v4.view.bg;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

final class at extends a
{
  private final Rect b = new Rect();

  at(SlidingPaneLayout paramSlidingPaneLayout)
  {
  }

  private boolean b(View paramView)
  {
    return this.c.b(paramView);
  }

  public final void a(View paramView, f paramf)
  {
    f localf = f.a(paramf);
    super.a(paramView, localf);
    Rect localRect = this.b;
    localf.a(localRect);
    paramf.b(localRect);
    localf.c(localRect);
    paramf.d(localRect);
    paramf.c(localf.f());
    paramf.a(localf.l());
    paramf.b(localf.m());
    paramf.c(localf.n());
    paramf.h(localf.k());
    paramf.f(localf.i());
    paramf.a(localf.d());
    paramf.b(localf.e());
    paramf.d(localf.g());
    paramf.e(localf.h());
    paramf.g(localf.j());
    paramf.a(localf.b());
    paramf.b(localf.c());
    localf.o();
    paramf.b(SlidingPaneLayout.class.getName());
    paramf.a(paramView);
    ViewParent localViewParent = bg.i(paramView);
    if ((localViewParent instanceof View))
      paramf.c((View)localViewParent);
    int i = this.c.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = this.c.getChildAt(j);
      if ((b(localView)) || (localView.getVisibility() != 0))
        continue;
      bg.c(localView, 1);
      paramf.b(localView);
    }
  }

  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!b(paramView))
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    return false;
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.at
 * JD-Core Version:    0.6.0
 */