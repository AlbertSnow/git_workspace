package com.wandoujia.push2.protocol;

import com.wandoujia.gson.a.a;
import java.io.Serializable;

public class NormalBody$IronStyle
  implements Serializable
{

  @a(a="icon")
  private String icon;

  @a(a="text")
  private String text;

  public String getIcon()
  {
    return this.icon;
  }

  public String getText()
  {
    return this.text;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.NormalBody.IronStyle
 * JD-Core Version:    0.6.0
 */