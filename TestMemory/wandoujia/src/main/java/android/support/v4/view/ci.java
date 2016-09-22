package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.f;
import android.support.v4.view.a.w;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class ci extends a
{
  ci(ViewPager paramViewPager)
  {
  }

  private boolean a()
  {
    return (ViewPager.b(this.b) != null) && (ViewPager.b(this.b).a() > 1);
  }

  public final void a(View paramView, f paramf)
  {
    super.a(paramView, paramf);
    paramf.b(ViewPager.class.getName());
    paramf.i(a());
    if (this.b.canScrollHorizontally(1))
      paramf.a(4096);
    if (this.b.canScrollHorizontally(-1))
      paramf.a(8192);
  }

  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 4096:
      if (this.b.canScrollHorizontally(1))
      {
        this.b.setCurrentItem(1 + ViewPager.c(this.b));
        return true;
      }
      return false;
    case 8192:
    }
    if (this.b.canScrollHorizontally(-1))
    {
      this.b.setCurrentItem(-1 + ViewPager.c(this.b));
      return true;
    }
    return false;
  }

  public final void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    w localw = w.a();
    localw.a(a());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.b(this.b) != null))
    {
      localw.a(ViewPager.b(this.b).a());
      localw.b(ViewPager.c(this.b));
      localw.c(ViewPager.c(this.b));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.ci
 * JD-Core Version:    0.6.0
 */