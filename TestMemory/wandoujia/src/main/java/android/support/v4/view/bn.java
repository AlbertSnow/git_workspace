package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class bn extends bm
{
  public final void a(View paramView, Paint paramPaint)
  {
    paramView.setLayerPaint(paramPaint);
  }

  public final void d(View paramView, int paramInt)
  {
    paramView.setLabelFor(paramInt);
  }

  public final void e(View paramView, int paramInt)
  {
    paramView.setLayoutDirection(paramInt);
  }

  public final int h(View paramView)
  {
    return paramView.getLayoutDirection();
  }

  public final int v(View paramView)
  {
    return paramView.getWindowSystemUiVisibility();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bn
 * JD-Core Version:    0.6.0
 */