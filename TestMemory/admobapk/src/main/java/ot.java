import java.util.Arrays;

final class ot
{
  public final String a;
  public final long b;
  public final long c;

  public ot(String paramString, long paramLong1, long paramLong2)
  {
    this.a = paramString;
    this.b = paramLong1;
    this.c = paramLong2;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ot localot;
    do
    {
      return true;
      if (!(paramObject instanceof ot))
        return false;
      localot = (ot)paramObject;
    }
    while ((anu.a(this.a, localot.a)) && (anu.a(Long.valueOf(this.b), Long.valueOf(localot.b))) && (anu.a(Long.valueOf(this.c), Long.valueOf(localot.c))));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Long.valueOf(this.b);
    arrayOfObject[2] = Long.valueOf(this.c);
    return Arrays.hashCode(arrayOfObject);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ot
 * JD-Core Version:    0.6.0
 */