package com.wandoujia.entities.app.comment;

import java.io.Serializable;

public class Reply
  implements Serializable
{
  private long commentId;
  private String content;
  private long id;
  private long updatedDate;
  private String updatedDateStr;

  public long getCommentId()
  {
    return this.commentId;
  }

  public String getContent()
  {
    return this.content;
  }

  public long getId()
  {
    return this.id;
  }

  public long getUpdatedDate()
  {
    return this.updatedDate;
  }

  public String getUpdatedDateStr()
  {
    return this.updatedDateStr;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.comment.Reply
 * JD-Core Version:    0.6.0
 */