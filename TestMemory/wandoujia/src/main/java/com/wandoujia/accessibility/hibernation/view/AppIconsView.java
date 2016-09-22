package com.wandoujia.accessibility.hibernation.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.ripple_framework.accessibility.R.dimen;
import com.wandoujia.ripple_framework.accessibility.R.id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AppIconsView extends FrameLayout
{
  private View a;
  private View b;
  private int c;
  private int d;
  private int e;
  private int f;
  private List<View> g;
  private Queue<m> h;
  private boolean i = false;
  private boolean j = false;

  public AppIconsView(Context paramContext)
  {
    super(paramContext);
  }

  public AppIconsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private Animator a(View paramView, int paramInt, long paramLong)
  {
    float[] arrayOfFloat1 = new float[2];
    arrayOfFloat1[0] = (this.e / 2);
    arrayOfFloat1[1] = (paramInt + this.e / 2);
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(paramView, "translationX", arrayOfFloat1);
    float[] arrayOfFloat2 = new float[2];
    arrayOfFloat2[0] = this.c;
    arrayOfFloat2[1] = (this.c - paramInt);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(paramView, "translationY", arrayOfFloat2);
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(paramView, "alpha", new float[] { 0.0F, 1.0F });
    AnimatorSet localAnimatorSet1 = new AnimatorSet();
    localAnimatorSet1.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, localObjectAnimator3 });
    localAnimatorSet1.setDuration(400L);
    ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(paramView, "alpha", new float[] { 1.0F, 0.0F }).setDuration(400L);
    localObjectAnimator4.setStartDelay(400L);
    AnimatorSet localAnimatorSet2 = new AnimatorSet();
    localAnimatorSet2.playSequentially(new Animator[] { localAnimatorSet1, localObjectAnimator4 });
    localAnimatorSet2.setStartDelay(paramLong);
    return localAnimatorSet2;
  }

  private void a(m paramm)
  {
    ((View)this.g.get(0)).setBackgroundDrawable(m.a(paramm));
    Object localObject = this.g.get(0);
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = this.f;
    arrayOfFloat[1] = 0.0F;
    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(localObject, "translationY", arrayOfFloat).setDuration(400L);
    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.g.get(1), "rotation", new float[] { 0.0F, -10.0F }).setDuration(400L);
    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(this.g.get(2), "rotation", new float[] { -10.0F, 10.0F }).setDuration(400L);
    ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(this.g.get(3), "alpha", new float[] { 1.0F, 0.0F }).setDuration(400L);
    AnimatorSet localAnimatorSet = new AnimatorSet();
    localAnimatorSet.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2, localObjectAnimator3, localObjectAnimator4 });
    localAnimatorSet.addListener(new j(this, paramm));
    localAnimatorSet.start();
  }

  public final void a(Drawable paramDrawable, n paramn)
  {
    if (!this.i)
    {
      this.i = true;
      a(new m(paramDrawable, paramn));
      return;
    }
    this.h.add(new m(paramDrawable, paramn));
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(R.id.z_big);
    this.b = findViewById(R.id.z_small);
    this.g = new ArrayList();
    this.g.add(findViewById(R.id.icon_0));
    this.g.add(findViewById(R.id.icon_1));
    this.g.add(findViewById(R.id.icon_2));
    this.g.add(findViewById(R.id.icon_3));
    ViewHelper.setAlpha(this.a, 0.0F);
    ViewHelper.setAlpha(this.b, 0.0F);
    this.c = getResources().getDimensionPixelSize(R.dimen.sleeping_big_z_moving_range);
    this.d = getResources().getDimensionPixelSize(R.dimen.sleeping_small_z_moving_range);
    this.h = new LinkedList();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.e = getMeasuredWidth();
    this.f = getMeasuredHeight();
    Iterator localIterator = this.g.iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      ViewHelper.setPivotX(localView, localView.getWidth() / 2);
      ViewHelper.setPivotY(localView, 2 * this.f);
    }
    if ((this.e > 0) && (!this.j))
    {
      this.j = true;
      Animator localAnimator1 = a(this.a, this.c, 0L);
      Animator localAnimator2 = a(this.b, this.d, 400L);
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localAnimator1, localAnimator2 });
      localAnimatorSet.addListener(new h(this, localAnimatorSet));
      localAnimatorSet.start();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.AppIconsView
 * JD-Core Version:    0.6.0
 */