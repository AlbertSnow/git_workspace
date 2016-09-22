package com.wandoujia.account.widget;

public enum AccountEditText$ContentType
{
  static
  {
    EMAIL = new ContentType("EMAIL", 1);
    PASSWORD = new ContentType("PASSWORD", 2);
    ContentType[] arrayOfContentType = new ContentType[3];
    arrayOfContentType[0] = TELEPHONE;
    arrayOfContentType[1] = EMAIL;
    arrayOfContentType[2] = PASSWORD;
    $VALUES = arrayOfContentType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.widget.AccountEditText.ContentType
 * JD-Core Version:    0.6.0
 */