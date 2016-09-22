package com.wandoujia.account.dto;

public enum AccountVerification$AccountVerificationMethod
{
  static
  {
    EMAIL = new AccountVerificationMethod("EMAIL", 2);
    AccountVerificationMethod[] arrayOfAccountVerificationMethod = new AccountVerificationMethod[3];
    arrayOfAccountVerificationMethod[0] = PASSWORD;
    arrayOfAccountVerificationMethod[1] = SMS;
    arrayOfAccountVerificationMethod[2] = EMAIL;
    $VALUES = arrayOfAccountVerificationMethod;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.dto.AccountVerification.AccountVerificationMethod
 * JD-Core Version:    0.6.0
 */