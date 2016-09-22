import java.util.Arrays;

public final class aws extends avv
  implements Cloneable
{
  private byte[] a = awe.e;
  private String b = "";
  private byte[][] c = awe.d;
  private boolean d = false;

  public aws()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (!Arrays.equals(this.a, awe.e))
      j += avt.b(1, this.a);
    if ((this.c != null) && (this.c.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.c.length)
      {
        byte[] arrayOfByte = this.c[i];
        if (arrayOfByte != null)
        {
          m++;
          k += avt.a(arrayOfByte);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    if (this.d)
      j += 1 + avt.b(3);
    if (!this.b.equals(""))
      j += avt.b(4, this.b);
    return j;
  }

  public final void a(avt paramavt)
  {
    if (!Arrays.equals(this.a, awe.e))
      paramavt.a(1, this.a);
    if ((this.c != null) && (this.c.length > 0))
      for (int i = 0; i < this.c.length; i++)
      {
        byte[] arrayOfByte = this.c[i];
        if (arrayOfByte == null)
          continue;
        paramavt.a(2, arrayOfByte);
      }
    if (this.d)
      paramavt.a(3, this.d);
    if (!this.b.equals(""))
      paramavt.a(4, this.b);
    super.a(paramavt);
  }

  public final aws b()
  {
    try
    {
      aws localaws = (aws)super.c();
      if ((this.c != null) && (this.c.length > 0))
        localaws.c = ((byte[][])this.c.clone());
      return localaws;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new AssertionError(localCloneNotSupportedException);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    aws localaws;
    while (true)
    {
      return true;
      if (!(paramObject instanceof aws))
        return false;
      localaws = (aws)paramObject;
      if (!Arrays.equals(this.a, localaws.a))
        return false;
      if (this.b == null)
      {
        if (localaws.b != null)
          return false;
      }
      else if (!this.b.equals(localaws.b))
        return false;
      if (!avz.a(this.c, localaws.c))
        return false;
      if (this.d != localaws.d)
        return false;
      if ((this.H != null) && (!this.H.a()))
        break;
      if ((localaws.H != null) && (!localaws.H.a()))
        return false;
    }
    return this.H.equals(localaws.H);
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (527 + getClass().getName().hashCode()) + Arrays.hashCode(this.a));
    int j;
    int m;
    label68: int n;
    int i1;
    if (this.b == null)
    {
      j = 0;
      int k = 31 * (31 * (j + i) + avz.a(this.c));
      if (!this.d)
        break label125;
      m = 1231;
      n = 31 * (m + k);
      avx localavx = this.H;
      i1 = 0;
      if (localavx != null)
      {
        boolean bool = this.H.a();
        i1 = 0;
        if (!bool)
          break label133;
      }
    }
    while (true)
    {
      return n + i1;
      j = this.b.hashCode();
      break;
      label125: m = 1237;
      break label68;
      label133: i1 = this.H.hashCode();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aws
 * JD-Core Version:    0.6.0
 */