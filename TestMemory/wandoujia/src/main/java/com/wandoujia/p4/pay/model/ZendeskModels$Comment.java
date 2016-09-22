package com.wandoujia.p4.pay.model;

import java.io.Serializable;
import java.util.Date;

public class ZendeskModels$Comment
  implements Serializable
{
  private long author_id;
  private String body;
  private Date created_at;
  private long id;

  public long getAuthor_id()
  {
    return this.author_id;
  }

  public String getBody()
  {
    return this.body;
  }

  public Date getCreated_at()
  {
    return this.created_at;
  }

  public long getId()
  {
    return this.id;
  }

  public void setAuthor_id(long paramLong)
  {
    this.author_id = paramLong;
  }

  public void setBody(String paramString)
  {
    this.body = paramString;
  }

  public void setCreated_at(Date paramDate)
  {
    this.created_at = paramDate;
  }

  public void setId(long paramLong)
  {
    this.id = paramLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.ZendeskModels.Comment
 * JD-Core Version:    0.6.0
 */