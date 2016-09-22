package com.wandoujia.p4.a;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;

public final class a extends Animation
{
  private View a;
  private int b;
  private int c = 0;
  private ViewGroup.LayoutParams d;
  private Animation.AnimationListener e;
  private boolean f = false;
  private boolean g = false;

  public a(View paramView, long paramLong, int paramInt1, int paramInt2)
  {
    setDuration(paramLong);
    this.a = paramView;
    this.c = paramInt1;
    this.b = paramInt2;
    this.d = this.a.getLayoutParams();
    this.d.height = this.c;
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if ((paramFloat == 0.0D) && (!this.f))
    {
      this.f = true;
      if (this.e != null)
        this.e.onAnimationStart(this);
    }
    if ((this.f) && (!this.g))
    {
      this.d.height = (this.c + (int)(paramFloat * (this.b - this.c)));
      this.a.requestLayout();
    }
    if ((paramFloat == 1.0D) && (!this.g))
    {
      this.g = true;
      if (this.e != null)
        this.e.onAnimationEnd(this);
    }
  }

  public final void setAnimationListener(Animation.AnimationListener paramAnimationListener)
  {
    this.e = paramAnimationListener;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.a.a
 * JD-Core Version:    0.6.0
 */