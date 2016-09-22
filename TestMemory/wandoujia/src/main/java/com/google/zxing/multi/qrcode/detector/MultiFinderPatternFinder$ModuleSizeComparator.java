package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.d;
import java.io.Serializable;
import java.util.Comparator;

final class MultiFinderPatternFinder$ModuleSizeComparator
  implements Serializable, Comparator<d>
{
  public final int compare(d paramd1, d paramd2)
  {
    float f = paramd2.c() - paramd1.c();
    if (f < 0.0D)
      return -1;
    if (f > 0.0D)
      return 1;
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.multi.qrcode.detector.MultiFinderPatternFinder.ModuleSizeComparator
 * JD-Core Version:    0.6.0
 */