package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class bk extends bj
{
  public final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }

  final long a()
  {
    return ValueAnimator.getFrameDelay();
  }

  public final void a(View paramView, float paramFloat)
  {
    paramView.setRotation(paramFloat);
  }

  public final void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }

  public void a(View paramView, Paint paramPaint)
  {
    paramView.setLayerType(paramView.getLayerType(), paramPaint);
    paramView.invalidate();
  }

  public final void a(View paramView, boolean paramBoolean)
  {
    paramView.setActivated(paramBoolean);
  }

  public final void b(View paramView, float paramFloat)
  {
    paramView.setTranslationX(paramFloat);
  }

  public final void c(View paramView, float paramFloat)
  {
    paramView.setTranslationY(paramFloat);
  }

  public final void d(View paramView, float paramFloat)
  {
    paramView.setAlpha(paramFloat);
  }

  public final void e(View paramView, float paramFloat)
  {
    paramView.setRotationX(paramFloat);
  }

  public final float f(View paramView)
  {
    return paramView.getAlpha();
  }

  public final void f(View paramView, float paramFloat)
  {
    paramView.setRotationY(paramFloat);
  }

  public final int g(View paramView)
  {
    return paramView.getLayerType();
  }

  public final void g(View paramView, float paramFloat)
  {
    paramView.setScaleX(paramFloat);
  }

  public final void h(View paramView, float paramFloat)
  {
    paramView.setScaleY(paramFloat);
  }

  public final void i(View paramView, float paramFloat)
  {
    paramView.setPivotX(paramFloat);
  }

  public final int k(View paramView)
  {
    return paramView.getMeasuredWidthAndState();
  }

  public final int l(View paramView)
  {
    return paramView.getMeasuredState();
  }

  public final float m(View paramView)
  {
    return paramView.getTranslationX();
  }

  public final float n(View paramView)
  {
    return paramView.getTranslationY();
  }

  public final float o(View paramView)
  {
    return paramView.getY();
  }

  public final float p(View paramView)
  {
    return paramView.getScaleY();
  }

  public final void t(View paramView)
  {
    paramView.setY(0.0F);
  }

  public final float u(View paramView)
  {
    return paramView.getPivotY();
  }

  public final void y(View paramView)
  {
    paramView.jumpDrawablesToCurrentState();
  }

  public final void z(View paramView)
  {
    paramView.setSaveFromParentEnabled(false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.bk
 * JD-Core Version:    0.6.0
 */