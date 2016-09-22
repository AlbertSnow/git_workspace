package android.support.v4.app;

import android.support.v4.content.f;
import android.support.v4.e.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class am extends ak
{
  final m<an> a = new m();
  final m<an> b = new m();
  final String c;
  FragmentActivity d;
  boolean e;
  boolean f;
  private boolean g;

  am(String paramString, FragmentActivity paramFragmentActivity, boolean paramBoolean)
  {
    this.c = paramString;
    this.d = paramFragmentActivity;
    this.e = paramBoolean;
  }

  private an c(int paramInt, al<Object> paramal)
  {
    an localan = new an(this, paramInt, null, paramal);
    localan.c = paramal.a(paramInt);
    return localan;
  }

  private an d(int paramInt, al<Object> paramal)
  {
    try
    {
      this.g = true;
      an localan = c(paramInt, paramal);
      a(localan);
      return localan;
    }
    finally
    {
      this.g = false;
    }
    throw localObject;
  }

  public final <D> f<D> a(int paramInt, al<D> paramal)
  {
    if (this.g)
      throw new IllegalStateException("Called while creating a loader");
    an localan = (an)this.a.a(paramInt);
    if (localan == null)
      localan = d(paramInt, paramal);
    while (true)
    {
      if ((localan.d) && (this.e))
        localan.b(localan.c, localan.f);
      return localan.c;
      localan.b = paramal;
    }
  }

  public final void a(int paramInt)
  {
    if (this.g)
      throw new IllegalStateException("Called while creating a loader");
    int i = this.a.f(paramInt);
    if (i >= 0)
    {
      an localan2 = (an)this.a.e(i);
      this.a.c(i);
      localan2.c();
    }
    int j = this.b.f(paramInt);
    if (j >= 0)
    {
      an localan1 = (an)this.b.e(j);
      this.b.c(j);
      localan1.c();
    }
    if ((this.d != null) && (!a()))
      this.d.mFragments.g();
  }

  final void a(an paraman)
  {
    this.a.a(paraman.a, paraman);
    if (this.e)
      paraman.a();
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    if (this.a.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      String str2 = paramString + "    ";
      for (int j = 0; j < this.a.a(); j++)
      {
        an localan2 = (an)this.a.e(j);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.a.d(j));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localan2.toString());
        localan2.a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    if (this.b.a() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      while (i < this.b.a())
      {
        an localan1 = (an)this.b.e(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.d(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localan1.toString());
        localan1.a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i++;
      }
    }
  }

  public final boolean a()
  {
    int i = this.a.a();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      an localan = (an)this.a.e(j);
      if ((localan.g) && (!localan.e));
      for (int m = 1; ; m = 0)
      {
        k |= m;
        j++;
        break;
      }
    }
    return k;
  }

  public final <D> f<D> b(int paramInt)
  {
    if (this.g)
      throw new IllegalStateException("Called while creating a loader");
    an localan = (an)this.a.a(paramInt);
    if (localan != null)
    {
      if (localan.k != null)
        return localan.k.c;
      return localan.c;
    }
    return null;
  }

  public final <D> f<D> b(int paramInt, al<D> paramal)
  {
    if (this.g)
      throw new IllegalStateException("Called while creating a loader");
    an localan1 = (an)this.a.a(paramInt);
    if (localan1 != null)
    {
      an localan2 = (an)this.b.a(paramInt);
      if (localan2 != null)
      {
        if (!localan1.d)
          break label95;
        localan2.e = false;
        localan2.c();
      }
      localan1.c.h();
      this.b.a(paramInt, localan1);
    }
    while (true)
    {
      return d(paramInt, paramal).c;
      label95: if (localan1.g)
        break;
      this.a.a(paramInt, null);
      localan1.c();
    }
    if (localan1.k != null)
    {
      localan1.k.c();
      localan1.k = null;
    }
    localan1.k = c(paramInt, paramal);
    return localan1.k.c;
  }

  final void b()
  {
    if (this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStart when already started: ").append(this);
    }
    while (true)
    {
      return;
      this.e = true;
      for (int i = -1 + this.a.a(); i >= 0; i--)
        ((an)this.a.e(i)).a();
    }
  }

  final void c()
  {
    if (!this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStop when not started: ").append(this);
      return;
    }
    for (int i = -1 + this.a.a(); i >= 0; i--)
      ((an)this.a.e(i)).b();
    this.e = false;
  }

  final void d()
  {
    if (!this.e)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doRetain when not started: ").append(this);
    }
    while (true)
    {
      return;
      this.f = true;
      this.e = false;
      for (int i = -1 + this.a.a(); i >= 0; i--)
      {
        an localan = (an)this.a.e(i);
        localan.h = true;
        localan.i = localan.g;
        localan.g = false;
        localan.b = null;
      }
    }
  }

  final void e()
  {
    for (int i = -1 + this.a.a(); i >= 0; i--)
      ((an)this.a.e(i)).j = true;
  }

  final void f()
  {
    for (int i = -1 + this.a.a(); i >= 0; i--)
    {
      an localan = (an)this.a.e(i);
      if ((!localan.g) || (!localan.j))
        continue;
      localan.j = false;
      if (!localan.d)
        continue;
      localan.b(localan.c, localan.f);
    }
  }

  final void g()
  {
    if (!this.f)
    {
      for (int j = -1 + this.a.a(); j >= 0; j--)
        ((an)this.a.e(j)).c();
      this.a.b();
    }
    for (int i = -1 + this.b.a(); i >= 0; i--)
      ((an)this.b.e(i)).c();
    this.b.b();
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    b.a(this.d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.am
 * JD-Core Version:    0.6.0
 */