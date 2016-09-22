package com.wandoujia.p4.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.bg;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.wandoujia.phoenix2.R.styleable;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.am;

public class ScrollDownLayout extends FrameLayout
  implements am
{
  private final GestureDetector.OnGestureListener a = new m(this);
  private final AbsListView.OnScrollListener b = new n(this);
  private float c;
  private float d;
  private float e;
  private float f;
  private Scroller g = new Scroller(getContext());
  private GestureDetector h = new GestureDetector(getContext(), this.a);
  private boolean i = true;
  private boolean j = true;
  private boolean k = true;
  private boolean l = true;
  private boolean m = false;
  private ScrollDownLayout.InnerStatus n = ScrollDownLayout.InnerStatus.INITIAL;
  private int o = 0;
  private int p = 0;
  private q q;

  public ScrollDownLayout(Context paramContext)
  {
    super(paramContext);
  }

  public ScrollDownLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public ScrollDownLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ScrollDownLayout, 0, 0);
    this.o = localTypedArray.getDimensionPixelOffset(0, this.o);
    localTypedArray.recycle();
  }

  private void a(AbsListView paramAbsListView)
  {
    if (paramAbsListView.getChildCount() == 0)
    {
      setDraggable(true);
      return;
    }
    if ((paramAbsListView.getFirstVisiblePosition() == 0) && (paramAbsListView.getChildAt(0).getTop() == paramAbsListView.getPaddingTop()))
    {
      setDraggable(true);
      return;
    }
    setDraggable(false);
  }

  public final void a()
  {
    if (this.n == ScrollDownLayout.InnerStatus.OPENED);
    int i1;
    do
    {
      do
        return;
      while (this.o == this.p);
      i1 = -getScrollY() - this.o;
    }
    while (i1 == 0);
    this.n = ScrollDownLayout.InnerStatus.SCROLLING;
    int i2 = 100 + Math.abs(i1 * 300 / (this.o - this.p));
    this.g.startScroll(0, getScrollY(), 0, i1, i2);
    invalidate();
  }

  public final void b()
  {
    if (this.n == ScrollDownLayout.InnerStatus.CLOSED);
    int i1;
    do
    {
      do
        return;
      while (this.o == this.p);
      i1 = -getScrollY() - this.p;
    }
    while (i1 == 0);
    this.n = ScrollDownLayout.InnerStatus.SCROLLING;
    int i2 = 100 + Math.abs(i1 * 300 / (this.o - this.p));
    this.g.startScroll(0, getScrollY(), 0, i1, i2);
    invalidate();
  }

  public final void c()
  {
    scrollTo(0, -this.o);
    this.n = ScrollDownLayout.InnerStatus.OPENED;
  }

  public void computeScroll()
  {
    if ((!this.g.isFinished()) && (this.g.computeScrollOffset()))
    {
      int i1 = this.g.getCurrY();
      scrollTo(0, i1);
      if ((i1 == -this.p) || (i1 == -this.o))
        this.g.abortAnimation();
    }
    else
    {
      return;
    }
    invalidate();
  }

  public ScrollDownLayout.Status getCurrentStatus()
  {
    switch (p.a[this.n.ordinal()])
    {
    default:
      return ScrollDownLayout.Status.OPENED;
    case 1:
      return ScrollDownLayout.Status.CLOSED;
    case 2:
    }
    return ScrollDownLayout.Status.OPENED;
  }

  public int getMaxOffset()
  {
    return this.o;
  }

  public int getMinOffset()
  {
    return this.p;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.i);
    int i1;
    do
    {
      int i2;
      do
      {
        do
        {
          do
          {
            do
            {
              do
                return false;
              while ((!this.k) && (this.n == ScrollDownLayout.InnerStatus.CLOSED));
              switch (paramMotionEvent.getAction())
              {
              default:
                return false;
              case 0:
                this.c = paramMotionEvent.getX();
                this.d = paramMotionEvent.getY();
                this.e = this.c;
                this.f = this.d;
                this.l = true;
                this.m = false;
              case 1:
              case 3:
              case 2:
              }
            }
            while (this.g.isFinished());
            this.g.forceFinished(true);
            this.n = ScrollDownLayout.InnerStatus.MOVING;
            this.m = true;
            return true;
            this.l = true;
            this.m = false;
          }
          while (this.n != ScrollDownLayout.InnerStatus.MOVING);
          return true;
        }
        while (!this.l);
        if (this.m)
          return true;
        i1 = (int)(paramMotionEvent.getY() - this.f);
        i2 = (int)(paramMotionEvent.getX() - this.e);
      }
      while (Math.abs(i1) < 10);
      if ((Math.abs(i1) < Math.abs(i2)) && (this.j))
      {
        this.l = false;
        this.m = false;
        return false;
      }
      if (this.n != ScrollDownLayout.InnerStatus.CLOSED)
        break;
    }
    while (i1 < 0);
    do
    {
      this.m = true;
      return true;
    }
    while ((this.n != ScrollDownLayout.InnerStatus.OPENED) || (i1 <= 0));
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.m);
    do
    {
      return false;
      this.h.onTouchEvent(paramMotionEvent);
      switch (paramMotionEvent.getAction())
      {
      default:
        return false;
      case 0:
        this.d = paramMotionEvent.getY();
        return true;
      case 2:
        int i1 = (int)(1.0F * (paramMotionEvent.getY() - this.d));
        int i2 = (int)Math.signum(i1) * Math.min(Math.abs(i1), 30);
        if ((i2 <= 0) && (getScrollY() >= -this.p))
          return true;
        if ((i2 >= 0) && (getScrollY() <= -this.o))
          return true;
        this.n = ScrollDownLayout.InnerStatus.MOVING;
        int i3 = getScrollY() - i2;
        if (i3 >= -this.p)
          scrollTo(0, -this.p);
        while (true)
        {
          this.d = paramMotionEvent.getY();
          return true;
          if (i3 <= -this.o)
          {
            scrollTo(0, -this.o);
            continue;
          }
          scrollTo(0, i3);
        }
      case 1:
      case 3:
      }
    }
    while (this.n != ScrollDownLayout.InnerStatus.MOVING);
    if (getScrollY() > -(0.8F * (this.o - this.p)))
      b();
    while (true)
    {
      return true;
      a();
    }
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    super.scrollTo(paramInt1, paramInt2);
    if (this.o == this.p);
    do
      while (true)
      {
        return;
        float f1 = (-paramInt2 - this.p) / (this.o - this.p);
        if (this.q != null)
          this.q.a(f1);
        if (paramInt2 != -this.p)
          break;
        if (this.n == ScrollDownLayout.InnerStatus.CLOSED)
          continue;
        this.n = ScrollDownLayout.InnerStatus.CLOSED;
        return;
      }
    while ((paramInt2 != -this.o) || (this.n == ScrollDownLayout.InnerStatus.OPENED));
    this.n = ScrollDownLayout.InnerStatus.OPENED;
  }

  public void setAllowHorizontalScroll(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public void setAssociatedListView(AbsListView paramAbsListView)
  {
    paramAbsListView.setOnScrollListener(this.b);
    a(paramAbsListView);
  }

  public void setAssociatedRecyclerView(ObservableRecyclerView paramObservableRecyclerView)
  {
    paramObservableRecyclerView.a(new o(this));
    if (!bg.b(paramObservableRecyclerView, -1));
    for (boolean bool = true; ; bool = false)
    {
      setDraggable(bool);
      return;
    }
  }

  public void setDraggable(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public void setEnable(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }

  public void setMaxOffset(int paramInt)
  {
    this.o = paramInt;
  }

  public void setMinOffset(int paramInt)
  {
    this.p = paramInt;
  }

  public void setOnScrollChangedListener(q paramq)
  {
    this.q = paramq;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.ScrollDownLayout
 * JD-Core Version:    0.6.0
 */