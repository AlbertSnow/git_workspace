package com.wandoujia.ripple_framework.download;

public class StorageUtil$GenerateSaveFileException extends Exception
{
  private static final long serialVersionUID = -7012378141199515715L;
  String mMessage;
  DownloadInfo.Status mStatus;

  public StorageUtil$GenerateSaveFileException(DownloadInfo.Status paramStatus, String paramString)
  {
    this.mStatus = paramStatus;
    this.mMessage = paramString;
  }

  public StorageUtil$GenerateSaveFileException(String paramString)
  {
    this(DownloadInfo.Status.FAILED, paramString);
  }

  public String getMessage()
  {
    return this.mMessage;
  }

  public DownloadInfo.Status getStatus()
  {
    return this.mStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.StorageUtil.GenerateSaveFileException
 * JD-Core Version:    0.6.0
 */