package com.wandoujia.game_launcher.views;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

final class m extends Animation
{
  m(l paraml, q paramq)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.b.a)
    {
      l.a(paramFloat, this.a);
      return;
    }
    float f1 = (float)Math.toRadians(this.a.d() / (6.283185307179586D * this.a.i()));
    float f2 = this.a.g();
    float f3 = this.a.f();
    float f4 = this.a.j();
    float f5 = f2 + (0.8F - f1) * l.b().getInterpolation(paramFloat);
    this.a.c(f5);
    float f6 = f3 + 0.8F * l.c().getInterpolation(paramFloat);
    this.a.b(f6);
    float f7 = f4 + 0.25F * paramFloat;
    this.a.d(f7);
    float f8 = 144.0F * paramFloat + 720.0F * (l.a(this.b) / 5.0F);
    this.b.a(f8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.m
 * JD-Core Version:    0.6.0
 */