public final class awu extends avv
  implements Cloneable
{
  private static volatile awu[] a;
  private String b = "";
  private String c = "";

  public awu()
  {
    this.H = null;
    this.I = -1;
  }

  public static awu[] b()
  {
    if (a == null);
    synchronized (avz.b)
    {
      if (a == null)
        a = new awu[0];
      return a;
    }
  }

  protected final int a()
  {
    int i = super.a();
    if (!this.b.equals(""))
      i += avt.b(1, this.b);
    if (!this.c.equals(""))
      i += avt.b(2, this.c);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (!this.b.equals(""))
      paramavt.a(1, this.b);
    if (!this.c.equals(""))
      paramavt.a(2, this.c);
    super.a(paramavt);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    awu localawu;
    while (true)
    {
      return true;
      if (!(paramObject instanceof awu))
        return false;
      localawu = (awu)paramObject;
      if (this.b == null)
      {
        if (localawu.b != null)
          return false;
      }
      else if (!this.b.equals(localawu.b))
        return false;
      if (this.c == null)
      {
        if (localawu.c != null)
          return false;
      }
      else if (!this.c.equals(localawu.c))
        return false;
      if ((this.H != null) && (!this.H.a()))
        break;
      if ((localawu.H != null) && (!localawu.H.a()))
        return false;
    }
    return this.H.equals(localawu.H);
  }

  public final awu f()
  {
    try
    {
      awu localawu = (awu)super.c();
      return localawu;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new AssertionError(localCloneNotSupportedException);
  }

  public final int hashCode()
  {
    int i = 31 * (527 + getClass().getName().hashCode());
    int j;
    int m;
    label44: int n;
    int i1;
    if (this.b == null)
    {
      j = 0;
      int k = 31 * (j + i);
      if (this.c != null)
        break label101;
      m = 0;
      n = 31 * (m + k);
      avx localavx = this.H;
      i1 = 0;
      if (localavx != null)
      {
        boolean bool = this.H.a();
        i1 = 0;
        if (!bool)
          break label113;
      }
    }
    while (true)
    {
      return n + i1;
      j = this.b.hashCode();
      break;
      label101: m = this.c.hashCode();
      break label44;
      label113: i1 = this.H.hashCode();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awu
 * JD-Core Version:    0.6.0
 */