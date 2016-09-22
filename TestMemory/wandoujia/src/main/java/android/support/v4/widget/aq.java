package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

final class aq
  implements ap
{
  public final Object a(Context paramContext, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
      return new Scroller(paramContext, paramInterpolator);
    return new Scroller(paramContext);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    ((Scroller)paramObject).startScroll(paramInt1, paramInt2, 0, paramInt3);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ((Scroller)paramObject).fling(0, 0, paramInt1, paramInt2, paramInt3, paramInt4, -2147483648, 2147483647);
  }

  public final void a(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ((Scroller)paramObject).startScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public final boolean a(Object paramObject)
  {
    return ((Scroller)paramObject).isFinished();
  }

  public final int b(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrX();
  }

  public final void b(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ((Scroller)paramObject).fling(paramInt1, paramInt2, 0, paramInt3, 0, 0, 0, paramInt4);
  }

  public final int c(Object paramObject)
  {
    return ((Scroller)paramObject).getCurrY();
  }

  public final float d(Object paramObject)
  {
    return 0.0F;
  }

  public final boolean e(Object paramObject)
  {
    return ((Scroller)paramObject).computeScrollOffset();
  }

  public final void f(Object paramObject)
  {
    ((Scroller)paramObject).abortAnimation();
  }

  public final int g(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalX();
  }

  public final int h(Object paramObject)
  {
    return ((Scroller)paramObject).getFinalY();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.aq
 * JD-Core Version:    0.6.0
 */