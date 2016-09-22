final class ju
{
  int a;
  int b;
  int c;
  int d;
  private int e = 1000;
  private long[] f = new long[this.e];
  private int[] g = new int[this.e];
  private int[] h = new int[this.e];
  private long[] i = new long[this.e];
  private byte[][] j = new byte[this.e][];

  public final long a()
  {
    monitorenter;
    try
    {
      this.a = (-1 + this.a);
      int k = this.c;
      this.c = (k + 1);
      this.b = (1 + this.b);
      if (this.c == this.e)
        this.c = 0;
      long l3;
      if (this.a > 0)
        l3 = this.f[this.c];
      while (true)
      {
        return l3;
        long l1 = this.g[k];
        long l2 = this.f[k];
        l3 = l2 + l1;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final long a(long paramLong)
  {
    long l1 = -1L;
    monitorenter;
    try
    {
      if (this.a != 0)
      {
        long l2 = this.i[this.c];
        if (paramLong >= l2)
          break label35;
      }
      while (true)
      {
        return l1;
        label35: if (this.d == 0);
        int i2;
        for (int k = this.e; ; k = this.d)
        {
          int m = k - 1;
          if (paramLong > this.i[m])
            break;
          int n = 0;
          int i1 = this.c;
          i2 = -1;
          while ((i1 != this.d) && (this.i[i1] <= paramLong))
          {
            if ((0x1 & this.h[i1]) != 0)
              i2 = n;
            i1 = (i1 + 1) % this.e;
            n++;
          }
        }
        if (i2 == -1)
          continue;
        this.a -= i2;
        this.c = ((i2 + this.c) % this.e);
        this.b = (i2 + this.b);
        l1 = this.f[this.c];
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(long paramLong1, int paramInt1, long paramLong2, int paramInt2, byte[] paramArrayOfByte)
  {
    monitorenter;
    try
    {
      this.i[this.d] = paramLong1;
      this.f[this.d] = paramLong2;
      this.g[this.d] = paramInt2;
      this.h[this.d] = paramInt1;
      this.j[this.d] = paramArrayOfByte;
      this.a = (1 + this.a);
      if (this.a == this.e)
      {
        int k = 1000 + this.e;
        long[] arrayOfLong1 = new long[k];
        long[] arrayOfLong2 = new long[k];
        int[] arrayOfInt1 = new int[k];
        int[] arrayOfInt2 = new int[k];
        byte[][] arrayOfByte = new byte[k][];
        int m = this.e - this.c;
        System.arraycopy(this.f, this.c, arrayOfLong1, 0, m);
        System.arraycopy(this.i, this.c, arrayOfLong2, 0, m);
        System.arraycopy(this.h, this.c, arrayOfInt1, 0, m);
        System.arraycopy(this.g, this.c, arrayOfInt2, 0, m);
        System.arraycopy(this.j, this.c, arrayOfByte, 0, m);
        int n = this.c;
        System.arraycopy(this.f, 0, arrayOfLong1, m, n);
        System.arraycopy(this.i, 0, arrayOfLong2, m, n);
        System.arraycopy(this.h, 0, arrayOfInt1, m, n);
        System.arraycopy(this.g, 0, arrayOfInt2, m, n);
        System.arraycopy(this.j, 0, arrayOfByte, m, n);
        this.f = arrayOfLong1;
        this.i = arrayOfLong2;
        this.h = arrayOfInt1;
        this.g = arrayOfInt2;
        this.j = arrayOfByte;
        this.c = 0;
        this.d = this.e;
        this.a = this.e;
        this.e = k;
      }
      while (true)
      {
        return;
        this.d = (1 + this.d);
        if (this.d != this.e)
          continue;
        this.d = 0;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final boolean a(iu paramiu, jv paramjv)
  {
    monitorenter;
    try
    {
      int k = this.a;
      if (k == 0);
      for (int m = 0; ; m = 1)
      {
        return m;
        paramiu.e = this.i[this.c];
        paramiu.c = this.g[this.c];
        paramiu.d = this.h[this.c];
        paramjv.a = this.f[this.c];
        paramjv.b = this.j[this.c];
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ju
 * JD-Core Version:    0.6.0
 */