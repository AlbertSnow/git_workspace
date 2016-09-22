public final class awq extends avv
  implements Cloneable
{
  private String[] a = awe.c;
  private String[] b = awe.c;
  private int[] c = awe.a;
  private long[] d = awe.b;
  private long[] e = awe.b;

  public awq()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i8;
    int i9;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i7 = 0;
      i8 = 0;
      i9 = 0;
      while (i7 < this.a.length)
      {
        String str2 = this.a[i7];
        if (str2 != null)
        {
          i9++;
          i8 += avt.a(str2);
        }
        i7++;
      }
    }
    for (int k = j + i8 + i9 * 1; ; k = j)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < this.b.length)
        {
          String str1 = this.b[i4];
          if (str1 != null)
          {
            i6++;
            i5 += avt.a(str1);
          }
          i4++;
        }
        k = k + i5 + i6 * 1;
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.c.length)
        {
          i3 += avt.a(this.c[i2]);
          i2++;
        }
        k = k + i3 + 1 * this.c.length;
      }
      if ((this.d != null) && (this.d.length > 0))
      {
        int n = 0;
        int i1 = 0;
        while (n < this.d.length)
        {
          i1 += avt.b(this.d[n]);
          n++;
        }
        k = k + i1 + 1 * this.d.length;
      }
      if ((this.e != null) && (this.e.length > 0))
      {
        int m = 0;
        while (i < this.e.length)
        {
          m += avt.b(this.e[i]);
          i++;
        }
        k = k + m + 1 * this.e.length;
      }
      return k;
    }
  }

  public final void a(avt paramavt)
  {
    if ((this.a != null) && (this.a.length > 0))
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        String str2 = this.a[i1];
        if (str2 == null)
          continue;
        paramavt.a(1, str2);
      }
    if ((this.b != null) && (this.b.length > 0))
      for (int n = 0; n < this.b.length; n++)
      {
        String str1 = this.b[n];
        if (str1 == null)
          continue;
        paramavt.a(2, str1);
      }
    if ((this.c != null) && (this.c.length > 0))
      for (int m = 0; m < this.c.length; m++)
        paramavt.a(3, this.c[m]);
    if ((this.d != null) && (this.d.length > 0))
      for (int k = 0; k < this.d.length; k++)
        paramavt.a(4, this.d[k]);
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0)
        while (j < this.e.length)
        {
          paramavt.a(5, this.e[j]);
          j++;
        }
    }
    super.a(paramavt);
  }

  public final awq b()
  {
    try
    {
      awq localawq = (awq)super.c();
      if ((this.a != null) && (this.a.length > 0))
        localawq.a = ((String[])this.a.clone());
      if ((this.b != null) && (this.b.length > 0))
        localawq.b = ((String[])this.b.clone());
      if ((this.c != null) && (this.c.length > 0))
        localawq.c = ((int[])this.c.clone());
      if ((this.d != null) && (this.d.length > 0))
        localawq.d = ((long[])this.d.clone());
      if ((this.e != null) && (this.e.length > 0))
        localawq.e = ((long[])this.e.clone());
      return localawq;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new AssertionError(localCloneNotSupportedException);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    awq localawq;
    while (true)
    {
      return true;
      if (!(paramObject instanceof awq))
        return false;
      localawq = (awq)paramObject;
      if (!avz.a(this.a, localawq.a))
        return false;
      if (!avz.a(this.b, localawq.b))
        return false;
      if (!avz.a(this.c, localawq.c))
        return false;
      if (!avz.a(this.d, localawq.d))
        return false;
      if (!avz.a(this.e, localawq.e))
        return false;
      if ((this.H != null) && (!this.H.a()))
        break;
      if ((localawq.H != null) && (!localawq.H.a()))
        return false;
    }
    return this.H.equals(localawq.H);
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (31 * (31 * (31 * (31 * (527 + getClass().getName().hashCode()) + avz.a(this.a)) + avz.a(this.b)) + avz.a(this.c)) + avz.a(this.d)) + avz.a(this.e));
    if ((this.H == null) || (this.H.a()));
    for (int j = 0; ; j = this.H.hashCode())
      return j + i;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awq
 * JD-Core Version:    0.6.0
 */