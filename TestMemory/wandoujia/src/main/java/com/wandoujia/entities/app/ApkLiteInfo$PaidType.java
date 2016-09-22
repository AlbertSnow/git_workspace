package com.wandoujia.entities.app;

public enum ApkLiteInfo$PaidType
{
  private final String type;

  static
  {
    EMBEDED = new PaidType("EMBEDED", 1, "EMBEDED");
    PAID = new PaidType("PAID", 2, "PAID");
    PaidType[] arrayOfPaidType = new PaidType[3];
    arrayOfPaidType[0] = NONE;
    arrayOfPaidType[1] = EMBEDED;
    arrayOfPaidType[2] = PAID;
    $VALUES = arrayOfPaidType;
  }

  private ApkLiteInfo$PaidType(String paramString)
  {
    this.type = paramString;
  }

  public final String getType()
  {
    return this.type;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.ApkLiteInfo.PaidType
 * JD-Core Version:    0.6.0
 */