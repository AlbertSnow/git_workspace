package com.wandoujia.entities.game;

import java.io.Serializable;

public class ImageModel
  implements Serializable
{
  private int height;
  private String url;
  private int width;

  public int getHeight()
  {
    return this.height;
  }

  public String getUrl()
  {
    return this.url;
  }

  public int getWidth()
  {
    return this.width;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.ImageModel
 * JD-Core Version:    0.6.0
 */