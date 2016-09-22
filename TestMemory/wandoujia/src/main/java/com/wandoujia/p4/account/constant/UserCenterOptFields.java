package com.wandoujia.p4.account.constant;

public enum UserCenterOptFields
{
  private final String optionFields;

  static
  {
    UserCenterOptFields[] arrayOfUserCenterOptFields = new UserCenterOptFields[3];
    arrayOfUserCenterOptFields[0] = USER_CENTER_COMMENT_LITE;
    arrayOfUserCenterOptFields[1] = USER_CENTER_HISTORY_LITE;
    arrayOfUserCenterOptFields[2] = USER_VIDEO_HISTORY_LITE;
    $VALUES = arrayOfUserCenterOptFields;
  }

  private UserCenterOptFields(String paramString)
  {
    this.optionFields = paramString.replaceAll(" ", "");
  }

  public final String getOptionFields()
  {
    return this.optionFields;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.constant.UserCenterOptFields
 * JD-Core Version:    0.6.0
 */