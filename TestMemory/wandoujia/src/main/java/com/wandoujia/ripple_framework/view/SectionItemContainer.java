package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.e.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.wandoujia.ripple_framework.R.dimen;
import com.wandoujia.ripple_framework.R.styleable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class SectionItemContainer extends ViewGroup
{
  private int a = 1;
  private int b;
  private final int c;
  private final int d;
  private int e = 0;
  private int f = 0;
  private int g = 0;
  private int h;
  private Map<Integer, Integer> i = new a();
  private an j;

  public SectionItemContainer(Context paramContext)
  {
    super(paramContext);
    this.c = 0;
    this.d = paramContext.getResources().getDimensionPixelOffset(R.dimen.margin_medium);
  }

  public SectionItemContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.SectionItemContainer, 0, 0);
    this.c = localTypedArray.getDimensionPixelOffset(R.styleable.SectionItemContainer_lineSpacing, 0);
    this.d = localTypedArray.getDimensionPixelOffset(R.styleable.SectionItemContainer_maxPadding, 0);
    this.b = localTypedArray.getDimensionPixelOffset(R.styleable.SectionItemContainer_minItemWidth, 0);
    localTypedArray.recycle();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = getPaddingLeft();
    int m = getPaddingTop();
    int n = 0;
    if (n < getChildCount())
    {
      View localView = getChildAt(n);
      int i1 = n / this.g;
      if (i1 >= this.e)
        localView.setVisibility(8);
      while (true)
      {
        n++;
        break;
        localView.setVisibility(0);
        int i2 = n % this.g;
        int i3 = ((Integer)this.i.get(Integer.valueOf(i1))).intValue();
        int i4 = k + this.f + i2 * this.h;
        int i5 = m + i1 * this.c;
        for (int i6 = 0; i6 < i1; i6++)
          i5 += ((Integer)this.i.get(Integer.valueOf(i6))).intValue();
        localView.layout(i4, i5, i4 + this.h, i5 + i3);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = getDefaultSize(getSuggestedMinimumWidth(), paramInt1);
    int m = View.MeasureSpec.getSize(paramInt1) - getPaddingLeft() - getPaddingRight();
    if (getChildCount() == 0)
    {
      setMeasuredDimension(k, 0);
      return;
    }
    View localView3;
    if (this.b == 0)
    {
      localView3 = getChildAt(0);
      measureChild(localView3, paramInt1, paramInt2);
    }
    for (this.h = localView3.getMeasuredWidth(); ; this.h = this.b)
    {
      this.g = (m / this.h);
      this.g = Math.min(6, this.g);
      this.f = ((m - this.h * this.g) / 2);
      this.f = Math.min(this.d, this.f);
      this.h = ((m - this.g * this.h - 2 * this.f) / this.g + this.h);
      if (this.h != 0)
        break;
      setMeasuredDimension(k, 0);
      return;
    }
    this.e = (int)Math.ceil(getChildCount() / this.g);
    this.e = Math.min(this.e, this.a);
    if (this.g == 0)
      this.g = 1;
    this.i.clear();
    int n = 0;
    int i3;
    int i5;
    int i6;
    label311: int i7;
    int i9;
    if (n < this.e)
    {
      i3 = n * this.g;
      int i4 = Math.min(this.g, getChildCount() - n * this.g);
      i5 = i3 + i4;
      if (this.j != null)
      {
        i6 = this.j.a(i3, i4);
        if (i6 >= 0)
          break label451;
        i7 = 0;
        i9 = i3;
        label323: if (i9 >= i5)
          break label501;
        View localView2 = getChildAt(i9);
        measureChild(localView2, View.MeasureSpec.makeMeasureSpec(this.h, 1073741824), paramInt2);
        Integer localInteger = (Integer)this.i.get(Integer.valueOf(n));
        if ((localInteger == null) || (localView2.getMeasuredHeight() > localInteger.intValue()))
          this.i.put(Integer.valueOf(n), Integer.valueOf(localView2.getMeasuredHeight()));
        if ((localInteger == null) || (localView2.getMeasuredHeight() == localInteger.intValue()))
          break label672;
      }
    }
    label672: for (int i10 = 1; ; i10 = i7)
    {
      i9++;
      i7 = i10;
      break label323;
      i6 = -1;
      break label311;
      label451: i7 = 1;
      View localView1 = getChildAt(i6);
      measureChild(localView1, View.MeasureSpec.makeMeasureSpec(this.h, 1073741824), paramInt2);
      this.i.put(Integer.valueOf(n), Integer.valueOf(localView1.getMeasuredHeight()));
      label501: if (i7 != 0)
        for (int i8 = i3; i8 < i5; i8++)
        {
          if (i8 == i6)
            continue;
          measureChild(getChildAt(i8), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + getPaddingBottom() + ((Integer)this.i.get(Integer.valueOf(n))).intValue(), 1073741824));
        }
      n++;
      break;
      int i1 = getPaddingTop() + getPaddingBottom();
      Iterator localIterator = this.i.values().iterator();
      int i2 = i1;
      while (localIterator.hasNext())
        i2 += ((Integer)localIterator.next()).intValue();
      setMeasuredDimension(k, i2 + this.c * (-1 + this.e));
      return;
    }
  }

  public void setItemHeightInjector(an paraman)
  {
    this.j = paraman;
  }

  public void setMaxLines(int paramInt)
  {
    this.a = paramInt;
  }

  public void setMinItemWidth(int paramInt)
  {
    this.b = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.SectionItemContainer
 * JD-Core Version:    0.6.0
 */