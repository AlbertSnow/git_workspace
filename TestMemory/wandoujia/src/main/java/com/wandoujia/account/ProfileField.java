package com.wandoujia.account;

public enum ProfileField
{
  private String field;

  static
  {
    SOCIALBRIEF = new ProfileField("SOCIALBRIEF", 3, "socialBrief.*");
    ProfileField[] arrayOfProfileField = new ProfileField[4];
    arrayOfProfileField[0] = ALL;
    arrayOfProfileField[1] = Device;
    arrayOfProfileField[2] = Social;
    arrayOfProfileField[3] = SOCIALBRIEF;
    $VALUES = arrayOfProfileField;
  }

  private ProfileField(String paramString)
  {
    this.field = paramString;
  }

  public final String getField()
  {
    return this.field;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.ProfileField
 * JD-Core Version:    0.6.0
 */