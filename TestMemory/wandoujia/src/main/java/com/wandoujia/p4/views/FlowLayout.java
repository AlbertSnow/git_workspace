package com.wandoujia.p4.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.phoenix2.R.styleable;

public class FlowLayout extends ViewGroup
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private boolean e = false;
  private boolean f = false;
  private int g = 1;

  public FlowLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private static Paint a(int paramInt)
  {
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setColor(paramInt);
    localPaint.setStrokeWidth(2.0F);
    return localPaint;
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FlowLayout);
    try
    {
      this.a = localTypedArray.getDimensionPixelSize(2, 0);
      this.b = localTypedArray.getDimensionPixelSize(3, 0);
      this.c = localTypedArray.getInteger(4, 0);
      this.d = localTypedArray.getInteger(7, 0);
      this.e = localTypedArray.getBoolean(6, false);
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw localObject;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof FlowLayout.LayoutParams;
  }

  protected void dispatchSetPressed(boolean paramBoolean)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if ((paramBoolean) && ((localView.isClickable()) || (localView.isLongClickable())))
        continue;
      localView.setPressed(paramBoolean);
    }
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    Paint localPaint2;
    Paint localPaint3;
    FlowLayout.LayoutParams localLayoutParams;
    if (this.e)
    {
      Paint localPaint1 = a(-256);
      localPaint2 = a(-16711936);
      localPaint3 = a(-65536);
      localLayoutParams = (FlowLayout.LayoutParams)paramView.getLayoutParams();
      if (FlowLayout.LayoutParams.d(localLayoutParams) <= 0)
        break label345;
      float f11 = paramView.getRight();
      float f12 = paramView.getTop() + paramView.getHeight() / 2.0F;
      paramCanvas.drawLine(f11, f12, f11 + FlowLayout.LayoutParams.d(localLayoutParams), f12, localPaint1);
      paramCanvas.drawLine(f11 + FlowLayout.LayoutParams.d(localLayoutParams) - 4.0F, f12 - 4.0F, f11 + FlowLayout.LayoutParams.d(localLayoutParams), f12, localPaint1);
      paramCanvas.drawLine(f11 + FlowLayout.LayoutParams.d(localLayoutParams) - 4.0F, f12 + 4.0F, f11 + FlowLayout.LayoutParams.d(localLayoutParams), f12, localPaint1);
      if (FlowLayout.LayoutParams.c(localLayoutParams) <= 0)
        break label461;
      float f9 = paramView.getLeft() + paramView.getWidth() / 2.0F;
      float f10 = paramView.getBottom();
      paramCanvas.drawLine(f9, f10, f9, f10 + FlowLayout.LayoutParams.c(localLayoutParams), localPaint1);
      paramCanvas.drawLine(f9 - 4.0F, f10 + FlowLayout.LayoutParams.c(localLayoutParams) - 4.0F, f9, f10 + FlowLayout.LayoutParams.c(localLayoutParams), localPaint1);
      paramCanvas.drawLine(f9 + 4.0F, f10 + FlowLayout.LayoutParams.c(localLayoutParams) - 4.0F, f9, f10 + FlowLayout.LayoutParams.c(localLayoutParams), localPaint1);
    }
    while (true)
    {
      if (FlowLayout.LayoutParams.a(localLayoutParams))
      {
        if (this.c != 0)
          break label577;
        float f7 = paramView.getLeft();
        float f8 = paramView.getTop() + paramView.getHeight() / 2.0F;
        paramCanvas.drawLine(f7, f8 - 6.0F, f7, f8 + 6.0F, localPaint3);
      }
      return bool;
      label345: if (this.a <= 0)
        break;
      float f1 = paramView.getRight();
      float f2 = paramView.getTop() + paramView.getHeight() / 2.0F;
      paramCanvas.drawLine(f1, f2, f1 + this.a, f2, localPaint2);
      paramCanvas.drawLine(f1 + this.a - 4.0F, f2 - 4.0F, f1 + this.a, f2, localPaint2);
      paramCanvas.drawLine(f1 + this.a - 4.0F, f2 + 4.0F, f1 + this.a, f2, localPaint2);
      break;
      label461: if (this.b <= 0)
        continue;
      float f3 = paramView.getLeft() + paramView.getWidth() / 2.0F;
      float f4 = paramView.getBottom();
      paramCanvas.drawLine(f3, f4, f3, f4 + this.b, localPaint2);
      paramCanvas.drawLine(f3 - 4.0F, f4 + this.b - 4.0F, f3, f4 + this.b, localPaint2);
      paramCanvas.drawLine(f3 + 4.0F, f4 + this.b - 4.0F, f3, f4 + this.b, localPaint2);
    }
    label577: float f5 = paramView.getLeft() + paramView.getWidth() / 2.0F;
    float f6 = paramView.getTop();
    paramCanvas.drawLine(f5 - 6.0F, f6, 6.0F + f5, f6, localPaint3);
    return bool;
  }

  public int getLineCount()
  {
    return this.g;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      FlowLayout.LayoutParams localLayoutParams = (FlowLayout.LayoutParams)localView.getLayoutParams();
      localView.layout(FlowLayout.LayoutParams.e(localLayoutParams), FlowLayout.LayoutParams.b(localLayoutParams), FlowLayout.LayoutParams.e(localLayoutParams) + localView.getMeasuredWidth(), FlowLayout.LayoutParams.b(localLayoutParams) + localView.getMeasuredHeight());
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.g = 1;
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingRight() - getPaddingLeft();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int k = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    FlowLayout.LayoutParams localLayoutParams1;
    int i18;
    label138: int i19;
    int i20;
    label157: int i21;
    int i22;
    label197: int i23;
    label228: int i24;
    label252: int i25;
    label267: int i27;
    int i28;
    int i29;
    label300: int i30;
    int i31;
    int i32;
    label337: int i34;
    int i36;
    int i35;
    int i33;
    label410: int i53;
    int i54;
    label468: int i38;
    int i37;
    int i39;
    int i40;
    if (this.c == 0)
    {
      n = k;
      i1 = i;
      i2 = 0;
      i3 = 0;
      i4 = 0;
      i5 = 0;
      i6 = 0;
      i7 = 0;
      i8 = 0;
      i9 = getChildCount();
      i10 = 0;
      if (i10 >= i9)
        break label862;
      View localView = getChildAt(i10);
      if (localView.getVisibility() == 8)
        break label985;
      localLayoutParams1 = (FlowLayout.LayoutParams)localView.getLayoutParams();
      if (k != 1073741824)
        break label593;
      i18 = -2147483648;
      i19 = View.MeasureSpec.makeMeasureSpec(i, i18);
      if (m != 1073741824)
        break label600;
      i20 = -2147483648;
      i21 = View.MeasureSpec.makeMeasureSpec(j, i20);
      if ((localLayoutParams1.width == -1) || (localLayoutParams1.width == -2))
        break label978;
      i22 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.width, 1073741824);
      if ((localLayoutParams1.height == -1) || (localLayoutParams1.height == -2))
        break label971;
      i23 = View.MeasureSpec.makeMeasureSpec(localLayoutParams1.height, 1073741824);
      localView.measure(i22, i23);
      if (!localLayoutParams1.a())
        break label607;
      i24 = FlowLayout.LayoutParams.d(localLayoutParams1);
      if (!localLayoutParams1.b())
        break label616;
      i25 = FlowLayout.LayoutParams.c(localLayoutParams1);
      int i26 = localView.getMeasuredWidth();
      i27 = localView.getMeasuredHeight();
      if (this.c != 0)
        break label625;
      i28 = i25;
      i29 = i26;
      i26 = i27;
      i30 = i4 + i29;
      i31 = i30 + i24;
      if ((!FlowLayout.LayoutParams.a(localLayoutParams1)) && ((n == 0) || (i30 <= i1)))
        break label640;
      i32 = 1;
      if ((i32 == 0) || ((this.d != 0) && (this.g >= this.d)))
        break label646;
      i5 += i2;
      int i55 = i26 + i28;
      int i56 = i24 + i29;
      this.g = (1 + this.g);
      i30 = i29;
      i34 = i55;
      i36 = 0;
      i35 = i56;
      i33 = i26;
      if (i36 != 0)
        break label934;
      int i50 = i28 + i26;
      int i51 = Math.max(i34, i50);
      int i52 = Math.max(i33, i26);
      if (this.c != 0)
        break label678;
      i53 = i30 + getPaddingLeft() - i29;
      i54 = i5 + getPaddingTop();
      localLayoutParams1.a(i53, i54);
      i38 = Math.max(i6, i30);
      i37 = i5 + i52;
      i39 = i52;
      i40 = i51;
      label501: if (i32 == 0)
        break label702;
    }
    int i42;
    int i43;
    label640: label646: label678: label702: for (int i41 = i10 - 1; ; i41 = i10)
    {
      if ((!this.f) || ((i32 == 0) && (i41 != i9 - 1)))
        break label795;
      i42 = 1 + (i41 - i8);
      if (i42 <= 1)
        break label795;
      i43 = 0;
      for (int i44 = i8; i44 <= i41; i44++)
        i43 += getChildAt(i44).getMeasuredWidth();
      n = m;
      i1 = j;
      break;
      label593: i18 = k;
      break label138;
      label600: i20 = m;
      break label157;
      label607: i24 = this.a;
      break label252;
      label616: i25 = this.b;
      break label267;
      label625: i28 = i24;
      i24 = i25;
      i29 = i27;
      break label300;
      i32 = 0;
      break label337;
      if (i32 == 0)
        break label953;
      localLayoutParams1.a(2147483647, 2147483647);
      i35 = i31;
      i33 = i3;
      i34 = i2;
      i36 = 1;
      break label410;
      i53 = i5 + getPaddingLeft();
      i54 = i30 + getPaddingTop() - i27;
      break label468;
    }
    int i45 = (i1 - i43) / (i42 - 1);
    int i46 = getPaddingLeft();
    int i47 = i8;
    int i48 = i46;
    while (i47 <= i41)
    {
      FlowLayout.LayoutParams localLayoutParams2 = (FlowLayout.LayoutParams)getChildAt(i47).getLayoutParams();
      int i49 = FlowLayout.LayoutParams.b(localLayoutParams2);
      localLayoutParams2.a(i48, i49);
      i48 = i45 + (i48 + getChildAt(i47).getMeasuredWidth());
      i47++;
    }
    label795: int i11;
    int i12;
    int i17;
    int i16;
    int i13;
    int i14;
    int i15;
    if (i32 != 0)
    {
      i11 = i10;
      i12 = i37;
      i17 = i40;
      i16 = i39;
      i13 = i38;
      i14 = i5;
      i15 = i35;
    }
    while (true)
    {
      i10++;
      i7 = i12;
      i6 = i13;
      i5 = i14;
      i4 = i15;
      i3 = i16;
      i2 = i17;
      i8 = i11;
      break;
      label862: if (this.c == 0)
      {
        setMeasuredDimension(resolveSize(i6, paramInt1), resolveSize(i7, paramInt2));
        return;
      }
      setMeasuredDimension(resolveSize(i7, paramInt1), resolveSize(i6, paramInt2));
      return;
      i11 = i8;
      i12 = i37;
      i13 = i38;
      i17 = i40;
      i16 = i39;
      i14 = i5;
      i15 = i35;
      continue;
      label934: i37 = i7;
      i38 = i6;
      i39 = i33;
      i40 = i34;
      break label501;
      label953: i33 = i3;
      i34 = i2;
      i35 = i31;
      i36 = 0;
      break label410;
      label971: i23 = i21;
      break label228;
      label978: i22 = i19;
      break label197;
      label985: i11 = i8;
      i12 = i7;
      i13 = i6;
      i14 = i5;
      i15 = i4;
      i16 = i3;
      i17 = i2;
    }
  }

  public void setMaxLines(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      requestLayout();
    }
  }

  public void setSpaceSharing(boolean paramBoolean)
  {
    if (this.f != paramBoolean)
    {
      this.f = paramBoolean;
      requestLayout();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.FlowLayout
 * JD-Core Version:    0.6.0
 */