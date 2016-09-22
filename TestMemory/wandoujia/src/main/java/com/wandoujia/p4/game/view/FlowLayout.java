package com.wandoujia.p4.game.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public class FlowLayout extends ViewGroup
{
  private LayoutConfiguration a;
  private List<b> b = new ArrayList();

  public FlowLayout(Context paramContext)
  {
    super(paramContext);
    this.a = new LayoutConfiguration(paramContext, null);
  }

  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = new LayoutConfiguration(paramContext, paramAttributeSet);
  }

  public FlowLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new LayoutConfiguration(paramContext, paramAttributeSet);
  }

  private float a(FlowLayout.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams.c >= 0.0F);
    for (int i = 1; i != 0; i = 0)
      return paramLayoutParams.c;
    return this.a.c();
  }

  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt1)
    {
    case 0:
    default:
      return paramInt3;
    case -2147483648:
      return Math.min(paramInt3, paramInt2);
    case 1073741824:
    }
    return paramInt2;
  }

  private static Paint a(int paramInt)
  {
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setColor(paramInt);
    localPaint.setStrokeWidth(2.0F);
    return localPaint;
  }

  private void a(b paramb)
  {
    List localList = paramb.e();
    int i = localList.size();
    int j = 0;
    if (j < i)
    {
      View localView = (View)localList.get(j);
      FlowLayout.LayoutParams localLayoutParams = (FlowLayout.LayoutParams)localView.getLayoutParams();
      if (this.a.a() == 0)
      {
        localLayoutParams.a(getPaddingLeft() + paramb.d() + localLayoutParams.a(), getPaddingTop() + paramb.a() + localLayoutParams.d());
        localView.measure(View.MeasureSpec.makeMeasureSpec(localLayoutParams.b(), 1073741824), View.MeasureSpec.makeMeasureSpec(localLayoutParams.c(), 1073741824));
      }
      while (true)
      {
        j++;
        break;
        localLayoutParams.a(getPaddingLeft() + paramb.a() + localLayoutParams.d(), getPaddingTop() + paramb.d() + localLayoutParams.a());
        localView.measure(View.MeasureSpec.makeMeasureSpec(localLayoutParams.c(), 1073741824), View.MeasureSpec.makeMeasureSpec(localLayoutParams.b(), 1073741824));
      }
    }
  }

  private void b(b paramb)
  {
    List localList = paramb.e();
    int i = localList.size();
    if (i <= 0)
      return;
    int j = 0;
    float f1 = 0.0F;
    while (j < i)
    {
      float f3 = f1 + a((FlowLayout.LayoutParams)((View)localList.get(j)).getLayoutParams());
      j++;
      f1 = f3;
    }
    FlowLayout.LayoutParams localLayoutParams1 = (FlowLayout.LayoutParams)((View)localList.get(i - 1)).getLayoutParams();
    int k = paramb.c() - (localLayoutParams1.b() + localLayoutParams1.a());
    int m = 0;
    int n = 0;
    label109: FlowLayout.LayoutParams localLayoutParams2;
    float f2;
    int i1;
    if (m < i)
    {
      localLayoutParams2 = (FlowLayout.LayoutParams)((View)localList.get(m)).getLayoutParams();
      f2 = a(localLayoutParams2);
      if (localLayoutParams2.b == 0)
        break label346;
      i1 = 1;
      label153: if (i1 == 0)
        break label352;
    }
    label346: label352: for (int i2 = localLayoutParams2.b; ; i2 = this.a.d())
    {
      int i3 = Math.round(f2 * k / f1);
      int i4 = localLayoutParams2.b() + localLayoutParams2.e();
      int i5 = localLayoutParams2.c() + localLayoutParams2.f();
      Rect localRect1 = new Rect();
      localRect1.top = 0;
      localRect1.left = n;
      localRect1.right = (n + (i4 + i3));
      localRect1.bottom = paramb.b();
      Rect localRect2 = new Rect();
      Gravity.apply(i2, i4, i5, localRect1, localRect2);
      int i6 = n + i3;
      localLayoutParams2.a(localRect2.left + localLayoutParams2.a());
      localLayoutParams2.d(localRect2.top);
      localLayoutParams2.b(localRect2.width() - localLayoutParams2.e());
      localLayoutParams2.c(localRect2.height() - localLayoutParams2.f());
      m++;
      n = i6;
      break label109;
      break;
      i1 = 0;
      break label153;
    }
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof FlowLayout.LayoutParams;
  }

  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    Paint localPaint2;
    if (this.a.b())
    {
      Paint localPaint1 = a(-256);
      localPaint2 = a(-65536);
      FlowLayout.LayoutParams localLayoutParams = (FlowLayout.LayoutParams)paramView.getLayoutParams();
      if (localLayoutParams.rightMargin > 0)
      {
        float f11 = paramView.getRight();
        float f12 = paramView.getTop() + paramView.getHeight() / 2.0F;
        paramCanvas.drawLine(f11, f12, f11 + localLayoutParams.rightMargin, f12, localPaint1);
        paramCanvas.drawLine(f11 + localLayoutParams.rightMargin - 4.0F, f12 - 4.0F, f11 + localLayoutParams.rightMargin, f12, localPaint1);
        paramCanvas.drawLine(f11 + localLayoutParams.rightMargin - 4.0F, f12 + 4.0F, f11 + localLayoutParams.rightMargin, f12, localPaint1);
      }
      if (localLayoutParams.leftMargin > 0)
      {
        float f9 = paramView.getLeft();
        float f10 = paramView.getTop() + paramView.getHeight() / 2.0F;
        paramCanvas.drawLine(f9, f10, f9 - localLayoutParams.leftMargin, f10, localPaint1);
        paramCanvas.drawLine(4.0F + (f9 - localLayoutParams.leftMargin), f10 - 4.0F, f9 - localLayoutParams.leftMargin, f10, localPaint1);
        paramCanvas.drawLine(4.0F + (f9 - localLayoutParams.leftMargin), f10 + 4.0F, f9 - localLayoutParams.leftMargin, f10, localPaint1);
      }
      if (localLayoutParams.bottomMargin > 0)
      {
        float f7 = paramView.getLeft() + paramView.getWidth() / 2.0F;
        float f8 = paramView.getBottom();
        paramCanvas.drawLine(f7, f8, f7, f8 + localLayoutParams.bottomMargin, localPaint1);
        paramCanvas.drawLine(f7 - 4.0F, f8 + localLayoutParams.bottomMargin - 4.0F, f7, f8 + localLayoutParams.bottomMargin, localPaint1);
        paramCanvas.drawLine(f7 + 4.0F, f8 + localLayoutParams.bottomMargin - 4.0F, f7, f8 + localLayoutParams.bottomMargin, localPaint1);
      }
      if (localLayoutParams.topMargin > 0)
      {
        float f5 = paramView.getLeft() + paramView.getWidth() / 2.0F;
        float f6 = paramView.getTop();
        paramCanvas.drawLine(f5, f6, f5, f6 - localLayoutParams.topMargin, localPaint1);
        paramCanvas.drawLine(f5 - 4.0F, 4.0F + (f6 - localLayoutParams.topMargin), f5, f6 - localLayoutParams.topMargin, localPaint1);
        paramCanvas.drawLine(f5 + 4.0F, 4.0F + (f6 - localLayoutParams.topMargin), f5, f6 - localLayoutParams.topMargin, localPaint1);
      }
      if (localLayoutParams.a)
      {
        if (this.a.a() != 0)
          break label582;
        float f3 = paramView.getLeft();
        float f4 = paramView.getTop() + paramView.getHeight() / 2.0F;
        paramCanvas.drawLine(f3, f4 - 6.0F, f3, f4 + 6.0F, localPaint2);
      }
    }
    return bool;
    label582: float f1 = paramView.getLeft() + paramView.getWidth() / 2.0F;
    float f2 = paramView.getTop();
    paramCanvas.drawLine(f1 - 6.0F, f2, 6.0F + f1, f2, localPaint2);
    return bool;
  }

  public int getGravity()
  {
    return this.a.d();
  }

  public int getLayoutDirection()
  {
    if (this.a == null)
      return 0;
    return this.a.e();
  }

  public int getOrientation()
  {
    return this.a.a();
  }

  public float getWeightDefault()
  {
    return this.a.c();
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      FlowLayout.LayoutParams localLayoutParams = (FlowLayout.LayoutParams)localView.getLayoutParams();
      localView.layout(FlowLayout.LayoutParams.a(localLayoutParams) + localLayoutParams.leftMargin, FlowLayout.LayoutParams.b(localLayoutParams) + localLayoutParams.topMargin, FlowLayout.LayoutParams.a(localLayoutParams) + localLayoutParams.leftMargin + localView.getMeasuredWidth(), FlowLayout.LayoutParams.b(localLayoutParams) + localLayoutParams.topMargin + localView.getMeasuredHeight());
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingRight() - getPaddingLeft();
    int j = View.MeasureSpec.getSize(paramInt2) - getPaddingTop() - getPaddingBottom();
    int k = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getMode(paramInt2);
    int n;
    label66: label76: Object localObject1;
    int i2;
    label121: View localView;
    FlowLayout.LayoutParams localLayoutParams2;
    label239: int i28;
    label265: Object localObject2;
    if (this.a.a() == 0)
    {
      n = i;
      if (this.a.a() != 0)
        break label365;
      if (this.a.a() != 0)
        break label371;
      this.b.clear();
      localObject1 = new b(n, this.a);
      this.b.add(localObject1);
      int i1 = getChildCount();
      i2 = 0;
      if (i2 >= i1)
        break label432;
      localView = getChildAt(i2);
      if (localView.getVisibility() == 8)
        break label1024;
      localLayoutParams2 = (FlowLayout.LayoutParams)localView.getLayoutParams();
      localView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams2.width), getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom(), localLayoutParams2.height));
      localLayoutParams2.e(this.a.a());
      if (this.a.a() != 0)
        break label378;
      localLayoutParams2.b(localView.getMeasuredWidth());
      localLayoutParams2.c(localView.getMeasuredHeight());
      if ((!localLayoutParams2.a) && ((k == 0) || (((b)localObject1).b(localView))))
        break label401;
      i28 = 1;
      if (i28 == 0)
        break label1017;
      localObject2 = new b(n, this.a);
      if ((this.a.a() != 1) || (this.a.e() != 1))
        break label407;
      this.b.add(0, localObject2);
      label319: if ((this.a.a() != 0) || (this.a.e() != 1))
        break label422;
      ((b)localObject2).a(0, localView);
    }
    while (true)
    {
      i2++;
      localObject1 = localObject2;
      break label121;
      n = j;
      break;
      label365: j = i;
      break label66;
      label371: k = m;
      break label76;
      label378: localLayoutParams2.b(localView.getMeasuredHeight());
      localLayoutParams2.c(localView.getMeasuredWidth());
      break label239;
      label401: i28 = 0;
      break label265;
      label407: this.b.add(localObject2);
      break label319;
      label422: ((b)localObject2).a(localView);
      continue;
      label432: List localList1 = this.b;
      int i3 = localList1.size();
      int i4 = 0;
      for (int i5 = 0; i5 < i3; i5++)
      {
        b localb4 = (b)localList1.get(i5);
        localb4.c(i4);
        i4 += localb4.b();
        List localList3 = localb4.e();
        int i25 = localList3.size();
        int i26 = 0;
        for (int i27 = 0; i27 < i25; i27++)
        {
          FlowLayout.LayoutParams localLayoutParams1 = (FlowLayout.LayoutParams)((View)localList3.get(i27)).getLayoutParams();
          localLayoutParams1.a(i26);
          i26 += localLayoutParams1.b() + localLayoutParams1.e();
        }
      }
      int i6 = this.b.size();
      int i7 = 0;
      for (int i8 = 0; i8 < i6; i8++)
        i7 = Math.max(i7, ((b)this.b.get(i8)).c());
      int i9 = ((b)localObject1).a() + ((b)localObject1).b();
      int i10 = a(k, n, i7);
      int i11 = a(m, j, i9);
      List localList2 = this.b;
      int i12 = localList2.size();
      if (i12 > 0)
      {
        b localb2 = (b)localList2.get(i12 - 1);
        int i18 = i11 - (localb2.b() + localb2.a());
        int i19 = 0;
        for (int i20 = 0; i20 < i12; i20++)
        {
          b localb3 = (b)localList2.get(i20);
          int i21 = getGravity();
          int i22 = Math.round(i18 * 1 / i12);
          int i23 = localb3.c();
          int i24 = localb3.b();
          Rect localRect1 = new Rect();
          localRect1.top = i19;
          localRect1.left = 0;
          localRect1.right = i10;
          localRect1.bottom = (i19 + (i24 + i22));
          Rect localRect2 = new Rect();
          Gravity.apply(i21, i23, i24, localRect1, localRect2);
          i19 += i22;
          localb3.d(localRect2.left);
          localb3.c(localRect2.top);
          localb3.b(localRect2.width());
          localb3.a(localRect2.height());
        }
      }
      for (int i13 = 0; i13 < i6; i13++)
      {
        b localb1 = (b)this.b.get(i13);
        b(localb1);
        a(localb1);
      }
      int i14 = getPaddingLeft() + getPaddingRight();
      int i15 = getPaddingBottom() + getPaddingTop();
      int i16;
      if (this.a.a() == 0)
        i16 = i14 + i7;
      for (int i17 = i15 + i9; ; i17 = i15 + i7)
      {
        setMeasuredDimension(resolveSize(i16, paramInt1), resolveSize(i17, paramInt2));
        return;
        i16 = i14 + i9;
      }
      label1017: localObject2 = localObject1;
      break label319;
      label1024: localObject2 = localObject1;
    }
  }

  public void setDebugDraw(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
    invalidate();
  }

  public void setGravity(int paramInt)
  {
    this.a.b(paramInt);
    requestLayout();
  }

  public void setLayoutDirection(int paramInt)
  {
    this.a.c(paramInt);
    requestLayout();
  }

  public void setOrientation(int paramInt)
  {
    this.a.a(paramInt);
    requestLayout();
  }

  public void setWeightDefault(float paramFloat)
  {
    this.a.a(paramFloat);
    requestLayout();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.game.view.FlowLayout
 * JD-Core Version:    0.6.0
 */