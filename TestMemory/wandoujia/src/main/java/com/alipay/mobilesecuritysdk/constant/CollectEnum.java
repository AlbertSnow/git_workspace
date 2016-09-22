package com.alipay.mobilesecuritysdk.constant;

public enum CollectEnum
{
  private String value;

  static
  {
    CollectEnum[] arrayOfCollectEnum = new CollectEnum[2];
    arrayOfCollectEnum[0] = APP;
    arrayOfCollectEnum[1] = LOCATION;
    ENUM$VALUES = arrayOfCollectEnum;
  }

  private CollectEnum(String arg3)
  {
    Object localObject;
    this.value = localObject;
  }

  public final String getValue()
  {
    return this.value;
  }

  public final void setValue(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.constant.CollectEnum
 * JD-Core Version:    0.6.0
 */