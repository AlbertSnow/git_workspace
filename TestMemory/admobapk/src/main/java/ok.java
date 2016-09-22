import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class ok
{
  private static long a(long paramLong1, long paramLong2)
  {
    long l1 = -4132994306676758123L * (paramLong2 ^ paramLong1);
    long l2 = -4132994306676758123L * (paramLong1 ^ (l1 ^ l1 >>> 47));
    return -4132994306676758123L * (l2 ^ l2 >>> 47);
  }

  public static long a(byte[] paramArrayOfByte)
  {
    long l13;
    if (paramArrayOfByte.length <= 32)
    {
      int i2 = 0xFFFFFFF8 & paramArrayOfByte.length;
      int i3 = 0x7 & paramArrayOfByte.length;
      long l36 = 0x8CF8F8DD ^ -4132994306676758123L * paramArrayOfByte.length;
      int i4 = 0;
      while (i4 < i2)
      {
        long l39 = -4132994306676758123L * a(paramArrayOfByte, i4);
        long l40 = -4132994306676758123L * (l36 ^ -4132994306676758123L * (l39 ^ l39 >>> 47));
        i4 += 8;
        l36 = l40;
      }
      if (i3 != 0)
      {
        long l38 = 0L;
        int i5 = Math.min(i3, 8);
        for (int i6 = 0; i6 < i5; i6++)
          l38 |= (0xFF & paramArrayOfByte[(i2 + i6)]) << (i6 << 3);
        l36 = -4132994306676758123L * (l36 ^ l38);
      }
      long l37 = -4132994306676758123L * (l36 ^ l36 >>> 47);
      l13 = l37 ^ l37 >>> 47;
    }
    long l14;
    label191: long l15;
    label209: long[] arrayOfLong1;
    long[] arrayOfLong2;
    long l5;
    long l7;
    int j;
    int k;
    long l8;
    while (paramArrayOfByte.length >= 8)
    {
      l14 = a(paramArrayOfByte, 0);
      if (paramArrayOfByte.length < 9)
        break label886;
      l15 = a(paramArrayOfByte, -8 + paramArrayOfByte.length);
      long l16 = a(l13 + l15, l14);
      if ((l16 == 0L) || (l16 == 1L))
        l16 -= 2L;
      return l16;
      if (paramArrayOfByte.length <= 64)
      {
        int i1 = paramArrayOfByte.length;
        long l17 = a(paramArrayOfByte, 24);
        long l18 = a(paramArrayOfByte, 0) + -6505348102511208375L * (i1 + a(paramArrayOfByte, i1 - 16));
        long l19 = Long.rotateRight(l18 + l17, 52);
        long l20 = Long.rotateRight(l18, 37);
        long l21 = l18 + a(paramArrayOfByte, 8);
        long l22 = l20 + Long.rotateRight(l21, 7);
        long l23 = l21 + a(paramArrayOfByte, 16);
        long l24 = l17 + l23;
        long l25 = l22 + (l19 + Long.rotateRight(l23, 31));
        long l26 = a(paramArrayOfByte, 16) + a(paramArrayOfByte, i1 - 32);
        long l27 = a(paramArrayOfByte, i1 - 8);
        long l28 = Long.rotateRight(l26 + l27, 52);
        long l29 = Long.rotateRight(l26, 37);
        long l30 = l26 + a(paramArrayOfByte, i1 - 24);
        long l31 = l29 + Long.rotateRight(l30, 7);
        long l32 = l30 + a(paramArrayOfByte, i1 - 16);
        long l33 = l32 + l27;
        long l34 = -4288712594273399085L * (l24 + (l31 + (l28 + Long.rotateRight(l32, 31)))) + -6505348102511208375L * (l33 + l25);
        long l35 = l25 + -6505348102511208375L * (l34 ^ l34 >>> 47);
        l13 = -4288712594273399085L * (l35 ^ l35 >>> 47);
        continue;
      }
      int i = paramArrayOfByte.length;
      long l1 = a(paramArrayOfByte, 0);
      long l2 = 0xAFE12E47 ^ a(paramArrayOfByte, i - 16);
      long l3 = 0x198ED849 ^ a(paramArrayOfByte, i - 56);
      arrayOfLong1 = new long[2];
      arrayOfLong2 = new long[2];
      a(paramArrayOfByte, i - 64, i, l2, arrayOfLong1);
      a(paramArrayOfByte, i - 32, -8261664234251669945L * i, -6505348102511208375L, arrayOfLong2);
      long l4 = arrayOfLong1[1];
      l5 = l3 + -8261664234251669945L * (l4 ^ l4 >>> 47);
      long l6 = -8261664234251669945L * Long.rotateRight(l5 + l1, 39);
      l7 = -8261664234251669945L * Long.rotateRight(l2, 33);
      j = 0xFFFFFFC0 & i - 1;
      k = 0;
      l8 = l6;
    }
    int n;
    for (int m = j; ; m = n)
    {
      long l9 = -8261664234251669945L * Long.rotateRight(l8 + l7 + arrayOfLong1[0] + a(paramArrayOfByte, k + 16), 37);
      long l10 = -8261664234251669945L * Long.rotateRight(l7 + arrayOfLong1[1] + a(paramArrayOfByte, k + 48), 42);
      long l11 = l9 ^ arrayOfLong2[1];
      l7 = l10 ^ arrayOfLong1[0];
      long l12 = Long.rotateRight(l5 ^ arrayOfLong2[0], 33);
      a(paramArrayOfByte, k, -8261664234251669945L * arrayOfLong1[1], l11 + arrayOfLong2[0], arrayOfLong1);
      a(paramArrayOfByte, k + 32, l12 + arrayOfLong2[1], l7, arrayOfLong2);
      k += 64;
      n = m - 64;
      if (n == 0)
      {
        l13 = a(l11 + (a(arrayOfLong1[0], arrayOfLong2[0]) + -8261664234251669945L * (l7 ^ l7 >>> 47)), l12 + a(arrayOfLong1[1], arrayOfLong2[1]));
        break;
        l14 = -6505348102511208375L;
        break label191;
        label886: l15 = -6505348102511208375L;
        break label209;
      }
      l5 = l11;
      l8 = l12;
    }
  }

  private static long a(byte[] paramArrayOfByte, int paramInt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte, paramInt, 8);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    return localByteBuffer.getLong();
  }

  private static void a(byte[] paramArrayOfByte, int paramInt, long paramLong1, long paramLong2, long[] paramArrayOfLong)
  {
    long l1 = a(paramArrayOfByte, paramInt);
    long l2 = a(paramArrayOfByte, paramInt + 8);
    long l3 = a(paramArrayOfByte, paramInt + 16);
    long l4 = a(paramArrayOfByte, paramInt + 24);
    long l5 = l1 + paramLong1;
    long l6 = Long.rotateRight(l4 + (paramLong2 + l5), 51);
    long l7 = l3 + (l2 + l5);
    long l8 = l6 + Long.rotateRight(l7, 23);
    paramArrayOfLong[0] = (l7 + l4);
    paramArrayOfLong[1] = (l5 + l8);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ok
 * JD-Core Version:    0.6.0
 */