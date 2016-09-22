package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.qrcode.decoder.m;
import com.google.zxing.qrcode.decoder.o;
import com.google.zxing.qrcode.detector.c;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.List;
import java.util.Map;

public class a
  implements com.google.zxing.d
{
  private static final f[] a = new f[0];
  private final m b = new m();

  public final e a(com.google.zxing.b paramb, Map<DecodeHintType, ?> paramMap)
  {
    com.google.zxing.common.b localb1;
    int[] arrayOfInt1;
    int[] arrayOfInt2;
    int i;
    int j;
    int n;
    int i2;
    int i3;
    int i22;
    label138: int i20;
    if ((paramMap != null) && (paramMap.containsKey(DecodeHintType.PURE_BARCODE)))
    {
      localb1 = paramb.c();
      arrayOfInt1 = localb1.c();
      arrayOfInt2 = localb1.d();
      if ((arrayOfInt1 == null) || (arrayOfInt2 == null))
        throw NotFoundException.getNotFoundInstance();
      i = localb1.f();
      j = localb1.e();
      int k = arrayOfInt1[0];
      int m = arrayOfInt1[1];
      n = 1;
      int i1 = 0;
      i2 = k;
      i3 = m;
      if ((i2 < j) && (i3 < i))
      {
        if (n == localb1.a(i2, i3))
          break label736;
        int i21 = i1 + 1;
        if (i21 != 5)
          if (n == 0)
          {
            i22 = 1;
            i20 = i22;
            i1 = i21;
          }
      }
    }
    while (true)
    {
      i2++;
      i3++;
      n = i20;
      break;
      i22 = 0;
      break label138;
      if ((i2 == j) || (i3 == i))
        throw NotFoundException.getNotFoundInstance();
      float f = (i2 - arrayOfInt1[0]) / 7.0F;
      int i4 = arrayOfInt1[1];
      int i5 = arrayOfInt2[1];
      int i6 = arrayOfInt1[0];
      int i7 = arrayOfInt2[0];
      if ((i6 >= i7) || (i4 >= i5))
        throw NotFoundException.getNotFoundInstance();
      if (i5 - i4 != i7 - i6)
        i7 = i6 + (i5 - i4);
      int i8 = Math.round((1 + (i7 - i6)) / f);
      int i9 = Math.round((1 + (i5 - i4)) / f);
      if ((i8 <= 0) || (i9 <= 0))
        throw NotFoundException.getNotFoundInstance();
      if (i9 != i8)
        throw NotFoundException.getNotFoundInstance();
      int i10 = (int)(f / 2.0F);
      int i11 = i4 + i10;
      int i12 = i6 + i10;
      int i13 = i12 + (int)(f * (i8 - 1)) - (i7 - 1);
      if (i13 > 0)
        if (i13 > i10)
          throw NotFoundException.getNotFoundInstance();
      for (int i14 = i12 - i13; ; i14 = i12)
      {
        int i15 = i11 + (int)(f * (i9 - 1)) - (i5 - 1);
        if (i15 > 0)
          if (i15 > i10)
            throw NotFoundException.getNotFoundInstance();
        for (int i16 = i11 - i15; ; i16 = i11)
        {
          com.google.zxing.common.b localb2 = new com.google.zxing.common.b(i8, i9);
          for (int i17 = 0; i17 < i9; i17++)
          {
            int i18 = i16 + (int)(f * i17);
            for (int i19 = 0; i19 < i8; i19++)
            {
              if (!localb1.a(i14 + (int)(f * i19), i18))
                continue;
              localb2.b(i19, i17);
            }
          }
          BadgeUtil localBadgeUtil = this.b.a(localb2, paramMap);
          f[] arrayOff = a;
          if ((!(localBadgeUtil.e() instanceof o)) || (arrayOff == null) || (arrayOff.length < 3));
          while (true)
          {
            e locale = new e(localBadgeUtil.b(), localBadgeUtil.a(), arrayOff, BarcodeFormat.QR_CODE);
            List localList = localBadgeUtil.c();
            if (localList != null)
              locale.a(ResultMetadataType.BYTE_SEGMENTS, localList);
            String str = localBadgeUtil.d();
            if (str != null)
              locale.a(ResultMetadataType.ERROR_CORRECTION_LEVEL, str);
            if (localBadgeUtil.f())
            {
              locale.a(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(localBadgeUtil.h()));
              locale.a(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(localBadgeUtil.g()));
            }
            return locale;
            com.google.zxing.common.d locald = new c(paramb.c()).a(paramMap);
            localBadgeUtil = this.b.a(locald.d(), paramMap);
            arrayOff = locald.e();
            break;
            f localf = arrayOff[0];
            arrayOff[0] = arrayOff[2];
            arrayOff[2] = localf;
          }
        }
      }
      label736: i20 = n;
    }
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.a
 * JD-Core Version:    0.6.0
 */