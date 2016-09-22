package com.wandoujia.ripple_framework.view;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

final class k extends Animation
{
  k(j paramj, o paramo)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.b.a)
    {
      j.a(paramFloat, this.a);
      return;
    }
    float f1 = (float)Math.toRadians(this.a.d() / (6.283185307179586D * this.a.i()));
    float f2 = this.a.g();
    float f3 = this.a.f();
    float f4 = this.a.j();
    float f5 = f2 + (0.8F - f1) * j.b().getInterpolation(paramFloat);
    this.a.c(f5);
    float f6 = f3 + 0.8F * j.c().getInterpolation(paramFloat);
    this.a.b(f6);
    float f7 = f4 + 0.25F * paramFloat;
    this.a.d(f7);
    float f8 = 144.0F * paramFloat + 720.0F * (j.a(this.b) / 5.0F);
    this.b.a(f8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.k
 * JD-Core Version:    0.6.0
 */