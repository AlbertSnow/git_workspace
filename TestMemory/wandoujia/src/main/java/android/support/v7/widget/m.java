package android.support.v7.widget;

import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;

final class m
  implements br
{
  final ArrayList<o> a = new ArrayList();
  private MediaSessionCompat<o> b = new MediaSessionCompat();
  private ArrayList<o> c = new ArrayList();
  private n d;
  private bq e;

  m(n paramn)
  {
    this(paramn, 0);
  }

  private m(n paramn, byte paramByte)
  {
    this.d = paramn;
    this.e = new bq(this);
  }

  private void a(o paramo, int paramInt)
  {
    this.d.a(paramo);
    switch (paramo.a)
    {
    default:
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    case 1:
      this.d.a(paramInt, paramo.c);
      return;
    case 2:
    }
    this.d.c(paramInt, paramo.c);
  }

  private void a(List<o> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
      a((o)paramList.get(j));
    paramList.clear();
  }

  private void b(o paramo)
  {
    if ((paramo.a == 0) || (paramo.a == 3))
      throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    int i = d(paramo.b, paramo.a);
    int j = paramo.b;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    label107: int i3;
    int i4;
    switch (paramo.a)
    {
    default:
      throw new IllegalArgumentException("op should be remove or update." + paramo);
    case 2:
      k = 1;
      m = 1;
      n = i;
      i1 = j;
      i2 = 1;
      if (i2 >= paramo.c)
        break label280;
      i3 = d(paramo.b + k * i2, paramo.a);
      switch (paramo.a)
      {
      default:
        i4 = 0;
        label167: if (i4 != 0)
          m++;
      case 2:
      case 1:
      }
    case 1:
    }
    while (true)
    {
      i2++;
      break label107;
      k = 0;
      break;
      if (i3 == n + 1)
      {
        i4 = 1;
        break label167;
      }
      i4 = 0;
      break label167;
      if (i3 == n)
      {
        i4 = 1;
        break label167;
      }
      i4 = 0;
      break label167;
      o localo2 = a(paramo.a, n, m);
      a(localo2, i1);
      a(localo2);
      if (paramo.a == 2)
        i1 += m;
      m = 1;
      n = i3;
    }
    label280: a(paramo);
    if (m > 0)
    {
      o localo1 = a(paramo.a, n, m);
      a(localo1, i1);
      a(localo1);
    }
  }

  private boolean b(int paramInt)
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++)
    {
      o localo = (o)this.c.get(j);
      if (localo.a == 3)
      {
        if (e(localo.c, j + 1) == paramInt)
          return true;
      }
      else
      {
        if (localo.a != 0)
          continue;
        int k = localo.b + localo.c;
        for (int m = localo.b; m < k; m++)
          if (e(m, j + 1) == paramInt)
            return true;
      }
    }
    return false;
  }

  private void c(o paramo)
  {
    this.c.add(paramo);
    switch (paramo.a)
    {
    default:
      throw new IllegalArgumentException("Unknown update op type for " + paramo);
    case 0:
      this.d.d(paramo.b, paramo.c);
      return;
    case 3:
      this.d.e(paramo.b, paramo.c);
      return;
    case 1:
      this.d.b(paramo.b, paramo.c);
      return;
    case 2:
    }
    this.d.c(paramo.b, paramo.c);
  }

  private int d(int paramInt1, int paramInt2)
  {
    int i = -1 + this.c.size();
    int j = paramInt1;
    if (i >= 0)
    {
      o localo2 = (o)this.c.get(i);
      int n;
      int i1;
      label66: label106: int m;
      if (localo2.a == 3)
        if (localo2.b < localo2.c)
        {
          n = localo2.b;
          i1 = localo2.c;
          if ((j < n) || (j > i1))
            break label204;
          if (n != localo2.b)
            break label159;
          if (paramInt2 != 0)
            break label139;
          localo2.c = (1 + localo2.c);
          m = j + 1;
        }
      while (true)
      {
        i--;
        j = m;
        break;
        n = localo2.c;
        i1 = localo2.b;
        break label66;
        label139: if (paramInt2 != 1)
          break label106;
        localo2.c = (-1 + localo2.c);
        break label106;
        label159: if (paramInt2 == 0)
          localo2.b = (1 + localo2.b);
        while (true)
        {
          m = j - 1;
          break;
          if (paramInt2 != 1)
            continue;
          localo2.b = (-1 + localo2.b);
        }
        label204: if (j < localo2.b)
        {
          if (paramInt2 == 0)
          {
            localo2.b = (1 + localo2.b);
            localo2.c = (1 + localo2.c);
            m = j;
            continue;
          }
          if (paramInt2 == 1)
          {
            localo2.b = (-1 + localo2.b);
            localo2.c = (-1 + localo2.c);
          }
        }
        m = j;
        continue;
        if (localo2.b <= j)
        {
          if (localo2.a == 0)
          {
            m = j - localo2.c;
            continue;
          }
          if (localo2.a == 1)
          {
            m = j + localo2.c;
            continue;
          }
        }
        else
        {
          if (paramInt2 == 0)
          {
            localo2.b = (1 + localo2.b);
            m = j;
            continue;
          }
          if (paramInt2 == 1)
            localo2.b = (-1 + localo2.b);
        }
        m = j;
      }
    }
    int k = -1 + this.c.size();
    if (k >= 0)
    {
      o localo1 = (o)this.c.get(k);
      if (localo1.a == 3)
        if ((localo1.c == localo1.b) || (localo1.c < 0))
        {
          this.c.remove(k);
          a(localo1);
        }
      while (true)
      {
        k--;
        break;
        if (localo1.c > 0)
          continue;
        this.c.remove(k);
        a(localo1);
      }
    }
    return j;
  }

  private int e(int paramInt1, int paramInt2)
  {
    int i = this.c.size();
    int j = paramInt1;
    o localo;
    if (paramInt2 < i)
    {
      localo = (o)this.c.get(paramInt2);
      if (localo.a == 3)
        if (localo.b == j)
          j = localo.c;
    }
    while (true)
    {
      paramInt2++;
      break;
      if (localo.b < j)
        j--;
      if (localo.c > j)
        continue;
      j++;
      continue;
      if (localo.b > j)
        continue;
      if (localo.a == 1)
      {
        if (j < localo.b + localo.c)
        {
          j = -1;
          return j;
        }
        j -= localo.c;
        continue;
      }
      if (localo.a != 0)
        continue;
      j += localo.c;
    }
  }

  final int a(int paramInt)
  {
    return e(paramInt, 0);
  }

  public final o a(int paramInt1, int paramInt2, int paramInt3)
  {
    o localo = (o)this.b.a();
    if (localo == null)
      return new o(paramInt1, paramInt2, paramInt3);
    localo.a = paramInt1;
    localo.b = paramInt2;
    localo.c = paramInt3;
    return localo;
  }

  final void a()
  {
    a(this.a);
    a(this.c);
  }

  public final void a(o paramo)
  {
    this.b.a(paramo);
  }

  final boolean a(int paramInt1, int paramInt2)
  {
    this.a.add(a(2, paramInt1, paramInt2));
    return this.a.size() == 1;
  }

  final void b()
  {
    this.e.a(this.a);
    int i = this.a.size();
    int j = 0;
    o localo;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    if (j < i)
    {
      localo = (o)this.a.get(j);
      switch (localo.a)
      {
      default:
      case 0:
        while (true)
        {
          j++;
          break;
          c(localo);
        }
      case 1:
        i8 = localo.b;
        i9 = localo.b + localo.c;
        i10 = localo.b;
        i11 = -1;
        i12 = 0;
        label115: if (i10 < i9)
        {
          if ((this.d.a(i10) == null) && (!b(i10)))
            break;
          if (i11 != 0)
            break label536;
          b(a(1, i8, i12));
        }
      case 2:
      case 3:
      }
    }
    label530: label536: for (int i13 = 1; ; i13 = 0)
    {
      i11 = 1;
      label167: int i18;
      int i16;
      int i17;
      if (i13 != 0)
      {
        i18 = i10 - i12;
        i16 = i9 - i12;
        i17 = 1;
        label189: int i19 = i18 + 1;
        i12 = i17;
        i9 = i16;
        i10 = i19;
        break label115;
        if (i11 != 1)
          break label530;
        c(a(1, i8, i12));
      }
      for (i13 = 1; ; i13 = 0)
      {
        i11 = 0;
        break label167;
        int i14 = i12 + 1;
        int i15 = i10;
        i16 = i9;
        i17 = i14;
        i18 = i15;
        break label189;
        if (i12 != localo.c)
        {
          a(localo);
          localo = a(1, i8, i12);
        }
        if (i11 == 0)
        {
          b(localo);
          break;
        }
        c(localo);
        break;
        int k = localo.b;
        int m = localo.b + localo.c;
        int n = localo.b;
        int i1 = -1;
        int i2 = 0;
        if (n < m)
        {
          int i3;
          int i4;
          if ((this.d.a(n) != null) || (b(n)))
          {
            if (i1 == 0)
            {
              b(a(2, k, i2));
              i2 = 0;
              k = n;
            }
            i3 = k;
            i4 = i2;
          }
          for (int i5 = 1; ; i5 = 0)
          {
            int i6 = i4 + 1;
            n++;
            int i7 = i5;
            i2 = i6;
            k = i3;
            i1 = i7;
            break;
            if (i1 == 1)
            {
              c(a(2, k, i2));
              i2 = 0;
              k = n;
            }
            i3 = k;
            i4 = i2;
          }
        }
        if (i2 != localo.c)
        {
          a(localo);
          localo = a(2, k, i2);
        }
        if (i1 == 0)
        {
          b(localo);
          break;
        }
        c(localo);
        break;
        c(localo);
        break;
        this.a.clear();
        return;
      }
    }
  }

  final boolean b(int paramInt1, int paramInt2)
  {
    this.a.add(a(0, paramInt1, paramInt2));
    return this.a.size() == 1;
  }

  final void c()
  {
    int i = this.c.size();
    for (int j = 0; j < i; j++)
      this.d.b((o)this.c.get(j));
    a(this.c);
  }

  final boolean c(int paramInt1, int paramInt2)
  {
    this.a.add(a(1, paramInt1, paramInt2));
    return this.a.size() == 1;
  }

  final boolean d()
  {
    return this.a.size() > 0;
  }

  final void e()
  {
    c();
    int i = this.a.size();
    int j = 0;
    if (j < i)
    {
      o localo = (o)this.a.get(j);
      switch (localo.a)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        j++;
        break;
        this.d.b(localo);
        this.d.d(localo.b, localo.c);
        continue;
        this.d.b(localo);
        this.d.a(localo.b, localo.c);
        continue;
        this.d.b(localo);
        this.d.c(localo.b, localo.c);
        continue;
        this.d.b(localo);
        this.d.e(localo.b, localo.c);
      }
    }
    a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.m
 * JD-Core Version:    0.6.0
 */