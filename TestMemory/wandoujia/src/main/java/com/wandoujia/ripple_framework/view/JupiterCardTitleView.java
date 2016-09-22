package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.wandoujia.ripple_framework.R.styleable;

public class JupiterCardTitleView extends LinearLayout
{
  private int a = 51;
  private int b;

  public JupiterCardTitleView(Context paramContext)
  {
    super(paramContext);
  }

  public JupiterCardTitleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public JupiterCardTitleView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.a = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.JupiterCardTitleView, 0, 0).getInt(R.styleable.JupiterCardTitleView_gravity, 0);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingTop();
    int j = getBottom() - getTop();
    int k = j - getPaddingBottom();
    int m = j - i - getPaddingBottom();
    int n = getChildCount();
    int i1 = 0x800007 & this.a;
    int i2 = 0x70 & this.a;
    int i3;
    int i4;
    int i5;
    label105: int i7;
    int i8;
    LinearLayout.LayoutParams localLayoutParams;
    int i10;
    label218: int i11;
    switch (i1)
    {
    default:
      i3 = getPaddingLeft();
      i4 = 0;
      i5 = i3;
      if (i4 >= n)
        break;
      View localView = getChildAt(i4);
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        i7 = localView.getMeasuredWidth();
        i8 = localView.getMeasuredHeight();
        localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
        int i9 = localLayoutParams.gravity;
        if (i9 < 0)
          i9 = i2;
        switch (i9 & 0x70)
        {
        default:
          i10 = i + localLayoutParams.topMargin;
          i11 = i5 + localLayoutParams.leftMargin;
          localView.layout(i11, i10, i11 + i7, i8 + i10);
        case 16:
        case 80:
        }
      }
    case 5:
    case 1:
    }
    for (int i6 = i11 + (i7 + localLayoutParams.rightMargin); ; i6 = i5)
    {
      i4++;
      i5 = i6;
      break label105;
      i3 = getPaddingLeft() + getRight() - getLeft() - this.b;
      break;
      i3 = getPaddingLeft() + (getRight() - getLeft() - this.b) / 2;
      break;
      i10 = i + (m - i8) / 2 + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
      break label218;
      i10 = k - i8 - localLayoutParams.bottomMargin;
      break label218;
      return;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.b = (getPaddingLeft() + getPaddingRight());
    int i = getPaddingTop() + getPaddingBottom();
    int j;
    int k;
    label47: int m;
    label58: int n;
    label69: int i1;
    int i2;
    label81: int i3;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824)
    {
      j = 1;
      if (View.MeasureSpec.getMode(paramInt2) != 1073741824)
        break label276;
      k = 1;
      if (j == 0)
        break label282;
      m = View.MeasureSpec.getSize(paramInt1);
      if (k == 0)
        break label291;
      n = View.MeasureSpec.getSize(paramInt2);
      i1 = -1 + getChildCount();
      i2 = n;
      if (i1 < 0)
        break label297;
      View localView = getChildAt(i1);
      if ((localView == null) || (localView.getVisibility() == 8))
        break label306;
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
      localView.measure(getChildMeasureSpec(paramInt1, this.b + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), getChildMeasureSpec(paramInt2, i + localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height));
      int i5 = localView.getMeasuredWidth() + localLayoutParams.leftMargin + localLayoutParams.rightMargin;
      this.b = (i5 + this.b);
      if (j == 0)
        m += i5;
      if (k != 0)
        break label306;
      i3 = Math.max(i2, localView.getMeasuredHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin + getPaddingTop() + getPaddingBottom());
    }
    for (int i4 = m; ; i4 = m)
    {
      i1--;
      m = i4;
      i2 = i3;
      break label81;
      j = 0;
      break;
      label276: k = 0;
      break label47;
      label282: m = this.b;
      break label58;
      label291: n = i;
      break label69;
      label297: setMeasuredDimension(m, i2);
      return;
      label306: i3 = i2;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.JupiterCardTitleView
 * JD-Core Version:    0.6.0
 */