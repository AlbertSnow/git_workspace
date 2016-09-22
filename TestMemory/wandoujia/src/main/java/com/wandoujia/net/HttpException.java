package com.wandoujia.net;

public class HttpException extends Exception
{
  private final String message;
  private final int type;

  public HttpException(int paramInt, String paramString)
  {
    this.type = paramInt;
    this.message = paramString;
  }

  public HttpException(HttpException.Type paramType, Exception paramException)
  {
    this.type = paramType.ordinal();
    if (paramException.getCause() != null)
    {
      this.message = paramException.getCause().getMessage();
      return;
    }
    this.message = paramException.getMessage();
  }

  public HttpException(HttpException.Type paramType, String paramString)
  {
    this.type = paramType.ordinal();
    this.message = paramString;
  }

  public String getMessage()
  {
    return this.message;
  }

  public int getType()
  {
    return this.type;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.HttpException
 * JD-Core Version:    0.6.0
 */