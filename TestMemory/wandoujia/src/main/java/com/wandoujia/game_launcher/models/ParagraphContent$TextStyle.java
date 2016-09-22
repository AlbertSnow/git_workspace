package com.wandoujia.game_launcher.models;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.game_launcher.lib.R.color;
import com.wandoujia.game_launcher.lib.R.dimen;
import com.wandoujia.gson.a.a;

public enum ParagraphContent$TextStyle
{
  public final int color;
  public final int gravity;
  public final float lineHeight;
  public final int size;

  static
  {
    SUBTITLE = new TextStyle("SUBTITLE", 1, R.dimen.text_size_xlarge, R.color.text_color_black, 1.0F, 1, 1.2F);
    NORMAL = new TextStyle("NORMAL", 2, R.dimen.text_size_middle, R.color.text_color_black, 0.8F, 3, 1.5F);
    QUOTE = new TextStyle("QUOTE", 3, R.dimen.text_size_small, R.color.text_color_black, 1.0F, 1, 1.5F);
    AUTHOR = new TextStyle("AUTHOR", 4, R.dimen.text_size_micro, R.color.pure_black_translucent_50, 1.0F, 1, 1.0F);
    TextStyle[] arrayOfTextStyle = new TextStyle[5];
    arrayOfTextStyle[0] = TITLE;
    arrayOfTextStyle[1] = SUBTITLE;
    arrayOfTextStyle[2] = NORMAL;
    arrayOfTextStyle[3] = QUOTE;
    arrayOfTextStyle[4] = AUTHOR;
    $VALUES = arrayOfTextStyle;
  }

  private ParagraphContent$TextStyle(int paramInt1, int paramInt2, float paramFloat1, int paramInt3, float paramFloat2)
  {
    this.size = GlobalConfig.getAppContext().getResources().getDimensionPixelSize(paramInt1);
    this.color = getARGBColor(GlobalConfig.getAppContext().getResources().getColor(paramInt2), paramFloat1);
    this.gravity = paramInt3;
    this.lineHeight = paramFloat2;
  }

  private int getARGBColor(int paramInt, float paramFloat)
  {
    if ((paramFloat < 1.0F) && (paramFloat >= 0.0F))
      paramInt = Color.argb((int)(255.0F * paramFloat), Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt));
    return paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.models.ParagraphContent.TextStyle
 * JD-Core Version:    0.6.0
 */