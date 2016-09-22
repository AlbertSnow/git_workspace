package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum DownloadPackage$VerifyType
  implements ProtoEnum
{
  private final int value;

  static
  {
    MD5 = new VerifyType("MD5", 1, 1);
    PF5 = new VerifyType("PF5", 2, 2);
    VerifyType[] arrayOfVerifyType = new VerifyType[3];
    arrayOfVerifyType[0] = NONE;
    arrayOfVerifyType[1] = MD5;
    arrayOfVerifyType[2] = PF5;
    $VALUES = arrayOfVerifyType;
  }

  private DownloadPackage$VerifyType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DownloadPackage.VerifyType
 * JD-Core Version:    0.6.0
 */