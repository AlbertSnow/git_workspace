package com.wandoujia.ripple_framework.view.slidingtab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.support.v4.view.ck;
import android.support.v7.app.f;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.styleable;
import java.util.Locale;

public class PagerSlidingTabStrip extends HorizontalScrollView
  implements com.wandoujia.ripple_framework.theme.c
{
  private static final int[] b = { 16842901, 16842904 };
  private int A = 1;
  private int B = 12;
  private int C = -10066330;
  private int D = 0;
  private ColorStateList E;
  private int F = 0;
  private Locale G;
  private f H;
  public ck a;
  private final c c = new c(this, 0);
  private LinearLayout.LayoutParams d;
  private LinearLayout e;
  private ViewPager f;
  private g g;
  private int h;
  private int i = 0;
  private float j = 0.0F;
  private int k = -1;
  private Paint l;
  private Paint m;
  private boolean n = false;
  private int o = -10066330;
  private int p = 436207616;
  private int q = 436207616;
  private boolean r = false;
  private boolean s = true;
  private int t = 52;
  private int u = 8;
  private int v = 0;
  private int w = 2;
  private int x = 12;
  private int y = 24;
  private int z = 0;

  public PagerSlidingTabStrip(Context paramContext)
  {
    this(paramContext, null);
  }

  public PagerSlidingTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PagerSlidingTabStrip(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setWillNotDraw(false);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.t = (int)TypedValue.applyDimension(1, this.t, localDisplayMetrics);
    this.u = (int)TypedValue.applyDimension(1, this.u, localDisplayMetrics);
    this.w = (int)TypedValue.applyDimension(1, this.w, localDisplayMetrics);
    this.x = (int)TypedValue.applyDimension(1, this.x, localDisplayMetrics);
    this.y = (int)TypedValue.applyDimension(1, this.y, localDisplayMetrics);
    this.z = (int)TypedValue.applyDimension(1, this.z, localDisplayMetrics);
    this.A = (int)TypedValue.applyDimension(1, this.A, localDisplayMetrics);
    this.B = (int)TypedValue.applyDimension(1, this.B, localDisplayMetrics);
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, b);
    this.B = localTypedArray1.getDimensionPixelSize(0, this.B);
    this.C = localTypedArray1.getColor(1, this.C);
    localTypedArray1.recycle();
    TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.PagerSlidingTabStrip);
    this.o = localTypedArray2.getColor(R.styleable.PagerSlidingTabStrip_indicatorColor, this.o);
    this.p = localTypedArray2.getColor(R.styleable.PagerSlidingTabStrip_underlineColor, this.p);
    this.q = localTypedArray2.getColor(R.styleable.PagerSlidingTabStrip_dividerColor, this.q);
    this.u = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_indicatorHeight, this.u);
    this.w = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_underlineHeight, this.w);
    this.v = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_indicatorWidth, this.v);
    this.x = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_tab_dividerPadding, this.x);
    this.y = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_tabPaddingLeftRight, this.y);
    this.z = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_indicatorPaddingBottom, this.z);
    this.F = localTypedArray2.getResourceId(R.styleable.PagerSlidingTabStrip_tab_background, this.F);
    this.r = localTypedArray2.getBoolean(R.styleable.PagerSlidingTabStrip_shouldExpand, this.r);
    this.t = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_scrollOffset, this.t);
    this.s = localTypedArray2.getBoolean(R.styleable.PagerSlidingTabStrip_tab_textAllCaps, this.s);
    this.E = localTypedArray2.getColorStateList(R.styleable.PagerSlidingTabStrip_tab_textColor);
    localTypedArray2.getResourceId(R.styleable.PagerSlidingTabStrip_tab_textColor, 0);
    this.B = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_tabTextSize, this.B);
    this.D = localTypedArray2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_tab_itemMinWidth, this.D);
    localTypedArray2.recycle();
    this.l = new Paint();
    this.l.setAntiAlias(true);
    this.l.setStyle(Paint.Style.FILL);
    this.m = new Paint();
    this.m.setAntiAlias(true);
    this.m.setStrokeWidth(this.A);
    this.d = new LinearLayout.LayoutParams(-2, -1);
    if (this.G == null)
      this.G = getResources().getConfiguration().locale;
    this.e = new LinearLayout(paramContext);
    this.e.setOrientation(0);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    localLayoutParams.bottomMargin = this.w;
    this.e.setLayoutParams(localLayoutParams);
    addView(this.e);
  }

  private void a(int paramInt)
  {
    if (this.k == paramInt);
    View localView2;
    do
    {
      do
        return;
      while ((paramInt >= this.h) || (paramInt < 0));
      View localView1 = this.e.getChildAt(this.k);
      if (localView1 != null)
        localView1.setSelected(false);
      this.k = paramInt;
      localView2 = this.e.getChildAt(this.k);
    }
    while (localView2 == null);
    localView2.setSelected(true);
  }

  private void a(int paramInt, e parame)
  {
    View localView = parame.a(getContext(), paramInt, this.f, this.H);
    if (paramInt == this.k)
      localView.setSelected(true);
    this.e.addView(localView, paramInt);
  }

  private void a(boolean paramBoolean)
  {
    int i1 = 0;
    if (i1 < this.h)
    {
      View localView = this.e.getChildAt(i1);
      localView.setLayoutParams(this.d);
      localView.setBackgroundResource(this.F);
      if ((localView.getTag(R.id.tab_skip_horizontal_padding) == null) || (!((Boolean)localView.getTag(R.id.tab_skip_horizontal_padding)).booleanValue()))
        localView.setPadding(this.y, 0, this.y, 0);
      TextView localTextView;
      if (((localView instanceof TextView)) && (localView.getTag(R.id.tab_default_theme) != null) && (((Boolean)localView.getTag(R.id.tab_default_theme)).booleanValue()))
      {
        localTextView = (TextView)localView;
        localTextView.setTextSize(0, this.B);
        if (this.E == null)
          break label168;
        localTextView.setTextColor(this.E);
        label141: if (this.s)
        {
          if (Build.VERSION.SDK_INT < 14)
            break label180;
          localTextView.setAllCaps(true);
        }
      }
      while (true)
      {
        i1++;
        break;
        label168: localTextView.setTextColor(this.C);
        break label141;
        label180: localTextView.setText(localTextView.getText().toString().toUpperCase(this.G));
      }
    }
    if (paramBoolean)
      this.n = false;
  }

  private void c()
  {
    int i1 = 0;
    if ((this.i > 0) && (this.i < this.h))
    {
      int i2 = getMeasuredWidth();
      this.t = 0;
      if (i1 < this.i)
      {
        int i3 = this.e.getChildAt(i1).getMeasuredWidth();
        int i4 = this.e.getChildAt(i1 + 1).getMeasuredWidth();
        this.t = (i3 + this.t);
        if (i4 + this.t <= i2)
          break label97;
        this.t -= i3;
      }
    }
    label97: 
    do
    {
      return;
      i1++;
      break;
    }
    while ((this.i != 0) || (this.e.getChildCount() <= 0));
    this.t = this.e.getChildAt(0).getMeasuredWidth();
  }

  public final void a()
  {
  }

  public final void b()
  {
    this.e.removeAllViews();
    this.h = this.f.getAdapter().a();
    int i1 = 0;
    if (i1 < this.h)
    {
      if ((this.g != null) && (this.g.c(i1) != null))
        a(i1, this.g.c(i1));
      while (true)
      {
        i1++;
        break;
        a(i1, new e(Integer.toString(i1), this.f.getAdapter().a(i1)));
      }
    }
    a(true);
    a(this.f.getCurrentItem());
  }

  public int getCurrentSelectedPosition()
  {
    return this.k;
  }

  public int getDividerColor()
  {
    return this.q;
  }

  public int getDividerPadding()
  {
    return this.x;
  }

  public int getIndicatorColor()
  {
    return this.o;
  }

  public int getIndicatorHeight()
  {
    return this.u;
  }

  public int getIndicatorPaddingBottom()
  {
    return this.z;
  }

  public int getScrollOffset()
  {
    return this.t;
  }

  public boolean getShouldExpand()
  {
    return this.r;
  }

  public int getTabBackground()
  {
    return this.F;
  }

  public int getTabPaddingLeftRight()
  {
    return this.y;
  }

  public int getTextColor()
  {
    return this.C;
  }

  public int getTextSize()
  {
    return this.B;
  }

  public int getUnderlineColor()
  {
    return this.p;
  }

  public int getUnderlineHeight()
  {
    return this.w;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    a(true);
    post(new b(this));
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((isInEditMode()) || (this.h == 0))
      return;
    int i1 = getHeight();
    this.l.setColor(this.p);
    paramCanvas.drawRect(0.0F, i1 - this.w, this.e.getWidth(), i1, this.l);
    this.l.setColor(this.o);
    View localView1 = this.e.getChildAt(this.i);
    int i2;
    label98: float f1;
    float f2;
    float f3;
    if (this.v == 0)
    {
      i2 = localView1.getWidth();
      this.v = i2;
      f1 = localView1.getLeft() + (localView1.getWidth() - this.v) / 2;
      f2 = localView1.getRight() - (localView1.getWidth() - this.v) / 2;
      if ((this.j <= 0.0F) || (this.i >= -1 + this.h))
        break label373;
      View localView3 = this.e.getChildAt(1 + this.i);
      float f4 = localView3.getLeft() + (localView3.getWidth() - this.v) / 2;
      float f5 = localView3.getRight() - (localView3.getWidth() - this.v) / 2;
      f3 = f4 * this.j + f1 * (1.0F - this.j);
      f2 = f5 * this.j + f2 * (1.0F - this.j);
    }
    while (true)
    {
      paramCanvas.drawRect(f3, i1 - this.u - this.z, f2, i1 - this.z, this.l);
      this.m.setColor(this.q);
      for (int i3 = 0; i3 < -1 + this.h; i3++)
      {
        View localView2 = this.e.getChildAt(i3);
        paramCanvas.drawLine(localView2.getRight(), this.x, localView2.getRight(), i1 - this.x, this.m);
      }
      break;
      i2 = this.v;
      break label98;
      label373: f3 = f1;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if ((!this.r) || (this.n) || (View.MeasureSpec.getMode(paramInt1) == 0))
      super.onMeasure(paramInt1, paramInt2);
    int i2;
    int i4;
    do
    {
      return;
      if (this.D > 0)
        for (int i8 = 0; i8 < this.h; i8++)
          this.e.getChildAt(i8).setMinimumWidth(this.D);
      if (!this.n)
        super.onMeasure(paramInt1, paramInt2);
      i2 = getMeasuredWidth();
      int i3 = 0;
      i4 = 0;
      while (i3 < this.h)
      {
        i4 += this.e.getChildAt(i3).getMeasuredWidth();
        i3++;
      }
    }
    while ((i4 <= 0) || (i2 <= 0));
    c();
    if (i4 <= i2)
    {
      if (this.D <= 0)
        break label190;
      int i7 = (i2 - i4) / 2;
      this.e.setPadding(i7, 0, i7, 0);
    }
    while (true)
    {
      super.onMeasure(paramInt1, paramInt2);
      this.n = true;
      return;
      label190: int i5 = (i2 - i4) / this.h / 2;
      int i6 = (i2 - i4 - 2 * (i5 * this.h)) / 2;
      this.e.setPadding(i6, 0, i6, 0);
      while (i1 < this.h)
      {
        View localView = this.e.getChildAt(i1);
        localView.setPadding(i5 + localView.getPaddingLeft(), localView.getPaddingTop(), i5 + localView.getPaddingRight(), localView.getPaddingBottom());
        i1++;
      }
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    PagerSlidingTabStrip.SavedState localSavedState = (PagerSlidingTabStrip.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    this.i = localSavedState.a;
    requestLayout();
  }

  public Parcelable onSaveInstanceState()
  {
    PagerSlidingTabStrip.SavedState localSavedState = new PagerSlidingTabStrip.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.i;
    return localSavedState;
  }

  public void setAllCaps(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }

  public void setAllTabEnabled(boolean paramBoolean)
  {
    for (int i1 = 0; i1 < this.e.getChildCount(); i1++)
      this.e.getChildAt(i1).setEnabled(paramBoolean);
  }

  public void setDividerColor(int paramInt)
  {
    this.q = paramInt;
    invalidate();
  }

  public void setDividerColorResource(int paramInt)
  {
    this.q = getResources().getColor(paramInt);
    invalidate();
  }

  public void setDividerPadding(int paramInt)
  {
    this.x = paramInt;
    invalidate();
  }

  public void setIndicatorColor(int paramInt)
  {
    this.o = paramInt;
    invalidate();
  }

  public void setIndicatorColorResource(int paramInt)
  {
    this.o = getResources().getColor(paramInt);
    invalidate();
  }

  public void setIndicatorHeight(int paramInt)
  {
    this.u = paramInt;
    invalidate();
  }

  public void setIndicatorPaddingBottom(int paramInt)
  {
    this.z = paramInt;
    a(false);
  }

  public void setOnPageChangeListener(ck paramck)
  {
    this.a = paramck;
  }

  public void setOnTabClickListener$3d8c93a5(f paramf)
  {
    this.H = paramf;
  }

  public void setScrollOffset(int paramInt)
  {
    this.t = paramInt;
    invalidate();
  }

  public void setShouldExpand(boolean paramBoolean)
  {
    this.r = paramBoolean;
    requestLayout();
  }

  public void setTabBackground(int paramInt)
  {
    this.F = paramInt;
  }

  public void setTabItemMinWidth(int paramInt)
  {
    this.D = paramInt;
  }

  public void setTabPaddingLeftRight(int paramInt)
  {
    this.y = paramInt;
    a(true);
  }

  public void setTextColor(int paramInt)
  {
    this.C = paramInt;
    a(false);
  }

  public void setTextColorResource(int paramInt)
  {
    this.C = getResources().getColor(paramInt);
    a(false);
  }

  public void setTextColorStateList(int paramInt)
  {
    this.E = getResources().getColorStateList(paramInt);
    a(false);
  }

  public void setTextSize(int paramInt)
  {
    this.B = paramInt;
    a(true);
  }

  public void setUnderlineColor(int paramInt)
  {
    this.p = paramInt;
    invalidate();
  }

  public void setUnderlineColorResource(int paramInt)
  {
    this.p = getResources().getColor(paramInt);
    invalidate();
  }

  public void setUnderlineHeight(int paramInt)
  {
    this.w = paramInt;
    invalidate();
  }

  public void setViewPager(ViewPager paramViewPager)
  {
    if ((paramViewPager.getAdapter() instanceof g));
    for (g localg = (g)paramViewPager.getAdapter(); ; localg = null)
    {
      this.f = paramViewPager;
      this.g = localg;
      if (this.f.getAdapter() != null)
        break;
      throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    this.f.a(this.c);
    getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.slidingtab.PagerSlidingTabStrip
 * JD-Core Version:    0.6.0
 */