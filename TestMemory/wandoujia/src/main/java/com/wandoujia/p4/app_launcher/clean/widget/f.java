package com.wandoujia.p4.app_launcher.clean.widget;

import android.view.animation.AccelerateDecelerateInterpolator;
import com.nineoldandroids.animation.ValueAnimator;

final class f
  implements Runnable
{
  f(b paramb, int paramInt)
  {
  }

  public final void run()
  {
    if ((this.b <= 10 + b.f(this.a)) && (this.b < 99));
    do
      return;
    while (this.b <= b.a(this.a));
    b.b(this.a, this.b);
    b.b(this.a);
    b.c(this.a);
    android.support.v4.app.b.z(b.a(this.a) + " " + b.f(this.a));
    int i = Math.max(1800 * (b.f(this.a) - b.a(this.a)) / 100, 200);
    b localb = this.a;
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = b.a(this.a);
    arrayOfInt[1] = b.f(this.a);
    b.b(localb, ValueAnimator.ofInt(arrayOfInt).setDuration(i));
    b.g(this.a).setInterpolator(new AccelerateDecelerateInterpolator());
    b.g(this.a).addUpdateListener(new g(this));
    b.g(this.a).addListener(new h(this));
    b.g(this.a).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.widget.f
 * JD-Core Version:    0.6.0
 */