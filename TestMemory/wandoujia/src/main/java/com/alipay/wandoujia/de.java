package com.alipay.wandoujia;

import android.view.View;
import android.view.animation.DecelerateInterpolator;

final class de
  implements Runnable
{
  private boolean a;
  private View b;
  private ua.a c;

  de(View paramView, boolean paramBoolean, ua.a parama)
  {
    this.b = paramView;
    this.a = paramBoolean;
    this.c = parama;
  }

  public final void run()
  {
    float f1 = this.b.getWidth() / 2.0F;
    float f2 = this.b.getHeight() / 2.0F;
    if (this.a);
    for (dd localdd = new dd(-90.0F, 0.0F, f1, f2, false); ; localdd = new dd(90.0F, 0.0F, f1, f2, false))
    {
      localdd.setDuration(500L);
      localdd.setFillAfter(true);
      localdd.setInterpolator(new DecelerateInterpolator());
      this.b.startAnimation(localdd);
      if (this.c != null)
        this.c.a();
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.de
 * JD-Core Version:    0.6.0
 */