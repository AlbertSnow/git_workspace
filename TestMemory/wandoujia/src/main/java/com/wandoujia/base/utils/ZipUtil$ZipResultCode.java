package com.wandoujia.base.utils;

public enum ZipUtil$ZipResultCode
{
  private int code;

  static
  {
    ERROR_ZIP_FILE_NOT_FOUND = new ZipResultCode("ERROR_ZIP_FILE_NOT_FOUND", 1, -104);
    ERROR_ZIP_FILE = new ZipResultCode("ERROR_ZIP_FILE", 2, -105);
    ERROR_CREATE_DIR = new ZipResultCode("ERROR_CREATE_DIR", 3, -106);
    ZipResultCode[] arrayOfZipResultCode = new ZipResultCode[4];
    arrayOfZipResultCode[0] = UNZ_OK;
    arrayOfZipResultCode[1] = ERROR_ZIP_FILE_NOT_FOUND;
    arrayOfZipResultCode[2] = ERROR_ZIP_FILE;
    arrayOfZipResultCode[3] = ERROR_CREATE_DIR;
    $VALUES = arrayOfZipResultCode;
  }

  private ZipUtil$ZipResultCode(int paramInt)
  {
    this.code = paramInt;
  }

  public static ZipResultCode fromCode(int paramInt)
  {
    for (ZipResultCode localZipResultCode : values())
      if (paramInt == localZipResultCode.code)
        return localZipResultCode;
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ZipUtil.ZipResultCode
 * JD-Core Version:    0.6.0
 */