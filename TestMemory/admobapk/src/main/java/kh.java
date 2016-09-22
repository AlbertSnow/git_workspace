final class kh
{
  public final int a;
  public final long[] b;
  public final int[] c;
  public final long[] d;
  public final int[] e;

  kh(long[] paramArrayOfLong1, int[] paramArrayOfInt1, long[] paramArrayOfLong2, int[] paramArrayOfInt2)
  {
    boolean bool2;
    boolean bool3;
    if (paramArrayOfInt1.length == paramArrayOfLong2.length)
    {
      bool2 = bool1;
      lp.a(bool2);
      if (paramArrayOfLong1.length != paramArrayOfLong2.length)
        break label86;
      bool3 = bool1;
      label34: lp.a(bool3);
      if (paramArrayOfInt2.length != paramArrayOfLong2.length)
        break label92;
    }
    while (true)
    {
      lp.a(bool1);
      this.b = paramArrayOfLong1;
      this.c = paramArrayOfInt1;
      this.d = paramArrayOfLong2;
      this.e = paramArrayOfInt2;
      this.a = paramArrayOfLong1.length;
      return;
      bool2 = false;
      break;
      label86: bool3 = false;
      break label34;
      label92: bool1 = false;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     kh
 * JD-Core Version:    0.6.0
 */