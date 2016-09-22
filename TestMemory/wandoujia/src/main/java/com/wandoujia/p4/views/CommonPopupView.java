package com.wandoujia.p4.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.view.bg;
import android.support.v7.app.f;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Scroller;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.util.n;

public class CommonPopupView extends FrameLayout
{
  private static final String a = CommonPopupView.class.getSimpleName();
  private static final Interpolator b = new a();
  private Activity c;
  private View d;
  private FrameLayout e;
  private View f;
  private n g;
  private int h = getResources().getDimensionPixelOffset(2131427550);
  private int i;
  private int j;
  private int k;
  private int l = ViewConfiguration.get(getContext()).getScaledMaximumFlingVelocity();
  private boolean m;
  private Scroller n = new Scroller(getContext(), b);
  private VelocityTracker o;
  private float p;
  private float q;
  private float r;
  private float s;
  private boolean t = true;
  private boolean u;
  private boolean v;
  private boolean w = false;

  public CommonPopupView(Context paramContext)
  {
    super(paramContext);
    if (!SystemUtil.aboveApiLevel(14))
      this.t = false;
  }

  public CommonPopupView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!SystemUtil.aboveApiLevel(14))
      this.t = false;
  }

  public CommonPopupView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!SystemUtil.aboveApiLevel(14))
      this.t = false;
  }

  public static CommonPopupView a(Activity paramActivity)
  {
    CommonPopupView localCommonPopupView = (CommonPopupView)com.wandoujia.p4.utils.c.a(paramActivity, 2130903487);
    localCommonPopupView.c = paramActivity;
    return localCommonPopupView;
  }

  private void a(int paramInt)
  {
    this.e.scrollTo(0, paramInt);
    float f1 = 1.0F - (-paramInt - this.i) / (getMeasuredHeight() - this.i);
    ViewHelper.setAlpha(this.d, f1);
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 - this.e.getScrollY();
    if (i1 == 0)
      return;
    if (paramInt2 != 0);
    for (int i2 = 4 * Math.round(1000.0F * Math.abs(i1 / paramInt2)); ; i2 = 600)
    {
      int i3 = Math.min(i2, 600);
      Log.d(a, "smoothScrollY, toScrollY=" + paramInt1 + ", velocity=" + paramInt2 + ", duration=" + i3, new Object[0]);
      this.n.startScroll(0, this.e.getScrollY(), 0, i1, i3);
      bg.d(this);
      return;
    }
  }

  private boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = paramView.getScrollX();
      int i2 = paramView.getScrollY();
      i3 = -1 + localViewGroup.getChildCount();
      if (i3 >= 0)
      {
        View localView = localViewGroup.getChildAt(i3);
        if ((paramInt2 + i1 < localView.getLeft()) || (paramInt2 + i1 >= localView.getRight()) || (paramInt3 + i2 < localView.getTop()) || (paramInt3 + i2 >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i1 - localView.getLeft(), paramInt3 + i2 - localView.getTop())));
      }
    }
    do
    {
      return true;
      i3--;
      break;
    }
    while ((paramBoolean) && (bg.b(paramView, -paramInt1)));
    return false;
  }

  private void c()
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(true);
  }

  private void d()
  {
    a(-this.i, 0);
  }

  private void e()
  {
    postDelayed(new d(this), 50L);
  }

  public final void a()
  {
    if (getParent() != null)
      ((ViewGroup)getParent()).removeView(this);
    ((ViewGroup)this.c.getWindow().getDecorView()).addView(this);
    ViewHelper.setAlpha(this.d, 0.0F);
    requestFocus();
    d();
  }

  public final void a(View paramView, FrameLayout.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams == null)
      paramLayoutParams = new FrameLayout.LayoutParams(-1, -2);
    if (this.f != null)
      this.e.removeView(this.f);
    this.f = paramView;
    paramView.setBackgroundColor(getResources().getColor(2131362141));
    paramView.setClickable(true);
    this.e.addView(paramView, paramLayoutParams);
  }

  public final void b()
  {
    a(-getMeasuredHeight(), 0);
  }

  public void computeScroll()
  {
    if ((!this.n.isFinished()) && (this.n.computeScrollOffset()))
    {
      a(this.n.getCurrY());
      bg.d(this);
    }
    do
      return;
    while (this.e.getScrollY() != -getMeasuredHeight());
    e();
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.w = true;
    this.h = getResources().getDimensionPixelOffset(2131427550);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.e = ((FrameLayout)findViewById(2131493174));
    this.d = findViewById(2131493743);
    this.e.setOnClickListener(new b(this));
    setFocusableInTouchMode(true);
    setOnKeyListener(new c(this));
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.t);
    do
      return false;
    while (paramMotionEvent.getY() < -this.e.getScrollY());
    if (this.m)
    {
      Log.d(a, "Already dragging, Intercept returning true!", new Object[0]);
      return true;
    }
    switch (0xFF & paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      if (this.o == null)
        this.o = VelocityTracker.obtain();
      this.o.addMovement(paramMotionEvent);
      return this.m;
      float f6 = paramMotionEvent.getX();
      this.r = f6;
      this.p = f6;
      float f7 = paramMotionEvent.getY();
      this.s = f7;
      this.q = f7;
      this.u = true;
      this.v = false;
      if (!this.n.isFinished())
      {
        this.n.forceFinished(true);
        this.m = true;
        this.v = true;
        c();
      }
      Log.d(a, "Down at " + this.p + "," + this.q, new Object[0]);
      continue;
      if (!this.u)
        break;
      if (this.v)
        return true;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      float f3 = f2 - this.q;
      float f4 = f2 - this.s;
      float f5 = f1 - this.r;
      this.p = f1;
      this.q = f2;
      if (Math.abs(f4) < 10.0F)
        break;
      if (Math.abs(f4) < Math.abs(f5))
      {
        this.u = false;
        this.v = false;
        return false;
      }
      if ((f3 != 0.0F) && (a(this, false, (int)f3, (int)f1, (int)f2)))
      {
        Log.d(a, "Nested view has scrollable area under this point, Intercept returning false", new Object[0]);
        return false;
      }
      Log.d(a, "Starting drag!, deltaY=" + Math.abs(f3), new Object[0]);
      this.m = true;
      this.v = true;
      c();
      continue;
      Log.d(a, "Intercept done!", new Object[0]);
      this.m = false;
      this.u = true;
      this.v = false;
      if (this.o == null)
        continue;
      this.o.recycle();
      this.o = null;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.f.getLayoutParams();
    if (!this.t)
      localLayoutParams.bottomMargin = this.h;
    int i1;
    int i2;
    do
    {
      while (true)
      {
        super.onMeasure(paramInt1, paramInt2);
        i1 = getMeasuredHeight();
        if (i1 != 0)
          break;
        return;
        if (localLayoutParams.height != -1)
          continue;
        localLayoutParams.bottomMargin = this.h;
      }
      i2 = this.f.getMeasuredHeight();
    }
    while ((i2 == 0) || ((!this.w) && (i2 == this.k) && (i1 == this.j)));
    this.w = false;
    this.k = i2;
    this.j = i1;
    this.i = (this.j - this.k);
    if (this.i < this.h)
      this.i = this.h;
    if (this.e.getScrollY() == 0)
      a(-this.j);
    d();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if (!this.v)
      bool = false;
    label393: 
    while (true)
    {
      return bool;
      if (this.o == null)
        this.o = VelocityTracker.obtain();
      this.o.addMovement(paramMotionEvent);
      switch (paramMotionEvent.getAction())
      {
      default:
        return false;
      case 0:
        this.p = paramMotionEvent.getX();
        this.q = paramMotionEvent.getY();
        this.n.forceFinished(bool);
        return bool;
      case 2:
        this.m = bool;
        int i2 = (int)(paramMotionEvent.getY() - this.q);
        if ((i2 <= 0) && (this.e.getScrollY() >= this.k - getMeasuredHeight()))
          continue;
        int i3 = this.e.getScrollY() - i2;
        if (i3 >= this.k - getMeasuredHeight())
          a(this.k - getMeasuredHeight());
        while (true)
        {
          this.p = paramMotionEvent.getX();
          this.q = paramMotionEvent.getY();
          return bool;
          if (i3 <= -getMeasuredHeight())
          {
            e();
            continue;
          }
          a(i3);
        }
      case 1:
      case 3:
        this.q = 0.0F;
        int i1;
        if (this.m)
        {
          this.o.computeCurrentVelocity(1000, this.l);
          i1 = (int)this.o.getYVelocity();
          if (i1 <= -100)
          {
            a(Math.max(this.k - getMeasuredHeight(), -this.i), i1);
            this.m = false;
          }
        }
        while (true)
        {
          if (this.o == null)
            break label393;
          this.o.recycle();
          this.o = null;
          return bool;
          if (i1 < 100)
          {
            if (this.e.getScrollY() >= -this.i)
              break;
            if (this.e.getScrollY() >= -(0.2F * (getMeasuredHeight() - this.i) + this.i))
            {
              a(-this.i, i1);
              break;
            }
          }
          a(-getMeasuredHeight(), i1);
          break;
          bool = false;
        }
      }
    }
  }

  public void setContentView(View paramView)
  {
    boolean bool = paramView.getLayoutParams() instanceof FrameLayout.LayoutParams;
    FrameLayout.LayoutParams localLayoutParams = null;
    if (bool)
      localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    a(paramView, localLayoutParams);
  }

  public void setDragEnable(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }

  public void setOnDismissListener$f79fa32(n paramn)
  {
    this.g = paramn;
  }

  public void setOnShowListener$341e184d(f paramf)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.CommonPopupView
 * JD-Core Version:    0.6.0
 */