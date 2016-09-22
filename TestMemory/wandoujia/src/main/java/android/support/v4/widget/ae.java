package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;

final class ae extends Animation
{
  ae(ad paramad, ah paramah)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.b.a)
    {
      ad.a(paramFloat, this.a);
      return;
    }
    float f1 = ad.a(this.a);
    float f2 = this.a.g();
    float f3 = this.a.f();
    float f4 = this.a.k();
    ad.b(paramFloat, this.a);
    if (paramFloat <= 0.5F)
    {
      float f10 = paramFloat / 0.5F;
      float f11 = f3 + (0.8F - f1) * ad.a().getInterpolation(f10);
      this.a.b(f11);
    }
    if (paramFloat > 0.5F)
    {
      float f7 = 0.8F - f1;
      float f8 = (paramFloat - 0.5F) / 0.5F;
      float f9 = f2 + f7 * ad.a().getInterpolation(f8);
      this.a.c(f9);
    }
    float f5 = f4 + 0.25F * paramFloat;
    this.a.d(f5);
    float f6 = 216.0F * paramFloat + 1080.0F * (ad.a(this.b) / 5.0F);
    this.b.d(f6);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.ae
 * JD-Core Version:    0.6.0
 */