package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.common.a;

final class r
{
  private final a a;
  private final CurrentParsingState b = new CurrentParsingState();
  private final StringBuilder c = new StringBuilder();

  r(a parama)
  {
    this.a = parama;
  }

  static int a(a parama, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = 0; j < paramInt2; j++)
    {
      if (!parama.a(paramInt1 + j))
        continue;
      i |= 1 << -1 + (paramInt2 - j);
    }
    return i;
  }

  private l a()
  {
    while (true)
    {
      int i = this.b.a();
      boolean bool;
      int i1;
      int i5;
      o localo;
      if (i + 7 > this.a.a())
        if (i + 4 <= this.a.a())
        {
          bool = true;
          if (!bool)
            break;
          i1 = this.b.a();
          if (i1 + 7 <= this.a.a())
            break label236;
          i5 = a(i1, 4);
          if (i5 != 0)
            break label211;
          localo = new o(this.a.a(), 10, 10);
          label99: this.b.a(localo.e());
          if (!localo.c())
            break label318;
          if (!localo.d())
            break label287;
        }
      label287: for (n localn = new n(this.b.a(), this.c.toString()); ; localn = new n(this.b.a(), this.c.toString(), localo.b()))
      {
        return new l(localn, true);
        bool = false;
        break;
        for (int j = i; ; j++)
        {
          if (j >= i + 3)
            break label197;
          if (!this.a.a(j))
            continue;
          bool = true;
          break;
        }
        label197: bool = this.a.a(i + 3);
        break;
        label211: localo = new o(this.a.a(), i5 - 1, 10);
        break label99;
        label236: int i2 = a(i1, 7);
        int i3 = (i2 - 8) / 11;
        int i4 = (i2 - 8) % 11;
        localo = new o(i1 + 7, i3, i4);
        break label99;
      }
      label318: this.c.append(localo.a());
      if (localo.d())
        return new l(new n(this.b.a(), this.c.toString()), true);
      this.c.append(localo.b());
    }
    int k = this.b.a();
    int n;
    if (k + 1 > this.a.a())
      n = 0;
    while (true)
    {
      if (n != 0)
      {
        this.b.e();
        this.b.b(4);
      }
      return new l();
      for (int m = 0; ; m++)
      {
        if ((m >= 4) || (m + k >= this.a.a()))
          break label490;
        if (!this.a.a(k + m))
          continue;
        n = 0;
        break;
      }
      label490: n = 1;
    }
  }

  private boolean a(int paramInt)
  {
    if (paramInt + 1 > this.a.a());
    while (true)
    {
      return false;
      int i = 0;
      if ((i >= 5) || (i + paramInt >= this.a.a()))
        break;
      if (i == 2)
        if (!this.a.a(paramInt + 2))
          continue;
      do
      {
        i++;
        break;
      }
      while (!this.a.a(paramInt + i));
      return false;
    }
    return true;
  }

  private l b()
  {
    while (true)
    {
      int i = this.b.a();
      int j;
      int k;
      int m;
      m localm;
      if (i + 5 <= this.a.a())
      {
        int i1 = a(i, 5);
        if ((i1 >= 5) && (i1 < 16))
        {
          j = 1;
          if (j == 0)
            break;
          k = this.b.a();
          m = a(k, 5);
          if (m != 15)
            break label226;
          localm = new m(k + 5, '$');
        }
      }
      while (true)
      {
        this.b.a(localm.e());
        if (!localm.b())
          break label614;
        return new l(new n(this.b.a(), this.c.toString()), true);
        if (i + 7 <= this.a.a())
        {
          int i2 = a(i, 7);
          if ((i2 >= 64) && (i2 < 116))
          {
            j = 1;
            break;
          }
          if (i + 8 <= this.a.a())
          {
            int i3 = a(i, 8);
            if ((i3 >= 232) && (i3 < 253))
            {
              j = 1;
              break;
            }
          }
        }
        j = 0;
        break;
        label226: if ((m >= 5) && (m < 15))
        {
          localm = new m(k + 5, (char)(-5 + (m + 48)));
          continue;
        }
        int n = a(k, 7);
        if ((n >= 64) && (n < 90))
        {
          localm = new m(k + 7, (char)(n + 1));
          continue;
        }
        if ((n < 90) || (n >= 116))
          break label343;
        localm = new m(k + 7, (char)(n + 7));
      }
      label343: char c1;
      switch (a(k, 8))
      {
      default:
        throw FormatException.getFormatInstance();
      case 232:
        c1 = '!';
      case 233:
      case 234:
      case 235:
      case 236:
      case 237:
      case 238:
      case 239:
      case 240:
      case 241:
      case 242:
      case 243:
      case 244:
      case 245:
      case 246:
      case 247:
      case 248:
      case 249:
      case 250:
      case 251:
      case 252:
      }
      while (true)
      {
        localm = new m(k + 8, c1);
        break;
        c1 = '"';
        continue;
        c1 = '%';
        continue;
        c1 = '&';
        continue;
        c1 = '\'';
        continue;
        c1 = '(';
        continue;
        c1 = ')';
        continue;
        c1 = '*';
        continue;
        c1 = '+';
        continue;
        c1 = ',';
        continue;
        c1 = '-';
        continue;
        c1 = '.';
        continue;
        c1 = '/';
        continue;
        c1 = ':';
        continue;
        c1 = ';';
        continue;
        c1 = '<';
        continue;
        c1 = '=';
        continue;
        c1 = '>';
        continue;
        c1 = '?';
        continue;
        c1 = '_';
        continue;
        c1 = ' ';
      }
      label614: this.c.append(localm.a());
    }
    if (b(this.b.a()))
    {
      this.b.b(3);
      this.b.d();
    }
    do
      return new l();
    while (!a(this.b.a()));
    if (5 + this.b.a() < this.a.a())
      this.b.b(5);
    while (true)
    {
      this.b.e();
      break;
      this.b.a(this.a.a());
    }
  }

  private boolean b(int paramInt)
  {
    if (paramInt + 3 > this.a.a())
      return false;
    for (int i = paramInt; ; i++)
    {
      if (i >= paramInt + 3)
        break label41;
      if (this.a.a(i))
        break;
    }
    label41: return true;
  }

  final int a(int paramInt1, int paramInt2)
  {
    return a(this.a, paramInt1, paramInt2);
  }

  final n a(int paramInt, String paramString)
  {
    this.c.setLength(0);
    if (paramString != null)
      this.c.append(paramString);
    this.b.a(paramInt);
    label140: label540: label691: label695: 
    while (true)
    {
      int i = this.b.a();
      int k;
      int m;
      label95: int n;
      int i1;
      m localm;
      l locall;
      boolean bool;
      if (this.b.b())
      {
        k = this.b.a();
        if (k + 5 <= this.a.a())
        {
          int i3 = a(k, 5);
          if ((i3 >= 5) && (i3 < 16))
          {
            m = 1;
            if (m == 0)
              break label540;
            n = this.b.a();
            i1 = a(n, 5);
            if (i1 != 15)
              break label325;
            localm = new m(n + 5, '$');
            this.b.a(localm.e());
            if (!localm.b())
              break label524;
            locall = new l(new n(this.b.a(), this.c.toString()), true);
            bool = locall.b();
            label198: if (i == this.b.a())
              break label691;
          }
        }
      }
      for (int j = 1; ; j = 0)
      {
        if (((j != 0) || (bool)) && (!bool))
          break label695;
        n localn = locall.a();
        if ((localn == null) || (!localn.b()))
          break label697;
        return new n(this.b.a(), this.c.toString(), localn.c());
        if (k + 6 <= this.a.a())
        {
          int i4 = a(k, 6);
          if ((i4 >= 16) && (i4 < 63))
          {
            m = 1;
            break label95;
          }
        }
        m = 0;
        break label95;
        label325: if ((i1 >= 5) && (i1 < 15))
        {
          localm = new m(n + 5, (char)(-5 + (i1 + 48)));
          break label140;
        }
        int i2 = a(n, 6);
        if ((i2 >= 32) && (i2 < 58))
        {
          localm = new m(n + 6, (char)(i2 + 33));
          break label140;
        }
        char c1;
        switch (i2)
        {
        default:
          throw new IllegalStateException("Decoding invalid alphanumeric value: " + i2);
        case 58:
          c1 = '*';
        case 59:
        case 60:
        case 61:
        case 62:
        }
        while (true)
        {
          localm = new m(n + 6, c1);
          break;
          c1 = ',';
          continue;
          c1 = '-';
          continue;
          c1 = '.';
          continue;
          c1 = '/';
        }
        this.c.append(localm.a());
        break;
        if (b(this.b.a()))
        {
          this.b.b(3);
          this.b.d();
        }
        do
        {
          locall = new l();
          break;
        }
        while (!a(this.b.a()));
        if (5 + this.b.a() < this.a.a())
          this.b.b(5);
        while (true)
        {
          this.b.f();
          break;
          this.b.a(this.a.a());
        }
        if (this.b.c())
        {
          locall = b();
          bool = locall.b();
          break label198;
        }
        locall = a();
        bool = locall.b();
        break label198;
      }
    }
    label524: label697: return new n(this.b.a(), this.c.toString());
  }

  final String a(StringBuilder paramStringBuilder, int paramInt)
  {
    String str1 = null;
    n localn = a(paramInt, str1);
    String str2 = q.a(localn.a());
    if (str2 != null)
      paramStringBuilder.append(str2);
    if (localn.b());
    for (str1 = String.valueOf(localn.c()); ; str1 = null)
    {
      if (paramInt == localn.e())
        break label72;
      paramInt = localn.e();
      break;
    }
    label72: return paramStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.r
 * JD-Core Version:    0.6.0
 */