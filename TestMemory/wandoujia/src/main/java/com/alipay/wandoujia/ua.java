package com.alipay.wandoujia;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class ua
  implements Animation.AnimationListener
{
  private View a;
  private boolean b;
  private ua.a c;

  private ua(View paramView, boolean paramBoolean, ua.a parama)
  {
    this.a = paramView;
    this.b = paramBoolean;
    this.c = parama;
  }

  public static void a(View paramView, ua.a parama)
  {
    a(paramView, false, -90.0F, parama);
  }

  private static void a(View paramView, boolean paramBoolean, float paramFloat, ua.a parama)
  {
    dd localdd = new dd(0.0F, paramFloat, paramView.getWidth() / 2.0F, paramView.getHeight() / 2.0F, true);
    localdd.setDuration(300L);
    localdd.setFillAfter(true);
    localdd.setInterpolator(new AccelerateInterpolator());
    localdd.setAnimationListener(new ua(paramView, paramBoolean, parama));
    paramView.startAnimation(localdd);
  }

  public static void b(View paramView, ua.a parama)
  {
    a(paramView, true, 90.0F, parama);
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.a.post(new de(this.a, this.b, this.c));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ua
 * JD-Core Version:    0.6.0
 */