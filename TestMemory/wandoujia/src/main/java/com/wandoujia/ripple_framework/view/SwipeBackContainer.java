package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.ripple_framework.R.styleable;

public class SwipeBackContainer extends FrameLayout
{
  private float a;
  private int b;
  private int c;
  private View d;
  private View e;
  private MotionEvent f;
  private bh g;
  private boolean h;
  private bf i;
  private bi j;
  private boolean k;

  public SwipeBackContainer(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public SwipeBackContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public SwipeBackContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.a = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RippleSwipeBackContainer, 0, 0);
      this.c = localTypedArray.getInteger(R.styleable.RippleSwipeBackContainer_swipeOrientation, 0);
      this.b = localTypedArray.getDimensionPixelSize(R.styleable.RippleSwipeBackContainer_swipeThreshold, b.b(paramContext, 100.0F));
      localTypedArray.recycle();
    }
    this.i = new bg(this);
  }

  private void b()
  {
    c();
    float f1 = android.support.v4.view.bg.n(this.e);
    float f2;
    if (this.d != null)
      f2 = android.support.v4.view.bg.f(this.d);
    while (true)
    {
      View localView = this.d;
      float f3 = 0.0F;
      if (localView != null)
        f3 = 1.0F;
      ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      localValueAnimator.setDuration(300L);
      localValueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
      localValueAnimator.addUpdateListener(new bc(this, f1, f2, f3));
      localValueAnimator.start();
      return;
      f2 = 0.0F;
    }
  }

  private void c()
  {
    if ((this.e == null) && (getChildCount() > 0))
      this.e = getChildAt(0);
  }

  private boolean d()
  {
    c();
    return this.i.a(this.e, this.c);
  }

  private void setTargetTransY(float paramFloat)
  {
    android.support.v4.view.bg.b(this.e, paramFloat);
    if (this.j != null)
      this.j.a(paramFloat);
  }

  public final void a()
  {
    if (this.h)
      return;
    this.k = true;
    this.h = true;
    c();
    float f1 = android.support.v4.view.bg.n(this.e);
    float f2;
    float f3;
    if (this.c == 0)
    {
      f2 = -this.e.getHeight();
      if (this.d == null)
        break label148;
      f3 = android.support.v4.view.bg.f(this.d);
    }
    while (true)
    {
      ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      localValueAnimator.setInterpolator(new DecelerateInterpolator());
      localValueAnimator.setDuration(()(300.0F * f3));
      localValueAnimator.addUpdateListener(new bd(this, f1, f2, f3));
      localValueAnimator.addListener(new be(this));
      localValueAnimator.start();
      return;
      f2 = this.e.getHeight();
      break;
      label148: f3 = 0.0F;
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    c();
    if ((!isEnabled()) || (d()))
      return false;
    switch (paramMotionEvent.getAction())
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    do
      while (true)
      {
        return false;
        this.f = MotionEvent.obtain(paramMotionEvent);
        continue;
        if (this.f == null)
          continue;
        if (this.c != 0)
          break;
        if (paramMotionEvent.getRawY() - this.f.getRawY() < 0.0F - this.a)
          return true;
      }
    while (paramMotionEvent.getRawY() - this.f.getRawY() <= this.a);
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    c();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((!isEnabled()) || (d()) || (this.k))
      return false;
    int m;
    float f1;
    float f2;
    switch (paramMotionEvent.getAction())
    {
    default:
      return true;
    case 2:
      m = this.e.getHeight();
      f1 = paramMotionEvent.getRawY() - this.f.getRawY();
      if (this.c == 0)
      {
        boolean bool2 = f1 < 0.0F;
        f2 = 0.0F;
        if (!bool2)
          break;
      }
    case 1:
    case 3:
    }
    while (true)
    {
      if (this.d != null)
        android.support.v4.view.bg.c(this.d, 1.0F - Math.abs(f2 / m));
      setTargetTransY(f2);
      break;
      if (f1 < -m)
      {
        f2 = -m;
        continue;
        boolean bool1 = f1 < 0.0F;
        f2 = 0.0F;
        if (bool1)
          continue;
        if (f1 > m)
        {
          f2 = m;
          continue;
          if (this.c == 0)
          {
            if (paramMotionEvent.getRawY() - this.f.getRawY() < 0 - this.b)
            {
              a();
              break;
            }
            b();
            break;
          }
          if (paramMotionEvent.getRawY() - this.f.getRawY() > this.b)
          {
            a();
            break;
          }
          b();
          break;
        }
      }
      f2 = f1;
    }
  }

  public void setBackgroundView(View paramView)
  {
    this.d = paramView;
  }

  public void setOnAnimListener(bh parambh)
  {
    this.g = parambh;
  }

  public void setScrollStateGetter(bf parambf)
  {
    if (parambf == null)
      return;
    this.i = parambf;
  }

  public void setTargetTransListener(bi parambi)
  {
    this.j = parambi;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.SwipeBackContainer
 * JD-Core Version:    0.6.0
 */