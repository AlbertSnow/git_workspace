final class km
{
  private static final int[] b = { 128, 64, 32, 16, 8, 4, 2, 1 };
  int a;
  private final byte[] c = new byte[8];
  private int d;

  public final long a(jn paramjn, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.d == 0)
    {
      if (!paramjn.a(this.c, 0, 1, paramBoolean1))
        return -1L;
      int j = 0xFF & this.c[0];
      this.a = -1;
      for (int k = 0; ; k++)
      {
        if (k < b.length)
        {
          if ((j & b[k]) == 0)
            continue;
          this.a = (k + 1);
        }
        if (this.a != -1)
          break;
        throw new IllegalStateException("No valid varint length mask found");
      }
      this.d = 1;
    }
    paramjn.a(this.c, 1, -1 + this.a);
    if (paramBoolean2)
    {
      byte[] arrayOfByte = this.c;
      arrayOfByte[0] = (byte)(arrayOfByte[0] & (0xFFFFFFFF ^ b[(-1 + this.a)]));
    }
    long l = 0L;
    for (int i = 0; i < this.a; i++)
      l = l << 8 | 0xFF & this.c[i];
    this.d = 0;
    return l;
  }

  public final void a()
  {
    this.d = 0;
    this.a = 0;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     km
 * JD-Core Version:    0.6.0
 */