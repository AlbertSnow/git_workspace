package com.wandoujia.entities.app.comment;

import java.io.Serializable;

public class Comment
  implements Serializable
{
  private String content;
  private long id;
  private long versionCode;

  public String getContent()
  {
    return this.content;
  }

  public long getId()
  {
    return this.id;
  }

  public long getVersionCode()
  {
    return this.versionCode;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.comment.Comment
 * JD-Core Version:    0.6.0
 */