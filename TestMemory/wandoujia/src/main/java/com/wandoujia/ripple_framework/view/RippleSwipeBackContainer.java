package com.wandoujia.ripple_framework.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.support.v4.app.b;
import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.support.v4.view.bb;
import android.support.v4.view.bg;
import android.support.v4.view.cu;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.R.anim;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.styleable;

public class RippleSwipeBackContainer extends FrameLayout
{
  private float a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private View i;
  private View j;
  private View k;
  private View l;
  private float m;
  private MotionEvent n;
  private al o;
  private int p;
  private boolean q;
  private boolean r;
  private boolean s = false;

  public RippleSwipeBackContainer(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public RippleSwipeBackContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public RippleSwipeBackContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(int paramInt)
  {
    if (this.q)
      return;
    setEnabled(false);
    this.q = true;
    e();
    bg.a(this.j, 2, null);
    float f1 = bg.n(this.j);
    float f2;
    float f3;
    if (paramInt == 0)
    {
      f2 = -this.j.getHeight();
      if (this.i == null)
        break label155;
      f3 = bg.f(this.i);
    }
    while (true)
    {
      ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      localValueAnimator.setInterpolator(new DecelerateInterpolator());
      localValueAnimator.setDuration(300L);
      localValueAnimator.addUpdateListener(new aj(this, f1, f2, f3));
      localValueAnimator.addListener(new ak(this, f2));
      localValueAnimator.start();
      return;
      f2 = this.j.getHeight();
      break;
      label155: f3 = 0.0F;
    }
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.a = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RippleSwipeBackContainer, 0, 0);
      this.e = localTypedArray.getInteger(R.styleable.RippleSwipeBackContainer_swipeOrientation, 0);
      this.b = localTypedArray.getDimensionPixelSize(R.styleable.RippleSwipeBackContainer_swipeThreshold, b.b(paramContext, 180.0F));
      this.c = localTypedArray.getDimensionPixelSize(R.styleable.RippleSwipeBackContainer_swipeThreshold, b.b(paramContext, 100.0F));
      this.d = localTypedArray.getDimensionPixelSize(R.styleable.RippleSwipeBackContainer_enableThreshold, 0);
      this.f = localTypedArray.getResourceId(R.styleable.RippleSwipeBackContainer_anchor, 0);
      this.g = localTypedArray.getResourceId(R.styleable.RippleSwipeBackContainer_targetIn, 0);
      this.h = localTypedArray.getResourceId(R.styleable.RippleSwipeBackContainer_targetOut, 0);
      localTypedArray.recycle();
    }
  }

  private boolean b(int paramInt)
  {
    int i1 = 1;
    View localView1 = this.l;
    View localView2;
    if (paramInt == 0)
    {
      int i2 = i1;
      if (!(localView1 instanceof ViewPager))
        break label121;
      ViewPager localViewPager = (ViewPager)localView1;
      if (localViewPager.getAdapter() == null)
        break label119;
      localView2 = ((Fragment)localViewPager.getAdapter().a(this, localViewPager.getCurrentItem())).getView();
      if (localView2 == null)
        break label119;
      RecyclerView localRecyclerView = (RecyclerView)localView2.findViewById(R.id.recycler_view);
      if (localRecyclerView == null)
        break label96;
      i1 = bg.b(localRecyclerView, i2);
    }
    label96: label119: label121: 
    do
    {
      AbsListView localAbsListView;
      do
      {
        do
        {
          return i1;
          int i3 = -1;
          break;
          View localView3 = localView2.findViewById(R.id.zoomable_image_view);
          if (localView3 != null)
            return localView3.canScrollVertically(i3);
          return false;
          if (((localView1 instanceof bb)) || (Build.VERSION.SDK_INT >= 14))
            return bg.b(localView1, i3);
          if (paramInt != 0)
            break label169;
          if ((localView1 instanceof AbsListView))
            return false;
        }
        while (localView1.getScrollY() < localView1.getMeasuredHeight());
        return false;
        if (!(localView1 instanceof AbsListView))
          break label217;
        localAbsListView = (AbsListView)localView1;
      }
      while ((localAbsListView.getChildCount() > 0) && ((localAbsListView.getFirstVisiblePosition() > 0) || (localAbsListView.getChildAt(0).getTop() < localAbsListView.getPaddingTop())));
      return false;
    }
    while (localView1.getScrollY() > 0);
    label169: label217: return false;
  }

  private void c()
  {
    if (this.q)
      return;
    this.q = true;
    e();
    float f1 = bg.n(this.j);
    float f2;
    if (this.i != null)
      f2 = bg.f(this.i);
    while (true)
    {
      View localView = this.i;
      float f3 = 0.0F;
      if (localView != null)
        f3 = 1.0F;
      ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      localValueAnimator.setDuration(300L);
      localValueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
      localValueAnimator.addUpdateListener(new ad(this, f1, f2, f3));
      localValueAnimator.addListener(new ae(this, f3));
      localValueAnimator.start();
      return;
      f2 = 0.0F;
    }
  }

  @TargetApi(14)
  private void d()
  {
    if (!SystemUtil.aboveApiLevel(14))
    {
      if (this.o != null)
        this.o.b();
      bg.h(this.k, 1.0F);
      this.q = false;
      return;
    }
    bg.a(this.k, 2, null);
    bg.q(this.k).d(this.m).b().a(300L).a(new ai(this)).d();
  }

  private void e()
  {
    View localView2;
    if (this.j == null)
    {
      if (this.h != 0)
      {
        this.j = findViewById(this.h);
        if (this.f != 0)
          break label87;
        localView2 = this.j;
        label38: this.l = localView2;
      }
    }
    else if (this.k == null)
      if (this.g != 0)
        break label102;
    label87: label102: for (View localView1 = this.j; ; localView1 = findViewById(this.g))
    {
      this.k = localView1;
      return;
      if (getChildCount() <= 0)
        break;
      this.j = getChildAt(0);
      break;
      localView2 = this.j.findViewById(this.f);
      break label38;
    }
  }

  public final void a()
  {
    if (this.q);
    do
    {
      return;
      this.q = true;
      e();
      bg.a(this.k, 2, null);
      Animation localAnimation1 = AnimationUtils.loadAnimation(getContext(), R.anim.fragment_slide_in_bottom);
      localAnimation1.setAnimationListener(new af(this));
      localAnimation1.setDuration(300L);
      this.k.startAnimation(localAnimation1);
    }
    while (this.i == null);
    Animation localAnimation2 = AnimationUtils.loadAnimation(getContext(), 17432576);
    localAnimation2.setDuration(300L);
    this.i.startAnimation(localAnimation2);
  }

  public final void a(Anchor paramAnchor)
  {
    if (this.q)
      return;
    this.q = true;
    e();
    if (paramAnchor != null)
    {
      if (SystemUtil.aboveApiLevel(14))
        this.k.setPivotY(paramAnchor.c * paramAnchor.a / (paramAnchor.c - paramAnchor.b));
      bg.h(this.k, paramAnchor.b / paramAnchor.c);
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = Integer.valueOf(paramAnchor.a);
      arrayOfObject[1] = Integer.valueOf(paramAnchor.b);
      arrayOfObject[2] = Integer.valueOf(paramAnchor.c);
      arrayOfObject[3] = Float.valueOf(bg.s(this.k));
      arrayOfObject[4] = Float.valueOf(bg.t(this.k));
      Log.d("DetailIn", "top %d, height %d, container height %d. \npivotY %f, scaleY %f", arrayOfObject);
    }
    while (true)
    {
      this.m = bg.u(this.k);
      bg.r(this.k);
      if (this.i == null)
        break;
      if (!SystemUtil.aboveApiLevel(14))
      {
        bg.c(this.i, 1.0F);
        d();
        return;
        bg.h(this.k, 0.5F);
        continue;
      }
      bg.c(this.i, 0.0F);
      bg.q(this.i).a(new DecelerateInterpolator()).a(300L).a(1.0F).a(new ah(this)).d();
      return;
    }
    d();
  }

  public final void b()
  {
    a(this.e);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    e();
    if (paramMotionEvent.getAction() == 0)
      this.r = this.q;
    int i1;
    if (this.r)
      i1 = 1;
    label58: label69: label112: boolean bool3;
    label165: label171: label177: label183: label189: 
    do
    {
      MotionEvent localMotionEvent;
      do
      {
        int i3;
        int i4;
        int i5;
        while (true)
        {
          return i1;
          boolean bool1 = isEnabled();
          i1 = 0;
          if (!bool1)
            continue;
          if (this.d <= 0)
            break;
          if (this.e != 0)
            break label165;
          i3 = 1;
          if (this.e != 2)
            break label171;
          i4 = 1;
          if ((i3 | i4) != 0)
          {
            boolean bool5 = paramMotionEvent.getRawY() < getMeasuredHeight() - this.d;
            i1 = 0;
            if (bool5)
              continue;
          }
          if (this.e != 1)
            break label177;
          i5 = 1;
          if (this.e != 2)
            break label183;
        }
        for (int i6 = 1; ; i6 = 0)
        {
          if ((i5 | i6) != 0)
          {
            boolean bool4 = paramMotionEvent.getRawY() < this.d;
            i1 = 0;
            if (bool4)
              break;
          }
          if (paramMotionEvent.getPointerCount() <= 1)
            break label189;
          this.s = false;
          return false;
          i3 = 0;
          break label58;
          i4 = 0;
          break label69;
          i5 = 0;
          break label112;
        }
        switch (android.support.v4.view.al.a(paramMotionEvent))
        {
        case 1:
        case 3:
        case 4:
        default:
          return false;
        case 0:
          this.n = MotionEvent.obtain(paramMotionEvent);
          this.s = true;
          this.p = this.e;
          return false;
        case 5:
        case 6:
          this.s = false;
          return false;
        case 2:
        }
        localMotionEvent = this.n;
        i1 = 0;
      }
      while (localMotionEvent == null);
      if (paramMotionEvent.getRawY() - this.n.getRawY() < 0.0F - this.a)
        if (this.p != 2);
      for (this.p = 0; ; this.p = 1)
        do
        {
          int i2 = this.p;
          i1 = 0;
          if (i2 == 2)
            break;
          boolean bool2 = this.s;
          i1 = 0;
          if (!bool2)
            break;
          if (!b(this.p))
            break label397;
          this.s = false;
          return false;
        }
        while ((paramMotionEvent.getRawY() - this.n.getRawY() <= this.a) || (this.p != 2));
      bool3 = this.s;
      i1 = 0;
    }
    while (!bool3);
    label397: Log.d("SwipeBack", "intercept true", new Object[0]);
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    e();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.r)
      return true;
    if (!isEnabled())
      return false;
    if ((this.p != 2) && (b(this.p)))
    {
      Log.d("SwipeBack", "on touch child can scroll", new Object[0]);
      this.s = false;
    }
    if (!this.s)
    {
      Log.d("SwipeBack", "on touch not handled reverse", new Object[0]);
      c();
      return false;
    }
    int i1;
    float f1;
    float f2;
    switch (paramMotionEvent.getAction())
    {
    case 0:
    case 4:
    default:
      return true;
    case 5:
    case 6:
      this.s = false;
      return false;
    case 2:
      i1 = this.j.getHeight();
      f1 = paramMotionEvent.getRawY() - this.n.getRawY();
      if (this.p == 0)
      {
        boolean bool2 = f1 < 0.0F;
        f2 = 0.0F;
        if (!bool2)
          break;
      }
    case 1:
    case 3:
    }
    while (true)
    {
      if (this.i != null)
        bg.c(this.i, 1.0F - Math.abs(f2 / i1));
      bg.b(this.j, f2);
      break;
      if (f1 < -i1)
      {
        f2 = -i1;
        continue;
        if (this.p == 1)
        {
          boolean bool1 = f1 < 0.0F;
          f2 = 0.0F;
          if (bool1)
            continue;
          if (f1 > i1)
          {
            f2 = i1;
            continue;
          }
        }
        else
        {
          return true;
          if (this.p == 0)
          {
            if (paramMotionEvent.getRawY() - this.n.getRawY() < 0 - this.b)
            {
              a(0);
              break;
            }
            c();
            break;
          }
          if (this.p != 1)
            break;
          if (paramMotionEvent.getRawY() - this.n.getRawY() > this.c)
          {
            a(1);
            break;
          }
          c();
          break;
        }
      }
      f2 = f1;
    }
  }

  public void setAnchorView(View paramView)
  {
    this.l = paramView;
  }

  public void setBackgroundView(View paramView)
  {
    this.i = paramView;
  }

  public void setEnableInAnim(boolean paramBoolean)
  {
  }

  public void setOnAnimListener(al paramal)
  {
    this.o = paramal;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.RippleSwipeBackContainer
 * JD-Core Version:    0.6.0
 */