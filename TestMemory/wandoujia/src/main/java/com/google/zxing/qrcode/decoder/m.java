package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.Map;

public final class m
{
  private final c a = new c(com.google.zxing.common.reedsolomon.a.e);

  private BadgeUtil a(a parama, Map<DecodeHintType, ?> paramMap)
  {
    p localp = parama.b();
    ErrorCorrectionLevel localErrorCorrectionLevel = parama.a().a();
    b[] arrayOfb = b.a(parama.c(), localp, localErrorCorrectionLevel);
    int i = 0;
    int j = arrayOfb.length;
    for (int k = 0; k < j; k++)
      i += arrayOfb[k].a();
    byte[] arrayOfByte1 = new byte[i];
    int m = 0;
    int n = arrayOfb.length;
    for (int i1 = 0; i1 < n; i1++)
    {
      b localb = arrayOfb[i1];
      byte[] arrayOfByte2 = localb.b();
      int i2 = localb.a();
      int i3 = arrayOfByte2.length;
      int[] arrayOfInt = new int[i3];
      for (int i4 = 0; i4 < i3; i4++)
        arrayOfInt[i4] = (0xFF & arrayOfByte2[i4]);
      int i5 = arrayOfByte2.length - i2;
      try
      {
        this.a.a(arrayOfInt, i5);
        for (int i6 = 0; i6 < i2; i6++)
          arrayOfByte2[i6] = (byte)arrayOfInt[i6];
      }
      catch (ReedSolomonException localReedSolomonException)
      {
        throw ChecksumException.getChecksumInstance();
      }
      int i7 = 0;
      while (i7 < i2)
      {
        int i8 = m + 1;
        arrayOfByte1[m] = arrayOfByte2[i7];
        i7++;
        m = i8;
      }
    }
    return l.a(arrayOfByte1, localp, localErrorCorrectionLevel, paramMap);
  }

  // ERROR //
  public final BadgeUtil a(com.google.zxing.common.b paramb, Map<DecodeHintType, ?> paramMap)
  {
    // Byte code:
    //   0: new 28	com/google/zxing/qrcode/decoder/a
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 74	com/google/zxing/qrcode/decoder/a:<init>	(Lcom/google/zxing/common/b;)V
    //   8: astore_3
    //   9: aload_0
    //   10: aload_3
    //   11: aload_2
    //   12: invokespecial 76	com/google/zxing/qrcode/decoder/m:a	(Lcom/google/zxing/qrcode/decoder/a;Ljava/util/Map;)Lcom/wandoujia/ripple_framework/util/BadgeUtil;
    //   15: astore 11
    //   17: aload 11
    //   19: areturn
    //   20: astore 10
    //   22: aload 10
    //   24: astore 5
    //   26: aconst_null
    //   27: astore 4
    //   29: aload_3
    //   30: invokevirtual 79	com/google/zxing/qrcode/decoder/a:d	()V
    //   33: aload_3
    //   34: invokevirtual 81	com/google/zxing/qrcode/decoder/a:e	()V
    //   37: aload_3
    //   38: invokevirtual 32	com/google/zxing/qrcode/decoder/a:b	()Lcom/google/zxing/qrcode/decoder/p;
    //   41: pop
    //   42: aload_3
    //   43: invokevirtual 35	com/google/zxing/qrcode/decoder/a:a	()Lcom/google/zxing/qrcode/decoder/n;
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 84	com/google/zxing/qrcode/decoder/a:f	()V
    //   51: aload_0
    //   52: aload_3
    //   53: aload_2
    //   54: invokespecial 76	com/google/zxing/qrcode/decoder/m:a	(Lcom/google/zxing/qrcode/decoder/a;Ljava/util/Map;)Lcom/wandoujia/ripple_framework/util/BadgeUtil;
    //   57: astore 9
    //   59: aload 9
    //   61: new 86	com/google/zxing/qrcode/decoder/o
    //   64: dup
    //   65: invokespecial 87	com/google/zxing/qrcode/decoder/o:<init>	()V
    //   68: invokevirtual 92	com/wandoujia/ripple_framework/util/BadgeUtil:a	(Ljava/lang/Object;)V
    //   71: aload 9
    //   73: areturn
    //   74: astore 6
    //   76: aload 5
    //   78: ifnull +14 -> 92
    //   81: aload 5
    //   83: athrow
    //   84: astore 4
    //   86: aconst_null
    //   87: astore 5
    //   89: goto -60 -> 29
    //   92: aload 4
    //   94: ifnull +6 -> 100
    //   97: aload 4
    //   99: athrow
    //   100: aload 6
    //   102: athrow
    //   103: astore 6
    //   105: goto -29 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   9	17	20	com/google/zxing/FormatException
    //   29	71	74	com/google/zxing/FormatException
    //   9	17	84	com/google/zxing/ChecksumException
    //   29	71	103	com/google/zxing/ChecksumException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.m
 * JD-Core Version:    0.6.0
 */