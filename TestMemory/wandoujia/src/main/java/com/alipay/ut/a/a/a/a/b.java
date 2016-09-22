package com.alipay.ut.a.a.a.a;

public abstract class b
{
  protected final int a = 0;
  protected byte[] b;
  protected int c;
  protected boolean d;
  protected int e;
  protected int f;
  private final int g;
  private int h;

  protected b(int paramInt1, int paramInt2)
  {
    this.g = paramInt2;
  }

  private int a(byte[] paramArrayOfByte, int paramInt)
  {
    int j;
    int i;
    if (this.b != null)
      if (this.b != null)
      {
        j = this.c - this.h;
        int k = Math.min(j, paramInt);
        System.arraycopy(this.b, this.h, paramArrayOfByte, 0, k);
        this.h = (k + this.h);
        if (this.h >= this.c)
          this.b = null;
        i = k;
      }
    boolean bool;
    do
    {
      return i;
      j = 0;
      break;
      bool = this.d;
      i = 0;
    }
    while (!bool);
    return -1;
  }

  private void a()
  {
    this.b = null;
    this.c = 0;
    this.h = 0;
    this.e = 0;
    this.f = 0;
    this.d = false;
  }

  protected final void a(int paramInt)
  {
    if ((this.b == null) || (this.b.length < paramInt + this.c))
    {
      if (this.b == null)
      {
        this.b = new byte[8192];
        this.c = 0;
        this.h = 0;
      }
    }
    else
      return;
    byte[] arrayOfByte = new byte[2 * this.b.length];
    System.arraycopy(this.b, 0, arrayOfByte, 0, this.b.length);
    this.b = arrayOfByte;
  }

  abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  protected abstract boolean a(byte paramByte);

  abstract void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public final byte[] b(byte[] paramArrayOfByte)
  {
    a();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      return paramArrayOfByte;
    b(paramArrayOfByte, 0, paramArrayOfByte.length);
    b(paramArrayOfByte, 0, -1);
    byte[] arrayOfByte = new byte[this.c];
    a(arrayOfByte, arrayOfByte.length);
    return arrayOfByte;
  }

  public final byte[] c(byte[] paramArrayOfByte)
  {
    a();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      return paramArrayOfByte;
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
    a(paramArrayOfByte, 0, -1);
    byte[] arrayOfByte = new byte[this.c - this.h];
    a(arrayOfByte, arrayOfByte.length);
    return arrayOfByte;
  }

  protected final boolean d(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    while (true)
    {
      return false;
      int i = paramArrayOfByte.length;
      for (int j = 0; j < i; j++)
      {
        byte b1 = paramArrayOfByte[j];
        if ((61 == b1) || (a(b1)))
          return true;
      }
    }
  }

  public final long e(byte[] paramArrayOfByte)
  {
    long l = 4L * ((-1 + (3 + paramArrayOfByte.length)) / 3);
    if (this.a > 0)
      l += (l + this.a - 1L) / this.a * this.g;
    return l;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.a.a.a.a.b
 * JD-Core Version:    0.6.0
 */