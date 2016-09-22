package com.alipay.android.app.exception;

import android.text.TextUtils;

public final class FailOperatingException extends Exception
{
  private static final long serialVersionUID = 5908800852030168641L;

  public FailOperatingException()
  {
    this(null, null);
  }

  public FailOperatingException(String paramString)
  {
    this(paramString, null);
  }

  public FailOperatingException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    printException(paramString, paramThrowable);
  }

  public FailOperatingException(Throwable paramThrowable)
  {
    this(null, paramThrowable);
  }

  public static void printException(String paramString, Throwable paramThrowable)
  {
    TextUtils.isEmpty(paramString);
    if (paramThrowable != null);
    try
    {
      new StringBuilder("FailOperating--").append(paramThrowable.getMessage());
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.exception.FailOperatingException
 * JD-Core Version:    0.6.0
 */