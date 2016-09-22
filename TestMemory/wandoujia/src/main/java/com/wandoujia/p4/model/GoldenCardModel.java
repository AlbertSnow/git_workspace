package com.wandoujia.p4.model;

import com.wandoujia.entities.app.AppLiteInfo;
import java.io.Serializable;

public class GoldenCardModel
  implements Serializable
{
  private AppLiteInfo app;
  private GoldenCardModel.GoldenCardType cardType;
  private GoldenCardModel.CornerMarkType cornerMark;
  private int id;
  private String image;
  private String meta;
  private boolean showTitle;
  private String subtitle;
  private String title;
  private String uri;

  public AppLiteInfo getApp()
  {
    return this.app;
  }

  public GoldenCardModel.GoldenCardType getCardType()
  {
    return this.cardType;
  }

  public GoldenCardModel.CornerMarkType getCornerMark()
  {
    return this.cornerMark;
  }

  public int getId()
  {
    return this.id;
  }

  public String getImage()
  {
    return this.image;
  }

  public String getMeta()
  {
    return this.meta;
  }

  public String getSubtitle()
  {
    return this.subtitle;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getUri()
  {
    return this.uri;
  }

  public boolean isShowTitle()
  {
    return this.showTitle;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.model.GoldenCardModel
 * JD-Core Version:    0.6.0
 */