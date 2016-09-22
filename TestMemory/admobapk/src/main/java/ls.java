import java.util.Arrays;

public final class ls
{
  public int a;
  private long[] b = new long[32];

  public ls()
  {
    this(32);
  }

  private ls(int paramInt)
  {
  }

  public final long a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.a))
    {
      int i = this.a;
      throw new IndexOutOfBoundsException(45 + "Invalid size " + paramInt + ", size is " + i);
    }
    return this.b[paramInt];
  }

  public final void a(long paramLong)
  {
    if (this.a == this.b.length)
      this.b = Arrays.copyOf(this.b, this.a << 1);
    long[] arrayOfLong = this.b;
    int i = this.a;
    this.a = (i + 1);
    arrayOfLong[i] = paramLong;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ls
 * JD-Core Version:    0.6.0
 */