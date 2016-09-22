package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.c.a;
import android.support.v4.view.al;
import android.support.v4.view.aq;
import android.support.v4.view.ar;
import android.support.v4.view.bc;
import android.support.v4.view.bg;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView extends FrameLayout
  implements aq, ar
{
  private static final ai v = new ai();
  private static final int[] w = { 16843130 };
  private long a;
  private final Rect b = new Rect();
  private ao c = new ao(getContext(), null);
  private x d;
  private x e;
  private int f;
  private boolean g = true;
  private boolean h = false;
  private View i = null;
  private boolean j = false;
  private VelocityTracker k;
  private boolean l;
  private boolean m = true;
  private int n;
  private int o;
  private int p;
  private int q = -1;
  private final int[] r = new int[2];
  private final int[] s = new int[2];
  private int t;
  private NestedScrollView.SavedState u;
  private final p x;
  private final a y;
  private float z;

  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.n = localViewConfiguration.getScaledTouchSlop();
    this.o = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.p = localViewConfiguration.getScaledMaximumFlingVelocity();
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, w, paramInt, 0);
    setFillViewport(localTypedArray.getBoolean(0, false));
    localTypedArray.recycle();
    this.x = new p();
    this.y = new a(this);
    setNestedScrollingEnabled(true);
    bg.a(this, v);
  }

  private int a(Rect paramRect)
  {
    if (getChildCount() == 0)
      return 0;
    int i1 = getHeight();
    int i2 = getScrollY();
    int i3 = i2 + i1;
    int i4 = getVerticalFadingEdgeLength();
    if (paramRect.top > 0)
      i2 += i4;
    if (paramRect.bottom < getChildAt(0).getHeight())
      i3 -= i4;
    int i7;
    int i5;
    if ((paramRect.bottom > i3) && (paramRect.top > i2))
      if (paramRect.height() > i1)
      {
        i7 = 0 + (paramRect.top - i2);
        i5 = Math.min(i7, getChildAt(0).getBottom() - i3);
      }
    while (true)
    {
      return i5;
      i7 = 0 + (paramRect.bottom - i3);
      break;
      if ((paramRect.top < i2) && (paramRect.bottom < i3))
      {
        if (paramRect.height() > i1);
        for (int i6 = 0 - (i3 - paramRect.bottom); ; i6 = 0 - (i2 - paramRect.top))
        {
          i5 = Math.max(i6, -getScrollY());
          break;
        }
      }
      i5 = 0;
    }
  }

  private void a()
  {
    if (this.k == null)
      this.k = VelocityTracker.obtain();
  }

  private void a(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0)
      return;
    if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250L)
    {
      int i1 = getHeight() - getPaddingBottom() - getPaddingTop();
      int i2 = Math.max(0, getChildAt(0).getHeight() - i1);
      int i3 = getScrollY();
      int i4 = Math.max(0, Math.min(i3 + paramInt2, i2)) - i3;
      ao localao = this.c;
      int i5 = getScrollX();
      localao.b.a(localao.a, i5, i3, i4);
      bg.d(this);
    }
    while (true)
    {
      this.a = AnimationUtils.currentAnimationTimeMillis();
      return;
      if (!this.c.a())
        this.c.h();
      scrollBy(paramInt1, paramInt2);
    }
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = (0xFF00 & paramMotionEvent.getAction()) >> 8;
    if (al.b(paramMotionEvent, i1) == this.q)
      if (i1 != 0)
        break label64;
    label64: for (int i2 = 1; ; i2 = 0)
    {
      this.f = (int)al.d(paramMotionEvent, i2);
      this.q = al.b(paramMotionEvent, i2);
      if (this.k != null)
        this.k.clear();
      return;
    }
  }

  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = getHeight();
    int i2 = getScrollY();
    int i3 = i2 + i1;
    int i4;
    Object localObject1;
    int i5;
    int i7;
    label53: View localView;
    int i10;
    int i11;
    int i13;
    label115: Object localObject2;
    int i12;
    if (paramInt1 == 33)
    {
      i4 = 1;
      ArrayList localArrayList = getFocusables(2);
      localObject1 = null;
      i5 = 0;
      int i6 = localArrayList.size();
      i7 = 0;
      if (i7 >= i6)
        break label254;
      localView = (View)localArrayList.get(i7);
      i10 = localView.getTop();
      i11 = localView.getBottom();
      if ((paramInt2 >= i11) || (i10 >= paramInt3))
        break label328;
      if ((paramInt2 >= i10) || (i11 >= paramInt3))
        break label152;
      i13 = 1;
      if (localObject1 != null)
        break label158;
      int i15 = i13;
      localObject2 = localView;
      i12 = i15;
    }
    while (true)
    {
      i7++;
      localObject1 = localObject2;
      i5 = i12;
      break label53;
      i4 = 0;
      break;
      label152: i13 = 0;
      break label115;
      label158: if (((i4 != 0) && (i10 < ((View)localObject1).getTop())) || ((i4 == 0) && (i11 > ((View)localObject1).getBottom())));
      for (int i14 = 1; ; i14 = 0)
      {
        if (i5 == 0)
          break label223;
        if ((i13 == 0) || (i14 == 0))
          break label328;
        localObject2 = localView;
        i12 = i5;
        break;
      }
      label223: if (i13 != 0)
      {
        localObject2 = localView;
        i12 = 1;
        continue;
      }
      if (i14 != 0)
      {
        localObject2 = localView;
        i12 = i5;
        continue;
        label254: if (localObject1 == null)
          localObject1 = this;
        int i9;
        if ((paramInt2 >= i2) && (paramInt3 <= i3))
        {
          i9 = 0;
          if (localObject1 != findFocus())
            ((View)localObject1).requestFocus(paramInt1);
          return i9;
        }
        if (i4 != 0);
        for (int i8 = paramInt2 - i2; ; i8 = paramInt3 - i3)
        {
          d(i8);
          i9 = 1;
          break;
        }
      }
      label328: i12 = i5;
      localObject2 = localObject1;
    }
  }

  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    bg.a(this);
    computeHorizontalScrollRange();
    computeHorizontalScrollExtent();
    computeVerticalScrollRange();
    computeVerticalScrollExtent();
    int i1 = paramInt3 + paramInt1;
    int i2 = paramInt4 + paramInt2;
    int i3 = paramInt5 + 0;
    boolean bool1;
    int i4;
    if (i1 > 0)
    {
      bool1 = true;
      i4 = 0;
    }
    while (true)
    {
      boolean bool2;
      if (i2 > i3)
      {
        i2 = i3;
        bool2 = true;
      }
      while (true)
      {
        onOverScrolled(i4, i2, bool1, bool2);
        int i5;
        if (!bool1)
        {
          i5 = 0;
          if (!bool2);
        }
        else
        {
          i5 = 1;
        }
        return i5;
        if (i1 >= 0)
          break label132;
        bool1 = true;
        i4 = 0;
        break;
        if (i2 < 0)
        {
          bool2 = true;
          i2 = 0;
          continue;
        }
        bool2 = false;
      }
      label132: i4 = i1;
      bool1 = false;
    }
  }

  private boolean a(View paramView)
  {
    boolean bool = a(paramView, 0, getHeight());
    int i1 = 0;
    if (!bool)
      i1 = 1;
    return i1;
  }

  private boolean a(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(paramView, this.b);
    return (paramInt1 + this.b.bottom >= getScrollY()) && (this.b.top - paramInt1 <= paramInt2 + getScrollY());
  }

  private static boolean a(View paramView1, View paramView2)
  {
    if (paramView1 == paramView2)
      return true;
    ViewParent localViewParent = paramView1.getParent();
    return ((localViewParent instanceof ViewGroup)) && (a((View)localViewParent, paramView2));
  }

  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 >= paramInt3) || (paramInt1 < 0))
      paramInt1 = 0;
    do
      return paramInt1;
    while (paramInt2 + paramInt1 <= paramInt3);
    return paramInt3 - paramInt2;
  }

  private void b()
  {
    if (this.k != null)
    {
      this.k.recycle();
      this.k = null;
    }
  }

  private void b(View paramView)
  {
    paramView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(paramView, this.b);
    int i1 = a(this.b);
    if (i1 != 0)
      scrollBy(0, i1);
  }

  private boolean b(int paramInt)
  {
    if (paramInt == 130);
    for (int i1 = 1; ; i1 = 0)
    {
      int i2 = getHeight();
      this.b.top = 0;
      this.b.bottom = i2;
      if (i1 != 0)
      {
        int i3 = getChildCount();
        if (i3 > 0)
        {
          View localView = getChildAt(i3 - 1);
          this.b.bottom = (localView.getBottom() + getPaddingBottom());
          this.b.top = (this.b.bottom - i2);
        }
      }
      return a(paramInt, this.b.top, this.b.bottom);
    }
  }

  private void c()
  {
    this.j = false;
    b();
    if (this.d != null)
    {
      this.d.c();
      this.e.c();
    }
  }

  private boolean c(int paramInt)
  {
    View localView1 = findFocus();
    if (localView1 == this)
      localView1 = null;
    View localView2 = FocusFinder.getInstance().findNextFocus(this, localView1, paramInt);
    int i1 = getMaxScrollAmount();
    if ((localView2 != null) && (a(localView2, i1, getHeight())))
    {
      localView2.getDrawingRect(this.b);
      offsetDescendantRectToMyCoords(localView2, this.b);
      d(a(this.b));
      localView2.requestFocus(paramInt);
      if ((localView1 != null) && (localView1.isFocused()) && (a(localView1)))
      {
        int i4 = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(i4);
      }
      return true;
    }
    if ((paramInt == 33) && (getScrollY() < i1))
      i1 = getScrollY();
    while (i1 == 0)
    {
      return false;
      if ((paramInt != 130) || (getChildCount() <= 0))
        continue;
      int i2 = getChildAt(0).getBottom();
      int i3 = getScrollY() + getHeight() - getPaddingBottom();
      if (i2 - i3 >= i1)
        continue;
      i1 = i2 - i3;
    }
    if (paramInt == 130);
    while (true)
    {
      d(i1);
      break;
      i1 = -i1;
    }
  }

  private void d()
  {
    if (bg.a(this) != 2)
    {
      if (this.d == null)
      {
        Context localContext = getContext();
        this.d = new x(localContext);
        this.e = new x(localContext);
      }
      return;
    }
    this.d = null;
    this.e = null;
  }

  private void d(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.m)
        a(0, paramInt);
    }
    else
      return;
    scrollBy(0, paramInt);
  }

  private void e(int paramInt)
  {
    int i1 = getScrollY();
    if (((i1 > 0) || (paramInt > 0)) && ((i1 < getScrollRange()) || (paramInt < 0)));
    for (boolean bool = true; ; bool = false)
    {
      if (!dispatchNestedPreFling(0.0F, paramInt))
      {
        dispatchNestedFling(0.0F, paramInt, bool);
        if ((bool) && (getChildCount() > 0))
        {
          int i2 = getHeight() - getPaddingBottom() - getPaddingTop();
          int i3 = getChildAt(0).getHeight();
          ao localao = this.c;
          int i4 = getScrollX();
          int i5 = getScrollY();
          int i6 = Math.max(0, i3 - i2);
          int i7 = i2 / 2;
          localao.b.b(localao.a, i4, i5, paramInt, i6, i7);
          bg.d(this);
        }
      }
      return;
    }
  }

  private int getScrollRange()
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i1 > 0)
      i2 = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
    return i2;
  }

  private float getVerticalScrollFactorCompat()
  {
    if (this.z == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (!localContext.getTheme().resolveAttribute(16842829, localTypedValue, true))
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      this.z = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
    }
    return this.z;
  }

  public final void a(int paramInt)
  {
    a(0 - getScrollX(), paramInt - getScrollY());
  }

  public void addView(View paramView)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child");
    super.addView(paramView);
  }

  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child");
    super.addView(paramView, paramInt);
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child");
    super.addView(paramView, paramInt, paramLayoutParams);
  }

  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0)
      throw new IllegalStateException("ScrollView can host only one direct child");
    super.addView(paramView, paramLayoutParams);
  }

  public void computeScroll()
  {
    int i2;
    int i4;
    int i5;
    int i7;
    if (this.c.g())
    {
      int i1 = getScrollX();
      i2 = getScrollY();
      int i3 = this.c.b();
      i4 = this.c.c();
      if ((i1 != i3) || (i2 != i4))
      {
        i5 = getScrollRange();
        int i6 = bg.a(this);
        if ((i6 != 0) && ((i6 != 1) || (i5 <= 0)))
          break label130;
        i7 = 1;
        a(i3 - i1, i4 - i2, i1, i2, i5);
        if (i7 != 0)
        {
          d();
          if ((i4 > 0) || (i2 <= 0))
            break label136;
          this.d.a((int)this.c.f());
        }
      }
    }
    label130: label136: 
    do
    {
      return;
      i7 = 0;
      break;
    }
    while ((i4 < i5) || (i2 >= i5));
    this.e.a((int)this.c.f());
  }

  protected int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }

  protected int computeVerticalScrollRange()
  {
    int i1 = getChildCount();
    int i2 = getHeight() - getPaddingBottom() - getPaddingTop();
    int i3;
    if (i1 == 0)
      i3 = i2;
    int i4;
    int i5;
    do
    {
      return i3;
      i3 = getChildAt(0).getBottom();
      i4 = getScrollY();
      i5 = Math.max(0, i3 - i2);
      if (i4 < 0)
        return i3 - i4;
    }
    while (i4 <= i5);
    return i3 + (i4 - i5);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i2;
    boolean bool;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      this.b.setEmpty();
      View localView1 = getChildAt(0);
      if (localView1 == null)
        break label144;
      int i7 = localView1.getHeight();
      if (getHeight() >= i7 + getPaddingTop() + getPaddingBottom())
        break label138;
      i2 = 1;
      if (i2 != 0)
        break label162;
      if ((!isFocused()) || (paramKeyEvent.getKeyCode() == 4))
        break label156;
      View localView3 = findFocus();
      if (localView3 == this)
        localView3 = null;
      View localView4 = FocusFinder.getInstance().findNextFocus(this, localView3, 130);
      if ((localView4 == null) || (localView4 == this) || (!localView4.requestFocus(130)))
        break label150;
      bool = true;
    }
    while (true)
    {
      int i1 = 0;
      if (bool)
        i1 = 1;
      return i1;
      label138: i2 = 0;
      break;
      label144: i2 = 0;
      break;
      label150: bool = false;
      continue;
      label156: bool = false;
      continue;
      label162: if (paramKeyEvent.getAction() == 0);
      switch (paramKeyEvent.getKeyCode())
      {
      default:
        bool = false;
        break;
      case 19:
        if (!paramKeyEvent.isAltPressed())
        {
          bool = c(33);
          continue;
        }
        bool = b(33);
        break;
      case 20:
        if (!paramKeyEvent.isAltPressed())
        {
          bool = c(130);
          continue;
        }
        bool = b(130);
      case 62:
      }
    }
    int i3;
    label285: int i4;
    label296: int i5;
    if (paramKeyEvent.isShiftPressed())
    {
      i3 = 33;
      if (i3 != 130)
        break label424;
      i4 = 1;
      i5 = getHeight();
      if (i4 == 0)
        break label430;
      this.b.top = (i5 + getScrollY());
      int i6 = getChildCount();
      if (i6 > 0)
      {
        View localView2 = getChildAt(i6 - 1);
        if (i5 + this.b.top > localView2.getBottom())
          this.b.top = (localView2.getBottom() - i5);
      }
    }
    while (true)
    {
      this.b.bottom = (i5 + this.b.top);
      a(i3, this.b.top, this.b.bottom);
      break;
      i3 = 130;
      break label285;
      label424: i4 = 0;
      break label296;
      label430: this.b.top = (getScrollY() - i5);
      if (this.b.top >= 0)
        continue;
      this.b.top = 0;
    }
  }

  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.y.a(paramFloat1, paramFloat2, paramBoolean);
  }

  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.y.a(paramFloat1, paramFloat2);
  }

  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.y.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }

  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.y.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.d != null)
    {
      int i1 = getScrollY();
      if (!this.d.a())
      {
        int i5 = paramCanvas.save();
        int i6 = getWidth() - getPaddingLeft() - getPaddingRight();
        paramCanvas.translate(getPaddingLeft(), Math.min(0, i1));
        this.d.a(i6, getHeight());
        if (this.d.a(paramCanvas))
          bg.d(this);
        paramCanvas.restoreToCount(i5);
      }
      if (!this.e.a())
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth() - getPaddingLeft() - getPaddingRight();
        int i4 = getHeight();
        paramCanvas.translate(-i3 + getPaddingLeft(), i4 + Math.max(getScrollRange(), i1));
        paramCanvas.rotate(180.0F, i3, 0.0F);
        this.e.a(i3, i4);
        if (this.e.a(paramCanvas))
          bg.d(this);
        paramCanvas.restoreToCount(i2);
      }
    }
  }

  protected float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0)
      return 0.0F;
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getHeight() - getPaddingBottom();
    int i3 = getChildAt(0).getBottom() - getScrollY() - i2;
    if (i3 < i1)
      return i3 / i1;
    return 1.0F;
  }

  public int getMaxScrollAmount()
  {
    return (int)(0.5F * getHeight());
  }

  public int getNestedScrollAxes()
  {
    return this.x.a();
  }

  protected float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0)
      return 0.0F;
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getScrollY();
    if (i2 < i1)
      return i2 / i1;
    return 1.0F;
  }

  public boolean hasNestedScrollingParent()
  {
    return this.y.c();
  }

  public boolean isNestedScrollingEnabled()
  {
    return this.y.b();
  }

  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }

  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, paramInt2 + (getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin), localMarginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin, 0));
  }

  public void onAttachedToWindow()
  {
    this.h = false;
  }

  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((0x2 & al.d(paramMotionEvent)) != 0)
      switch (paramMotionEvent.getAction())
      {
      default:
      case 8:
      }
    while (true)
    {
      return false;
      if (this.j)
        continue;
      float f1 = al.e(paramMotionEvent, 9);
      if (f1 == 0.0F)
        continue;
      int i1 = (int)(f1 * getVerticalScrollFactorCompat());
      int i2 = getScrollRange();
      int i3 = getScrollY();
      int i4 = i3 - i1;
      if (i4 < 0)
        i2 = 0;
      while (i2 != i3)
      {
        super.scrollTo(getScrollX(), i2);
        return true;
        if (i4 > i2)
          continue;
        i2 = i4;
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    int i3 = paramMotionEvent.getAction();
    if ((i3 == 2) && (this.j))
      return i1;
    if ((getScrollY() == 0) && (!bg.b(this, i1)))
      return false;
    switch (i3 & 0xFF)
    {
    case 4:
    case 5:
    default:
    case 2:
    case 0:
    case 1:
    case 3:
    case 6:
    }
    while (true)
    {
      return this.j;
      int i9 = this.q;
      if (i9 == -1)
        continue;
      int i10 = al.a(paramMotionEvent, i9);
      if (i10 == -1)
      {
        new StringBuilder("Invalid pointerId=").append(i9).append(" in onInterceptTouchEvent");
        continue;
      }
      int i11 = (int)al.d(paramMotionEvent, i10);
      if ((Math.abs(i11 - this.f) <= this.n) || ((0x2 & getNestedScrollAxes()) != 0))
        continue;
      this.j = i1;
      this.f = i11;
      a();
      this.k.addMovement(paramMotionEvent);
      this.t = 0;
      ViewParent localViewParent = getParent();
      if (localViewParent == null)
        continue;
      localViewParent.requestDisallowInterceptTouchEvent(i1);
      continue;
      int i4 = (int)paramMotionEvent.getY();
      int i5 = (int)paramMotionEvent.getX();
      int i6;
      if (getChildCount() > 0)
      {
        int i8 = getScrollY();
        View localView = getChildAt(0);
        if ((i4 >= localView.getTop() - i8) && (i4 < localView.getBottom() - i8) && (i5 >= localView.getLeft()) && (i5 < localView.getRight()))
          i6 = i1;
      }
      while (true)
      {
        if (i6 != 0)
          break label337;
        this.j = false;
        b();
        break;
        int i7 = 0;
        continue;
        i7 = 0;
      }
      label337: this.f = i4;
      this.q = al.b(paramMotionEvent, 0);
      if (this.k == null)
      {
        this.k = VelocityTracker.obtain();
        label366: this.k.addMovement(paramMotionEvent);
        if (this.c.a())
          break label408;
      }
      while (true)
      {
        this.j = i1;
        startNestedScroll(2);
        break;
        this.k.clear();
        break label366;
        label408: int i2 = 0;
      }
      this.j = false;
      this.q = -1;
      b();
      stopNestedScroll();
      continue;
      a(paramMotionEvent);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = false;
    if ((this.i != null) && (a(this.i, this)))
      b(this.i);
    this.i = null;
    int i1;
    if (!this.h)
    {
      if (this.u != null)
      {
        scrollTo(getScrollX(), this.u.a);
        this.u = null;
      }
      if (getChildCount() <= 0)
        break label158;
      i1 = getChildAt(0).getMeasuredHeight();
      int i2 = Math.max(0, i1 - (paramInt4 - paramInt2 - getPaddingBottom() - getPaddingTop()));
      if (getScrollY() <= i2)
        break label164;
      scrollTo(getScrollX(), i2);
    }
    while (true)
    {
      scrollTo(getScrollX(), getScrollY());
      this.h = true;
      return;
      label158: i1 = 0;
      break;
      label164: if (getScrollY() >= 0)
        continue;
      scrollTo(getScrollX(), 0);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.l);
    View localView;
    int i1;
    do
    {
      do
        return;
      while ((View.MeasureSpec.getMode(paramInt2) == 0) || (getChildCount() <= 0));
      localView = getChildAt(0);
      i1 = getMeasuredHeight();
    }
    while (localView.getMeasuredHeight() >= i1);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    localView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(i1 - getPaddingTop() - getPaddingBottom(), 1073741824));
  }

  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      e((int)paramFloat2);
      return true;
    }
    return false;
  }

  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
  }

  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getScrollY();
    scrollBy(0, paramInt4);
    int i2 = getScrollY() - i1;
    dispatchNestedScroll(0, i2, 0, paramInt4 - i2, null);
  }

  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.x.a(paramInt);
    startNestedScroll(2);
  }

  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    View localView;
    if (paramInt == 2)
    {
      paramInt = 130;
      if (paramRect != null)
        break label40;
      localView = FocusFinder.getInstance().findNextFocus(this, null, paramInt);
      label23: if (localView != null)
        break label53;
    }
    label40: label53: 
    do
    {
      return false;
      if (paramInt != 1)
        break;
      paramInt = 33;
      break;
      localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, paramInt);
      break label23;
    }
    while (a(localView));
    return localView.requestFocus(paramInt, paramRect);
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    NestedScrollView.SavedState localSavedState = (NestedScrollView.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.u = localSavedState;
    requestLayout();
  }

  protected Parcelable onSaveInstanceState()
  {
    NestedScrollView.SavedState localSavedState = new NestedScrollView.SavedState(super.onSaveInstanceState());
    localSavedState.a = getScrollY();
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView == null) || (this == localView));
    do
      return;
    while (!a(localView, 0, paramInt4));
    localView.getDrawingRect(this.b);
    offsetDescendantRectToMyCoords(localView, this.b);
    d(a(this.b));
  }

  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }

  public void onStopNestedScroll(View paramView)
  {
    stopNestedScroll();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    a();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i1 = al.a(paramMotionEvent);
    if (i1 == 0)
      this.t = 0;
    localMotionEvent.offsetLocation(0.0F, this.t);
    int i4;
    int i5;
    int i6;
    int i7;
    switch (i1)
    {
    case 4:
    default:
    case 0:
    case 2:
      while (true)
      {
        if (this.k != null)
          this.k.addMovement(localMotionEvent);
        localMotionEvent.recycle();
        return true;
        if (getChildCount() == 0)
          return false;
        if (!this.c.a());
        for (boolean bool = true; ; bool = false)
        {
          this.j = bool;
          if (bool)
          {
            ViewParent localViewParent2 = getParent();
            if (localViewParent2 != null)
              localViewParent2.requestDisallowInterceptTouchEvent(true);
          }
          if (!this.c.a())
            this.c.h();
          this.f = (int)paramMotionEvent.getY();
          this.q = al.b(paramMotionEvent, 0);
          startNestedScroll(2);
          break;
        }
        i4 = al.a(paramMotionEvent, this.q);
        if (i4 != -1)
          break;
        new StringBuilder("Invalid pointerId=").append(this.q).append(" in onTouchEvent");
      }
      i5 = (int)al.d(paramMotionEvent, i4);
      i6 = this.f - i5;
      if (dispatchNestedPreScroll(0, i6, this.s, this.r))
      {
        i6 -= this.s[1];
        localMotionEvent.offsetLocation(0.0F, this.r[1]);
        this.t += this.r[1];
      }
      if ((!this.j) && (Math.abs(i6) > this.n))
      {
        ViewParent localViewParent1 = getParent();
        if (localViewParent1 != null)
          localViewParent1.requestDisallowInterceptTouchEvent(true);
        this.j = true;
        if (i6 <= 0)
          break;
        i7 = i6 - this.n;
      }
    case 1:
    case 3:
    case 5:
    case 6:
    }
    label373: 
    while (this.j)
    {
      this.f = (i5 - this.r[1]);
      int i8 = getScrollY();
      int i9 = getScrollRange();
      int i10 = bg.a(this);
      if ((i10 == 0) || ((i10 == 1) && (i9 > 0)));
      for (int i11 = 1; ; i11 = 0)
      {
        if ((a(0, i7, 0, getScrollY(), i9)) && (!hasNestedScrollingParent()))
          this.k.clear();
        int i12 = getScrollY() - i8;
        if (!dispatchNestedScroll(0, i12, 0, i7 - i12, this.r))
          break label553;
        this.f -= this.r[1];
        localMotionEvent.offsetLocation(0.0F, this.r[1]);
        this.t += this.r[1];
        break;
        i7 = i6 + this.n;
        break label373;
      }
      if (i11 == 0)
        break;
      d();
      int i13 = i8 + i7;
      if (i13 < 0)
      {
        this.d.a(i7 / getHeight(), al.c(paramMotionEvent, i4) / getWidth());
        if (!this.e.a())
          this.e.c();
      }
      while ((this.d != null) && ((!this.d.a()) || (!this.e.a())))
      {
        bg.d(this);
        break;
        if (i13 <= i9)
          continue;
        this.e.a(i7 / getHeight(), 1.0F - al.c(paramMotionEvent, i4) / getWidth());
        if (this.d.a())
          continue;
        this.d.c();
      }
      if (!this.j)
        break;
      VelocityTracker localVelocityTracker = this.k;
      localVelocityTracker.computeCurrentVelocity(1000, this.p);
      int i3 = (int)bc.b(localVelocityTracker, this.q);
      if (Math.abs(i3) > this.o)
        e(-i3);
      this.q = -1;
      c();
      break;
      if ((!this.j) || (getChildCount() <= 0))
        break;
      this.q = -1;
      c();
      break;
      int i2 = al.b(paramMotionEvent);
      this.f = (int)al.d(paramMotionEvent, i2);
      this.q = al.b(paramMotionEvent, i2);
      break;
      a(paramMotionEvent);
      this.f = (int)al.d(paramMotionEvent, al.a(paramMotionEvent, this.q));
      break;
      i7 = i6;
    }
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!this.g)
      b(paramView2);
    while (true)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      this.i = paramView2;
    }
  }

  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    int i1 = a(paramRect);
    if (i1 != 0);
    for (int i2 = 1; ; i2 = 0)
    {
      if (i2 != 0)
      {
        if (!paramBoolean)
          break;
        scrollBy(0, i1);
      }
      return i2;
    }
    a(0, i1);
    return i2;
  }

  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean)
      b();
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }

  public void requestLayout()
  {
    this.g = true;
    super.requestLayout();
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      int i1 = b(paramInt1, getWidth() - getPaddingRight() - getPaddingLeft(), localView.getWidth());
      int i2 = b(paramInt2, getHeight() - getPaddingBottom() - getPaddingTop(), localView.getHeight());
      if ((i1 != getScrollX()) || (i2 != getScrollY()))
        super.scrollTo(i1, i2);
    }
  }

  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != this.l)
    {
      this.l = paramBoolean;
      requestLayout();
    }
  }

  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.y.a(paramBoolean);
  }

  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }

  public boolean shouldDelayChildPressedState()
  {
    return true;
  }

  public boolean startNestedScroll(int paramInt)
  {
    return this.y.a(paramInt);
  }

  public void stopNestedScroll()
  {
    this.y.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.NestedScrollView
 * JD-Core Version:    0.6.0
 */