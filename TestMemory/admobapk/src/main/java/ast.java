import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ast
{
  private static final Logger a = aso.a("AppStreamingFragment", "AudioBuffer");
  private int b;
  private int c;
  private short[] d;
  private short[] e;
  private short[] f;
  private int g;
  private int h;
  private int i;
  private boolean j = true;

  ast(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = new short[this.b * this.c];
    this.e = new short[this.b * this.c];
    this.f = new short[this.c];
  }

  private final int b()
  {
    if (this.h == this.i)
    {
      if (this.j)
        return 0;
      return this.b;
    }
    if (this.h < this.i)
      return this.i - this.h;
    return this.b - this.h + this.i;
  }

  private final int c()
  {
    return this.b - b();
  }

  public final int a(ByteBuffer paramByteBuffer)
  {
    int k = 0;
    monitorenter;
    try
    {
      paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      int m = Math.min(paramByteBuffer.remaining() / 2 / this.c, this.b);
      for (int n = 0; n < m * this.c; n++)
        this.e[n] = paramByteBuffer.getShort();
      short[] arrayOfShort = this.e;
      if ((arrayOfShort == null) || (m < 0))
        a.log(asn.b, "Invalid arguments calling write().");
      while (true)
      {
        return k;
        k = 0;
        if (m == 0)
          continue;
        k = Math.min(m, this.b);
        if (k > c())
        {
          Logger localLogger = a;
          Level localLevel = asn.e;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(k - c());
          localLogger.log(localLevel, String.format("Buffer is full. Dropping %d oldest samples.", arrayOfObject));
          this.h += k - c();
          if (this.h > this.b)
            this.h -= this.b;
        }
        int i1 = Math.min(k, this.b - this.i);
        System.arraycopy(arrayOfShort, 0, this.d, this.i * this.c, i1 * this.c);
        int i2 = 0 + i1 * this.c;
        this.i = (i1 + this.i);
        if (i1 < k)
        {
          int i3 = k - i1;
          System.arraycopy(arrayOfShort, i2, this.d, 0, i3 * this.c);
          this.i = i3;
        }
        if (this.h != this.i)
          continue;
        this.j = false;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  final int a(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    int k = 0;
    monitorenter;
    if ((paramInt2 < 0) || (paramInt3 < 0));
    while (true)
    {
      try
      {
        a.log(asn.b, "Invalid arguments calling read().");
        paramInt3 = 0;
        return paramInt3;
        if (paramInt2 != 0)
          continue;
        paramInt3 = 0;
        continue;
        if (b() > 0)
        {
          if (this.g <= 0)
            continue;
          Logger localLogger = a;
          Level localLevel = asn.e;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(this.g);
          localLogger.log(localLevel, String.format("Buffer was empty. Repeated latest sample %d times.", arrayOfObject));
          this.g = 0;
          paramInt3 = Math.min(paramInt2, b());
          int n = Math.min(paramInt3, this.b - this.h);
          System.arraycopy(this.d, this.h * this.c, paramArrayOfShort, 0, n * this.c);
          int i1 = 0 + n * this.c;
          this.h = (n + this.h);
          if (n >= paramInt3)
            continue;
          int i2 = paramInt3 - n;
          System.arraycopy(this.d, 0, paramArrayOfShort, i1, i2 * this.c);
          i1 += i2 * this.c;
          this.h = i2;
          System.arraycopy(paramArrayOfShort, i1 - this.c, this.f, 0, this.c);
          if (this.h != this.i)
            continue;
          this.j = true;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      int m = 0;
      while (k < paramInt3)
      {
        System.arraycopy(this.f, 0, paramArrayOfShort, m, this.c);
        m += this.c;
        k++;
      }
      this.g = (paramInt3 + this.g);
    }
  }

  final void a()
  {
    int k = 0;
    monitorenter;
    try
    {
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.j = true;
      while (k < this.f.length)
      {
        this.f[k] = 0;
        k++;
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ast
 * JD-Core Version:    0.6.0
 */