package com.wandoujia.rpc.http.exception;

public class HttpException extends Exception
{
  private static final long serialVersionUID = -3072988987189952939L;
  private final int statusCode;

  public HttpException(int paramInt, String paramString)
  {
    super(paramString);
    this.statusCode = paramInt;
  }

  public int getStatusCode()
  {
    return this.statusCode;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.exception.HttpException
 * JD-Core Version:    0.6.0
 */