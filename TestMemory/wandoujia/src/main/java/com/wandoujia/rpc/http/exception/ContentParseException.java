package com.wandoujia.rpc.http.exception;

public class ContentParseException extends Exception
{
  private static final long serialVersionUID = 1397363257477243232L;
  private final String contentString;

  public ContentParseException(String paramString1, String paramString2)
  {
    super(paramString1);
    this.contentString = paramString2;
  }

  public String getContentString()
  {
    return this.contentString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.exception.ContentParseException
 * JD-Core Version:    0.6.0
 */