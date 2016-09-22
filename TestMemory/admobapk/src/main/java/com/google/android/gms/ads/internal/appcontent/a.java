package com.google.android.gms.ads.internal.appcontent;

import com.google.android.gms.ads.internal.util.c;
import java.util.ArrayList;
import java.util.Iterator;

@com.google.android.gms.ads.internal.report.client.a
public final class a
{
  final Object a = new Object();
  int b = 0;
  int c = 0;
  int d = 0;
  int e;
  public String f = "";
  public String g = "";
  private final int h;
  private final int i;
  private final int j;
  private final j k;
  private ArrayList l = new ArrayList();
  private ArrayList m = new ArrayList();

  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.h = paramInt1;
    this.i = paramInt2;
    this.j = paramInt3;
    this.k = new j(paramInt4);
  }

  private static String a(ArrayList paramArrayList, int paramInt)
  {
    String str;
    if (paramArrayList.isEmpty())
      str = "";
    do
    {
      return str;
      StringBuffer localStringBuffer = new StringBuffer();
      Iterator localIterator = paramArrayList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localStringBuffer.append((String)localIterator.next());
        localStringBuffer.append(' ');
      }
      while (localStringBuffer.length() <= 100);
      localStringBuffer.deleteCharAt(-1 + localStringBuffer.length());
      str = localStringBuffer.toString();
    }
    while (str.length() < 100);
    return str.substring(0, 100);
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    b(paramString, paramBoolean);
    synchronized (this.a)
    {
      if (this.d < 0)
        c.b("ActivityContent: negative number of WebViews.");
      c();
      return;
    }
  }

  public final boolean a()
  {
    while (true)
    {
      synchronized (this.a)
      {
        if (this.d == 0)
        {
          n = 1;
          return n;
        }
      }
      int n = 0;
    }
  }

  public final void b()
  {
    synchronized (this.a)
    {
      this.d = (1 + this.d);
      return;
    }
  }

  final void b(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.length() < this.j))
      return;
    synchronized (this.a)
    {
      this.l.add(paramString);
      this.b += paramString.length();
      if (paramBoolean)
        this.m.add(paramString);
      return;
    }
  }

  public final void c()
  {
    synchronized (this.a)
    {
      int n = this.b;
      int i1 = this.c;
      int i2 = n * this.h + i1 * this.i;
      if (i2 > this.e)
      {
        this.e = i2;
        this.f = this.k.a(this.l);
        this.g = this.k.a(this.m);
      }
      return;
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a));
    a locala;
    do
    {
      return false;
      if (paramObject == this)
        return true;
      locala = (a)paramObject;
    }
    while ((locala.f == null) || (!locala.f.equals(this.f)));
    return true;
  }

  public final int hashCode()
  {
    return this.f.hashCode();
  }

  public final String toString()
  {
    int n = this.c;
    int i1 = this.e;
    int i2 = this.b;
    String str1 = String.valueOf(a(this.l, 100));
    String str2 = String.valueOf(a(this.m, 100));
    String str3 = this.f;
    String str4 = this.g;
    return 133 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + "ActivityContent fetchId: " + n + " score:" + i1 + " total_length:" + i2 + "\n text: " + str1 + "\n viewableText" + str2 + "\n signture: " + str3 + "\n viewableSignture: " + str4;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.a
 * JD-Core Version:    0.6.0
 */