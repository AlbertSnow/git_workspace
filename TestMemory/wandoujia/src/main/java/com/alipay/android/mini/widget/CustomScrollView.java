package com.alipay.android.mini.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class CustomScrollView extends ScrollView
{
  public CustomScrollView(Context paramContext)
  {
    super(paramContext);
  }

  public CustomScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CustomScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a()
  {
    postDelayed(new b(this), 300L);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    new StringBuilder(" custom scroll view ").append(paramInt1).append("  ").append(paramInt2).append(" old ").append(paramInt3).append("  ").append(paramInt4);
    if (paramInt4 - paramInt2 > 0)
      a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.widget.CustomScrollView
 * JD-Core Version:    0.6.0
 */