package com.wandoujia.account.storage;

public enum AccountStorageType
{
  static
  {
    SHARED_PREFERENCE = new AccountStorageType("SHARED_PREFERENCE", 1);
    SDK = new AccountStorageType("SDK", 2);
    FIVE = new AccountStorageType("FIVE", 3);
    AccountStorageType[] arrayOfAccountStorageType = new AccountStorageType[4];
    arrayOfAccountStorageType[0] = SYSTEM;
    arrayOfAccountStorageType[1] = SHARED_PREFERENCE;
    arrayOfAccountStorageType[2] = SDK;
    arrayOfAccountStorageType[3] = FIVE;
    $VALUES = arrayOfAccountStorageType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.AccountStorageType
 * JD-Core Version:    0.6.0
 */