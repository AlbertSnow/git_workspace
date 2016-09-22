package com.alipay.android.app.exception;

import android.text.TextUtils;

public final class ValifyException extends Exception
{
  private static final long serialVersionUID = 7405333891987087563L;

  public ValifyException()
  {
    this(null, null);
  }

  public ValifyException(String paramString)
  {
    this(paramString, null);
  }

  public ValifyException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    printException(paramString, paramThrowable);
  }

  public ValifyException(Throwable paramThrowable)
  {
    this(null, paramThrowable);
  }

  public static void printException(String paramString, Throwable paramThrowable)
  {
    TextUtils.isEmpty(paramString);
    if (paramThrowable != null);
    try
    {
      new StringBuilder("Validation--").append(paramThrowable.getMessage());
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.exception.ValifyException
 * JD-Core Version:    0.6.0
 */