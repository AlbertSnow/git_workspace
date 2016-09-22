package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.wandoujia.ripple_framework.R.id;

public class TextWithAdContainer extends FrameLayout
{
  public TextWithAdContainer(Context paramContext)
  {
    super(paramContext);
  }

  public TextWithAdContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public TextWithAdContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = getPaddingLeft();
    int k = paramInt3 - paramInt1 - getPaddingRight() - j;
    int m = getPaddingTop();
    int n = 0;
    int i1 = 0;
    View localView;
    int i5;
    int i2;
    if (n < i)
    {
      localView = getChildAt(n);
      if (localView.getVisibility() != 0)
        break label194;
      int i3 = localView.getMeasuredWidth();
      int i4 = localView.getMeasuredHeight();
      if (localView.getId() == R.id.title)
      {
        i5 = j + (k - i3) / 2;
        i2 = i3;
        label102: localView.layout(i5, m, i3 + i5, i4 + m);
      }
    }
    while (true)
    {
      n++;
      i1 = i2;
      break;
      if (localView.getId() == R.id.ad_label)
      {
        if (i1 == 0)
          i1 = findViewById(R.id.title).getMeasuredWidth();
        int i6 = j + (k + i1) / 2;
        i2 = i1;
        i5 = i6;
        break label102;
        return;
      }
      i2 = i1;
      i5 = j;
      break label102;
      label194: i2 = i1;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.TextWithAdContainer
 * JD-Core Version:    0.6.0
 */