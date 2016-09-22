package com.wandoujia.gson.stream;

import java.io.IOException;

public final class MalformedJsonException extends IOException
{
  private static final long serialVersionUID = 1L;

  public MalformedJsonException(String paramString)
  {
    super(paramString);
  }

  public MalformedJsonException(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    initCause(paramThrowable);
  }

  public MalformedJsonException(Throwable paramThrowable)
  {
    initCause(paramThrowable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.stream.MalformedJsonException
 * JD-Core Version:    0.6.0
 */