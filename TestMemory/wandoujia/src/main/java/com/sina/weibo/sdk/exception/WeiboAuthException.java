package com.sina.weibo.sdk.exception;

public class WeiboAuthException extends WeiboException
{
  public static final String DEFAULT_AUTH_ERROR_CODE = "-1";
  public static final String DEFAULT_AUTH_ERROR_DESC = "Unknown Error Description";
  public static final String DEFAULT_AUTH_ERROR_TYPE = "Unknown Error Type";
  private static final long serialVersionUID = 1L;
  private final String mErrorCode;
  private final String mErrorType;

  public WeiboAuthException(String paramString1, String paramString2, String paramString3)
  {
    super(paramString3);
    this.mErrorType = paramString2;
    this.mErrorCode = paramString1;
  }

  public String getErrorCode()
  {
    return this.mErrorCode;
  }

  public String getErrorType()
  {
    return this.mErrorType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.exception.WeiboAuthException
 * JD-Core Version:    0.6.0
 */