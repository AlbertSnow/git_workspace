package com.wandoujia.jupiter.anim;

import android.support.v4.view.bg;
import android.view.View;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.base.utils.SystemUtil;
import java.util.ArrayList;

final class i extends AnimatorListenerAdapter
{
  i(a parama, j paramj, View paramView1, View paramView2, ValueAnimator paramValueAnimator)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    a.g(this.e).remove(this.d);
    super.onAnimationCancel(paramAnimator);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (SystemUtil.aboveApiLevel(11))
    {
      this.b.setLayerType(0, null);
      this.c.setLayerType(0, null);
    }
    this.d.removeAllUpdateListeners();
    this.d.removeAllListeners();
    ViewHelper.setAlpha(this.b, 1.0F);
    ViewHelper.setRotationY(this.b, 0.0F);
    ViewHelper.setScaleX(this.b, 1.0F);
    ViewHelper.setScaleY(this.b, 1.0F);
    bg.b(this.b, 0.0F);
    bg.b(this.c, 0.0F);
    this.e.g(this.a.a);
    this.e.g(this.a.b);
    a.g(this.e).remove(this.d);
    a.c(this.e);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    ViewHelper.setPivotY(this.b, 0.0F);
    ViewHelper.setPivotY(this.c, 0.0F);
    ViewHelper.setPivotX(this.b, this.b.getWidth() / 2);
    ViewHelper.setPivotY(this.c, this.c.getWidth() / 2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.anim.i
 * JD-Core Version:    0.6.0
 */