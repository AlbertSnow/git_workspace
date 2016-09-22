package com.wandoujia.account.storage;

public class AccountStorageException extends Exception
{
  private static final long serialVersionUID = 5263723766495543593L;
  private final AccountStorageException.ExceptionType type;

  public AccountStorageException(AccountStorageException.ExceptionType paramExceptionType)
  {
    this.type = paramExceptionType;
  }

  public AccountStorageException.ExceptionType getExceptionType()
  {
    return this.type;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.AccountStorageException
 * JD-Core Version:    0.6.0
 */