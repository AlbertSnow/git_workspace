package com.wandoujia.account.storage;

public enum AccountStorageException$ExceptionType
{
  static
  {
    ExceptionType[] arrayOfExceptionType = new ExceptionType[3];
    arrayOfExceptionType[0] = ACCOUNT_ALREADY_EXISTED;
    arrayOfExceptionType[1] = ACCOUNT_NOT_EXISTED;
    arrayOfExceptionType[2] = EXECUTE_FAILED;
    $VALUES = arrayOfExceptionType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.AccountStorageException.ExceptionType
 * JD-Core Version:    0.6.0
 */