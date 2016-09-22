package com.wandoujia.p4.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.p4.a.a;
import com.wandoujia.phoenix2.R.styleable;

public class ExpandablePanel extends RelativeLayout
{
  private final int a;
  private final int b;
  private final int c;
  private AnimationSet d;
  private AnimationSet e;
  private View f;
  private View g;
  private ExpandablePanelIcon h;
  private boolean i = false;
  private boolean j = true;
  private boolean k = false;
  private boolean l = false;
  private int m = 0;
  private long n = 200L;
  private int o;
  private int p;
  private j q;
  private final Animation.AnimationListener r = new i(this);

  public ExpandablePanel(Context paramContext)
  {
    this(paramContext, null);
  }

  public ExpandablePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ExpandablePanel, 0, 0);
    int i1 = localTypedArray.getResourceId(0, 0);
    if (i1 == 0)
      throw new IllegalArgumentException("The handle attribute is required and must refer to a valid child.");
    int i2 = localTypedArray.getResourceId(1, 0);
    if (i2 == 0)
      throw new IllegalArgumentException("The content attribute is required and must refer to a valid child.");
    int i3 = localTypedArray.getResourceId(2, 0);
    long l1 = localTypedArray.getInteger(5, 200);
    if (l1 == 0L)
      throw new IllegalArgumentException("The animationDuration attribute is required and must refer to a valid child.");
    this.a = i1;
    this.b = i2;
    this.c = i3;
    this.n = l1;
    localTypedArray.recycle();
  }

  private Animation getDownAnimationSet()
  {
    this.g.measure(this.o, this.p);
    this.e = new AnimationSet(false);
    a locala = new a(this.g, this.n, this.m, this.g.getMeasuredHeight());
    locala.setDuration(300L);
    locala.setInterpolator(getContext(), 2130968599);
    this.e.addAnimation(locala);
    if (this.m == 0)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
      localAlphaAnimation.setDuration(150L);
      localAlphaAnimation.setInterpolator(getContext(), 2130968599);
      localAlphaAnimation.setStartOffset(75L);
      this.e.addAnimation(localAlphaAnimation);
    }
    this.e.setAnimationListener(this.r);
    return this.e;
  }

  private Animation getUpAnimationSet()
  {
    this.g.measure(this.o, this.p);
    this.d = new AnimationSet(false);
    a locala = new a(this.g, this.n, this.g.getMeasuredHeight(), this.m);
    locala.setDuration(300L);
    locala.setInterpolator(getContext(), 2130968599);
    this.d.addAnimation(locala);
    if (this.m == 0)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation.setDuration(150L);
      localAlphaAnimation.setInterpolator(getContext(), 2130968599);
      this.d.addAnimation(localAlphaAnimation);
    }
    this.d.setAnimationListener(this.r);
    return this.d;
  }

  public final void a()
  {
    this.i = true;
    if (this.h != null)
      this.h.a();
    this.l = true;
    this.g.startAnimation(getDownAnimationSet());
  }

  public final void b()
  {
    this.i = false;
    if (this.h != null)
      this.h.b();
    this.l = true;
    this.g.startAnimation(getUpAnimationSet());
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.f = findViewById(this.a);
    if (this.f == null)
      throw new IllegalArgumentException("The handle attribute must refer to an existing child.");
    this.g = findViewById(this.b);
    if (this.g == null)
      throw new IllegalArgumentException("The content attribute must refer to an existing child.");
    if (this.c != 0)
      this.h = ((ExpandablePanelIcon)findViewById(this.c));
    this.g.getLayoutParams().height = this.m;
    this.f.setOnClickListener(new k(this, 0));
    setOnClickListener(new k(this, 0));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.g.getLayoutParams();
    this.o = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - (getPaddingLeft() + getPaddingRight() + localLayoutParams.leftMargin + localLayoutParams.rightMargin), View.MeasureSpec.getMode(paramInt1));
    this.p = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 0);
    if ((this.j) && (!this.l) && ((!this.i) || (this.k)))
    {
      this.g.measure(this.o, this.p);
      if (this.g.getMeasuredHeight() <= this.m)
      {
        this.k = true;
        if (this.h != null)
          this.h.setVisibility(8);
        this.g.getLayoutParams().height = -2;
        super.onMeasure(paramInt1, this.p);
        return;
      }
      this.k = false;
      if (this.h != null)
        this.h.setVisibility(0);
      this.g.getLayoutParams().height = this.m;
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }

  public void setCollapseHeight(int paramInt)
  {
    this.m = paramInt;
    if (!this.i)
    {
      this.g.getLayoutParams().height = this.m;
      if (this.q != null)
        this.q.b(this.i);
    }
  }

  public void setExpandStateListener(j paramj)
  {
    this.q = paramj;
  }

  public void setExpanded(boolean paramBoolean)
  {
    if (!this.j);
    while (true)
    {
      return;
      this.i = paramBoolean;
      if (this.q != null)
        this.q.a(this.i);
      if (this.i)
      {
        this.g.measure(this.o, this.p);
        this.g.getLayoutParams().height = this.g.getMeasuredHeight();
        if (this.h != null)
          this.h.a();
      }
      while (this.q != null)
      {
        this.q.b(this.i);
        return;
        this.g.getLayoutParams().height = this.m;
        if (this.h == null)
          continue;
        this.h.b();
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.ExpandablePanel
 * JD-Core Version:    0.6.0
 */