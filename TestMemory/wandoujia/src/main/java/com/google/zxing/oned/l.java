package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.b;
import com.google.zxing.common.a;
import java.util.Map;

public final class l extends p
{
  private final p d = new e();

  private static com.google.zxing.e a(com.google.zxing.e parame)
  {
    String str = parame.a();
    if (str.charAt(0) == '0')
      return new com.google.zxing.e(str.substring(1), null, parame.c(), BarcodeFormat.UPC_A);
    throw FormatException.getFormatInstance();
  }

  protected final int a(a parama, int[] paramArrayOfInt, StringBuilder paramStringBuilder)
  {
    return this.d.a(parama, paramArrayOfInt, paramStringBuilder);
  }

  public final com.google.zxing.e a(int paramInt, a parama, Map<DecodeHintType, ?> paramMap)
  {
    return a(this.d.a(paramInt, parama, paramMap));
  }

  public final com.google.zxing.e a(int paramInt, a parama, int[] paramArrayOfInt, Map<DecodeHintType, ?> paramMap)
  {
    return a(this.d.a(paramInt, parama, paramArrayOfInt, paramMap));
  }

  public final com.google.zxing.e a(b paramb, Map<DecodeHintType, ?> paramMap)
  {
    return a(this.d.a(paramb, paramMap));
  }

  final BarcodeFormat b()
  {
    return BarcodeFormat.UPC_A;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.l
 * JD-Core Version:    0.6.0
 */