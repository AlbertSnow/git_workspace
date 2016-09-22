import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class be extends bc
{
  static boolean a = false;
  final di b;
  final String c;
  boolean d;
  boolean e;
  ai f;
  private di g;

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = 0;
    if (this.b.c > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      String str2 = paramString + "    ";
      for (int j = 0; j < this.b.c; j++)
      {
        bf localbf2 = (bf)this.b.b[j];
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.b.a[j]);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localbf2.toString());
        localbf2.a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      }
    }
    if (this.g.c > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      String str1 = paramString + "    ";
      while (i < this.g.c)
      {
        bf localbf1 = (bf)this.g.b[i];
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.g.a[i]);
        paramPrintWriter.print(": ");
        paramPrintWriter.println(localbf1.toString());
        localbf1.a(str1, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i++;
      }
    }
  }

  public final boolean a()
  {
    int i = this.b.c;
    int j = 0;
    int k = 0;
    if (j < i)
    {
      bf localbf = (bf)this.b.b[j];
      if ((localbf.d) && (!localbf.c));
      for (int m = 1; ; m = 0)
      {
        k |= m;
        j++;
        break;
      }
    }
    return k;
  }

  final void b()
  {
    if (this.d)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStart when already started: " + this, localRuntimeException);
      return;
    }
    this.d = true;
    int i = -1 + this.b.c;
    label62: bf localbf;
    if (i >= 0)
    {
      localbf = (bf)this.b.b[i];
      if ((!localbf.e) || (!localbf.f))
        break label110;
      localbf.d = true;
    }
    while (true)
    {
      i--;
      break label62;
      break;
      label110: if (localbf.d)
        continue;
      localbf.d = true;
      if (localbf.b == null)
        continue;
      if ((localbf.b.getClass().isMemberClass()) && (!Modifier.isStatic(localbf.b.getClass().getModifiers())))
        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + localbf.b);
      if (!localbf.h)
      {
        ct localct2 = localbf.b;
        if (localct2.b != null)
          throw new IllegalStateException("There is already a listener registered");
        localct2.b = localbf;
        localct2.a = 0;
        ct localct3 = localbf.b;
        if (localct3.c != null)
          throw new IllegalStateException("There is already a listener registered");
        localct3.c = localbf;
        localbf.h = true;
      }
      ct localct1 = localbf.b;
      localct1.d = true;
      localct1.f = false;
      localct1.e = false;
    }
  }

  final void c()
  {
    if (!this.d)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStop when not started: " + this, localRuntimeException);
      return;
    }
    for (int i = -1 + this.b.c; i >= 0; i--)
      ((bf)this.b.b[i]).a();
    this.d = false;
  }

  final void d()
  {
    if (!this.d)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doRetain when not started: " + this, localRuntimeException);
    }
    while (true)
    {
      return;
      this.e = true;
      this.d = false;
      for (int i = -1 + this.b.c; i >= 0; i--)
      {
        bf localbf = (bf)this.b.b[i];
        localbf.e = true;
        localbf.f = localbf.d;
        localbf.d = false;
        localbf.a = null;
      }
    }
  }

  final void e()
  {
    for (int i = -1 + this.b.c; i >= 0; i--)
      ((bf)this.b.b[i]).g = true;
  }

  final void f()
  {
    for (int i = -1 + this.b.c; i >= 0; i--)
    {
      bf localbf = (bf)this.b.b[i];
      if ((!localbf.d) || (!localbf.g))
        continue;
      localbf.g = false;
    }
  }

  final void g()
  {
    if (!this.e)
    {
      for (int j = -1 + this.b.c; j >= 0; j--)
        ((bf)this.b.b[j]).b();
      this.b.a();
    }
    for (int i = -1 + this.g.c; i >= 0; i--)
      ((bf)this.g.b[i]).b();
    this.g.a();
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    cz.a(this.f, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     be
 * JD-Core Version:    0.6.0
 */