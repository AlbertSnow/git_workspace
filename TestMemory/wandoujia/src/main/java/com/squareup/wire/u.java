package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class u
{
  public int a;
  private final InputStream b;
  private final byte[] c;
  private long d = 0L;
  private int e = 0;
  private int f;
  private boolean g;
  private int h;
  private int i = 2147483647;

  private u(InputStream paramInputStream)
  {
    this.b = paramInputStream;
    this.c = new byte[1024];
  }

  private u(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.b = null;
    this.c = paramArrayOfByte;
    this.d = (-paramInt1);
    this.e = paramInt1;
    this.f = (paramInt1 + paramInt2);
    this.g = true;
  }

  public static u a(InputStream paramInputStream)
  {
    return new u(paramInputStream);
  }

  public static u a(byte[] paramArrayOfByte)
  {
    return new u(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public static u a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new u(paramArrayOfByte, paramInt1, paramInt2);
  }

  private void e(int paramInt)
  {
    if ((this.e < this.f) || (this.g))
      return;
    this.d += this.e;
    this.e = 0;
    int j = Math.min(paramInt, 1024);
    int k = 0;
    while (k < j)
    {
      int m = this.b.read(this.c, k, 1024 - k);
      if (m == -1)
      {
        this.f = k;
        this.g = true;
        return;
      }
      k += m;
    }
    this.f = k;
    this.g = false;
  }

  private byte[] f(int paramInt)
  {
    if (paramInt < 0)
      throw new IOException("Encountered a negative size");
    byte[] arrayOfByte = new byte[paramInt];
    int j = 0;
    while (j < paramInt)
    {
      e(paramInt - j);
      if (i() == 0)
        throw new EOFException("The input ended unexpectedly in the middle of a field");
      int k = Math.min(paramInt - j, i());
      System.arraycopy(this.c, this.e, arrayOfByte, j, k);
      this.e = (k + this.e);
      j += k;
    }
    return arrayOfByte;
  }

  private int i()
  {
    return this.f - this.e;
  }

  private byte j()
  {
    e(1);
    if (i() == 0)
      throw new EOFException("The input ended unexpectedly in the middle of a field");
    byte[] arrayOfByte = this.c;
    int j = this.e;
    this.e = (j + 1);
    return arrayOfByte[j];
  }

  public final int a()
  {
    int j = 1;
    if (g() == this.i);
    while (j != 0)
    {
      this.h = 0;
      return 0;
      e(j);
      if ((i() == 0) && (this.g))
        continue;
      j = 0;
    }
    this.h = c();
    if (this.h == 0)
      throw new IOException("Protocol message contained an invalid tag (zero).");
    return this.h;
  }

  public final void a(int paramInt)
  {
    if (this.h != paramInt)
      throw new IOException("Protocol message end-group tag did not match expected tag.");
  }

  public final ByteString b(int paramInt)
  {
    if (i() >= paramInt)
    {
      ByteString localByteString = ByteString.of(this.c, this.e, paramInt);
      this.e = (paramInt + this.e);
      return localByteString;
    }
    return ByteString.of(f(paramInt));
  }

  public final String b()
  {
    int j = c();
    if (i() >= j)
    {
      String str = new String(this.c, this.e, j, "UTF-8");
      this.e = (j + this.e);
      return str;
    }
    return new String(f(j), "UTF-8");
  }

  public final int c()
  {
    int j = j();
    if (j >= 0);
    int i5;
    do
    {
      return j;
      int k = j & 0x7F;
      int m = j();
      if (m >= 0)
        return k | m << 7;
      int n = k | (m & 0x7F) << 7;
      int i1 = j();
      if (i1 >= 0)
        return n | i1 << 14;
      int i2 = n | (i1 & 0x7F) << 14;
      int i3 = j();
      if (i3 >= 0)
        return i2 | i3 << 21;
      int i4 = i2 | (i3 & 0x7F) << 21;
      i5 = j();
      j = i4 | i5 << 28;
    }
    while (i5 >= 0);
    for (int i6 = 0; ; i6++)
    {
      if (i6 >= 5)
        break label151;
      if (j() >= 0)
        break;
    }
    label151: throw new IOException("WireInput encountered a malformed varint.");
  }

  public final int c(int paramInt)
  {
    if (paramInt < 0)
      throw new IOException("Encountered a negative size");
    int j = (int)(paramInt + (this.d + this.e));
    int k = this.i;
    if (j > k)
      throw new EOFException("The input ended unexpectedly in the middle of a field");
    this.i = j;
    return k;
  }

  public final long d()
  {
    int j = 0;
    long l = 0L;
    while (j < 64)
    {
      int k = j();
      l |= (k & 0x7F) << j;
      if ((k & 0x80) == 0)
        return l;
      j += 7;
    }
    throw new IOException("WireInput encountered a malformed varint.");
  }

  public final void d(int paramInt)
  {
    this.i = paramInt;
  }

  public final int e()
  {
    int j = j();
    int k = j();
    int m = j();
    int n = j();
    return j & 0xFF | (k & 0xFF) << 8 | (m & 0xFF) << 16 | (n & 0xFF) << 24;
  }

  public final long f()
  {
    int j = j();
    int k = j();
    int m = j();
    int n = j();
    int i1 = j();
    int i2 = j();
    int i3 = j();
    int i4 = j();
    return 0xFF & j | (0xFF & k) << 8 | (0xFF & m) << 16 | (0xFF & n) << 24 | (0xFF & i1) << 32 | (0xFF & i2) << 40 | (0xFF & i3) << 48 | (0xFF & i4) << 56;
  }

  public final long g()
  {
    return this.d + this.e;
  }

  public final void h()
  {
    int j = a();
    int k;
    if (j != 0)
      switch (v.a[WireType.valueOf(j).ordinal()])
      {
      default:
        throw new AssertionError();
      case 1:
        d();
        k = 0;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    while (k != 0)
    {
      return;
      e();
      k = 0;
      continue;
      f();
      k = 0;
      continue;
      f(c());
      k = 0;
      continue;
      h();
      a(j & 0xFFFFFFF8 | WireType.END_GROUP.value());
      k = 0;
      continue;
      k = 1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.u
 * JD-Core Version:    0.6.0
 */