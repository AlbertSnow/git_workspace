package com.wandoujia.ripple_framework;

import android.graphics.Typeface;

public enum TypefaceManager$FONT
{
  public Typeface defaultTypeface;
  public String md5;
  public String path;
  public String url;

  static
  {
    BLACK = new FONT("BLACK", 2, "fonts/FZLTZHK.TTF", "http://static.wdjimg.com/misc/images/fonts/FZLTZHK.TTF", Typeface.create(Typeface.DEFAULT, 0), "d18cb36bf3662a9b86f165e39cf48f80");
    BOLD = new FONT("BOLD", 3, "fonts/FZLTZHK.TTF", "http://static.wdjimg.com/misc/images/fonts/FZLTZHK.TTF", Typeface.create(Typeface.DEFAULT, 1), "d18cb36bf3662a9b86f165e39cf48f80");
    FONT[] arrayOfFONT = new FONT[4];
    arrayOfFONT[0] = NORMAL;
    arrayOfFONT[1] = ROBOT;
    arrayOfFONT[2] = BLACK;
    arrayOfFONT[3] = BOLD;
    $VALUES = arrayOfFONT;
  }

  private TypefaceManager$FONT(String paramString1, String paramString2, Typeface paramTypeface, String paramString3)
  {
    this.path = paramString1;
    this.url = paramString2;
    this.defaultTypeface = paramTypeface;
    this.md5 = paramString3;
  }

  public static FONT getFont(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < values().length))
      return values()[paramInt];
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.TypefaceManager.FONT
 * JD-Core Version:    0.6.0
 */