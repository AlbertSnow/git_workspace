package android.support.v4.view;

import android.view.View;

class bo extends bn
{
  public final boolean B(View paramView)
  {
    return paramView.isLaidOut();
  }

  public final boolean C(View paramView)
  {
    return paramView.isAttachedToWindow();
  }

  public final void c(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(paramInt);
  }

  public final void f(View paramView, int paramInt)
  {
    paramView.setAccessibilityLiveRegion(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bo
 * JD-Core Version:    0.6.0
 */