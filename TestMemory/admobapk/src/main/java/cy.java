final class cy
{
  static final int[] a = new int[0];
  static final Object[] b = new Object[0];

  public static int a(int paramInt)
  {
    int i = paramInt << 2;
    for (int j = 4; ; j++)
    {
      if (j < 32)
      {
        if (i > -12 + (1 << j))
          continue;
        i = -12 + (1 << j);
      }
      return i / 4;
    }
  }

  static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramInt1 - 1;
    int j = 0;
    int k = i;
    int m;
    while (true)
      if (j <= k)
      {
        m = j + k >>> 1;
        int n = paramArrayOfInt[m];
        if (n < paramInt2)
        {
          j = m + 1;
          continue;
        }
        if (n <= paramInt2)
          break;
        k = m - 1;
        continue;
      }
      else
      {
        m = j ^ 0xFFFFFFFF;
      }
    return m;
  }

  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     cy
 * JD-Core Version:    0.6.0
 */