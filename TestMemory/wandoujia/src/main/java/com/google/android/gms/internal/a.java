package com.google.android.gms.internal;

public final class a extends ar<a>
{
  private static volatile a[] o;
  public int a = 1;
  public String b = "";
  public a[] c = c();
  public a[] d = c();
  public a[] e = c();
  public String f = "";
  public String g = "";
  public long h = 0L;
  public boolean i = false;
  public a[] j = c();
  public int[] k = ay.a;
  public boolean l = false;

  public a()
  {
    this.m = null;
    this.n = -1;
  }

  private static a[] c()
  {
    if (o == null);
    synchronized (av.a)
    {
      if (o == null)
        o = new a[0];
      return o;
    }
  }

  public final boolean equals(Object paramObject)
  {
    int m;
    if (paramObject == this)
      m = 1;
    a locala;
    label69: String str1;
    label153: 
    do
    {
      String str2;
      do
      {
        boolean bool4;
        do
        {
          boolean bool3;
          do
          {
            boolean bool2;
            do
            {
              String str3;
              do
              {
                int n;
                int i1;
                do
                {
                  boolean bool1;
                  do
                  {
                    return m;
                    bool1 = paramObject instanceof a;
                    m = 0;
                  }
                  while (!bool1);
                  locala = (a)paramObject;
                  n = this.a;
                  i1 = locala.a;
                  m = 0;
                }
                while (n != i1);
                if (this.b != null)
                  break;
                str3 = locala.b;
                m = 0;
              }
              while (str3 != null);
              bool2 = av.a(this.c, locala.c);
              m = 0;
            }
            while (!bool2);
            bool3 = av.a(this.d, locala.d);
            m = 0;
          }
          while (!bool3);
          bool4 = av.a(this.e, locala.e);
          m = 0;
        }
        while (!bool4);
        if (this.f != null)
          break label303;
        str2 = locala.f;
        m = 0;
      }
      while (str2 != null);
      if (this.g != null)
        break label320;
      str1 = locala.g;
      m = 0;
    }
    while (str1 != null);
    label303: label320: 
    do
    {
      boolean bool5 = this.h < locala.h;
      m = 0;
      if (bool5)
        break;
      boolean bool6 = this.i;
      boolean bool7 = locala.i;
      m = 0;
      if (bool6 != bool7)
        break;
      boolean bool8 = av.a(this.j, locala.j);
      m = 0;
      if (!bool8)
        break;
      boolean bool9 = av.a(this.k, locala.k);
      m = 0;
      if (!bool9)
        break;
      boolean bool10 = this.l;
      boolean bool11 = locala.l;
      m = 0;
      if (bool10 != bool11)
        break;
      return a(locala);
      if (this.b.equals(locala.b))
        break label69;
      return false;
      if (this.f.equals(locala.f))
        break label153;
      return false;
    }
    while (this.g.equals(locala.g));
    return false;
  }

  public final int hashCode()
  {
    int m = 1231;
    int n = 31 * (527 + this.a);
    int i1;
    int i3;
    label76: int i5;
    label100: int i7;
    label137: int i8;
    if (this.b == null)
    {
      i1 = 0;
      int i2 = 31 * (31 * (31 * (31 * (i1 + n) + av.a(this.c)) + av.a(this.d)) + av.a(this.e));
      if (this.f != null)
        break label200;
      i3 = 0;
      int i4 = 31 * (i3 + i2);
      String str = this.g;
      i5 = 0;
      if (str != null)
        break label212;
      int i6 = 31 * (31 * (i4 + i5) + (int)(this.h ^ this.h >>> 32));
      if (!this.i)
        break label224;
      i7 = m;
      i8 = 31 * (31 * (31 * (i7 + i6) + av.a(this.j)) + av.a(this.k));
      if (!this.l)
        break label232;
    }
    while (true)
    {
      return 31 * (i8 + m) + a();
      i1 = this.b.hashCode();
      break;
      label200: i3 = this.f.hashCode();
      break label76;
      label212: i5 = this.g.hashCode();
      break label100;
      label224: i7 = 1237;
      break label137;
      label232: m = 1237;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.a
 * JD-Core Version:    0.6.0
 */