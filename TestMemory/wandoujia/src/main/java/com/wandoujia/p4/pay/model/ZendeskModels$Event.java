package com.wandoujia.p4.pay.model;

import java.io.Serializable;

public class ZendeskModels$Event
  implements Serializable
{
  private long author_id;
  private String body;
  private boolean public_ = true;

  public long getAuthor_id()
  {
    return this.author_id;
  }

  public String getBody()
  {
    return this.body;
  }

  public boolean isPublic_()
  {
    return this.public_;
  }

  public void setAuthor_id(long paramLong)
  {
    this.author_id = paramLong;
  }

  public void setBody(String paramString)
  {
    this.body = paramString;
  }

  public void setPublic_(boolean paramBoolean)
  {
    this.public_ = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.model.ZendeskModels.Event
 * JD-Core Version:    0.6.0
 */