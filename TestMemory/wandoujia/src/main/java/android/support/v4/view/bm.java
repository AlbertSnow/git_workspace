package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class bm extends bl
{
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }

  public final void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }

  public void c(View paramView, int paramInt)
  {
    if (paramInt == 4)
      paramInt = 2;
    paramView.setImportantForAccessibility(paramInt);
  }

  public final boolean c(View paramView)
  {
    return paramView.hasTransientState();
  }

  public final void d(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }

  public final int e(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }

  public final ViewParent i(View paramView)
  {
    return paramView.getParentForAccessibility();
  }

  public final int q(View paramView)
  {
    return paramView.getMinimumWidth();
  }

  public final int r(View paramView)
  {
    return paramView.getMinimumHeight();
  }

  public void w(View paramView)
  {
    paramView.requestFitSystemWindows();
  }

  public final boolean x(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bm
 * JD-Core Version:    0.6.0
 */