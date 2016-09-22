package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.f;
import android.support.v4.view.bg;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

final class m extends a
{
  private final Rect b = new Rect();

  m(DrawerLayout paramDrawerLayout)
  {
  }

  public final void a(View paramView, f paramf)
  {
    if (DrawerLayout.c())
      super.a(paramView, paramf);
    while (true)
    {
      paramf.b(DrawerLayout.class.getName());
      paramf.a(false);
      paramf.b(false);
      return;
      f localf = f.a(paramf);
      super.a(paramView, localf);
      paramf.a(paramView);
      ViewParent localViewParent = bg.i(paramView);
      if ((localViewParent instanceof View))
        paramf.c((View)localViewParent);
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
      localf.o();
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = localViewGroup.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = localViewGroup.getChildAt(j);
        if (!DrawerLayout.f(localView))
          continue;
        paramf.b(localView);
      }
    }
  }

  public final boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if ((DrawerLayout.c()) || (DrawerLayout.f(paramView)))
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    return false;
  }

  public final boolean b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      paramAccessibilityEvent.getText();
      View localView = DrawerLayout.a(this.c);
      if (localView != null)
        android.support.v4.view.m.a(this.c.c(localView), bg.h(this.c));
      return true;
    }
    return super.b(paramView, paramAccessibilityEvent);
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.m
 * JD-Core Version:    0.6.0
 */