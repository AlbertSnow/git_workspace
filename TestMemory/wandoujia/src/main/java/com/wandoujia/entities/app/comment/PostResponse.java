package com.wandoujia.entities.app.comment;

import java.io.Serializable;

public class PostResponse
  implements Serializable
{
  public static final int FAILED = -1;
  public static final int SUCCESS = 0;
  public static final int WRONG_VERIFY_CODE = -2;
  private Comment comment;
  private int errorCode;
  private String errorMsg;
  private Reply reply;

  public Comment getComment()
  {
    return this.comment;
  }

  public int getErrorCode()
  {
    return this.errorCode;
  }

  public String getErrorMsg()
  {
    return this.errorMsg;
  }

  public Reply getReply()
  {
    return this.reply;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.comment.PostResponse
 * JD-Core Version:    0.6.0
 */