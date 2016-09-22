package com.wandoujia.jupiter.library.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.wandoujia.jupiter.JupiterApplication;

public enum TransitionTab$State
{
  private final int bgColor;
  private final int indicatorColor;
  private final ColorStateList numColorList;
  private final ColorStateList titleColorList;

  static
  {
    DARK = new State("DARK", 1, 2131362265, 2131362265, 2131361989, 2131361862);
    State[] arrayOfState = new State[2];
    arrayOfState[0] = LIGHT;
    arrayOfState[1] = DARK;
    $VALUES = arrayOfState;
  }

  private TransitionTab$State(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.numColorList = JupiterApplication.e().getResources().getColorStateList(paramInt1);
    this.titleColorList = JupiterApplication.e().getResources().getColorStateList(paramInt2);
    this.bgColor = JupiterApplication.e().getResources().getColor(paramInt3);
    this.indicatorColor = JupiterApplication.e().getResources().getColor(paramInt4);
  }

  public final int getBgColor()
  {
    return this.bgColor;
  }

  public final int getIndicatorColor()
  {
    return this.indicatorColor;
  }

  public final ColorStateList getNumColorList()
  {
    return this.numColorList;
  }

  public final ColorStateList getTitleColorList()
  {
    return this.titleColorList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.view.TransitionTab.State
 * JD-Core Version:    0.6.0
 */