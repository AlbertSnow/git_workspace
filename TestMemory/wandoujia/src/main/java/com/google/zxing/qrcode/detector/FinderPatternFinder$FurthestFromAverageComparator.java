package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;

final class FinderPatternFinder$FurthestFromAverageComparator
  implements Serializable, Comparator<d>
{
  private final float average;

  private FinderPatternFinder$FurthestFromAverageComparator(float paramFloat)
  {
    this.average = paramFloat;
  }

  public final int compare(d paramd1, d paramd2)
  {
    float f1 = Math.abs(paramd2.c() - this.average);
    float f2 = Math.abs(paramd1.c() - this.average);
    if (f1 < f2)
      return -1;
    if (f1 == f2)
      return 0;
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.FinderPatternFinder.FurthestFromAverageComparator
 * JD-Core Version:    0.6.0
 */