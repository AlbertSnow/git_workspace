package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.datamatrix.detector.Detector;
import com.google.zxing.e;
import com.google.zxing.f;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.List;
import java.util.Map;

public final class a
  implements com.google.zxing.d
{
  private static final f[] a = new f[0];
  private final com.google.zxing.datamatrix.decoder.d b = new com.google.zxing.datamatrix.decoder.d();

  public final e a(com.google.zxing.b paramb, Map<DecodeHintType, ?> paramMap)
  {
    BadgeUtil localBadgeUtil;
    if ((paramMap != null) && (paramMap.containsKey(DecodeHintType.PURE_BARCODE)))
    {
      com.google.zxing.common.b localb1 = paramb.c();
      int[] arrayOfInt1 = localb1.c();
      int[] arrayOfInt2 = localb1.d();
      if ((arrayOfInt1 == null) || (arrayOfInt2 == null))
        throw NotFoundException.getNotFoundInstance();
      int i = localb1.e();
      int j = arrayOfInt1[0];
      int k = arrayOfInt1[1];
      while ((j < i) && (localb1.a(j, k)))
        j++;
      if (j == i)
        throw NotFoundException.getNotFoundInstance();
      int m = j - arrayOfInt1[0];
      if (m == 0)
        throw NotFoundException.getNotFoundInstance();
      int n = arrayOfInt1[1];
      int i1 = arrayOfInt2[1];
      int i2 = arrayOfInt1[0];
      int i3 = (1 + (arrayOfInt2[0] - i2)) / m;
      int i4 = (1 + (i1 - n)) / m;
      if ((i3 <= 0) || (i4 <= 0))
        throw NotFoundException.getNotFoundInstance();
      int i5 = m / 2;
      int i6 = n + i5;
      int i7 = i5 + i2;
      com.google.zxing.common.b localb2 = new com.google.zxing.common.b(i3, i4);
      for (int i8 = 0; i8 < i4; i8++)
      {
        int i9 = i6 + i8 * m;
        for (int i10 = 0; i10 < i3; i10++)
        {
          if (!localb1.a(i7 + i10 * m, i9))
            continue;
          localb2.b(i10, i8);
        }
      }
      localBadgeUtil = this.b.a(localb2);
    }
    com.google.zxing.common.d locald;
    for (f[] arrayOff = a; ; arrayOff = locald.e())
    {
      e locale = new e(localBadgeUtil.b(), localBadgeUtil.a(), arrayOff, BarcodeFormat.DATA_MATRIX);
      List localList = localBadgeUtil.c();
      if (localList != null)
        locale.a(ResultMetadataType.BYTE_SEGMENTS, localList);
      String str = localBadgeUtil.d();
      if (str != null)
        locale.a(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
      return locale;
      locald = new Detector(paramb.c()).a();
      localBadgeUtil = this.b.a(locald.d());
    }
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.a
 * JD-Core Version:    0.6.0
 */