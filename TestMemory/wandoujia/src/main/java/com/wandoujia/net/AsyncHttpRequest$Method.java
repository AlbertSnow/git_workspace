package com.wandoujia.net;

public enum AsyncHttpRequest$Method
{
  private String method;

  static
  {
    GET = new Method("GET", 1, "GET");
    POST = new Method("POST", 2, "POST");
    Method[] arrayOfMethod = new Method[3];
    arrayOfMethod[0] = HEAD;
    arrayOfMethod[1] = GET;
    arrayOfMethod[2] = POST;
    $VALUES = arrayOfMethod;
  }

  private AsyncHttpRequest$Method(String paramString)
  {
    this.method = paramString;
  }

  public final String toString()
  {
    return this.method;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.AsyncHttpRequest.Method
 * JD-Core Version:    0.6.0
 */