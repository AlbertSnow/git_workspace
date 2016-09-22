package com.wandoujia.account;

public enum AccountErrorType
{
  static
  {
    PASSWORD_EMPTY = new AccountErrorType("PASSWORD_EMPTY", 2);
    NICK_EMPTY = new AccountErrorType("NICK_EMPTY", 3);
    USERNAME_INVALID = new AccountErrorType("USERNAME_INVALID", 4);
    USERNAME_TOO_LONG = new AccountErrorType("USERNAME_TOO_LONG", 5);
    PASSWORD_INVALID = new AccountErrorType("PASSWORD_INVALID", 6);
    PASSWORD_TOO_SHORT = new AccountErrorType("PASSWORD_TOO_SHORT", 7);
    PASSWORD_TOO_LONG = new AccountErrorType("PASSWORD_TOO_LONG", 8);
    EMAIL_INVALID = new AccountErrorType("EMAIL_INVALID", 9);
    EMAIL_EMPTY = new AccountErrorType("EMAIL_EMPTY", 10);
    TEL_INVALID = new AccountErrorType("TEL_INVALID", 11);
    TEL_EMPTY = new AccountErrorType("TEL_EMPTY", 12);
    AccountErrorType[] arrayOfAccountErrorType = new AccountErrorType[13];
    arrayOfAccountErrorType[0] = OK;
    arrayOfAccountErrorType[1] = USERNAME_EMPTY;
    arrayOfAccountErrorType[2] = PASSWORD_EMPTY;
    arrayOfAccountErrorType[3] = NICK_EMPTY;
    arrayOfAccountErrorType[4] = USERNAME_INVALID;
    arrayOfAccountErrorType[5] = USERNAME_TOO_LONG;
    arrayOfAccountErrorType[6] = PASSWORD_INVALID;
    arrayOfAccountErrorType[7] = PASSWORD_TOO_SHORT;
    arrayOfAccountErrorType[8] = PASSWORD_TOO_LONG;
    arrayOfAccountErrorType[9] = EMAIL_INVALID;
    arrayOfAccountErrorType[10] = EMAIL_EMPTY;
    arrayOfAccountErrorType[11] = TEL_INVALID;
    arrayOfAccountErrorType[12] = TEL_EMPTY;
    $VALUES = arrayOfAccountErrorType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.AccountErrorType
 * JD-Core Version:    0.6.0
 */