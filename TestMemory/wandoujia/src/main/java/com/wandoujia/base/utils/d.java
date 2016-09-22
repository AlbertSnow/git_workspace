package com.wandoujia.base.utils;

final class d extends b
{
  private static final byte[] f;
  private static final byte[] g;
  public final boolean c;
  public final boolean d;
  public final boolean e;
  private final byte[] h;
  private int i;
  private int j;
  private final byte[] k;

  static
  {
    if (!Base64.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      l = bool;
      f = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
      g = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
      return;
    }
  }

  public d(int paramInt)
  {
    this.a = null;
    boolean bool2;
    boolean bool3;
    label33: label45: byte[] arrayOfByte;
    if ((paramInt & 0x1) == 0)
    {
      bool2 = bool1;
      this.c = bool2;
      if ((paramInt & 0x2) != 0)
        break label103;
      bool3 = bool1;
      this.d = bool3;
      if ((paramInt & 0x4) == 0)
        break label109;
      this.e = bool1;
      if ((paramInt & 0x8) != 0)
        break label114;
      arrayOfByte = f;
      label62: this.k = arrayOfByte;
      this.h = new byte[2];
      this.i = 0;
      if (!this.d)
        break label122;
    }
    label103: label109: label114: label122: for (int m = 19; ; m = -1)
    {
      this.j = m;
      return;
      bool2 = false;
      break;
      bool3 = false;
      break label33;
      bool1 = false;
      break label45;
      arrayOfByte = g;
      break label62;
    }
  }

