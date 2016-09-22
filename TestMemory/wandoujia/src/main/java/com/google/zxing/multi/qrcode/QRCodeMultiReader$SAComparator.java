package com.google.zxing.multi.qrcode;

import com.google.zxing.ResultMetadataType;
import com.google.zxing.e;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

final class QRCodeMultiReader$SAComparator
  implements Serializable, Comparator<e>
{
  public final int compare(e parame1, e parame2)
  {
    int i = ((Integer)parame1.e().get(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)).intValue();
    int j = ((Integer)parame2.e().get(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)).intValue();
    if (i < j)
      return -1;
    if (i > j)
      return 1;
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.multi.qrcode.QRCodeMultiReader.SAComparator
 * JD-Core Version:    0.6.0
 */