package com.alipay.android.app.exception;

import android.text.TextUtils;

public final class AppErrorException extends Exception
{
  private static final long serialVersionUID = 4918321648798599467L;

  public AppErrorException(Class paramClass)
  {
    this(paramClass, null, null);
  }

  public AppErrorException(Class paramClass, String paramString)
  {
    this(paramClass, paramString, null);
  }

  public AppErrorException(Class paramClass, String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    printException(paramClass, paramString, paramThrowable);
  }

  public AppErrorException(Class paramClass, Throwable paramThrowable)
  {
    this(paramClass, null, paramThrowable);
  }

  public static void printException(Class paramClass, String paramString, Throwable paramThrowable)
  {
    if (paramClass != null)
      new StringBuilder("AppError--").append(paramClass.getCanonicalName());
    TextUtils.isEmpty(paramString);
    if (paramThrowable != null);
    try
    {
      new StringBuilder("AppError--").append(paramThrowable.getMessage());
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.exception.AppErrorException
 * JD-Core Version:    0.6.0
 */