  public final boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1 = this.k;
    byte[] arrayOfByte2 = this.a;
    int m = this.j;
    int n = paramInt2 + paramInt1;
    int i2;
    int i4;
    label58: int i35;
    int i36;
    int i6;
    int i5;
    switch (this.i)
    {
    default:
      i2 = paramInt1;
      i4 = -1;
      if (i4 != -1)
      {
        arrayOfByte2[0] = arrayOfByte1[(0x3F & i4 >> 18)];
        arrayOfByte2[1] = arrayOfByte1[(0x3F & i4 >> 12)];
        arrayOfByte2[2] = arrayOfByte1[(0x3F & i4 >> 6)];
        i35 = 4;
        arrayOfByte2[3] = arrayOfByte1[(i4 & 0x3F)];
        i36 = m - 1;
        if (i36 != 0)
          break;
        if (this.e)
        {
          i35 = 5;
          arrayOfByte2[4] = 13;
        }
        i6 = i35 + 1;
        arrayOfByte2[i35] = 10;
        i5 = 19;
      }
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      label168: int i32;
      int i33;
      int i34;
      if (i2 + 3 <= n)
      {
        int i31 = (0xFF & paramArrayOfByte[i2]) << 16 | (0xFF & paramArrayOfByte[(i2 + 1)]) << 8 | 0xFF & paramArrayOfByte[(i2 + 2)];
        arrayOfByte2[i6] = arrayOfByte1[(0x3F & i31 >> 18)];
        arrayOfByte2[(i6 + 1)] = arrayOfByte1[(0x3F & i31 >> 12)];
        arrayOfByte2[(i6 + 2)] = arrayOfByte1[(0x3F & i31 >> 6)];
        arrayOfByte2[(i6 + 3)] = arrayOfByte1[(i31 & 0x3F)];
        i2 += 3;
        i32 = i6 + 4;
        i33 = i5 - 1;
        if (i33 != 0)
          break label1113;
        if (!this.e)
          break label1106;
        i34 = i32 + 1;
        arrayOfByte2[i32] = 13;
      }
      while (true)
      {
        i6 = i34 + 1;
        arrayOfByte2[i34] = 10;
        i5 = 19;
        break label168;
        i2 = paramInt1;
        i4 = -1;
        break label58;
        if (paramInt1 + 2 > n)
          break;
        int i37 = (0xFF & this.h[0]) << 16;
        int i38 = paramInt1 + 1;
        int i39 = i37 | (0xFF & paramArrayOfByte[paramInt1]) << 8;
        int i40 = i38 + 1;
        int i41 = i39 | 0xFF & paramArrayOfByte[i38];
        this.i = 0;
        i2 = i40;
        i4 = i41;
        break label58;
        if (paramInt1 + 1 > n)
          break;
        int i1 = (0xFF & this.h[0]) << 16 | (0xFF & this.h[1]) << 8;
        i2 = paramInt1 + 1;
        int i3 = i1 | 0xFF & paramArrayOfByte[paramInt1];
        this.i = 0;
        i4 = i3;
        break label58;
        if (i2 - this.i == n - 1)
        {
          int i24;
          int i23;
          if (this.i > 0)
          {
            byte[] arrayOfByte5 = this.h;
            i24 = 1;
            i23 = arrayOfByte5[0];
          }
          while (true)
          {
            int i25 = (i23 & 0xFF) << 4;
            this.i -= i24;
            int i26 = i6 + 1;
            arrayOfByte2[i6] = arrayOfByte1[(0x3F & i25 >> 6)];
            int i27 = i26 + 1;
            arrayOfByte2[i26] = arrayOfByte1[(i25 & 0x3F)];
            if (this.c)
            {
              int i30 = i27 + 1;
              arrayOfByte2[i27] = 61;
              i27 = i30 + 1;
              arrayOfByte2[i30] = 61;
            }
            if (this.d)
            {
              if (this.e)
              {
                int i29 = i27 + 1;
                arrayOfByte2[i27] = 13;
                i27 = i29;
              }
              int i28 = i27 + 1;
              arrayOfByte2[i27] = 10;
              i27 = i28;
            }
            i6 = i27;
            if ((l) || (this.i == 0))
              break;
            throw new AssertionError();
            int i22 = i2 + 1;
            i23 = paramArrayOfByte[i2];
            i2 = i22;
            i24 = 0;
          }
        }
        int i10;
        int i9;
        label758: int i13;
        label799: int i17;
        int i18;
        if (i2 - this.i == n - 2)
          if (this.i > 1)
          {
            byte[] arrayOfByte4 = this.h;
            i10 = 1;
            i9 = arrayOfByte4[0];
            int i11 = (i9 & 0xFF) << 10;
            if (this.i <= 0)
              break label983;
            byte[] arrayOfByte3 = this.h;
            int i21 = i10 + 1;
            i13 = arrayOfByte3[i10];
            i10 = i21;
            int i14 = i11 | (i13 & 0xFF) << 2;
            this.i -= i10;
            int i15 = i6 + 1;
            arrayOfByte2[i6] = arrayOfByte1[(0x3F & i14 >> 12)];
            int i16 = i15 + 1;
            arrayOfByte2[i15] = arrayOfByte1[(0x3F & i14 >> 6)];
            i17 = i16 + 1;
            arrayOfByte2[i16] = arrayOfByte1[(i14 & 0x3F)];
            if (!this.c)
              break label1099;
            i18 = i17 + 1;
            arrayOfByte2[i17] = 61;
          }
        while (true)
        {
          if (this.d)
          {
            if (this.e)
            {
              int i20 = i18 + 1;
              arrayOfByte2[i18] = 13;
              i18 = i20;
            }
            int i19 = i18 + 1;
            arrayOfByte2[i18] = 10;
            i18 = i19;
          }
          i6 = i18;
          break;
          int i8 = i2 + 1;
          i9 = paramArrayOfByte[i2];
          i2 = i8;
          i10 = 0;
          break label758;
          label983: int i12 = i2 + 1;
          i13 = paramArrayOfByte[i2];
          i2 = i12;
          break label799;
          if ((!this.d) || (i6 <= 0) || (i5 == 19))
            break;
          int i7;
          if (this.e)
          {
            i7 = i6 + 1;
            arrayOfByte2[i6] = 13;
          }
          while (true)
          {
            i6 = i7 + 1;
            arrayOfByte2[i7] = 10;
            break;
            if ((!l) && (i2 != n))
              throw new AssertionError();
            this.b = i6;
            this.j = i5;
            return true;
            i7 = i6;
          }
          label1099: i18 = i17;
        }
        label1106: i34 = i32;
      }
      label1113: i5 = i33;
      i6 = i32;
      continue;
      i5 = i36;
      i6 = i35;
      continue;
      i5 = m;
      i6 = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.d
 * JD-Core Version:    0.6.0
 */