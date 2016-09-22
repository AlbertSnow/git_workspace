package com.wandoujia.account;

public enum AccountParams$Page
{
  static
  {
    EMAIL_REGISTER = new Page("EMAIL_REGISTER", 2);
    FORGET_PASSWORD = new Page("FORGET_PASSWORD", 3);
    USER_TERMS = new Page("USER_TERMS", 4);
    Page[] arrayOfPage = new Page[5];
    arrayOfPage[0] = LOG_IN;
    arrayOfPage[1] = TEL_REGISTER;
    arrayOfPage[2] = EMAIL_REGISTER;
    arrayOfPage[3] = FORGET_PASSWORD;
    arrayOfPage[4] = USER_TERMS;
    $VALUES = arrayOfPage;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.AccountParams.Page
 * JD-Core Version:    0.6.0
 */