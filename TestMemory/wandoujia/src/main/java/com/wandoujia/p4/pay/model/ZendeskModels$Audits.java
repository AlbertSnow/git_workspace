package com.wandoujia.p4.pay.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ZendeskModels$Audits
  implements Serializable
{
  private long author_id;
  private Date created_at;
  private List<ZendeskModels.Event> events;
  private long ticket_id;

  public long getAuthor_id()
  {
    return this.author_id;
  }

  public Date getCreated_at()
  {
    return this.created_at;
  }

  public List<ZendeskModels.Event> getEvents()
  {
    return this.events;
  }

  public long getTicket_id()
  {
    return this.ticket_id;
  }

  public void setAuthor_id(long paramLong)
  {
    this.author_id = paramLong;
  }

  public void setCreated_at(Date paramDate)
  {
    this.created_at = paramDate;
  }

  public void setEvents(List<ZendeskModels.Event> paramList)
  {
    this.events = paramList;
  }

  public void setTicket_id(long paramLong)
  {
    this.ticket_id = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.ZendeskModels.Audits
 * JD-Core Version:    0.6.0
 */