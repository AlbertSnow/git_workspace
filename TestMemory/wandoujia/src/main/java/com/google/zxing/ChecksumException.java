package com.google.zxing;

public final class ChecksumException extends ReaderException
{
  private static final ChecksumException instance = new ChecksumException();

  public static ChecksumException getChecksumInstance()
  {
    return instance;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.ChecksumException
 * JD-Core Version:    0.6.0
 */