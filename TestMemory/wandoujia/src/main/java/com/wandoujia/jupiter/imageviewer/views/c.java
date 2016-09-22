package com.wandoujia.jupiter.imageviewer.views;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener
{
  private c(TouchImageView paramTouchImageView)
  {
  }

  public final boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    float f1 = (float)Math.min(Math.max(0.95F, paramScaleGestureDetector.getScaleFactor()), 1.05D);
    float f2 = TouchImageView.c(this.a);
    TouchImageView.a(this.a, f1);
    float f3;
    float f4;
    if (TouchImageView.c(this.a) > TouchImageView.d(this.a))
    {
      TouchImageView.b(this.a, TouchImageView.d(this.a));
      f1 = TouchImageView.d(this.a) / f2;
      TouchImageView.c(this.a, TouchImageView.f(this.a) * TouchImageView.c(this.a) - TouchImageView.f(this.a) - 2.0F * TouchImageView.g(this.a) * TouchImageView.c(this.a));
      TouchImageView.d(this.a, TouchImageView.h(this.a) * TouchImageView.c(this.a) - TouchImageView.h(this.a) - 2.0F * TouchImageView.i(this.a) * TouchImageView.c(this.a));
      if ((TouchImageView.j(this.a) * TouchImageView.c(this.a) > TouchImageView.f(this.a)) && (TouchImageView.k(this.a) * TouchImageView.c(this.a) > TouchImageView.h(this.a)))
        break label515;
      TouchImageView.l(this.a).postScale(f1, f1, TouchImageView.f(this.a) / 2.0F, TouchImageView.h(this.a) / 2.0F);
      if (f1 < 1.0F)
      {
        TouchImageView.l(this.a).getValues(TouchImageView.m(this.a));
        f3 = TouchImageView.m(this.a)[2];
        f4 = TouchImageView.m(this.a)[5];
        if (f1 < 1.0F)
        {
          if (Math.round(TouchImageView.j(this.a) * TouchImageView.c(this.a)) >= TouchImageView.f(this.a))
            break label450;
          if (f4 >= -TouchImageView.n(this.a))
            break label425;
          TouchImageView.l(this.a).postTranslate(0.0F, -(f4 + TouchImageView.n(this.a)));
        }
      }
    }
    while (true)
    {
      return true;
      if (TouchImageView.c(this.a) >= TouchImageView.e(this.a))
        break;
      TouchImageView.b(this.a, TouchImageView.e(this.a));
      f1 = TouchImageView.e(this.a) / f2;
      break;
      label425: if (f4 <= 0.0F)
        continue;
      TouchImageView.l(this.a).postTranslate(0.0F, -f4);
      continue;
      label450: if (f3 < -TouchImageView.o(this.a))
      {
        TouchImageView.l(this.a).postTranslate(-(f3 + TouchImageView.o(this.a)), 0.0F);
        continue;
      }
      if (f3 <= 0.0F)
        continue;
      TouchImageView.l(this.a).postTranslate(-f3, 0.0F);
      continue;
      label515: TouchImageView.l(this.a).postScale(f1, f1, paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY());
      TouchImageView.l(this.a).getValues(TouchImageView.m(this.a));
      float f5 = TouchImageView.m(this.a)[2];
      float f6 = TouchImageView.m(this.a)[5];
      if (f1 >= 1.0F)
        continue;
      if (f5 < -TouchImageView.o(this.a))
        TouchImageView.l(this.a).postTranslate(-(f5 + TouchImageView.o(this.a)), 0.0F);
      while (true)
      {
        if (f6 >= -TouchImageView.n(this.a))
          break label683;
        TouchImageView.l(this.a).postTranslate(0.0F, -(f6 + TouchImageView.n(this.a)));
        break;
        if (f5 <= 0.0F)
          continue;
        TouchImageView.l(this.a).postTranslate(-f5, 0.0F);
      }
      label683: if (f6 <= 0.0F)
        continue;
      TouchImageView.l(this.a).postTranslate(0.0F, -f6);
    }
  }

  public final boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    TouchImageView.b(this.a);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.views.c
 * JD-Core Version:    0.6.0
 */