package com.google.zxing.a;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.a.a.c;
import com.google.zxing.d;
import com.google.zxing.e;
import com.google.zxing.f;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.Map;

public final class a
  implements d
{
  private static final f[] a = new f[0];
  private final c b = new c();

  public final e a(com.google.zxing.b paramb, Map<DecodeHintType, ?> paramMap)
  {
    if ((paramMap != null) && (paramMap.containsKey(DecodeHintType.PURE_BARCODE)))
    {
      com.google.zxing.common.b localb1 = paramb.c();
      int[] arrayOfInt = localb1.b();
      if (arrayOfInt == null)
        throw NotFoundException.getNotFoundInstance();
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];
      int k = arrayOfInt[2];
      int m = arrayOfInt[3];
      com.google.zxing.common.b localb2 = new com.google.zxing.common.b(30, 33);
      for (int n = 0; n < 33; n++)
      {
        int i1 = j + (n * m + m / 2) / 33;
        for (int i2 = 0; i2 < 30; i2++)
        {
          if (!localb1.a(i + (i2 * k + k / 2 + k * (n & 0x1) / 2) / 30, i1))
            continue;
          localb2.b(i2, n);
        }
      }
      BadgeUtil localBadgeUtil = this.b.a(localb2);
      f[] arrayOff = a;
      e locale = new e(localBadgeUtil.b(), localBadgeUtil.a(), arrayOff, BarcodeFormat.MAXICODE);
      String str = localBadgeUtil.d();
      if (str != null)
        locale.a(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
      return locale;
    }
    throw NotFoundException.getNotFoundInstance();
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.a.a
 * JD-Core Version:    0.6.0
 */