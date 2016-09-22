import java.io.EOFException;

public final class jk
  implements jn
{
  private static final byte[] a = new byte[4096];
  private final ku b;
  private long c;

  public jk(ku paramku, long paramLong1, long paramLong2)
  {
    this.b = paramku;
    this.c = paramLong1;
  }

  public final long a()
  {
    return this.c;
  }

  public final void a(int paramInt)
  {
    int i = paramInt;
    while (i > 0)
    {
      if (Thread.interrupted())
        throw new InterruptedException();
      int j = this.b.a(a, 0, Math.min(a.length, i));
      if (j == -1)
        throw new EOFException();
      i -= j;
    }
    this.c += paramInt;
  }

  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramArrayOfByte, paramInt1, paramInt2, false);
  }

  public final boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramInt2;
    while (i > 0)
    {
      if (Thread.interrupted())
        throw new InterruptedException();
      int j = this.b.a(paramArrayOfByte, paramInt1, i);
      if (j == -1)
      {
        if ((paramBoolean) && (i == paramInt2))
          return false;
        throw new EOFException();
      }
      paramInt1 += j;
      i -= j;
    }
    this.c += paramInt2;
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jk
 * JD-Core Version:    0.6.0
 */