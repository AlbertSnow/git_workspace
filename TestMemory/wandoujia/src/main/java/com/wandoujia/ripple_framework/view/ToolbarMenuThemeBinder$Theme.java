package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.i;

public enum ToolbarMenuThemeBinder$Theme
{
  int drawableLevel;
  int textColor;

  static
  {
    DARK = new Theme("DARK", 1, 1, R.color.text_color_black);
    BLACK = new Theme("BLACK", 2, 2, R.color.text_color_black);
    Theme[] arrayOfTheme = new Theme[3];
    arrayOfTheme[0] = WHITE;
    arrayOfTheme[1] = DARK;
    arrayOfTheme[2] = BLACK;
    $VALUES = arrayOfTheme;
  }

  private ToolbarMenuThemeBinder$Theme(int paramInt1, int paramInt2)
  {
    this.drawableLevel = paramInt1;
    this.textColor = i.k().g().getResources().getColor(paramInt2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ToolbarMenuThemeBinder.Theme
 * JD-Core Version:    0.6.0
 */