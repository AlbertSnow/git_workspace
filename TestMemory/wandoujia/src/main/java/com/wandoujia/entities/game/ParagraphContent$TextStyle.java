package com.wandoujia.entities.game;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.entities.R.color;
import com.wandoujia.entities.R.dimen;
import com.wandoujia.gson.a.a;

public enum ParagraphContent$TextStyle
{
  public final int color;
  public final int gravity;
  public final int size;

  static
  {
    SUBTITLE = new TextStyle("SUBTITLE", 1, R.dimen.story_text_size_subtitle, R.color.text_color_dark, 1.0F, 1);
    NORMAL = new TextStyle("NORMAL", 2, R.dimen.story_text_size_normal, R.color.text_color_black, 0.8F, 3);
    QUOTE = new TextStyle("QUOTE", 3, R.dimen.story_text_size_quote, R.color.text_color_black, 1.0F, 1);
    AUTHOR = new TextStyle("AUTHOR", 4, R.dimen.story_text_size_quote_author, R.color.transparent_black, 1.0F, 1);
    TextStyle[] arrayOfTextStyle = new TextStyle[5];
    arrayOfTextStyle[0] = TITLE;
    arrayOfTextStyle[1] = SUBTITLE;
    arrayOfTextStyle[2] = NORMAL;
    arrayOfTextStyle[3] = QUOTE;
    arrayOfTextStyle[4] = AUTHOR;
    $VALUES = arrayOfTextStyle;
  }

  private ParagraphContent$TextStyle(int paramInt1, int paramInt2, float paramFloat, int paramInt3)
  {
    this.size = GlobalConfig.getAppContext().getResources().getDimensionPixelSize(paramInt1);
    this.color = GlobalConfig.getAppContext().getResources().getColor(paramInt2);
    this.gravity = paramInt3;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.ParagraphContent.TextStyle
 * JD-Core Version:    0.6.0
 */