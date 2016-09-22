public final class awv extends avv
  implements Cloneable
{
  private int a = -1;

  public awv()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != -1)
      i += avt.c(1, this.a);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != -1)
      paramavt.a(1, this.a);
    super.a(paramavt);
  }

  public final awv b()
  {
    try
    {
      awv localawv = (awv)super.c();
      return localawv;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new AssertionError(localCloneNotSupportedException);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    awv localawv;
    while (true)
    {
      return true;
      if (!(paramObject instanceof awv))
        return false;
      localawv = (awv)paramObject;
      if (this.a != localawv.a)
        return false;
      if ((this.H != null) && (!this.H.a()))
        break;
      if ((localawv.H != null) && (!localawv.H.a()))
        return false;
    }
    return this.H.equals(localawv.H);
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (527 + getClass().getName().hashCode()) + this.a);
    if ((this.H == null) || (this.H.a()));
    for (int j = 0; ; j = this.H.hashCode())
      return j + i;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awv
 * JD-Core Version:    0.6.0
 */