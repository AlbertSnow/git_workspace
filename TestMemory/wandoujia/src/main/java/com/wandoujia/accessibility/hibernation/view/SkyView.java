package com.wandoujia.accessibility.hibernation.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.wandoujia.ripple_framework.accessibility.R.dimen;
import com.wandoujia.ripple_framework.accessibility.R.id;

public class SkyView extends FrameLayout
{
  private View a;
  private View b;
  private View c;
  private View d;
  private boolean e = true;

  public SkyView(Context paramContext)
  {
    super(paramContext);
  }

  public SkyView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void a(View paramView, float paramFloat, long paramLong1, long paramLong2)
  {
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(paramView, "alpha", new float[] { 1.0F, paramFloat }).setDuration(paramLong1);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(paramView, "alpha", new float[] { paramFloat, 1.0F }).setDuration(paramLong1);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.setStartDelay(paramLong2);
    localAnimatorSet.playSequentially(new Animator[] { localObjectAnimator1, localObjectAnimator2 });
    localAnimatorSet.addListener(new p(this, localAnimatorSet));
    localAnimatorSet.start();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.e = true;
    a(this.a, 0.2F, 1000L, 3000L);
    a(this.b, 0.5F, 600L, 2000L);
    a(this.c, 0.0F, 1000L, 1000L);
    int i = getResources().getDimensionPixelSize(R.dimen.sky_cloud_moving_range);
    View localView1 = this.d;
    float[] arrayOfFloat1 = new float[2];
    arrayOfFloat1[0] = 0.0F;
    arrayOfFloat1[1] = (-i);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localView1, "translationX", arrayOfFloat1).setDuration(3000L);
    localObjectAnimator1.setStartDelay(400L);
    View localView2 = this.d;
    float[] arrayOfFloat2 = new float[2];
    arrayOfFloat2[0] = (-i);
    arrayOfFloat2[1] = 0.0F;
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(localView2, "translationX", arrayOfFloat2).setDuration(3000L);
    localObjectAnimator2.setStartDelay(400L);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playSequentially(new Animator[] { localObjectAnimator1, localObjectAnimator2 });
    localAnimatorSet.addListener(new o(this, localAnimatorSet));
    localAnimatorSet.start();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.e = false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(R.id.star1);
    this.b = findViewById(R.id.star2);
    this.c = findViewById(R.id.star3);
    this.d = findViewById(R.id.cloud);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.SkyView
 * JD-Core Version:    0.6.0
 */