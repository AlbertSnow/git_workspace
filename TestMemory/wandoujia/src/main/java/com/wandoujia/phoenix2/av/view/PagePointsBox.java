package com.wandoujia.phoenix2.av.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class PagePointsBox extends LinearLayout
{
  private int a = 0;

  public PagePointsBox(Context paramContext)
  {
    super(paramContext);
    b();
  }

  public PagePointsBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }

  public PagePointsBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
  }

  private void b()
  {
    setGravity(17);
    setOrientation(0);
  }

  public final void a()
  {
    int i = 0;
    this.a = 0;
    removeAllViews();
    int j = getResources().getDimensionPixelSize(2131427466);
    int k = getResources().getDimensionPixelSize(2131427469);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(j, j);
    localLayoutParams.setMargins(k, 0, k, 0);
    if (i < 2)
    {
      ImageView localImageView = new ImageView(getContext());
      if (i == 0)
        localImageView.setImageResource(2130838623);
      while (true)
      {
        addView(localImageView, localLayoutParams);
        i++;
        break;
        localImageView.setImageResource(2130838622);
      }
    }
  }

  public final void a(int paramInt)
  {
    if (paramInt != this.a)
    {
      ((ImageView)getChildAt(paramInt)).setImageResource(2130838623);
      ((ImageView)getChildAt(this.a)).setImageResource(2130838622);
      this.a = paramInt;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.av.view.PagePointsBox
 * JD-Core Version:    0.6.0
 */