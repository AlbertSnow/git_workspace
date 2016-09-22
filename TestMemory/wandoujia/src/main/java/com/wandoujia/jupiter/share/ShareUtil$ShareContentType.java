package com.wandoujia.jupiter.share;

public enum ShareUtil$ShareContentType
{
  static
  {
    REVIEW_LIST = new ShareContentType("REVIEW_LIST", 1);
    APP = new ShareContentType("APP", 2);
    ShareContentType[] arrayOfShareContentType = new ShareContentType[3];
    arrayOfShareContentType[0] = REVIEW_SINGLE;
    arrayOfShareContentType[1] = REVIEW_LIST;
    arrayOfShareContentType[2] = APP;
    $VALUES = arrayOfShareContentType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.share.ShareUtil.ShareContentType
 * JD-Core Version:    0.6.0
 */