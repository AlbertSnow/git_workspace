package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.f;
import android.support.v4.content.g;
import android.support.v4.e.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class an
  implements g<Object>
{
  final int a;
  al<Object> b;
  f<Object> c;
  boolean d;
  boolean e;
  Object f;
  boolean g;
  boolean h;
  boolean i;
  boolean j;
  an k;
  private Bundle l;
  private boolean m;
  private boolean n;

  public an(int paramInt, Bundle paramBundle, al<Object> paramal)
  {
    this.a = paramBundle;
    this.l = null;
    Object localObject;
    this.b = localObject;
  }

  final void a()
  {
    if ((this.h) && (this.i))
      this.g = true;
    do
    {
      do
        return;
      while (this.g);
      this.g = true;
      if ((this.c != null) || (this.b == null))
        continue;
      this.c = this.b.a(this.a);
    }
    while (this.c == null);
    if ((this.c.getClass().isMemberClass()) && (!Modifier.isStatic(this.c.getClass().getModifiers())))
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.c);
    if (!this.n)
    {
      this.c.a(this.a, this);
      this.n = true;
    }
    this.c.d();
  }

  public final void a(f<Object> paramf, Object paramObject)
  {
    if (this.m);
    do
    {
      do
        return;
      while (this.o.a.a(this.a) != this);
      an localan1 = this.k;
      if (localan1 != null)
      {
        this.k = null;
        this.o.a.a(this.a, null);
        c();
        this.o.a(localan1);
        return;
      }
      if ((this.f != paramObject) || (!this.d))
      {
        this.f = paramObject;
        this.d = true;
        if (this.g)
          b(paramf, paramObject);
      }
      an localan2 = (an)this.o.b.a(this.a);
      if ((localan2 == null) || (localan2 == this))
        continue;
      localan2.e = false;
      localan2.c();
      this.o.b.b(this.a);
    }
    while ((this.o.d == null) || (this.o.a()));
    this.o.d.mFragments.g();
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    while (true)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.a);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.l);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      paramPrintWriter.println(this.b);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.c);
      if (this.c != null)
        this.c.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      if ((this.d) || (this.e))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mHaveData=");
        paramPrintWriter.print(this.d);
        paramPrintWriter.print("  mDeliveredData=");
        paramPrintWriter.println(this.e);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mData=");
        paramPrintWriter.println(this.f);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.g);
      paramPrintWriter.print(" mReportNextStart=");
      paramPrintWriter.print(this.j);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(this.m);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mRetaining=");
      paramPrintWriter.print(this.h);
      paramPrintWriter.print(" mRetainingStarted=");
      paramPrintWriter.print(this.i);
      paramPrintWriter.print(" mListenerRegistered=");
      paramPrintWriter.println(this.n);
      if (this.k == null)
        break;
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.k);
      paramPrintWriter.println(":");
      this = this.k;
      paramString = paramString + "  ";
    }
  }

  final void b()
  {
    this.g = false;
    if ((!this.h) && (this.c != null) && (this.n))
    {
      this.n = false;
      this.c.a(this);
      this.c.f();
    }
  }

  final void b(f<Object> paramf, Object paramObject)
  {
    String str2;
    if (this.b != null)
    {
      if (this.o.d == null)
        break label120;
      str2 = this.o.d.mFragments.j;
      this.o.d.mFragments.j = "onLoadFinished";
    }
    label120: for (String str1 = str2; ; str1 = null)
      try
      {
        this.b.a(paramf, paramObject);
        if (this.o.d != null)
          this.o.d.mFragments.j = str1;
        this.e = true;
        return;
      }
      finally
      {
        if (this.o.d != null)
          this.o.d.mFragments.j = str1;
      }
  }

  final void c()
  {
    this.m = true;
    boolean bool = this.e;
    this.e = false;
    String str;
    if ((this.b != null) && (this.c != null) && (this.d) && (bool))
    {
      if (this.o.d == null)
        break label168;
      str = this.o.d.mFragments.j;
      this.o.d.mFragments.j = "onLoaderReset";
    }
    while (true)
    {
      if (this.o.d != null)
        this.o.d.mFragments.j = str;
      this.b = null;
      this.f = null;
      this.d = false;
      if (this.c != null)
      {
        if (this.n)
        {
          this.n = false;
          this.c.a(this);
        }
        this.c.i();
      }
      if (this.k != null)
      {
        this = this.k;
        break;
      }
      return;
      label168: str = null;
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    b.a(this.c, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.an
 * JD-Core Version:    0.6.0
 */