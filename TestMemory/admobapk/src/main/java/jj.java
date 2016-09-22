public final class jj
  implements jw
{
  private long[] a;
  private long[] b;

  public jj(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    this.a = paramArrayOfLong1;
    this.b = paramArrayOfLong3;
  }

  public final long a(long paramLong)
  {
    return this.a[ly.a(this.b, paramLong, true, true)];
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jj
 * JD-Core Version:    0.6.0
 */