package com.alipay.mobilesecuritysdk.constant;

public enum AppinfoNameEnum
{
  private String value;

  static
  {
    APP_ITEM = new AppinfoNameEnum("APP_ITEM", 2, "appitem");
    START_TAG = new AppinfoNameEnum("START_TAG", 3, "apps");
    AppinfoNameEnum[] arrayOfAppinfoNameEnum = new AppinfoNameEnum[4];
    arrayOfAppinfoNameEnum[0] = PKG_NAME;
    arrayOfAppinfoNameEnum[1] = PUB_KEY_HASH;
    arrayOfAppinfoNameEnum[2] = APP_ITEM;
    arrayOfAppinfoNameEnum[3] = START_TAG;
    ENUM$VALUES = arrayOfAppinfoNameEnum;
  }

  private AppinfoNameEnum(String arg3)
  {
    String str;
    setValue(str);
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
 * Qualified Name:     com.alipay.mobilesecuritysdk.constant.AppinfoNameEnum
 * JD-Core Version:    0.6.0
 */