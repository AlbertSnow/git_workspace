package com.wandoujia.base.utils;

public class SerializationException extends RuntimeException
{
  private static final long serialVersionUID = 4029025366392702726L;

  public SerializationException()
  {
  }

  public SerializationException(String paramString)
  {
    super(paramString);
  }

  public SerializationException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public SerializationException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.SerializationException
 * JD-Core Version:    0.6.0
 */