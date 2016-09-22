import java.util.Arrays;

public final class awt extends avv
  implements Cloneable
{
  public long a = 0L;
  public long b = 0L;
  public int c = 0;
  public int d = 0;
  public byte[] e = awe.e;
  public long f = 180000L;
  public byte[] g = awe.e;
  public long h = 0L;
  private long i = 0L;
  private String j = "";
  private boolean k = false;
  private awu[] l = awu.b();
  private byte[] m = awe.e;
  private awr n = null;
  private String o = "";
  private String p = "";
  private awq q = null;
  private String r = "";
  private aws s = null;
  private String t = "";
  private int u = 0;
  private int[] v = awe.a;
  private awv w = null;

  public awt()
  {
    this.H = null;
    this.I = -1;
  }

  private awt b()
  {
    awt localawt;
    try
    {
      localawt = (awt)super.c();
      if ((this.l != null) && (this.l.length > 0))
      {
        localawt.l = new awu[this.l.length];
        for (int i1 = 0; i1 < this.l.length; i1++)
        {
          if (this.l[i1] == null)
            continue;
          localawt.l[i1] = ((awu)this.l[i1].clone());
        }
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    if (this.n != null)
      localawt.n = ((awr)this.n.clone());
    if (this.q != null)
      localawt.q = ((awq)this.q.clone());
    if (this.s != null)
      localawt.s = ((aws)this.s.clone());
    if ((this.v != null) && (this.v.length > 0))
      localawt.v = ((int[])this.v.clone());
    if (this.w != null)
      localawt.w = ((awv)this.w.clone());
    return localawt;
  }

  protected final int a()
  {
    int i1 = 0;
    int i2 = super.a();
    if (this.a != 0L)
      i2 += avt.b(1, this.a);
    if (!this.j.equals(""))
      i2 += avt.b(2, this.j);
    if ((this.l != null) && (this.l.length > 0))
    {
      int i4 = i2;
      for (int i5 = 0; i5 < this.l.length; i5++)
      {
        awu localawu = this.l[i5];
        if (localawu == null)
          continue;
        i4 += avt.b(3, localawu);
      }
      i2 = i4;
    }
    if (!Arrays.equals(this.m, awe.e))
      i2 += avt.b(4, this.m);
    if (!Arrays.equals(this.e, awe.e))
      i2 += avt.b(6, this.e);
    if (this.q != null)
      i2 += avt.b(7, this.q);
    if (!this.o.equals(""))
      i2 += avt.b(8, this.o);
    if (this.n != null)
      i2 += avt.b(9, this.n);
    if (this.k)
      i2 += 1 + avt.b(10);
    if (this.c != 0)
      i2 += avt.c(11, this.c);
    if (this.d != 0)
      i2 += avt.c(12, this.d);
    if (!this.p.equals(""))
      i2 += avt.b(13, this.p);
    if (!this.r.equals(""))
      i2 += avt.b(14, this.r);
    if (this.f != 180000L)
    {
      long l1 = this.f;
      i2 += avt.b(15) + avt.b(avt.d(l1));
    }
    if (this.s != null)
      i2 += avt.b(16, this.s);
    if (this.b != 0L)
      i2 += avt.b(17, this.b);
    if (!Arrays.equals(this.g, awe.e))
      i2 += avt.b(18, this.g);
    if (this.u != 0)
      i2 += avt.c(19, this.u);
    if ((this.v != null) && (this.v.length > 0))
    {
      int i3 = 0;
      while (i1 < this.v.length)
      {
        i3 += avt.a(this.v[i1]);
        i1++;
      }
      i2 = i2 + i3 + 2 * this.v.length;
    }
    if (this.i != 0L)
      i2 += avt.b(21, this.i);
    if (this.h != 0L)
      i2 += avt.b(22, this.h);
    if (this.w != null)
      i2 += avt.b(23, this.w);
    if (!this.t.equals(""))
      i2 += avt.b(24, this.t);
    return i2;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0L)
      paramavt.a(1, this.a);
    if (!this.j.equals(""))
      paramavt.a(2, this.j);
    if ((this.l != null) && (this.l.length > 0))
      for (int i3 = 0; i3 < this.l.length; i3++)
      {
        awu localawu = this.l[i3];
        if (localawu == null)
          continue;
        paramavt.a(3, localawu);
      }
    if (!Arrays.equals(this.m, awe.e))
      paramavt.a(4, this.m);
    if (!Arrays.equals(this.e, awe.e))
      paramavt.a(6, this.e);
    if (this.q != null)
      paramavt.a(7, this.q);
    if (!this.o.equals(""))
      paramavt.a(8, this.o);
    if (this.n != null)
      paramavt.a(9, this.n);
    if (this.k)
      paramavt.a(10, this.k);
    if (this.c != 0)
      paramavt.a(11, this.c);
    if (this.d != 0)
      paramavt.a(12, this.d);
    if (!this.p.equals(""))
      paramavt.a(13, this.p);
    if (!this.r.equals(""))
      paramavt.a(14, this.r);
    if (this.f != 180000L)
    {
      long l1 = this.f;
      paramavt.e(15, 0);
      paramavt.a(avt.d(l1));
    }
    if (this.s != null)
      paramavt.a(16, this.s);
    if (this.b != 0L)
      paramavt.a(17, this.b);
    if (!Arrays.equals(this.g, awe.e))
      paramavt.a(18, this.g);
    if (this.u != 0)
      paramavt.a(19, this.u);
    if (this.v != null)
    {
      int i1 = this.v.length;
      int i2 = 0;
      if (i1 > 0)
        while (i2 < this.v.length)
        {
          paramavt.a(20, this.v[i2]);
          i2++;
        }
    }
    if (this.i != 0L)
      paramavt.a(21, this.i);
    if (this.h != 0L)
      paramavt.a(22, this.h);
    if (this.w != null)
      paramavt.a(23, this.w);
    if (!this.t.equals(""))
      paramavt.a(24, this.t);
    super.a(paramavt);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    awt localawt;
    while (true)
    {
      return true;
      if (!(paramObject instanceof awt))
        return false;
      localawt = (awt)paramObject;
      if (this.a != localawt.a)
        return false;
      if (this.b != localawt.b)
        return false;
      if (this.i != localawt.i)
        return false;
      if (this.j == null)
      {
        if (localawt.j != null)
          return false;
      }
      else if (!this.j.equals(localawt.j))
        return false;
      if (this.c != localawt.c)
        return false;
      if (this.d != localawt.d)
        return false;
      if (this.k != localawt.k)
        return false;
      if (!avz.a(this.l, localawt.l))
        return false;
      if (!Arrays.equals(this.m, localawt.m))
        return false;
      if (this.n == null)
      {
        if (localawt.n != null)
          return false;
      }
      else if (!this.n.equals(localawt.n))
        return false;
      if (!Arrays.equals(this.e, localawt.e))
        return false;
      if (this.o == null)
      {
        if (localawt.o != null)
          return false;
      }
      else if (!this.o.equals(localawt.o))
        return false;
      if (this.p == null)
      {
        if (localawt.p != null)
          return false;
      }
      else if (!this.p.equals(localawt.p))
        return false;
      if (this.q == null)
      {
        if (localawt.q != null)
          return false;
      }
      else if (!this.q.equals(localawt.q))
        return false;
      if (this.r == null)
      {
        if (localawt.r != null)
          return false;
      }
      else if (!this.r.equals(localawt.r))
        return false;
      if (this.f != localawt.f)
        return false;
      if (this.s == null)
      {
        if (localawt.s != null)
          return false;
      }
      else if (!this.s.equals(localawt.s))
        return false;
      if (!Arrays.equals(this.g, localawt.g))
        return false;
      if (this.t == null)
      {
        if (localawt.t != null)
          return false;
      }
      else if (!this.t.equals(localawt.t))
        return false;
      if (this.u != localawt.u)
        return false;
      if (!avz.a(this.v, localawt.v))
        return false;
      if (this.h != localawt.h)
        return false;
      if (this.w == null)
      {
        if (localawt.w != null)
          return false;
      }
      else if (!this.w.equals(localawt.w))
        return false;
      if ((this.H != null) && (!this.H.a()))
        break;
      if ((localawt.H != null) && (!localawt.H.a()))
        return false;
    }
    return this.H.equals(localawt.H);
  }

  public final int hashCode()
  {
    int i1 = 31 * (31 * (31 * (31 * (527 + getClass().getName().hashCode()) + (int)(this.a ^ this.a >>> 32)) + (int)(this.b ^ this.b >>> 32)) + (int)(this.i ^ this.i >>> 32));
    int i2;
    int i4;
    label113: int i6;
    label154: int i8;
    label185: int i10;
    label205: int i12;
    label225: int i14;
    label245: int i16;
    label282: int i18;
    label313: int i20;
    label369: int i21;
    int i22;
    if (this.j == null)
    {
      i2 = 0;
      int i3 = 31 * (31 * (31 * (i2 + i1) + this.c) + this.d);
      if (!this.k)
        break label427;
      i4 = 1231;
      int i5 = 31 * (31 * (31 * (i4 + i3) + avz.a(this.l)) + Arrays.hashCode(this.m));
      if (this.n != null)
        break label435;
      i6 = 0;
      int i7 = 31 * (31 * (i6 + i5) + Arrays.hashCode(this.e));
      if (this.o != null)
        break label447;
      i8 = 0;
      int i9 = 31 * (i8 + i7);
      if (this.p != null)
        break label459;
      i10 = 0;
      int i11 = 31 * (i10 + i9);
      if (this.q != null)
        break label471;
      i12 = 0;
      int i13 = 31 * (i12 + i11);
      if (this.r != null)
        break label483;
      i14 = 0;
      int i15 = 31 * (31 * (i14 + i13) + (int)(this.f ^ this.f >>> 32));
      if (this.s != null)
        break label495;
      i16 = 0;
      int i17 = 31 * (31 * (i16 + i15) + Arrays.hashCode(this.g));
      if (this.t != null)
        break label507;
      i18 = 0;
      int i19 = 31 * (31 * (31 * (31 * (i18 + i17) + this.u) + avz.a(this.v)) + (int)(this.h ^ this.h >>> 32));
      if (this.w != null)
        break label519;
      i20 = 0;
      i21 = 31 * (i20 + i19);
      avx localavx = this.H;
      i22 = 0;
      if (localavx != null)
      {
        boolean bool = this.H.a();
        i22 = 0;
        if (!bool)
          break label531;
      }
    }
    while (true)
    {
      return i21 + i22;
      i2 = this.j.hashCode();
      break;
      label427: i4 = 1237;
      break label113;
      label435: i6 = this.n.hashCode();
      break label154;
      label447: i8 = this.o.hashCode();
      break label185;
      label459: i10 = this.p.hashCode();
      break label205;
      label471: i12 = this.q.hashCode();
      break label225;
      label483: i14 = this.r.hashCode();
      break label245;
      label495: i16 = this.s.hashCode();
      break label282;
      label507: i18 = this.t.hashCode();
      break label313;
      label519: i20 = this.w.hashCode();
      break label369;
      label531: i22 = this.H.hashCode();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awt
 * JD-Core Version:    0.6.0
 */