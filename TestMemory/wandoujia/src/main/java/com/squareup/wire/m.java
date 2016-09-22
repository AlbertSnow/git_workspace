package com.squareup.wire;

final class m
{
  private static final int[] a = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  private final byte[] b;
  private int c;
  private int d;

  public m(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
    this.d = 0;
  }

  public final boolean a(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.d == 6)
      return false;
    int i = paramInt + 0;
    int j = this.d;
    byte[] arrayOfByte = this.b;
    int[] arrayOfInt = a;
    int k = 0;
    int m = j;
    int n = 0;
    int i1 = 0;
    while (n < i)
    {
      if (m == 0)
      {
        while (n + 4 <= i)
        {
          k = arrayOfInt[(0xFF & paramArrayOfByte[n])] << 18 | arrayOfInt[(0xFF & paramArrayOfByte[(n + 1)])] << 12 | arrayOfInt[(0xFF & paramArrayOfByte[(n + 2)])] << 6 | arrayOfInt[(0xFF & paramArrayOfByte[(n + 3)])];
          if (k < 0)
            break;
          arrayOfByte[(i1 + 2)] = (byte)k;
          arrayOfByte[(i1 + 1)] = (byte)(k >> 8);
          arrayOfByte[i1] = (byte)(k >> 16);
          i1 += 3;
          n += 4;
        }
        if (n >= i)
          break;
      }
      int i5 = n + 1;
      int i6 = arrayOfInt[(0xFF & paramArrayOfByte[n])];
      switch (m)
      {
      default:
        throw new AssertionError("state = " + m);
      case 0:
        if (i6 >= 0)
        {
          m++;
          k = i6;
          n = i5;
          continue;
        }
        if (i6 != -1)
        {
          this.d = 6;
          return false;
        }
      case 1:
        if (i6 >= 0)
        {
          k = i6 | k << 6;
          m++;
          n = i5;
          continue;
        }
        if (i6 != -1)
        {
          this.d = 6;
          return false;
        }
      case 2:
        if (i6 >= 0)
        {
          k = i6 | k << 6;
          m++;
          n = i5;
          continue;
        }
        if (i6 == -2)
        {
          int i7 = i1 + 1;
          arrayOfByte[i1] = (byte)(k >> 4);
          m = 4;
          i1 = i7;
          n = i5;
          continue;
        }
        if (i6 != -1)
        {
          this.d = 6;
          return false;
        }
      case 3:
        if (i6 >= 0)
        {
          k = i6 | k << 6;
          arrayOfByte[(i1 + 2)] = (byte)k;
          arrayOfByte[(i1 + 1)] = (byte)(k >> 8);
          arrayOfByte[i1] = (byte)(k >> 16);
          i1 += 3;
          n = i5;
          m = 0;
          continue;
        }
        if (i6 == -2)
        {
          arrayOfByte[(i1 + 1)] = (byte)(k >> 2);
          arrayOfByte[i1] = (byte)(k >> 10);
          i1 += 2;
          m = 5;
          n = i5;
          continue;
        }
        if (i6 != -1)
        {
          this.d = 6;
          return false;
        }
      case 4:
        if (i6 == -2)
        {
          m++;
          n = i5;
          continue;
        }
        if (i6 != -1)
        {
          this.d = 6;
          return false;
        }
      case 5:
        if (i6 != -1)
        {
          this.d = 6;
          return false;
        }
        n = i5;
      }
    }
    int i2 = k;
    switch (m)
    {
    default:
      throw new AssertionError("state = " + m);
    case 1:
      this.d = 6;
      return false;
    case 2:
      int i4 = i1 + 1;
      arrayOfByte[i1] = (byte)(i2 >> 4);
      i1 = i4;
    case 0:
    case 5:
    case 3:
      while (true)
      {
        this.d = m;
        this.c = i1;
        return true;
        int i3 = i1 + 1;
        arrayOfByte[i1] = (byte)(i2 >> 10);
        i1 = i3 + 1;
        arrayOfByte[i3] = (byte)(i2 >> 2);
      }
    case 4:
    }
    this.d = 6;
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.m
 * JD-Core Version:    0.6.0
 */