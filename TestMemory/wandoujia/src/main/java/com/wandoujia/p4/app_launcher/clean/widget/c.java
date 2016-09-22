package com.wandoujia.p4.app_launcher.clean.widget;

import android.view.animation.DecelerateInterpolator;
import com.nineoldandroids.animation.ValueAnimator;

final class c
  implements Runnable
{
  c(b paramb)
  {
  }

  public final void run()
  {
    if (b.a(this.a) >= 99)
    {
      b.b(this.a);
      b.c(this.a);
      return;
    }
    int i = 120000 * (100 - b.a(this.a)) / 100;
    b localb = this.a;
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = b.a(this.a);
    arrayOfInt[1] = 99;
    b.a(localb, ValueAnimator.ofInt(arrayOfInt).setDuration(i));
    b.d(this.a).setInterpolator(new DecelerateInterpolator());
    b.d(this.a).addUpdateListener(new d(this));
    b.d(this.a).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.widget.c
 * JD-Core Version:    0.6.0
 */