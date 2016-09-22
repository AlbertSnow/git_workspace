package com.wandoujia.push2.protocol;

import com.wandoujia.gson.a.a;
import java.io.Serializable;

public class NormalBody$PopupStyle
  implements Serializable
{

  @a(a="description")
  private String description;

  @a(a="interval_hour")
  private int intervalHour;

  public String getDescription()
  {
    return this.description;
  }

  public int getIntervalHour()
  {
    return this.intervalHour;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.protocol.NormalBody.PopupStyle
 * JD-Core Version:    0.6.0
 */