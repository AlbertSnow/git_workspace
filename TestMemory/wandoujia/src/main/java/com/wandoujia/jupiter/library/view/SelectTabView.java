package com.wandoujia.jupiter.library.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class SelectTabView extends LinearLayout
{
  public SelectTabView(Context paramContext)
  {
    super(paramContext);
    setTag(2131492976, Boolean.valueOf(true));
  }

  public SelectTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setTag(2131492976, Boolean.valueOf(true));
  }

  public SelectTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setTag(2131492976, Boolean.valueOf(true));
  }

  public SelectTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setTag(2131492976, Boolean.valueOf(true));
  }

  private void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    for (int i = 0; i < paramViewGroup.getChildCount(); i++)
    {
      View localView = paramViewGroup.getChildAt(i);
      localView.setSelected(paramBoolean);
      if ((!(localView instanceof ViewGroup)) || (((ViewGroup)localView).getChildCount() <= 0))
        continue;
      a((ViewGroup)localView, paramBoolean);
    }
  }

  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    a(this, paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.view.SelectTabView
 * JD-Core Version:    0.6.0
 */