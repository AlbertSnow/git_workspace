package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.content.a;
import android.support.v4.view.al;
import android.support.v4.view.bg;
import android.support.v4.view.bx;
import android.support.v7.app.f;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class DrawerLayout extends ViewGroup
  implements w
{
  private static final int[] a;
  private static final boolean b;
  private static o w;
  private final n c = new n();
  private int d;
  private int e = -1728053248;
  private float f;
  private Paint g = new Paint();
  private final bi h;
  private final bi i;
  private final s j;
  private final s k;
  private int l;
  private boolean m;
  private boolean n = true;
  private int o;
  private int p;
  private boolean q;
  private float r;
  private float s;
  private Drawable t;
  private Object u;
  private boolean v;

  static
  {
    boolean bool = true;
    int[] arrayOfInt = new int[bool];
    arrayOfInt[0] = 16842931;
    a = arrayOfInt;
    if (Build.VERSION.SDK_INT >= 19);
    while (true)
    {
      b = bool;
      if (Build.VERSION.SDK_INT < 21)
        break;
      w = new p();
      return;
      bool = false;
    }
    w = new q();
  }

  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.d = (int)(0.5F + 64.0F * f1);
    float f2 = f1 * 400.0F;
    this.j = new s(this, 3);
    this.k = new s(this, 5);
    this.h = bi.a(this, 1.0F, this.j);
    this.h.a(1);
    this.h.a(f2);
    this.j.a(this.h);
    this.i = bi.a(this, 1.0F, this.k);
    this.i.a(2);
    this.i.a(f2);
    this.k.a(this.i);
    setFocusableInTouchMode(true);
    bg.c(this, 1);
    bg.a(this, new m(this));
    bx.a(this);
    if (bg.x(this))
    {
      w.a(this);
      this.t = w.a(paramContext);
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = android.support.v4.view.m.a(paramInt2, bg.h(this));
    bi localbi;
    if (i1 == 3)
    {
      this.o = paramInt1;
      if (paramInt1 != 0)
      {
        if (i1 != 3)
          break label78;
        localbi = this.h;
        label34: localbi.e();
      }
      switch (paramInt1)
      {
      default:
      case 2:
      case 1:
      }
    }
    label78: View localView1;
    do
    {
      View localView2;
      do
      {
        return;
        if (i1 != 5)
          break;
        this.p = paramInt1;
        break;
        localbi = this.i;
        break label34;
        localView2 = a(i1);
      }
      while (localView2 == null);
      h(localView2);
      return;
      localView1 = a(i1);
    }
    while (localView1 == null);
    e(localView1);
  }

  static void a(View paramView, float paramFloat)
  {
    DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    if (paramFloat == localLayoutParams.b)
      return;
    localLayoutParams.b = paramFloat;
  }

  private void a(View paramView, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      if (((!paramBoolean) && (!d(localView))) || ((paramBoolean) && (localView == paramView)))
        bg.c(localView, 1);
      while (true)
      {
        i2++;
        break;
        bg.c(localView, 4);
      }
    }
  }

  private void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool = false;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
      if ((d(localView)) && ((!paramBoolean) || (localLayoutParams.c)))
      {
        int i3 = localView.getWidth();
        if (!a(localView, 3))
          break label103;
        bool |= this.h.a(localView, -i3, localView.getTop());
      }
      while (true)
      {
        localLayoutParams.c = false;
        i2++;
        break;
        label103: bool |= this.i.a(localView, getWidth(), localView.getTop());
      }
    }
    this.j.a();
    this.k.a();
    if (bool)
      invalidate();
  }

  static float b(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).b;
  }

  private View d()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (((DrawerLayout.LayoutParams)localView.getLayoutParams()).d)
        return localView;
    }
    return null;
  }

  static boolean d(View paramView)
  {
    return (0x7 & android.support.v4.view.m.a(((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a, bg.h(paramView))) != 0;
  }

  private View e()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (!d(localView))
        continue;
      if (!d(localView))
        throw new IllegalArgumentException("View " + localView + " is not a drawer");
      if (((DrawerLayout.LayoutParams)localView.getLayoutParams()).b > 0.0F);
      for (int i3 = 1; i3 != 0; i3 = 0)
        return localView;
    }
    return null;
  }

  private static boolean g(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a == 0;
  }

  private void h(View paramView)
  {
    if (!d(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    if (this.n)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.b = 1.0F;
      localLayoutParams.d = true;
      a(paramView, true);
    }
    while (true)
    {
      invalidate();
      return;
      if (a(paramView, 3))
      {
        this.h.a(paramView, 0, paramView.getTop());
        continue;
      }
      this.i.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
    }
  }

  public final int a(View paramView)
  {
    int i1 = c(paramView);
    if (i1 == 3)
      return this.o;
    if (i1 == 5)
      return this.p;
    return 0;
  }

  final View a(int paramInt)
  {
    int i1 = 0x7 & android.support.v4.view.m.a(paramInt, bg.h(this));
    int i2 = getChildCount();
    for (int i3 = 0; i3 < i2; i3++)
    {
      View localView = getChildAt(i3);
      if ((0x7 & c(localView)) == i1)
        return localView;
    }
    return null;
  }

  final void a()
  {
    int i1 = 0;
    if (!this.q)
    {
      long l1 = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
      int i2 = getChildCount();
      while (i1 < i2)
      {
        getChildAt(i1).dispatchTouchEvent(localMotionEvent);
        i1++;
      }
      localMotionEvent.recycle();
      this.q = true;
    }
  }

  final void a(int paramInt, View paramView)
  {
    int i1 = this.h.a();
    int i2 = this.i.a();
    int i3;
    DrawerLayout.LayoutParams localLayoutParams1;
    if ((i1 == 1) || (i2 == 1))
    {
      i3 = 1;
      if ((paramView != null) && (paramInt == 0))
      {
        localLayoutParams1 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
        if (localLayoutParams1.b != 0.0F)
          break label151;
        DrawerLayout.LayoutParams localLayoutParams3 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
        if (localLayoutParams3.d)
        {
          localLayoutParams3.d = false;
          a(paramView, false);
          if (hasWindowFocus())
          {
            View localView = getRootView();
            if (localView != null)
              localView.sendAccessibilityEvent(32);
          }
        }
      }
    }
    while (true)
    {
      if (i3 != this.l)
        this.l = i3;
      return;
      if ((i1 == 2) || (i2 == 2))
      {
        i3 = 2;
        break;
      }
      i3 = 0;
      break;
      label151: if (localLayoutParams1.b != 1.0F)
        continue;
      DrawerLayout.LayoutParams localLayoutParams2 = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      if (localLayoutParams2.d)
        continue;
      localLayoutParams2.d = true;
      a(paramView, true);
      if (hasWindowFocus())
        sendAccessibilityEvent(32);
      paramView.requestFocus();
    }
  }

  public final void a(Object paramObject, boolean paramBoolean)
  {
    this.u = paramObject;
    this.v = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null));
    for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      requestLayout();
      return;
    }
  }

  final boolean a(View paramView, int paramInt)
  {
    return (paramInt & c(paramView)) == paramInt;
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((d() != null) || (d(paramView)))
      bg.c(paramView, 4);
    while (true)
    {
      if (!b)
        bg.a(paramView, this.c);
      return;
      bg.c(paramView, 1);
    }
  }

  final int c(View paramView)
  {
    return android.support.v4.view.m.a(((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a, bg.h(this));
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof DrawerLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    int i1 = getChildCount();
    float f1 = 0.0F;
    for (int i2 = 0; i2 < i1; i2++)
      f1 = Math.max(f1, ((DrawerLayout.LayoutParams)getChildAt(i2).getLayoutParams()).b);
    this.f = f1;
    if ((this.h.g() | this.i.g()))
      bg.d(this);
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = g(paramView);
    int i2 = getWidth();
    int i3 = paramCanvas.save();
    int i4 = 0;
    int i8;
    View localView;
    int i10;
    label94: int i11;
    if (bool1)
    {
      int i7 = getChildCount();
      i8 = 0;
      if (i8 < i7)
      {
        localView = getChildAt(i8);
        if ((localView != paramView) && (localView.getVisibility() == 0))
        {
          Drawable localDrawable = localView.getBackground();
          if (localDrawable != null)
            if (localDrawable.getOpacity() == -1)
            {
              i10 = 1;
              if ((i10 == 0) || (!d(localView)) || (localView.getHeight() < i1))
                break label185;
              if (!a(localView, 3))
                break label171;
              i11 = localView.getRight();
              if (i11 <= i4)
                break label303;
            }
        }
      }
    }
    while (true)
    {
      i4 = i11;
      int i9 = i2;
      while (true)
      {
        i8++;
        i2 = i9;
        break;
        i10 = 0;
        break label94;
        i10 = 0;
        break label94;
        label171: i9 = localView.getLeft();
        if (i9 < i2)
          continue;
        label185: i9 = i2;
      }
      paramCanvas.clipRect(i4, 0, i2, getHeight());
      int i5 = i2;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i3);
      if ((this.f > 0.0F) && (bool1))
      {
        int i6 = (int)(((0xFF000000 & this.e) >>> 24) * this.f) << 24 | 0xFFFFFF & this.e;
        this.g.setColor(i6);
        paramCanvas.drawRect(i4, 0.0F, i5, getHeight(), this.g);
      }
      return bool2;
      label303: i11 = i4;
    }
  }

  public final void e(View paramView)
  {
    if (!d(paramView))
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    if (this.n)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.b = 0.0F;
      localLayoutParams.d = false;
    }
    while (true)
    {
      invalidate();
      return;
      if (a(paramView, 3))
      {
        this.h.a(paramView, -paramView.getWidth(), paramView.getTop());
        continue;
      }
      this.i.a(paramView, getWidth(), paramView.getTop());
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new DrawerLayout.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new DrawerLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof DrawerLayout.LayoutParams))
      return new DrawerLayout.LayoutParams((DrawerLayout.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new DrawerLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new DrawerLayout.LayoutParams(paramLayoutParams);
  }

  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.t;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.n = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.n = true;
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.v) && (this.t != null))
    {
      int i1 = w.a(this.u);
      if (i1 > 0)
      {
        this.t.setBounds(0, 0, getWidth(), i1);
        this.t.draw(paramCanvas);
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = al.a(paramMotionEvent);
    boolean bool1 = this.h.a(paramMotionEvent) | this.i.a(paramMotionEvent);
    label59: int i5;
    label77: int i6;
    switch (i1)
    {
    default:
      i2 = 0;
      if ((!bool1) && (i2 == 0))
      {
        int i4 = getChildCount();
        i5 = 0;
        if (i5 >= i4)
          break label251;
        if (!((DrawerLayout.LayoutParams)getChildAt(i5).getLayoutParams()).c)
          break;
        i6 = 1;
        if (i6 == 0)
        {
          boolean bool2 = this.q;
          i3 = 0;
          if (!bool2)
            break label127;
        }
      }
      int i3 = 1;
      return i3;
    case 0:
      label105: label127: float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.r = f1;
      this.s = f2;
      if (this.f > 0.0F)
      {
        View localView = this.h.b((int)f1, (int)f2);
        if ((localView == null) || (!g(localView)));
      }
    case 2:
    case 1:
    case 3:
    }
    for (int i2 = 1; ; i2 = 0)
    {
      this.q = false;
      break label59;
      if (!this.h.h())
        break;
      this.j.a();
      this.k.a();
      i2 = 0;
      break label59;
      a(true);
      this.q = false;
      break;
      i5++;
      break label77;
      label251: i6 = 0;
      break label105;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (e() != null);
      for (int i1 = 1; i1 != 0; i1 = 0)
      {
        android.support.v4.view.q.c(paramKeyEvent);
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      View localView = e();
      if ((localView != null) && (a(localView) == 0))
        a(false);
      int i1 = 0;
      if (localView != null)
        i1 = 1;
      return i1;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.m = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    int i3 = 0;
    while (i3 < i2)
    {
      View localView = getChildAt(i3);
      DrawerLayout.LayoutParams localLayoutParams;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        if (g(localView))
          localView.layout(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.leftMargin + localView.getMeasuredWidth(), localLayoutParams.topMargin + localView.getMeasuredHeight());
      }
      else
      {
        i3++;
        continue;
      }
      int i4 = localView.getMeasuredWidth();
      int i5 = localView.getMeasuredHeight();
      int i6;
      float f1;
      label158: int i7;
      if (a(localView, 3))
      {
        i6 = -i4 + (int)(i4 * localLayoutParams.b);
        f1 = (i4 + i6) / i4;
        if (f1 == localLayoutParams.b)
          break label308;
        i7 = 1;
        label172: switch (0x70 & localLayoutParams.a)
        {
        default:
          localView.layout(i6, localLayoutParams.topMargin, i4 + i6, i5 + localLayoutParams.topMargin);
          label233: if (i7 != 0)
            a(localView, f1);
          if (localLayoutParams.b <= 0.0F)
            break;
        case 80:
        case 16:
        }
      }
      for (int i10 = 0; localView.getVisibility() != i10; i10 = 4)
      {
        localView.setVisibility(i10);
        break;
        i6 = i1 - (int)(i4 * localLayoutParams.b);
        f1 = (i1 - i6) / i4;
        break label158;
        label308: i7 = 0;
        break label172;
        int i11 = paramInt4 - paramInt2;
        localView.layout(i6, i11 - localLayoutParams.bottomMargin - localView.getMeasuredHeight(), i4 + i6, i11 - localLayoutParams.bottomMargin);
        break label233;
        int i8 = paramInt4 - paramInt2;
        int i9 = (i8 - i5) / 2;
        if (i9 < localLayoutParams.topMargin)
          i9 = localLayoutParams.topMargin;
        while (true)
        {
          localView.layout(i6, i9, i4 + i6, i5 + i9);
          break;
          if (i9 + i5 <= i8 - localLayoutParams.bottomMargin)
            continue;
          i9 = i8 - localLayoutParams.bottomMargin - i5;
        }
      }
    }
    this.m = false;
    this.n = false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 300;
    int i2 = 0;
    int i3 = View.MeasureSpec.getMode(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i5 = View.MeasureSpec.getSize(paramInt1);
    int i6 = View.MeasureSpec.getSize(paramInt2);
    if ((i3 != 1073741824) || (i4 != 1073741824))
      if (isInEditMode())
      {
        if ((i3 != -2147483648) && (i3 == 0))
          i5 = i1;
        if ((i4 == -2147483648) || (i4 != 0))
          break label487;
      }
    while (true)
    {
      setMeasuredDimension(i5, i1);
      int i7;
      label119: View localView;
      DrawerLayout.LayoutParams localLayoutParams;
      int i11;
      if ((this.u != null) && (bg.x(this)))
      {
        i7 = 1;
        int i8 = bg.h(this);
        int i9 = getChildCount();
        if (i2 >= i9)
          break label486;
        localView = getChildAt(i2);
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
          if (i7 != 0)
          {
            i11 = android.support.v4.view.m.a(localLayoutParams.a, i8);
            if (!bg.x(localView))
              break label270;
            w.a(localView, this.u, i11);
          }
          label195: if (!g(localView))
            break label289;
          localView.measure(View.MeasureSpec.makeMeasureSpec(i5 - localLayoutParams.leftMargin - localLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i1 - localLayoutParams.topMargin - localLayoutParams.bottomMargin, 1073741824));
        }
      }
      while (true)
      {
        i2++;
        break label119;
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        i7 = 0;
        break;
        label270: w.a(localLayoutParams, this.u, i11);
        break label195;
        label289: if (!d(localView))
          break label443;
        int i10 = 0x7 & c(localView);
        if ((i10 & 0x0) != 0)
        {
          StringBuilder localStringBuilder = new StringBuilder("Child drawer has absolute gravity ");
          String str;
          if ((i10 & 0x3) == 3)
            str = "LEFT";
          while (true)
          {
            throw new IllegalStateException(str + " but this DrawerLayout already has a drawer view along that edge");
            if ((i10 & 0x5) == 5)
            {
              str = "RIGHT";
              continue;
            }
            str = Integer.toHexString(i10);
          }
        }
        localView.measure(getChildMeasureSpec(paramInt1, this.d + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), getChildMeasureSpec(paramInt2, localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height));
      }
      label443: throw new IllegalStateException("Child " + localView + " at index " + i2 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
      label486: return;
      label487: i1 = i6;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    DrawerLayout.SavedState localSavedState = (DrawerLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a != 0)
    {
      View localView = a(localSavedState.a);
      if (localView != null)
        h(localView);
    }
    a(localSavedState.b, 3);
    a(localSavedState.c, 5);
  }

  protected Parcelable onSaveInstanceState()
  {
    DrawerLayout.SavedState localSavedState = new DrawerLayout.SavedState(super.onSaveInstanceState());
    View localView = d();
    if (localView != null)
      localSavedState.a = ((DrawerLayout.LayoutParams)localView.getLayoutParams()).a;
    localSavedState.b = this.o;
    localSavedState.c = this.p;
    return localSavedState;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.h.b(paramMotionEvent);
    this.i.b(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 2:
    default:
      return true;
    case 0:
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.r = f5;
      this.s = f6;
      this.q = false;
      return true;
    case 1:
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      View localView1 = this.h.b((int)f1, (int)f2);
      if ((localView1 != null) && (g(localView1)))
      {
        float f3 = f1 - this.r;
        float f4 = f2 - this.s;
        int i1 = this.h.d();
        if (f3 * f3 + f4 * f4 < i1 * i1)
        {
          View localView2 = d();
          if (localView2 != null)
          {
            int i2 = a(localView2);
            bool = false;
            if (i2 != 2)
              break;
          }
        }
      }
    case 3:
    }
    for (boolean bool = true; ; bool = true)
    {
      a(bool);
      return true;
      a(true);
      this.q = false;
      return true;
    }
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean)
      a(true);
  }

  public void requestLayout()
  {
    if (!this.m)
      super.requestLayout();
  }

  public void setDrawerListener$1b20c458(f paramf)
  {
  }

  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }

  public void setScrimColor(int paramInt)
  {
    this.e = paramInt;
    invalidate();
  }

  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0);
    for (Drawable localDrawable = a.a(getContext(), paramInt); ; localDrawable = null)
    {
      this.t = localDrawable;
      invalidate();
      return;
    }
  }

  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.t = paramDrawable;
    invalidate();
  }

  public void setStatusBarBackgroundColor(int paramInt)
  {
    this.t = new ColorDrawable(paramInt);
    invalidate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.DrawerLayout
 * JD-Core Version:    0.6.0
 */