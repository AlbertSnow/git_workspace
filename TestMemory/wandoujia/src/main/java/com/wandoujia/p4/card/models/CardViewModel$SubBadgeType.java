package com.wandoujia.p4.card.models;

import android.content.Context;
import com.wandoujia.p4.a;

public enum CardViewModel$SubBadgeType
{
  private int imageResId;
  private boolean isText;
  private boolean isVerticalColor = false;
  private String text;
  private int textColor;

  static
  {
    AD = new SubBadgeType("AD", 2, 2130837808);
    SUBSCRIBED = new SubBadgeType("SUBSCRIBED", 3, a.a().getString(2131625463));
    NOT_DOWNLOADED = new SubBadgeType("NOT_DOWNLOADED", 4, a.a().getString(2131625643));
    ONLY_PLAY = new SubBadgeType("ONLY_PLAY", 5, a.a().getString(2131625644));
    DOWNLOADED = new SubBadgeType("DOWNLOADED", 6, 2130837792);
    SubBadgeType[] arrayOfSubBadgeType = new SubBadgeType[7];
    arrayOfSubBadgeType[0] = COIN;
    arrayOfSubBadgeType[1] = VERIFIED;
    arrayOfSubBadgeType[2] = AD;
    arrayOfSubBadgeType[3] = SUBSCRIBED;
    arrayOfSubBadgeType[4] = NOT_DOWNLOADED;
    arrayOfSubBadgeType[5] = ONLY_PLAY;
    arrayOfSubBadgeType[6] = DOWNLOADED;
    $VALUES = arrayOfSubBadgeType;
  }

  private CardViewModel$SubBadgeType(int paramInt)
  {
    this.isText = false;
    this.imageResId = paramInt;
  }

  private CardViewModel$SubBadgeType(String paramString)
  {
    this.text = paramString;
    this.isText = true;
    this.isVerticalColor = true;
  }

  private CardViewModel$SubBadgeType(String paramString, int paramInt)
  {
    this.isText = true;
    this.textColor = paramInt;
    this.text = paramString;
  }

  public final int getImageResId()
  {
    return this.imageResId;
  }

  public final String getText()
  {
    return this.text;
  }

  public final int getTextColor()
  {
    return this.textColor;
  }

  public final boolean isText()
  {
    return this.isText;
  }

  public final boolean isVerticalColor()
  {
    return this.isVerticalColor;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.card.models.CardViewModel.SubBadgeType
 * JD-Core Version:    0.6.0
 */