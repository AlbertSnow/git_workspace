package com.wandoujia.entities.game;

import java.io.Serializable;
import java.util.List;

public class ParagraphContent
  implements Serializable
{
  private String author;
  private String icon;
  private List<ImageModel> images;
  private String text;
  private ParagraphContent.TextStyle textStyle;

  public String getAuthor()
  {
    return this.author;
  }

  public String getIcon()
  {
    return this.icon;
  }

  public List<ImageModel> getImages()
  {
    return this.images;
  }

  public String getText()
  {
    return this.text;
  }

  public ParagraphContent.TextStyle getTextStyle()
  {
    return this.textStyle;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.ParagraphContent
 * JD-Core Version:    0.6.0
 */