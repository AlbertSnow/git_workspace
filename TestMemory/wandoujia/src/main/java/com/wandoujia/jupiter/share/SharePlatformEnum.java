package com.wandoujia.jupiter.share;

public enum SharePlatformEnum
{
  static
  {
    WECHAT_MOMENT = new SharePlatformEnum("WECHAT_MOMENT", 1);
    WECHAT_SESSION = new SharePlatformEnum("WECHAT_SESSION", 2);
    QQ = new SharePlatformEnum("QQ", 3);
    OTHERS = new SharePlatformEnum("OTHERS", 4);
    LINK = new SharePlatformEnum("LINK", 5);
    SharePlatformEnum[] arrayOfSharePlatformEnum = new SharePlatformEnum[6];
    arrayOfSharePlatformEnum[0] = WEIBO;
    arrayOfSharePlatformEnum[1] = WECHAT_MOMENT;
    arrayOfSharePlatformEnum[2] = WECHAT_SESSION;
    arrayOfSharePlatformEnum[3] = QQ;
    arrayOfSharePlatformEnum[4] = OTHERS;
    arrayOfSharePlatformEnum[5] = LINK;
    $VALUES = arrayOfSharePlatformEnum;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.share.SharePlatformEnum
 * JD-Core Version:    0.6.0
 */