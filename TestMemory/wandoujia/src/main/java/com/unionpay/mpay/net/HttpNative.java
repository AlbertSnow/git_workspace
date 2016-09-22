package com.unionpay.mpay.net;

public class HttpNative
{
  private static HttpNative a = null;

  public static HttpNative a()
  {
    if (a == null)
      a = new HttpNative();
    return a;
  }

  public native String getIssuer();

  public native String getSubject();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.net.HttpNative
 * JD-Core Version:    0.6.0
 */