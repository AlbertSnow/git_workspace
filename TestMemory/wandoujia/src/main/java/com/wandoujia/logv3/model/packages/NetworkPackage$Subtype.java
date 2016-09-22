package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum NetworkPackage$Subtype
  implements ProtoEnum
{
  private final int value;

  static
  {
    GPRS = new Subtype("GPRS", 1, 1);
    EDGE = new Subtype("EDGE", 2, 2);
    UMTS = new Subtype("UMTS", 3, 3);
    CDMA = new Subtype("CDMA", 4, 4);
    EVDO_0 = new Subtype("EVDO_0", 5, 5);
    EVDO_A = new Subtype("EVDO_A", 6, 6);
    CDMA_1xRTT = new Subtype("CDMA_1xRTT", 7, 7);
    HSDPA = new Subtype("HSDPA", 8, 8);
    HSUPA = new Subtype("HSUPA", 9, 9);
    HSPA = new Subtype("HSPA", 10, 10);
    IDEN = new Subtype("IDEN", 11, 11);
    EVDO_B = new Subtype("EVDO_B", 12, 12);
    LTE = new Subtype("LTE", 13, 13);
    EHRPD = new Subtype("EHRPD", 14, 14);
    HSPAP = new Subtype("HSPAP", 15, 15);
    Subtype[] arrayOfSubtype = new Subtype[16];
    arrayOfSubtype[0] = UNKNOWN;
    arrayOfSubtype[1] = GPRS;
    arrayOfSubtype[2] = EDGE;
    arrayOfSubtype[3] = UMTS;
    arrayOfSubtype[4] = CDMA;
    arrayOfSubtype[5] = EVDO_0;
    arrayOfSubtype[6] = EVDO_A;
    arrayOfSubtype[7] = CDMA_1xRTT;
    arrayOfSubtype[8] = HSDPA;
    arrayOfSubtype[9] = HSUPA;
    arrayOfSubtype[10] = HSPA;
    arrayOfSubtype[11] = IDEN;
    arrayOfSubtype[12] = EVDO_B;
    arrayOfSubtype[13] = LTE;
    arrayOfSubtype[14] = EHRPD;
    arrayOfSubtype[15] = HSPAP;
    $VALUES = arrayOfSubtype;
  }

  private NetworkPackage$Subtype(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.NetworkPackage.Subtype
 * JD-Core Version:    0.6.0
 */