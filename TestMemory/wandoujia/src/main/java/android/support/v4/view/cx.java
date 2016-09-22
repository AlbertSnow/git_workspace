package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

class cx extends cv
{
  public final void a(cu paramcu, View paramView)
  {
    paramView.animate().scaleY(1.0F);
  }

  public final void a(cu paramcu, View paramView, float paramFloat)
  {
    paramView.animate().alpha(paramFloat);
  }

  public void a(cu paramcu, View paramView, dh paramdh)
  {
    paramView.setTag(2113929216, paramdh);
    cy localcy = new cy(paramcu);
    paramView.animate().setListener(new de(localcy, paramView));
  }

  public final void a(View paramView)
  {
    paramView.animate().setStartDelay(75L);
  }

  public final void a(View paramView, long paramLong)
  {
    paramView.animate().setDuration(paramLong);
  }

  public final void a(View paramView, Interpolator paramInterpolator)
  {
    paramView.animate().setInterpolator(paramInterpolator);
  }

  public final void b(cu paramcu, View paramView)
  {
    paramView.animate().cancel();
  }

  public final void b(cu paramcu, View paramView, float paramFloat)
  {
    paramView.animate().translationX(paramFloat);
  }

  public final void b(View paramView)
  {
    paramView.animate().start();
  }

  public final void c(cu paramcu, View paramView, float paramFloat)
  {
    paramView.animate().translationY(paramFloat);
  }

  public final void d(cu paramcu, View paramView, float paramFloat)
  {
    paramView.animate().y(paramFloat);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.cx
 * JD-Core Version:    0.6.0
 */