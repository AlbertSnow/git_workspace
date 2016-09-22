package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.al;
import android.support.v4.view.bg;
import android.support.v7.app.f;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup
{
  private static ax t;
  private int a = -858993460;
  private int b;
  private Drawable c;
  private Drawable d;
  private final int e;
  private boolean f;
  private View g;
  private float h;
  private float i;
  private int j;
  private boolean k;
  private int l;
  private float m;
  private float n;
  private final bi o;
  private boolean p;
  private boolean q = true;
  private final Rect r = new Rect();
  private final ArrayList<au> s = new ArrayList();

  static
  {
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= 17)
    {
      t = new az();
      return;
    }
    if (i1 >= 16)
    {
      t = new ay();
      return;
    }
    t = new ax();
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.e = (int)(0.5F + 32.0F * f1);
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    bg.a(this, new at(this));
    bg.c(this, 1);
    this.o = bi.a(this, 0.5F, new av(this, 0));
    this.o.a(f1 * 400.0F);
  }

  private void a(View paramView, float paramFloat, int paramInt)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      int i1 = (int)(paramFloat * ((0xFF000000 & paramInt) >>> 24)) << 24 | 0xFFFFFF & paramInt;
      if (localLayoutParams.d == null)
        localLayoutParams.d = new Paint();
      localLayoutParams.d.setColorFilter(new PorterDuffColorFilter(i1, PorterDuff.Mode.SRC_OVER));
      if (bg.g(paramView) != 2)
        bg.a(paramView, 2, localLayoutParams.d);
      c(paramView);
    }
    do
      return;
    while (bg.g(paramView) == 0);
    if (localLayoutParams.d != null)
      localLayoutParams.d.setColorFilter(null);
    au localau = new au(this, paramView);
    this.s.add(localau);
    bg.a(this, localau);
  }

  private boolean a(float paramFloat)
  {
    if (!this.f)
      return false;
    boolean bool = c();
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.g.getLayoutParams();
    int i2;
    int i3;
    if (bool)
    {
      i2 = getPaddingRight() + localLayoutParams.rightMargin;
      i3 = this.g.getWidth();
    }
    for (int i1 = (int)(getWidth() - (i2 + paramFloat * this.j + i3)); this.o.a(this.g, i1, this.g.getTop()); i1 = (int)(getPaddingLeft() + localLayoutParams.leftMargin + paramFloat * this.j))
    {
      a();
      bg.d(this);
      return true;
    }
    return false;
  }

  private void b(float paramFloat)
  {
    boolean bool = c();
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)this.g.getLayoutParams();
    int i6;
    int i1;
    label41: int i3;
    label50: View localView;
    float f1;
    if (localLayoutParams.c)
      if (bool)
      {
        i6 = localLayoutParams.rightMargin;
        if (i6 > 0)
          break label169;
        i1 = 1;
        int i2 = getChildCount();
        i3 = 0;
        if (i3 >= i2)
          return;
        localView = getChildAt(i3);
        if (localView != this.g)
        {
          int i4 = (int)((1.0F - this.i) * this.l);
          this.i = paramFloat;
          int i5 = i4 - (int)((1.0F - paramFloat) * this.l);
          if (bool)
            i5 = -i5;
          localView.offsetLeftAndRight(i5);
          if (i1 != 0)
          {
            if (!bool)
              break label175;
            f1 = this.i - 1.0F;
          }
        }
      }
    while (true)
    {
      a(localView, f1, this.b);
      i3++;
      break label50;
      i6 = localLayoutParams.leftMargin;
      break;
      label169: i1 = 0;
      break label41;
      label175: f1 = 1.0F - this.i;
    }
  }

  private boolean b()
  {
    int i1;
    if (!this.q)
    {
      boolean bool = a(0.0F);
      i1 = 0;
      if (!bool);
    }
    else
    {
      this.p = false;
      i1 = 1;
    }
    return i1;
  }

  private void c(View paramView)
  {
    t.a(this, paramView);
  }

  private boolean c()
  {
    return bg.h(this) == 1;
  }

  final void a()
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() != 4)
        continue;
      localView.setVisibility(0);
    }
  }

  final void a(View paramView)
  {
    boolean bool = c();
    int i1;
    int i2;
    label29: int i18;
    label60: int i8;
    int i7;
    int i6;
    int i5;
    label89: int i10;
    label98: View localView;
    int i11;
    label127: int i14;
    if (bool)
    {
      i1 = getWidth() - getPaddingRight();
      if (!bool)
        break label234;
      i2 = getPaddingLeft();
      int i3 = getPaddingTop();
      int i4 = getHeight() - getPaddingBottom();
      if (paramView == null)
        break label294;
      if (!bg.j(paramView))
        break label248;
      i18 = 1;
      if (i18 == 0)
        break label294;
      i8 = paramView.getLeft();
      i7 = paramView.getRight();
      i6 = paramView.getTop();
      i5 = paramView.getBottom();
      int i9 = getChildCount();
      i10 = 0;
      if (i10 >= i9)
        return;
      localView = getChildAt(i10);
      if (localView == paramView)
        return;
      if (!bool)
        break label309;
      i11 = i2;
      int i12 = Math.max(i11, localView.getLeft());
      int i13 = Math.max(i3, localView.getTop());
      if (!bool)
        break label315;
      i14 = i1;
      label158: int i15 = Math.min(i14, localView.getRight());
      int i16 = Math.min(i4, localView.getBottom());
      if ((i12 < i8) || (i13 < i6) || (i15 > i7) || (i16 > i5))
        break label322;
    }
    label294: label309: label315: label322: for (int i17 = 4; ; i17 = 0)
    {
      localView.setVisibility(i17);
      i10++;
      break label98;
      i1 = getPaddingLeft();
      break;
      label234: i2 = getWidth() - getPaddingRight();
      break label29;
      label248: if (Build.VERSION.SDK_INT < 18)
      {
        Drawable localDrawable = paramView.getBackground();
        if (localDrawable != null)
        {
          if (localDrawable.getOpacity() == -1)
          {
            i18 = 1;
            break label60;
          }
          i18 = 0;
          break label60;
        }
      }
      i18 = 0;
      break label60;
      i5 = 0;
      i6 = 0;
      i7 = 0;
      i8 = 0;
      break label89;
      i11 = i1;
      break label127;
      i14 = i2;
      break label158;
    }
  }

  final boolean b(View paramView)
  {
    if (paramView == null)
      return false;
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    return (this.f) && (localLayoutParams.c) && (this.h > 0.0F);
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof SlidingPaneLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    if (this.o.g())
    {
      if (!this.f)
        this.o.f();
    }
    else
      return;
    bg.d(this);
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    if (c())
    {
      localDrawable = this.d;
      if (getChildCount() <= 1)
        break label48;
    }
    label48: for (View localView = getChildAt(1); ; localView = null)
    {
      if ((localView != null) && (localDrawable != null))
        break label53;
      return;
      localDrawable = this.c;
      break;
    }
    label53: int i1 = localView.getTop();
    int i2 = localView.getBottom();
    int i3 = localDrawable.getIntrinsicWidth();
    int i5;
    int i4;
    if (c())
    {
      i5 = localView.getRight();
      i4 = i5 + i3;
    }
    while (true)
    {
      localDrawable.setBounds(i5, i1, i4, i2);
      localDrawable.draw(paramCanvas);
      return;
      i4 = localView.getLeft();
      i5 = i4 - i3;
    }
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i1 = paramCanvas.save(2);
    if ((this.f) && (!localLayoutParams.b) && (this.g != null))
    {
      paramCanvas.getClipBounds(this.r);
      if (!c())
        break label168;
      this.r.left = Math.max(this.r.left, this.g.getRight());
    }
    boolean bool;
    while (true)
    {
      paramCanvas.clipRect(this.r);
      if (Build.VERSION.SDK_INT >= 11)
        break;
      if ((!localLayoutParams.c) || (this.h <= 0.0F))
        break label228;
      if (!paramView.isDrawingCacheEnabled())
        paramView.setDrawingCacheEnabled(true);
      Bitmap localBitmap = paramView.getDrawingCache();
      if (localBitmap != null)
      {
        paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localLayoutParams.d);
        bool = false;
        paramCanvas.restoreToCount(i1);
        return bool;
        label168: this.r.right = Math.min(this.r.right, this.g.getLeft());
        continue;
      }
      new StringBuilder("drawChild: child view ").append(paramView).append(" returned null drawing cache");
    }
    while (true)
    {
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      break;
      label228: if (!paramView.isDrawingCacheEnabled())
        continue;
      paramView.setDrawingCacheEnabled(false);
    }
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new SlidingPaneLayout.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new SlidingPaneLayout.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new SlidingPaneLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new SlidingPaneLayout.LayoutParams(paramLayoutParams);
  }

  public int getCoveredFadeColor()
  {
    return this.b;
  }

  public int getParallaxDistance()
  {
    return this.l;
  }

  public int getSliderFadeColor()
  {
    return this.a;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.q = true;
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.q = true;
    int i1 = this.s.size();
    for (int i2 = 0; i2 < i1; i2++)
      ((au)this.s.get(i2)).run();
    this.s.clear();
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = al.a(paramMotionEvent);
    if ((!this.f) && (i1 == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null)
        if (bi.b(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          break label96;
    }
    boolean bool1;
    label96: for (boolean bool2 = true; ; bool2 = false)
    {
      this.p = bool2;
      if ((this.f) && ((!this.k) || (i1 == 0)))
        break;
      this.o.e();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i1 == 3) || (i1 == 1))
    {
      this.o.e();
      return false;
    }
    switch (i1)
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    label148: float f3;
    float f4;
    do
    {
      for (int i2 = 0; ; i2 = 1)
      {
        if (!this.o.a(paramMotionEvent))
        {
          bool1 = false;
          if (i2 == 0)
            break;
        }
        return true;
        this.k = false;
        float f5 = paramMotionEvent.getX();
        float f6 = paramMotionEvent.getY();
        this.m = f5;
        this.n = f6;
        if ((!bi.b(this.g, (int)f5, (int)f6)) || (!b(this.g)))
          break label148;
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      f3 = Math.abs(f1 - this.m);
      f4 = Math.abs(f2 - this.n);
    }
    while ((f3 <= this.o.d()) || (f4 <= f3));
    this.o.e();
    this.k = true;
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = c();
    int i2;
    label36: int i3;
    label47: int i5;
    float f1;
    label83: int i6;
    int i7;
    label96: SlidingPaneLayout.LayoutParams localLayoutParams;
    int i11;
    int i12;
    int i19;
    label203: boolean bool2;
    label227: int i14;
    int i16;
    int i15;
    label290: int i9;
    if (bool1)
    {
      this.o.a(2);
      int i1 = paramInt3 - paramInt1;
      if (!bool1)
        break label348;
      i2 = getPaddingRight();
      if (!bool1)
        break label357;
      i3 = getPaddingLeft();
      int i4 = getPaddingTop();
      i5 = getChildCount();
      if (this.q)
      {
        if ((!this.f) || (!this.p))
          break label366;
        f1 = 1.0F;
        this.h = f1;
      }
      i6 = 0;
      i7 = i2;
      if (i6 >= i5)
        break label445;
      View localView = getChildAt(i6);
      if (localView.getVisibility() == 8)
        break label557;
      localLayoutParams = (SlidingPaneLayout.LayoutParams)localView.getLayoutParams();
      i11 = localView.getMeasuredWidth();
      i12 = 0;
      if (!localLayoutParams.b)
        break label388;
      int i17 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
      int i18 = Math.min(i2, i1 - i3 - this.e) - i7 - i17;
      this.j = i18;
      if (!bool1)
        break label372;
      i19 = localLayoutParams.rightMargin;
      if (i18 + (i7 + i19) + i11 / 2 <= i1 - i3)
        break label382;
      bool2 = true;
      localLayoutParams.c = bool2;
      int i20 = (int)(i18 * this.h);
      i14 = i7 + (i19 + i20);
      this.h = (i20 / this.j);
      if (!bool1)
        break label428;
      i16 = i12 + (i1 - i14);
      i15 = i16 - i11;
      localView.layout(i15, i4, i16, i4 + localView.getMeasuredHeight());
      i9 = i2 + localView.getWidth();
    }
    for (int i10 = i14; ; i10 = i7)
    {
      i6++;
      i2 = i9;
      i7 = i10;
      break label96;
      this.o.a(1);
      break;
      label348: i2 = getPaddingLeft();
      break label36;
      label357: i3 = getPaddingRight();
      break label47;
      label366: f1 = 0.0F;
      break label83;
      label372: i19 = localLayoutParams.leftMargin;
      break label203;
      label382: bool2 = false;
      break label227;
      label388: if ((this.f) && (this.l != 0));
      for (int i13 = (int)((1.0F - this.h) * this.l); ; i13 = 0)
      {
        i12 = i13;
        i14 = i2;
        break;
        label428: i15 = i14 - i12;
        i16 = i15 + i11;
        break label290;
        label445: if (this.q)
        {
          if (!this.f)
            break label520;
          if (this.l != 0)
            b(this.h);
          if (((SlidingPaneLayout.LayoutParams)this.g.getLayoutParams()).c)
            a(this.g, this.h, this.a);
        }
        while (true)
        {
          a(this.g);
          this.q = false;
          return;
          label520: for (int i8 = 0; i8 < i5; i8++)
            a(getChildAt(i8), 0.0F, this.a);
        }
      }
      label557: i9 = i2;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i5;
    int i6;
    int i7;
    if (i1 != 1073741824)
      if (isInEditMode())
      {
        if ((i1 == -2147483648) || (i1 != 0))
          break label1091;
        i5 = i3;
        i6 = 300;
        i7 = i4;
      }
    while (true)
    {
      int i9;
      int i8;
      label94: boolean bool1;
      int i10;
      int i11;
      int i12;
      int i13;
      int i14;
      float f1;
      label136: View localView2;
      SlidingPaneLayout.LayoutParams localLayoutParams2;
      int i30;
      int i31;
      float f2;
      boolean bool4;
      switch (i5)
      {
      default:
        i9 = 0;
        i8 = -1;
        bool1 = false;
        i10 = i6 - getPaddingLeft() - getPaddingRight();
        i11 = getChildCount();
        this.g = null;
        i12 = 0;
        i13 = i10;
        i14 = i9;
        f1 = 0.0F;
        if (i12 < i11)
        {
          localView2 = getChildAt(i12);
          localLayoutParams2 = (SlidingPaneLayout.LayoutParams)localView2.getLayoutParams();
          if (localView2.getVisibility() != 8)
            break;
          localLayoutParams2.c = false;
          i30 = i13;
          i31 = i14;
          f2 = f1;
          bool4 = bool1;
        }
      case 1073741824:
      case -2147483648:
      }
      while (true)
      {
        i12++;
        bool1 = bool4;
        i14 = i31;
        i13 = i30;
        f1 = f2;
        break label136;
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (i3 != 0)
          break label1091;
        if (isInEditMode())
        {
          if (i3 != 0)
            break label1091;
          i5 = -2147483648;
          i6 = i2;
          i7 = 300;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        i9 = i7 - getPaddingTop() - getPaddingBottom();
        i8 = i9;
        break label94;
        i8 = i7 - getPaddingTop() - getPaddingBottom();
        i9 = 0;
        break label94;
        if (localLayoutParams2.a > 0.0F)
        {
          f1 += localLayoutParams2.a;
          if (localLayoutParams2.width == 0);
        }
        else
        {
          int i24 = localLayoutParams2.leftMargin + localLayoutParams2.rightMargin;
          int i25;
          label376: int i26;
          label396: int i29;
          if (localLayoutParams2.width == -2)
          {
            i25 = View.MeasureSpec.makeMeasureSpec(i10 - i24, -2147483648);
            if (localLayoutParams2.height != -2)
              break label546;
            i26 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
            localView2.measure(i25, i26);
            int i27 = localView2.getMeasuredWidth();
            int i28 = localView2.getMeasuredHeight();
            if ((i5 == -2147483648) && (i28 > i14))
              i14 = Math.min(i28, i8);
            i29 = i13 - i27;
            if (i29 >= 0)
              break label584;
          }
          label546: label584: for (boolean bool2 = true; ; bool2 = false)
          {
            localLayoutParams2.b = bool2;
            boolean bool3 = bool2 | bool1;
            if (localLayoutParams2.b)
              this.g = localView2;
            i30 = i29;
            f2 = f1;
            bool4 = bool3;
            i31 = i14;
            break;
            if (localLayoutParams2.width == -1)
            {
              i25 = View.MeasureSpec.makeMeasureSpec(i10 - i24, 1073741824);
              break label376;
            }
            i25 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.width, 1073741824);
            break label376;
            if (localLayoutParams2.height == -1)
            {
              i26 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
              break label396;
            }
            i26 = View.MeasureSpec.makeMeasureSpec(localLayoutParams2.height, 1073741824);
            break label396;
          }
          if ((bool1) || (f1 > 0.0F))
          {
            int i15 = i10 - this.e;
            int i16 = 0;
            if (i16 < i11)
            {
              View localView1 = getChildAt(i16);
              SlidingPaneLayout.LayoutParams localLayoutParams1;
              int i17;
              label680: int i18;
              label688: int i23;
              if (localView1.getVisibility() != 8)
              {
                localLayoutParams1 = (SlidingPaneLayout.LayoutParams)localView1.getLayoutParams();
                if (localView1.getVisibility() != 8)
                {
                  if ((localLayoutParams1.width != 0) || (localLayoutParams1.a <= 0.0F))
                    break label773;
                  i17 = 1;
                  if (i17 == 0)
                    break label779;
                  i18 = 0;
                  if ((!bool1) || (localView1 == this.g))
                    break label843;
                  if ((localLayoutParams1.width < 0) && ((i18 > i15) || (localLayoutParams1.a > 0.0F)))
                  {
                    if (i17 == 0)
                      break label827;
                    if (localLayoutParams1.height != -2)
                      break label789;
                    i23 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                    label752: localView1.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), i23);
                  }
                }
              }
              while (true)
              {
                i16++;
                break;
                label773: i17 = 0;
                break label680;
                label779: i18 = localView1.getMeasuredWidth();
                break label688;
                label789: if (localLayoutParams1.height == -1)
                {
                  i23 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                  break label752;
                }
                i23 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                break label752;
                label827: i23 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                break label752;
                label843: if (localLayoutParams1.a <= 0.0F)
                  continue;
                int i19;
                if (localLayoutParams1.width == 0)
                  if (localLayoutParams1.height == -2)
                    i19 = View.MeasureSpec.makeMeasureSpec(i8, -2147483648);
                while (true)
                {
                  if (!bool1)
                    break label985;
                  int i21 = i10 - (localLayoutParams1.leftMargin + localLayoutParams1.rightMargin);
                  int i22 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                  if (i18 == i21)
                    break;
                  localView1.measure(i22, i19);
                  break;
                  if (localLayoutParams1.height == -1)
                  {
                    i19 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    continue;
                  }
                  i19 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
                  continue;
                  i19 = View.MeasureSpec.makeMeasureSpec(localView1.getMeasuredHeight(), 1073741824);
                }
                label985: int i20 = Math.max(0, i13);
                localView1.measure(View.MeasureSpec.makeMeasureSpec(i18 + (int)(localLayoutParams1.a * i20 / f1), 1073741824), i19);
              }
            }
          }
          setMeasuredDimension(i6, i14 + getPaddingTop() + getPaddingBottom());
          this.f = bool1;
          if ((this.o.a() != 0) && (!bool1))
            this.o.f();
          return;
        }
        i30 = i13;
        i31 = i14;
        f2 = f1;
        bool4 = bool1;
      }
      label1091: i5 = i3;
      i6 = i2;
      i7 = i4;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    SlidingPaneLayout.SavedState localSavedState = (SlidingPaneLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (localSavedState.a)
      if ((this.q) || (a(1.0F)))
        this.p = true;
    while (true)
    {
      this.p = localSavedState.a;
      return;
      b();
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    SlidingPaneLayout.SavedState localSavedState = new SlidingPaneLayout.SavedState(super.onSaveInstanceState());
    boolean bool;
    if (this.f)
      if ((!this.f) || (this.h == 1.0F))
        bool = true;
    while (true)
    {
      localSavedState.a = bool;
      return localSavedState;
      bool = false;
      continue;
      bool = this.p;
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      this.q = true;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.f)
      return super.onTouchEvent(paramMotionEvent);
    this.o.b(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return true;
      float f5 = paramMotionEvent.getX();
      float f6 = paramMotionEvent.getY();
      this.m = f5;
      this.n = f6;
      continue;
      if (!b(this.g))
        continue;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      float f3 = f1 - this.m;
      float f4 = f2 - this.n;
      int i1 = this.o.d();
      if ((f3 * f3 + f4 * f4 >= i1 * i1) || (!bi.b(this.g, (int)f1, (int)f2)))
        continue;
      b();
    }
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.f))
      if (paramView1 != this.g)
        break label36;
    label36: for (boolean bool = true; ; bool = false)
    {
      this.p = bool;
      return;
    }
  }

  public void setCoveredFadeColor(int paramInt)
  {
    this.b = paramInt;
  }

  public void setPanelSlideListener$14b5545(f paramf)
  {
  }

  public void setParallaxDistance(int paramInt)
  {
    this.l = paramInt;
    requestLayout();
  }

  @Deprecated
  public void setShadowDrawable(Drawable paramDrawable)
  {
    setShadowDrawableLeft(paramDrawable);
  }

  public void setShadowDrawableLeft(Drawable paramDrawable)
  {
    this.c = paramDrawable;
  }

  public void setShadowDrawableRight(Drawable paramDrawable)
  {
    this.d = paramDrawable;
  }

  @Deprecated
  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }

  public void setShadowResourceLeft(int paramInt)
  {
    setShadowDrawableLeft(getResources().getDrawable(paramInt));
  }

  public void setShadowResourceRight(int paramInt)
  {
    setShadowDrawableRight(getResources().getDrawable(paramInt));
  }

  public void setSliderFadeColor(int paramInt)
  {
    this.a = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout
 * JD-Core Version:    0.6.0
 */