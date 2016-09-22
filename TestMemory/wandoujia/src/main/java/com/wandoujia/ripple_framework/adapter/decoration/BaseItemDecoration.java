package com.wandoujia.ripple_framework.adapter.decoration;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.by;
import android.support.v7.widget.cc;
import android.support.v7.widget.cm;
import android.view.View;

public class BaseItemDecoration extends cc
{
  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    int i = paramRecyclerView.getPaddingLeft();
    int j = paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight();
    int k = paramRecyclerView.getChildCount();
    int m = 0;
    View localView;
    BaseItemDecoration.Direction localDirection;
    int i2;
    Drawable localDrawable;
    RecyclerView.LayoutParams localLayoutParams;
    int i3;
    if (m < k)
    {
      localView = paramRecyclerView.getChildAt(m);
      int n = RecyclerView.c(localView);
      if ((n >= 0) && (n <= paramRecyclerView.getAdapter().a()))
      {
        int i1 = paramRecyclerView.getAdapter().a(n);
        boolean bool = a(i1, n);
        localDirection = b(i1, n);
        i2 = d(i1, n);
        localDrawable = c(i1, n);
        if ((bool) && (i2 > 0) && (localDrawable != null))
        {
          localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
          if (localDirection != BaseItemDecoration.Direction.TOP)
            break label185;
          i3 = localView.getTop() - i2;
        }
      }
    }
    while (true)
    {
      localDrawable.setBounds(i, i3, j, i3 + i2);
      localDrawable.draw(paramCanvas);
      m++;
      break;
      label185: if (localDirection == BaseItemDecoration.Direction.BOTTOM)
      {
        i3 = localView.getBottom() + localLayoutParams.bottomMargin;
        continue;
        return;
      }
      i3 = 0;
    }
  }

  public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, cm paramcm)
  {
    int i = RecyclerView.c(paramView);
    if ((i < 0) || (i > paramRecyclerView.getAdapter().a()))
      return;
    a(paramRect, paramView, paramRecyclerView, paramcm, paramRecyclerView.getAdapter().a(i), i);
  }

  protected void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, cm paramcm, int paramInt1, int paramInt2)
  {
    boolean bool = a(paramInt1, paramInt2);
    BaseItemDecoration.Direction localDirection = b(paramInt1, paramInt2);
    int i = d(paramInt1, paramInt2);
    if ((bool) && (i > 0))
    {
      if (localDirection != BaseItemDecoration.Direction.TOP)
        break label58;
      paramRect.set(0, i, 0, 0);
    }
    label58: 
    do
      return;
    while (localDirection != BaseItemDecoration.Direction.BOTTOM);
    paramRect.set(0, 0, 0, i);
  }

  protected boolean a(int paramInt1, int paramInt2)
  {
    return false;
  }

  protected BaseItemDecoration.Direction b(int paramInt1, int paramInt2)
  {
    return BaseItemDecoration.Direction.BOTTOM;
  }

  protected Drawable c(int paramInt1, int paramInt2)
  {
    return null;
  }

  protected int d(int paramInt1, int paramInt2)
  {
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.decoration.BaseItemDecoration
 * JD-Core Version:    0.6.0
 */