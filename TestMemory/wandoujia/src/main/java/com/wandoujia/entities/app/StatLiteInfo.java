package com.wandoujia.entities.app;

import java.io.Serializable;

public class StatLiteInfo
  implements Serializable
{
  String totalStr;
  String weeklyStr;

  public String getTotalStr()
  {
    return this.totalStr;
  }

  public String getWeeklyStr()
  {
    return this.weeklyStr;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.StatLiteInfo
 * JD-Core Version:    0.6.0
 */