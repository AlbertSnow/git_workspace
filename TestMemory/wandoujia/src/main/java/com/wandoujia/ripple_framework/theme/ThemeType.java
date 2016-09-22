package com.wandoujia.ripple_framework.theme;

public enum ThemeType
{
  static
  {
    BACKGROUND = new ThemeType("BACKGROUND", 1);
    CUSTOM = new ThemeType("CUSTOM", 2);
    ThemeType[] arrayOfThemeType = new ThemeType[3];
    arrayOfThemeType[0] = TEXT_COLOR;
    arrayOfThemeType[1] = BACKGROUND;
    arrayOfThemeType[2] = CUSTOM;
    $VALUES = arrayOfThemeType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.theme.ThemeType
 * JD-Core Version:    0.6.0
 */