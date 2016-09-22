package com.squareup.wire;

final class n
{
  private static final byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private final byte[] b;
  private final byte[] c;
  private int d;

  public n(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
    this.c = new byte[2];
    this.d = 0;
  }

  public final void a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 1;
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = this.b;
    int j = paramInt + 0;
    int k;
    int m;
    switch (this.d)
    {
    default:
      throw new AssertionError("tailLen = " + this.d);
    case 0:
      k = -1;
      m = 0;
    case 1:
    case 2:
    }
    while (true)
    {
      int n;
      if (k != -1)
      {
        arrayOfByte2[0] = arrayOfByte1[(0x3F & k >> 18)];
        arrayOfByte2[i] = arrayOfByte1[(0x3F & k >> 12)];
        arrayOfByte2[2] = arrayOfByte1[(0x3F & k >> 6)];
        arrayOfByte2[3] = arrayOfByte1[(k & 0x3F)];
        n = 4;
      }
      while (true)
      {
        if (m + 3 <= j)
        {
          int i16 = (0xFF & paramArrayOfByte[m]) << 16 | (0xFF & paramArrayOfByte[(m + 1)]) << 8 | 0xFF & paramArrayOfByte[(m + 2)];
          arrayOfByte2[n] = arrayOfByte1[(0x3F & i16 >> 18)];
          arrayOfByte2[(n + 1)] = arrayOfByte1[(0x3F & i16 >> 12)];
          arrayOfByte2[(n + 2)] = arrayOfByte1[(0x3F & i16 >> 6)];
          arrayOfByte2[(n + 3)] = arrayOfByte1[(i16 & 0x3F)];
          m += 3;
          n += 4;
          continue;
          if (2 > j)
            break label710;
          int i18 = (0xFF & this.c[0]) << 16 | (0xFF & paramArrayOfByte[0]) << 8 | 0xFF & paramArrayOfByte[i];
          this.d = 0;
          k = i18;
          m = 2;
          break;
          if (j <= 0)
            break label710;
          int i17 = (0xFF & this.c[0]) << 16 | (0xFF & this.c[i]) << 8 | 0xFF & paramArrayOfByte[0];
          this.d = 0;
          k = i17;
          m = i;
          break;
        }
        int i11;
        if (m - this.d == j - 1)
          if (this.d > 0)
          {
            i11 = this.c[0];
            int i12 = (i11 & 0xFF) << 4;
            this.d -= i;
            int i13 = n + 1;
            arrayOfByte2[n] = arrayOfByte1[(0x3F & i12 >> 6)];
            int i14 = i13 + 1;
            arrayOfByte2[i13] = arrayOfByte1[(i12 & 0x3F)];
            int i15 = i14 + 1;
            arrayOfByte2[i14] = 61;
            arrayOfByte2[i15] = 61;
          }
        do
        {
          return;
          i11 = paramArrayOfByte[m];
          i = 0;
          break;
        }
        while (m - this.d != j - 2);
        int i2;
        int i3;
        int i1;
        int i4;
        int i5;
        if (this.d > i)
        {
          i2 = this.c[0];
          i3 = i;
          i1 = m;
          i4 = (i2 & 0xFF) << 10;
          if (this.d <= 0)
            break label695;
          byte[] arrayOfByte3 = this.c;
          int i10 = i3 + 1;
          i5 = arrayOfByte3[i3];
          i3 = i10;
        }
        while (true)
        {
          int i6 = i4 | (i5 & 0xFF) << 2;
          this.d -= i3;
          int i7 = n + 1;
          arrayOfByte2[n] = arrayOfByte1[(0x3F & i6 >> 12)];
          int i8 = i7 + 1;
          arrayOfByte2[i7] = arrayOfByte1[(0x3F & i6 >> 6)];
          int i9 = i8 + 1;
          arrayOfByte2[i8] = arrayOfByte1[(i6 & 0x3F)];
          arrayOfByte2[i9] = 61;
          return;
          i1 = m + 1;
          i2 = paramArrayOfByte[m];
          i3 = 0;
          break;
          label695: i5 = paramArrayOfByte[i1];
        }
        n = 0;
      }
      label710: k = -1;
      m = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.n
 * JD-Core Version:    0.6.0
 */