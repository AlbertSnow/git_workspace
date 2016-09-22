package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.al;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

public class SwipeRefreshLayout extends ViewGroup
{
  private static final int[] p;
  private int A;
  private boolean B;
  private Animation.AnimationListener C = new ba(this);
  private final Animation D = new bf(this);
  private final Animation E = new bg(this);
  protected int a;
  protected int b;
  private View c;
  private bh d;
  private boolean e = false;
  private int f;
  private float g = -1.0F;
  private int h;
  private int i;
  private boolean j = false;
  private float k;
  private float l;
  private boolean m;
  private int n = -1;
  private final DecelerateInterpolator o;
  private d q;
  private int r = -1;
  private ad s;
  private Animation t;
  private Animation u;
  private Animation v;
  private Animation w;
  private float x;
  private boolean y;
  private int z;

  static
  {
    SwipeRefreshLayout.class.getSimpleName();
    p = new int[] { 16842766 };
  }

  public SwipeRefreshLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.h = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.o = new DecelerateInterpolator(2.0F);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p);
    setEnabled(localTypedArray.getBoolean(0, true));
    localTypedArray.recycle();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.z = (int)(40.0F * localDisplayMetrics.density);
    this.A = (int)(40.0F * localDisplayMetrics.density);
    this.q = new d(getContext());
    this.s = new ad(getContext(), this);
    this.s.b(-328966);
    this.q.setImageDrawable(this.s);
    this.q.setVisibility(8);
    addView(this.q);
    android.support.v4.view.bg.a(this);
    this.x = (64.0F * localDisplayMetrics.density);
    this.g = this.x;
  }

  private static float a(MotionEvent paramMotionEvent, int paramInt)
  {
    int i1 = al.a(paramMotionEvent, paramInt);
    if (i1 < 0)
      return -1.0F;
    return al.d(paramMotionEvent, i1);
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    this.q.bringToFront();
    this.q.offsetTopAndBottom(paramInt);
    this.i = this.q.getTop();
    if ((paramBoolean) && (Build.VERSION.SDK_INT < 11))
      invalidate();
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = al.b(paramMotionEvent);
    if (al.b(paramMotionEvent, i1) == this.n)
      if (i1 != 0)
        break label33;
    label33: for (int i2 = 1; ; i2 = 0)
    {
      this.n = al.b(paramMotionEvent, i2);
      return;
    }
  }

  private void a(Animation.AnimationListener paramAnimationListener)
  {
    this.u = new bc(this);
    this.u.setDuration(150L);
    this.q.a(paramAnimationListener);
    this.q.clearAnimation();
    this.q.startAnimation(this.u);
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.e != paramBoolean1)
    {
      this.y = paramBoolean2;
      c();
      this.e = paramBoolean1;
      if (this.e)
      {
        int i1 = this.i;
        Animation.AnimationListener localAnimationListener = this.C;
        this.a = i1;
        this.D.reset();
        this.D.setDuration(200L);
        this.D.setInterpolator(this.o);
        if (localAnimationListener != null)
          this.q.a(localAnimationListener);
        this.q.clearAnimation();
        this.q.startAnimation(this.D);
      }
    }
    else
    {
      return;
    }
    a(this.C);
  }

  private static boolean a(Animation paramAnimation)
  {
    return (paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded());
  }

  private Animation b(int paramInt1, int paramInt2)
  {
    bd localbd = new bd(this, paramInt1, paramInt2);
    localbd.setDuration(300L);
    this.q.a(null);
    this.q.clearAnimation();
    this.q.startAnimation(localbd);
    return localbd;
  }

  private void c()
  {
    if (this.c == null);
    for (int i1 = 0; ; i1++)
    {
      if (i1 < getChildCount())
      {
        View localView = getChildAt(i1);
        if (localView.equals(this.q))
          continue;
        this.c = localView;
      }
      return;
    }
  }

  private boolean d()
  {
    if (Build.VERSION.SDK_INT < 14)
    {
      if ((this.c instanceof AbsListView))
      {
        AbsListView localAbsListView = (AbsListView)this.c;
        return (localAbsListView.getChildCount() > 0) && ((localAbsListView.getFirstVisiblePosition() > 0) || (localAbsListView.getChildAt(0).getTop() < localAbsListView.getPaddingTop()));
      }
      return (android.support.v4.view.bg.b(this.c, -1)) || (this.c.getScrollY() > 0);
    }
    return android.support.v4.view.bg.b(this.c, -1);
  }

  private void setAnimationProgress(float paramFloat)
  {
    if (Build.VERSION.SDK_INT < 11);
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      setColorViewAlpha((int)(255.0F * paramFloat));
      return;
    }
    android.support.v4.view.bg.g(this.q, paramFloat);
    android.support.v4.view.bg.h(this.q, paramFloat);
  }

  private void setColorViewAlpha(int paramInt)
  {
    this.q.getBackground().setAlpha(paramInt);
    this.s.setAlpha(paramInt);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.q.setVisibility(8);
    this.i = paramInt1;
    this.b = paramInt1;
    this.x = paramInt2;
    this.B = true;
    this.q.invalidate();
  }

  public final boolean a()
  {
    return this.e;
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.r < 0);
    do
    {
      return paramInt2;
      if (paramInt2 == paramInt1 - 1)
        return this.r;
    }
    while (paramInt2 < this.r);
    return paramInt2 + 1;
  }

  public int getProgressCircleDiameter()
  {
    if (this.q != null)
      return this.q.getMeasuredHeight();
    return 0;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    c();
    int i1 = al.a(paramMotionEvent);
    if ((!isEnabled()) || (d()) || (this.e))
      return false;
    switch (i1)
    {
    case 4:
    case 5:
    default:
    case 0:
    case 2:
    case 6:
    case 1:
    case 3:
    }
    while (true)
    {
      return this.m;
      a(this.b - this.q.getTop(), true);
      this.n = al.b(paramMotionEvent, 0);
      this.m = false;
      float f2 = a(paramMotionEvent, this.n);
      if (f2 == -1.0F)
        break;
      this.l = f2;
      continue;
      if (this.n == -1)
        break;
      float f1 = a(paramMotionEvent, this.n);
      if (f1 == -1.0F)
        break;
      if ((f1 - this.l <= this.f) || (this.m))
        continue;
      this.k = (this.l + this.f);
      this.m = true;
      this.s.setAlpha(76);
      continue;
      a(paramMotionEvent);
      continue;
      this.m = false;
      this.n = -1;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    if (getChildCount() == 0);
    do
    {
      return;
      if (this.c != null)
        continue;
      c();
    }
    while (this.c == null);
    View localView = this.c;
    int i3 = getPaddingLeft();
    int i4 = getPaddingTop();
    int i5 = i1 - getPaddingLeft() - getPaddingRight();
    int i6 = i2 - getPaddingTop() - getPaddingBottom();
    localView.layout(i3, i4, i5 + i3, i6 + i4);
    int i7 = this.q.getMeasuredWidth();
    int i8 = this.q.getMeasuredHeight();
    this.q.layout(i1 / 2 - i7 / 2, this.i, i1 / 2 + i7 / 2, i8 + this.i);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.c == null)
      c();
    if (this.c == null);
    while (true)
    {
      return;
      this.c.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
      this.q.measure(View.MeasureSpec.makeMeasureSpec(this.z, 1073741824), View.MeasureSpec.makeMeasureSpec(this.A, 1073741824));
      if ((!this.B) && (!this.j))
      {
        this.j = true;
        int i2 = -this.q.getMeasuredHeight();
        this.b = i2;
        this.i = i2;
      }
      this.r = -1;
      for (int i1 = 0; i1 < getChildCount(); i1++)
      {
        if (getChildAt(i1) != this.q)
          continue;
        this.r = i1;
        return;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = al.a(paramMotionEvent);
    if ((!isEnabled()) || (d()))
      return false;
    switch (i1)
    {
    case 4:
    default:
    case 0:
    case 2:
    case 5:
    case 6:
      while (true)
      {
        return true;
        this.n = al.b(paramMotionEvent, 0);
        this.m = false;
        continue;
        int i2 = al.a(paramMotionEvent, this.n);
        if (i2 < 0)
          return false;
        float f2 = 0.5F * (al.d(paramMotionEvent, i2) - this.k);
        if (!this.m)
          continue;
        this.s.a(true);
        float f3 = f2 / this.g;
        if (f3 < 0.0F)
          return false;
        float f4 = Math.min(1.0F, Math.abs(f3));
        float f5 = 5.0F * (float)Math.max(f4 - 0.4D, 0.0D) / 3.0F;
        float f6 = Math.abs(f2) - this.g;
        float f7;
        label214: float f9;
        int i3;
        if (this.B)
        {
          f7 = this.x - this.b;
          float f8 = Math.max(0.0F, Math.min(f6, f7 * 2.0F) / f7);
          f9 = 2.0F * (float)(f8 / 4.0F - Math.pow(f8 / 4.0F, 2.0D));
          float f10 = 2.0F * (f7 * f9);
          i3 = this.b + (int)(f10 + f7 * f4);
          if (this.q.getVisibility() != 0)
            this.q.setVisibility(0);
          android.support.v4.view.bg.g(this.q, 1.0F);
          android.support.v4.view.bg.h(this.q, 1.0F);
          if (f2 >= this.g)
            break label456;
          if ((this.s.getAlpha() > 76) && (!a(this.v)))
            this.v = b(this.s.getAlpha(), 76);
          float f12 = 0.8F * f5;
          this.s.b(Math.min(0.8F, f12));
          this.s.a(Math.min(1.0F, f5));
        }
        while (true)
        {
          float f11 = 0.5F * (-0.25F + 0.4F * f5 + f9 * 2.0F);
          this.s.c(f11);
          a(i3 - this.i, true);
          break;
          f7 = this.x;
          break label214;
          label456: if ((this.s.getAlpha() >= 255) || (a(this.w)))
            continue;
          this.w = b(this.s.getAlpha(), 255);
        }
        this.n = al.b(paramMotionEvent, al.b(paramMotionEvent));
        continue;
        a(paramMotionEvent);
      }
    case 1:
    case 3:
    }
    if (this.n == -1)
      return false;
    float f1 = 0.5F * (al.d(paramMotionEvent, al.a(paramMotionEvent, this.n)) - this.k);
    this.m = false;
    if (f1 > this.g)
      a(true, true);
    while (true)
    {
      this.n = -1;
      return false;
      this.e = false;
      this.s.b(0.0F);
      be localbe = new be(this);
      this.a = this.i;
      this.E.reset();
      this.E.setDuration(200L);
      this.E.setInterpolator(this.o);
      this.q.a(localbe);
      this.q.clearAnimation();
      this.q.startAnimation(this.E);
      this.s.a(false);
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
  }

  @Deprecated
  public void setColorScheme(int[] paramArrayOfInt)
  {
    setColorSchemeResources(paramArrayOfInt);
  }

  public void setColorSchemeColors(int[] paramArrayOfInt)
  {
    c();
    this.s.a(paramArrayOfInt);
  }

  public void setColorSchemeResources(int[] paramArrayOfInt)
  {
    Resources localResources = getResources();
    int[] arrayOfInt = new int[paramArrayOfInt.length];
    for (int i1 = 0; i1 < paramArrayOfInt.length; i1++)
      arrayOfInt[i1] = localResources.getColor(paramArrayOfInt[i1]);
    setColorSchemeColors(arrayOfInt);
  }

  public void setDistanceToTriggerSync(int paramInt)
  {
    this.g = paramInt;
  }

  public void setOnRefreshListener(bh parambh)
  {
    this.d = parambh;
  }

  @Deprecated
  public void setProgressBackgroundColor(int paramInt)
  {
    setProgressBackgroundColorSchemeResource(paramInt);
  }

  public void setProgressBackgroundColorSchemeColor(int paramInt)
  {
    this.q.setBackgroundColor(paramInt);
    this.s.b(paramInt);
  }

  public void setProgressBackgroundColorSchemeResource(int paramInt)
  {
    setProgressBackgroundColorSchemeColor(getResources().getColor(paramInt));
  }

  public void setRefreshing(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != paramBoolean))
    {
      this.e = paramBoolean;
      if (!this.B);
      for (int i1 = (int)(this.x + this.b); ; i1 = (int)this.x)
      {
        a(i1 - this.i, true);
        this.y = false;
        Animation.AnimationListener localAnimationListener = this.C;
        this.q.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11)
          this.s.setAlpha(255);
        this.t = new bb(this);
        this.t.setDuration(this.h);
        if (localAnimationListener != null)
          this.q.a(localAnimationListener);
        this.q.clearAnimation();
        this.q.startAnimation(this.t);
        return;
      }
    }
    a(paramBoolean, false);
  }

  public void setSize(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1))
      return;
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    int i2;
    if (paramInt == 0)
    {
      i2 = (int)(56.0F * localDisplayMetrics.density);
      this.z = i2;
    }
    int i1;
    for (this.A = i2; ; this.A = i1)
    {
      this.q.setImageDrawable(null);
      this.s.a(paramInt);
      this.q.setImageDrawable(this.s);
      return;
      i1 = (int)(40.0F * localDisplayMetrics.density);
      this.z = i1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout
 * JD-Core Version:    0.6.0
 */