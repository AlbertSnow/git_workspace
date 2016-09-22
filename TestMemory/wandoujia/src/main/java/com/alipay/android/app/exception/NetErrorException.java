package com.alipay.android.app.exception;

import android.text.TextUtils;

public final class NetErrorException extends Exception
{
  public static final int NET_CONNECTION_ERROR = 0;
  public static final int SERVER_ERROR = 1;
  public static final int SSL_ERROR = 2;
  private static final long serialVersionUID = 8374198311711795611L;
  private int errorCode = 0;

  public NetErrorException()
  {
    this(null, null);
  }

  public NetErrorException(String paramString)
  {
    this(paramString, null);
  }

  public NetErrorException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    printException(paramString, paramThrowable);
  }

  public NetErrorException(Throwable paramThrowable)
  {
    this(null, paramThrowable);
  }

  public static void printException(String paramString, Throwable paramThrowable)
  {
    TextUtils.isEmpty(paramString);
    if (paramThrowable != null);
    try
    {
      new StringBuilder("NetError--").append(paramThrowable.getMessage());
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final int getErrorCode()
  {
    return this.errorCode;
  }

  public final void setErrorCode(int paramInt)
  {
    this.errorCode = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.exception.NetErrorException
 * JD-Core Version:    0.6.0
 */