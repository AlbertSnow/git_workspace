package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.support.v4.view.bg;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.logv3.toolkit.LogViewPager;

public class CustomViewPager extends LogViewPager
{
  private boolean a = true;

  public CustomViewPager(Context paramContext)
  {
    super(paramContext);
  }

  public CustomViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private boolean b(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = paramView.getScrollX();
      int j = paramView.getScrollY();
      for (int k = -1 + localViewGroup.getChildCount(); k >= 0; k--)
      {
        View localView = localViewGroup.getChildAt(k);
        int m = (int)bg.n(localView);
        int n = (int)bg.m(localView);
        int i1 = m + localView.getTop();
        int i2 = m + localView.getBottom();
        int i3 = n + localView.getLeft();
        int i4 = n + localView.getRight();
        if ((paramInt2 + i >= i3) && (paramInt2 + i < i4) && (paramInt3 + j >= i1) && (paramInt3 + j < i2) && (b(localView, true, paramInt1, paramInt2 + i - i3, paramInt3 + j - i1)))
          return true;
      }
    }
    if ((paramBoolean) && ((paramView instanceof InlineRecyclerView)))
      return true;
    return (paramBoolean) && (bg.a(paramView, -paramInt1));
  }

  protected final boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.a);
    do
      return true;
    while ((paramBoolean) && ((paramView instanceof InlineRecyclerView)));
    if (SystemUtil.aboveApiLevel(11))
      return b(paramView, paramBoolean, paramInt1, paramInt2, paramInt3);
    return super.a(paramView, paramBoolean, paramInt1, paramInt2, paramInt3);
  }

  public void setPagingEnabled(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.CustomViewPager
 * JD-Core Version:    0.6.0
 */