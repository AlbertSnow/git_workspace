import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public final class kd
  implements jm, jw
{
  private final lu a = new lu(lr.a);
  private final lu b = new lu(4);
  private final lu c = new lu(16);
  private final Stack d = new Stack();
  private int e = 0;
  private long f;
  private int g;
  private long h;
  private int i;
  private lu j;
  private int k;
  private int l;
  private int m;
  private jo n;
  private ke[] o;

  private final int b(jn paramjn, js paramjs)
  {
    long l1 = 9223372036854775807L;
    int i1 = 0;
    int i2 = -1;
    while (i1 < this.o.length)
    {
      ke localke2 = this.o[i1];
      int i8 = localke2.d;
      if (i8 != localke2.b.a)
      {
        long l4 = localke2.b.b[i8];
        if (l4 < l1)
        {
          l1 = l4;
          i2 = i1;
        }
      }
      i1++;
    }
    if (i2 == -1)
      return -1;
    ke localke1 = this.o[i2];
    int i3 = localke1.d;
    long l2 = localke1.b.b[i3];
    long l3 = l2 - paramjn.a() + this.l;
    if ((l3 < 0L) || (l3 >= 262144L))
    {
      paramjs.a = l2;
      return 1;
    }
    paramjn.a((int)l3);
    this.k = localke1.b.c[i3];
    if (localke1.a.d != -1)
    {
      byte[] arrayOfByte = this.b.a;
      arrayOfByte[0] = 0;
      arrayOfByte[1] = 0;
      arrayOfByte[2] = 0;
      int i5 = localke1.a.d;
      int i6 = 4 - localke1.a.d;
      while (this.l < this.k)
      {
        if (this.m == 0)
        {
          paramjn.a(this.b.a, i6, i5);
          this.b.a(0);
          this.m = this.b.f();
          this.a.a(0);
          localke1.c.a(this.a, 4);
          this.l = (4 + this.l);
          this.k = (i6 + this.k);
          continue;
        }
        int i7 = localke1.c.a(paramjn, this.m);
        this.l = (i7 + this.l);
        this.m -= i7;
      }
    }
    while (this.l < this.k)
    {
      int i4 = localke1.c.a(paramjn, this.k - this.l);
      this.l = (i4 + this.l);
      this.m -= i4;
    }
    localke1.c.a(localke1.b.d[i3], localke1.b.e[i3], this.k, 0, null);
    localke1.d = (1 + localke1.d);
    this.l = 0;
    this.m = 0;
    return 0;
  }

  public final int a(jn paramjn, js paramjs)
  {
    label150: label199: label247: int i1;
    label279: label285: label322: label475: 
    do
    {
      int i7;
      while (true)
        switch (this.e)
        {
        default:
          return b(paramjn, paramjs);
        case 0:
          if (!paramjn.a(this.c.a, 0, 8, true))
          {
            i7 = 0;
            if (i7 == 0)
              return -1;
          }
        case 1:
        }
      this.c.a(0);
      this.h = this.c.c();
      this.g = this.c.d();
      int i4;
      if (this.h == 1L)
      {
        paramjn.a(this.c.a, 8, 8);
        this.h = this.c.e();
        this.f = (16L + this.f);
        this.i = 16;
        int i3 = this.g;
        if ((i3 != jy.i) && (i3 != jy.k) && (i3 != jy.l) && (i3 != jy.m) && (i3 != jy.n))
          break label279;
        i4 = 1;
        if (i4 == 0)
          break label322;
        if (this.h != 1L)
          break label285;
        this.d.add(new jz(this.g, this.f + this.h - this.i));
        this.e = 0;
      }
      while (true)
      {
        i7 = 1;
        break;
        this.f = (8L + this.f);
        this.i = 8;
        break label150;
        i4 = 0;
        break label199;
        this.d.add(new jz(this.g, this.f + this.h - this.i));
        break label247;
        int i5 = this.g;
        int i6;
        if ((i5 == jy.q) || (i5 == jy.j) || (i5 == jy.r) || (i5 == jy.C) || (i5 == jy.D) || (i5 == jy.s) || (i5 == jy.a) || (i5 == jy.o) || (i5 == jy.d) || (i5 == jy.c) || (i5 == jy.F) || (i5 == jy.G) || (i5 == jy.H) || (i5 == jy.I) || (i5 == jy.J) || (i5 == jy.K) || (i5 == jy.L) || (i5 == jy.p))
        {
          i6 = 1;
          if (i6 == 0)
            break label556;
          if (this.h >= 2147483647L)
            break label550;
        }
        for (boolean bool = true; ; bool = false)
        {
          lp.b(bool);
          this.j = new lu((int)this.h);
          System.arraycopy(this.c.a, 0, this.j.a, 0, 8);
          this.e = 1;
          break;
          i6 = 0;
          break label475;
        }
        this.j = null;
        this.e = 1;
      }
      this.e = 0;
      this.f += this.h - this.i;
      long l1 = this.h - this.i;
      if ((this.j == null) && ((this.h >= 262144L) || (this.h > 2147483647L)))
      {
        i1 = 1;
        if (i1 == 0)
          break label896;
        paramjs.a = this.f;
      }
      while (true)
      {
        if ((this.d.isEmpty()) || (((jz)this.d.peek()).N != this.f))
          break label1067;
        jz localjz1 = (jz)this.d.pop();
        if (localjz1.M == jy.i)
        {
          ArrayList localArrayList = new ArrayList();
          int i2 = 0;
          while (true)
            if (i2 < localjz1.P.size())
            {
              jz localjz2 = (jz)localjz1.P.get(i2);
              if (localjz2.M == jy.k)
              {
                kf localkf = kb.a(localjz2, localjz1.c(jy.j));
                if ((localkf != null) && ((localkf.a == 1936684398) || (localkf.a == 1986618469)))
                {
                  kh localkh = kb.a(localkf, localjz2.d(jy.l).d(jy.m).d(jy.n));
                  if (localkh.a != 0)
                  {
                    ke localke = new ke(localkf, localkh, this.n.c(i2));
                    localke.c.a(localkf.c);
                    localArrayList.add(localke);
                  }
                }
              }
              i2++;
              continue;
              i1 = 0;
              break;
              if (this.j != null)
              {
                paramjn.a(this.j.a, this.i, (int)l1);
                if (this.d.isEmpty())
                  break label649;
                jz localjz3 = (jz)this.d.peek();
                ka localka = new ka(this.g, this.j);
                localjz3.O.add(localka);
                break label649;
              }
              paramjn.a((int)l1);
              break label649;
            }
          this.o = ((ke[])localArrayList.toArray(new ke[0]));
          this.n.e();
          this.n.a(this);
          this.e = 2;
          continue;
        }
        if (this.d.isEmpty())
          continue;
        ((jz)this.d.peek()).P.add(localjz1);
      }
    }
    while (i1 == 0);
    label550: label556: return 1;
  }

  public final long a(long paramLong)
  {
    long l1 = 9223372036854775807L;
    int i1 = 0;
    if (i1 < this.o.length)
    {
      kh localkh = this.o[i1].b;
      int i2 = ly.a(localkh.d, paramLong, true, false);
      label42: if (i2 >= 0)
        if ((localkh.d[i2] <= paramLong) && ((0x1 & localkh.e[i2]) != 0))
          label73: if (i2 == -1)
          {
            i2 = ly.b(localkh.d, paramLong, true, false);
            label92: if (i2 >= localkh.d.length)
              break label193;
            if ((localkh.d[i2] < paramLong) || ((0x1 & localkh.e[i2]) == 0))
              break label187;
          }
      while (true)
      {
        this.o[i1].d = i2;
        long l2 = localkh.b[this.o[i1].d];
        if (l2 < l1)
          l1 = l2;
        i1++;
        break;
        i2--;
        break label42;
        i2 = -1;
        break label73;
        label187: i2++;
        break label92;
        label193: i2 = -1;
      }
    }
    return l1;
  }

  public final void a()
  {
    this.f = 0L;
    this.l = 0;
    this.m = 0;
  }

  public final void a(jo paramjo)
  {
    this.n = paramjo;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     kd
 * JD-Core Version:    0.6.0
 */