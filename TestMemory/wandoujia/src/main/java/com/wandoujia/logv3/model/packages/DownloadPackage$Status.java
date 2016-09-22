package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum DownloadPackage$Status
  implements ProtoEnum
{
  private final int value;

  static
  {
    CANCELED = new Status("CANCELED", 2, 2);
    SUCCEED = new Status("SUCCEED", 3, 3);
    FAILED = new Status("FAILED", 4, 4);
    Status[] arrayOfStatus = new Status[5];
    arrayOfStatus[0] = PENDING;
    arrayOfStatus[1] = RUNNING;
    arrayOfStatus[2] = CANCELED;
    arrayOfStatus[3] = SUCCEED;
    arrayOfStatus[4] = FAILED;
    $VALUES = arrayOfStatus;
  }

  private DownloadPackage$Status(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DownloadPackage.Status
 * JD-Core Version:    0.6.0
 */