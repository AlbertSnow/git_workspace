package com.wandoujia.appmanager;

public enum LocalAppChangedListener$Error
{
  static
  {
    IO_ERROR = new Error("IO_ERROR", 1);
    ROOTKIT_INTERNAL_ERROR = new Error("ROOTKIT_INTERNAL_ERROR", 2);
    TIMEOUT_ERROR = new Error("TIMEOUT_ERROR", 3);
    INTERRUPTED_ERROR = new Error("INTERRUPTED_ERROR", 4);
    STORAGE_ERROR = new Error("STORAGE_ERROR", 5);
    INCONSISTENT_CERTIFICATES = new Error("INCONSISTENT_CERTIFICATES", 6);
    INSUFFICIENT_STORAGE = new Error("INSUFFICIENT_STORAGE", 7);
    PACKAGE_PARSE_ERROR = new Error("PACKAGE_PARSE_ERROR", 8);
    PACKAGE_NAME_ERROR = new Error("PACKAGE_NAME_ERROR", 9);
    NO_PERMISSION_ERROR = new Error("NO_PERMISSION_ERROR", 10);
    Error[] arrayOfError = new Error[11];
    arrayOfError[0] = UNKNOWN;
    arrayOfError[1] = IO_ERROR;
    arrayOfError[2] = ROOTKIT_INTERNAL_ERROR;
    arrayOfError[3] = TIMEOUT_ERROR;
    arrayOfError[4] = INTERRUPTED_ERROR;
    arrayOfError[5] = STORAGE_ERROR;
    arrayOfError[6] = INCONSISTENT_CERTIFICATES;
    arrayOfError[7] = INSUFFICIENT_STORAGE;
    arrayOfError[8] = PACKAGE_PARSE_ERROR;
    arrayOfError[9] = PACKAGE_NAME_ERROR;
    arrayOfError[10] = NO_PERMISSION_ERROR;
    $VALUES = arrayOfError;
  }

  public static Error fromCode(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return UNKNOWN;
    case 1001:
      return IO_ERROR;
    case 1002:
      return ROOTKIT_INTERNAL_ERROR;
    case 1003:
      return TIMEOUT_ERROR;
    case 1004:
      return INTERRUPTED_ERROR;
    case 1005:
      return STORAGE_ERROR;
    case 1006:
      return INCONSISTENT_CERTIFICATES;
    case 1007:
      return INSUFFICIENT_STORAGE;
    case 1008:
      return PACKAGE_PARSE_ERROR;
    case 1009:
      return PACKAGE_NAME_ERROR;
    case 1010:
    }
    return NO_PERMISSION_ERROR;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.LocalAppChangedListener.Error
 * JD-Core Version:    0.6.0
 */