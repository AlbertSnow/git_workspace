package com.squareup.leakcanary;

public final class e
{
  static <T> T a(T paramT, String paramString)
  {
    if (paramT == null)
      throw new NullPointerException(paramString + " must not be null");
    return paramT;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.leakcanary.e
 * JD-Core Version:    0.6.0
 */