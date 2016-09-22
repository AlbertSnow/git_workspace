package com.wandoujia.push2.protocol;

import com.wandoujia.gson.a.a;
import java.io.Serializable;

public class NormalBody$GoldStyle
  implements Serializable
{

  @a(a="collapsed_image")
  private String collapsedImage;

  @a(a="image")
  private String image;

  public String getCollapsedImage()
  {
    return this.collapsedImage;
  }

  public String getImage()
  {
    return this.image;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.NormalBody.GoldStyle
 * JD-Core Version:    0.6.0
 */