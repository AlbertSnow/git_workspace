package com.wandoujia.p4.feedback.zendesk;

import java.io.Serializable;

public class ZendeskModels$TicketCustomFieldOptionItem
  implements Serializable
{
  private int id;
  private String value;

  public ZendeskModels$TicketCustomFieldOptionItem(int paramInt, String paramString)
  {
    this.id = paramInt;
    this.value = paramString;
  }

  public int getId()
  {
    return this.id;
  }

  public String getValue()
  {
    return this.value;
  }

  public void setId(int paramInt)
  {
    this.id = paramInt;
  }

  public void setValue(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.zendesk.ZendeskModels.TicketCustomFieldOptionItem
 * JD-Core Version:    0.6.0
 */