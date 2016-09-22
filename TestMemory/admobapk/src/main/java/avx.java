public final class avx
  implements Cloneable
{
  static final avy a = new avy();
  int[] b;
  avy[] c;
  int d;
  private boolean e = false;

  avx()
  {
    this(10);
  }

  private avx(int paramInt)
  {
    int i = a(paramInt);
    this.b = new int[i];
    this.c = new avy[i];
    this.d = 0;
  }

  final int a(int paramInt)
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

  public final boolean a()
  {
    return this.d == 0;
  }

  final int b(int paramInt)
  {
    int i = -1 + this.d;
    int j = 0;
    int k = i;
    int m;
    while (true)
      if (j <= k)
      {
        m = j + k >>> 1;
        int n = this.b[m];
        if (n < paramInt)
        {
          j = m + 1;
          continue;
        }
        if (n <= paramInt)
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

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    label147: label153: label157: 
    while (true)
    {
      return true;
      if (!(paramObject instanceof avx))
        return false;
      avx localavx = (avx)paramObject;
      if (this.d != localavx.d)
        return false;
      int[] arrayOfInt1 = this.b;
      int[] arrayOfInt2 = localavx.b;
      int i = this.d;
      int j = 0;
      int k;
      label76: int n;
      if (j < i)
        if (arrayOfInt1[j] != arrayOfInt2[j])
        {
          k = 0;
          if (k != 0)
          {
            avy[] arrayOfavy1 = this.c;
            avy[] arrayOfavy2 = localavx.c;
            int m = this.d;
            n = 0;
            label102: if (n >= m)
              break label153;
            if (arrayOfavy1[n].equals(arrayOfavy2[n]))
              break label147;
          }
        }
      for (int i1 = 0; ; i1 = 1)
      {
        if (i1 != 0)
          break label157;
        return false;
        j++;
        break;
        k = 1;
        break label76;
        n++;
        break label102;
      }
    }
  }

  public final int hashCode()
  {
    int i = 17;
    for (int j = 0; j < this.d; j++)
      i = 31 * (i * 31 + this.b[j]) + this.c[j].hashCode();
    return i;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avx
 * JD-Core Version:    0.6.0
 */