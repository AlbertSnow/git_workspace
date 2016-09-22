package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum SharePlatformEnum$SharePlatform
  implements ProtoEnum
{
  private final int value;

  static
  {
    QQ = new SharePlatform("QQ", 2, 3);
    WEIBO = new SharePlatform("WEIBO", 3, 4);
    OTHERS = new SharePlatform("OTHERS", 4, 5);
    SharePlatform[] arrayOfSharePlatform = new SharePlatform[5];
    arrayOfSharePlatform[0] = WECHAT_MOMENT;
    arrayOfSharePlatform[1] = WECHAT_SESSION;
    arrayOfSharePlatform[2] = QQ;
    arrayOfSharePlatform[3] = WEIBO;
    arrayOfSharePlatform[4] = OTHERS;
    $VALUES = arrayOfSharePlatform;
  }

  private SharePlatformEnum$SharePlatform(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SharePlatformEnum.SharePlatform
 * JD-Core Version:    0.6.0
 */