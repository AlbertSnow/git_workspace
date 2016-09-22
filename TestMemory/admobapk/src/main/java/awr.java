public final class awr extends avv
  implements Cloneable
{
  private int a = 0;
  private String b = "";
  private String c = "";

  public awr()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0)
      i += avt.c(1, this.a);
    if (!this.b.equals(""))
      i += avt.b(2, this.b);
    if (!this.c.equals(""))
      i += avt.b(3, this.c);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0)
      paramavt.a(1, this.a);
    if (!this.b.equals(""))
      paramavt.a(2, this.b);
    if (!this.c.equals(""))
      paramavt.a(3, this.c);
    super.a(paramavt);
  }

  public final awr b()
  {
    try
    {
      awr localawr = (awr)super.c();
      return localawr;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new AssertionError(localCloneNotSupportedException);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    awr localawr;
    while (true)
    {
      return true;
      if (!(paramObject instanceof awr))
        return false;
      localawr = (awr)paramObject;
      if (this.a != localawr.a)
        return false;
      if (this.b == null)
      {
        if (localawr.b != null)
          return false;
      }
      else if (!this.b.equals(localawr.b))
        return false;
      if (this.c == null)
      {
        if (localawr.c != null)
          return false;
      }
      else if (!this.c.equals(localawr.c))
        return false;
      if ((this.H != null) && (!this.H.a()))
        break;
      if ((localawr.H != null) && (!localawr.H.a()))
        return false;
    }
    return this.H.equals(localawr.H);
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (527 + getClass().getName().hashCode()) + this.a);
    int j;
    int m;
    label52: int n;
    int i1;
    if (this.b == null)
    {
      j = 0;
      int k = 31 * (j + i);
      if (this.c != null)
        break label109;
      m = 0;
      n = 31 * (m + k);
      avx localavx = this.H;
      i1 = 0;
      if (localavx != null)
      {
        boolean bool = this.H.a();
        i1 = 0;
        if (!bool)
          break label121;
      }
    }
    while (true)
    {
      return n + i1;
      j = this.b.hashCode();
      break;
      label109: m = this.c.hashCode();
      break label52;
      label121: i1 = this.H.hashCode();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awr
 * JD-Core Version:    0.6.0
 */