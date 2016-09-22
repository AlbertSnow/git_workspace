import java.nio.charset.Charset;
import java.util.Stack;

final class ki
  implements kk
{
  private final byte[] a = new byte[8];
  private final Stack b = new Stack();
  private final km c = new km();
  private kl d;
  private int e;
  private int f;
  private long g;

  private final long a(jn paramjn, int paramInt)
  {
    int i = 0;
    paramjn.a(this.a, 0, paramInt);
    long l = 0L;
    while (i < paramInt)
    {
      l = l << 8 | 0xFF & this.a[i];
      i++;
    }
    return l;
  }

  public final void a()
  {
    this.e = 0;
    this.b.clear();
    this.c.a();
  }

  public final void a(kl paramkl)
  {
    this.d = paramkl;
  }

  public final boolean a(jn paramjn)
  {
    boolean bool;
    if (this.d != null)
    {
      bool = true;
      lp.b(bool);
    }
    while (true)
    {
      if ((!this.b.isEmpty()) && (paramjn.a() >= ((kj)this.b.peek()).b))
      {
        this.d.b(((kj)this.b.pop()).a);
        return true;
        bool = false;
        break;
      }
      if (this.e == 0)
      {
        long l7 = this.c.a(paramjn, true, false);
        if (l7 == -1L)
          return false;
        this.f = (int)l7;
        this.e = 1;
      }
      if (this.e == 1)
      {
        this.g = this.c.a(paramjn, false, true);
        this.e = 2;
      }
      int i = this.d.a(this.f);
      switch (i)
      {
      default:
        throw new IllegalStateException(32 + "Invalid element type " + i);
      case 1:
        long l5 = paramjn.a();
        long l6 = l5 + this.g;
        this.b.add(new kj(this.f, l6));
        this.d.a(this.f, l5, this.g);
        this.e = 0;
        return true;
      case 2:
        if (this.g > 8L)
        {
          long l4 = this.g;
          throw new IllegalStateException(42 + "Invalid integer size: " + l4);
        }
        this.d.a(this.f, a(paramjn, (int)this.g));
        this.e = 0;
        return true;
      case 5:
        if ((this.g != 4L) && (this.g != 8L))
        {
          long l3 = this.g;
          throw new IllegalStateException(40 + "Invalid float size: " + l3);
        }
        kl localkl2 = this.d;
        int m = this.f;
        int n = (int)this.g;
        long l2 = a(paramjn, n);
        double d1;
        if (n == 4)
          d1 = Float.intBitsToFloat((int)l2);
        while (true)
        {
          localkl2.a(m, d1);
          this.e = 0;
          return true;
          d1 = Double.longBitsToDouble(l2);
        }
      case 3:
        if (this.g > 2147483647L)
        {
          long l1 = this.g;
          throw new IllegalStateException(41 + "String element size: " + l1);
        }
        kl localkl1 = this.d;
        int j = this.f;
        int k = (int)this.g;
        byte[] arrayOfByte = new byte[k];
        paramjn.a(arrayOfByte, 0, k);
        localkl1.a(j, new String(arrayOfByte, Charset.forName("UTF-8")));
        this.e = 0;
        return true;
      case 4:
        this.d.a(this.f, (int)this.g, paramjn);
        this.e = 0;
        return true;
      case 0:
      }
      paramjn.a((int)this.g);
      this.e = 0;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ki
 * JD-Core Version:    0.6.0
 */