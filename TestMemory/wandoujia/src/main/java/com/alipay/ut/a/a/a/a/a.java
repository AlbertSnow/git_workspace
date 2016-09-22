package com.alipay.ut.a.a.a.a;

public final class a extends b
{
  private static byte[] g = { 13, 10 };
  private static final byte[] h = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] i;
  private final byte[] j;
  private final byte[] k;
  private final byte[] l;
  private final int m;
  private final int n;
  private int o;

  static
  {
    new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
    i = new byte[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 };
  }

  public a()
  {
    this(0);
  }

  private a(byte paramByte)
  {
    this(g);
  }

  private a(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0);
  }

  private a(byte[] paramArrayOfByte, byte paramByte)
  {
  }

  public static String a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0));
    while (true)
    {
      return android.support.v4.app.b.a(paramArrayOfByte);
      a locala = new a(g, 0);
      long l1 = locala.e(paramArrayOfByte);
      if (l1 > 2147483647L)
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + l1 + ") than the specified maximum size of 2147483647");
      paramArrayOfByte = locala.c(paramArrayOfByte);
    }
  }

  public static byte[] a(String paramString)
  {
    return new a().b(android.support.v4.app.b.h(paramString));
  }

  final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.d);
    while (true)
    {
      return;
      if (paramInt2 < 0)
      {
        this.d = true;
        if ((this.f == 0) && (this.a == 0))
          continue;
        a(4);
        int i8 = this.c;
        switch (this.f)
        {
        default:
        case 1:
        case 2:
        }
        while (true)
        {
          this.e += this.c - i8;
          if ((this.a <= 0) || (this.e <= 0))
            break;
          System.arraycopy(null, 0, this.b, this.c, null.length);
          this.c += null.length;
          return;
          byte[] arrayOfByte9 = this.b;
          int i13 = this.c;
          this.c = (i13 + 1);
          arrayOfByte9[i13] = this.j[(0x3F & this.o >> 2)];
          byte[] arrayOfByte10 = this.b;
          int i14 = this.c;
          this.c = (i14 + 1);
          arrayOfByte10[i14] = this.j[(0x3F & this.o << 4)];
          if (this.j != h)
            continue;
          byte[] arrayOfByte11 = this.b;
          int i15 = this.c;
          this.c = (i15 + 1);
          arrayOfByte11[i15] = 61;
          byte[] arrayOfByte12 = this.b;
          int i16 = this.c;
          this.c = (i16 + 1);
          arrayOfByte12[i16] = 61;
          continue;
          byte[] arrayOfByte5 = this.b;
          int i9 = this.c;
          this.c = (i9 + 1);
          arrayOfByte5[i9] = this.j[(0x3F & this.o >> 10)];
          byte[] arrayOfByte6 = this.b;
          int i10 = this.c;
          this.c = (i10 + 1);
          arrayOfByte6[i10] = this.j[(0x3F & this.o >> 4)];
          byte[] arrayOfByte7 = this.b;
          int i11 = this.c;
          this.c = (i11 + 1);
          arrayOfByte7[i11] = this.j[(0x3F & this.o << 2)];
          if (this.j != h)
            continue;
          byte[] arrayOfByte8 = this.b;
          int i12 = this.c;
          this.c = (i12 + 1);
          arrayOfByte8[i12] = 61;
        }
      }
      int i1 = 0;
      while (i1 < paramInt2)
      {
        a(4);
        this.f = ((1 + this.f) % 3);
        int i2 = paramInt1 + 1;
        int i3 = paramArrayOfByte[paramInt1];
        if (i3 < 0)
          i3 += 256;
        this.o = (i3 + (this.o << 8));
        if (this.f == 0)
        {
          byte[] arrayOfByte1 = this.b;
          int i4 = this.c;
          this.c = (i4 + 1);
          arrayOfByte1[i4] = this.j[(0x3F & this.o >> 18)];
          byte[] arrayOfByte2 = this.b;
          int i5 = this.c;
          this.c = (i5 + 1);
          arrayOfByte2[i5] = this.j[(0x3F & this.o >> 12)];
          byte[] arrayOfByte3 = this.b;
          int i6 = this.c;
          this.c = (i6 + 1);
          arrayOfByte3[i6] = this.j[(0x3F & this.o >> 6)];
          byte[] arrayOfByte4 = this.b;
          int i7 = this.c;
          this.c = (i7 + 1);
          arrayOfByte4[i7] = this.j[(0x3F & this.o)];
          this.e = (4 + this.e);
          if ((this.a > 0) && (this.a <= this.e))
          {
            System.arraycopy(null, 0, this.b, this.c, null.length);
            this.c += null.length;
            this.e = 0;
          }
        }
        i1++;
        paramInt1 = i2;
      }
    }
  }

  protected final boolean a(byte paramByte)
  {
    return (paramByte >= 0) && (paramByte < this.k.length) && (this.k[paramByte] != -1);
  }

  final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.d)
      return;
    if (paramInt2 < 0)
      this.d = true;
    int i1 = 0;
    while (true)
    {
      int i5;
      int i6;
      if (i1 < paramInt2)
      {
        a(this.m);
        i5 = paramInt1 + 1;
        i6 = paramArrayOfByte[paramInt1];
        if (i6 == 61)
          this.d = true;
      }
      else
      {
        if ((!this.d) || (this.f == 0))
          break;
        a(this.m);
      }
      switch (this.f)
      {
      default:
        return;
      case 2:
        this.o >>= 4;
        byte[] arrayOfByte3 = this.b;
        int i4 = this.c;
        this.c = (i4 + 1);
        arrayOfByte3[i4] = (byte)(0xFF & this.o);
        return;
        if ((i6 >= 0) && (i6 < 123))
        {
          int i7 = i[i6];
          if (i7 >= 0)
          {
            this.f = ((1 + this.f) % 4);
            this.o = (i7 + (this.o << 6));
            if (this.f == 0)
            {
              byte[] arrayOfByte4 = this.b;
              int i8 = this.c;
              this.c = (i8 + 1);
              arrayOfByte4[i8] = (byte)(0xFF & this.o >> 16);
              byte[] arrayOfByte5 = this.b;
              int i9 = this.c;
              this.c = (i9 + 1);
              arrayOfByte5[i9] = (byte)(0xFF & this.o >> 8);
              byte[] arrayOfByte6 = this.b;
              int i10 = this.c;
              this.c = (i10 + 1);
              arrayOfByte6[i10] = (byte)(0xFF & this.o);
            }
          }
        }
        i1++;
        paramInt1 = i5;
      case 3:
      }
    }
    this.o >>= 2;
    byte[] arrayOfByte1 = this.b;
    int i2 = this.c;
    this.c = (i2 + 1);
    arrayOfByte1[i2] = (byte)(0xFF & this.o >> 8);
    byte[] arrayOfByte2 = this.b;
    int i3 = this.c;
    this.c = (i3 + 1);
    arrayOfByte2[i3] = (byte)(0xFF & this.o);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.a.a.a.a.a
 * JD-Core Version:    0.6.0
 */