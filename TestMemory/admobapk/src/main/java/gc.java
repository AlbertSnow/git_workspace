@Deprecated
public final class gc
{
  public static final gc b = new gc(-1, -2);
  public static final gc c = new gc(320, 50);
  public static final gc d = new gc(300, 250);
  public static final gc e = new gc(468, 60);
  public static final gc f = new gc(728, 90);
  public static final gc g = new gc(160, 600);
  public final mi a;

  private gc(int paramInt1, int paramInt2)
  {
    this(new mi(paramInt1, paramInt2));
  }

  public gc(mi parammi)
  {
    this.a = parammi;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof gc))
      return false;
    gc localgc = (gc)paramObject;
    return this.a.equals(localgc.a);
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final String toString()
  {
    return this.a.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     gc
 * JD-Core Version:    0.6.0
 */