package com.sina.weibo.sdk.exception;

public class WeiboHttpException extends WeiboException
{
  private static final long serialVersionUID = 1L;
  private final int mStatusCode;

  public WeiboHttpException(String paramString, int paramInt)
  {
    super(paramString);
    this.mStatusCode = paramInt;
  }

  public int getStatusCode()
  {
    return this.mStatusCode;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.exception.WeiboHttpException
 * JD-Core Version:    0.6.0
 */