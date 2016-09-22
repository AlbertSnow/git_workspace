package com.wandoujia.jupiter.paid.model;

import java.io.Serializable;

public class ChannelInfo
  implements Serializable
{
  private String channelName;
  private boolean paid;
  private String udid;

  public String getChannelName()
  {
    return this.channelName;
  }

  public String getUdid()
  {
    return this.udid;
  }

  public boolean isPaid()
  {
    return this.paid;
  }

  public void setChannelName(String paramString)
  {
    this.channelName = paramString;
  }

  public void setPaid(boolean paramBoolean)
  {
    this.paid = paramBoolean;
  }

  public void setUdid(String paramString)
  {
    this.udid = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.model.ChannelInfo
 * JD-Core Version:    0.6.0
 */