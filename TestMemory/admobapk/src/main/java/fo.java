import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class fo
{
  public long a;
  public String b;
  public String c;
  public long d;
  public long e;
  public long f;
  public long g;
  public Map h;

  private fo()
  {
  }

  public fo(String paramString, ej paramej)
  {
    this.b = paramString;
    this.a = paramej.a.length;
    this.c = paramej.b;
    this.d = paramej.c;
    this.e = paramej.d;
    this.f = paramej.e;
    this.g = paramej.f;
    this.h = paramej.g;
  }

  public static fo a(InputStream paramInputStream)
  {
    fo localfo = new fo();
    if (fn.a(paramInputStream) != 538247942)
      throw new IOException();
    localfo.b = fn.c(paramInputStream);
    localfo.c = fn.c(paramInputStream);
    if (localfo.c.equals(""))
      localfo.c = null;
    localfo.d = fn.b(paramInputStream);
    localfo.e = fn.b(paramInputStream);
    localfo.f = fn.b(paramInputStream);
    localfo.g = fn.b(paramInputStream);
    localfo.h = fn.d(paramInputStream);
    return localfo;
  }

  public final boolean a(OutputStream paramOutputStream)
  {
    while (true)
    {
      try
      {
        fn.a(paramOutputStream, 538247942);
        fn.a(paramOutputStream, this.b);
        if (this.c == null)
        {
          str = "";
          fn.a(paramOutputStream, str);
          fn.a(paramOutputStream, this.d);
          fn.a(paramOutputStream, this.e);
          fn.a(paramOutputStream, this.f);
          fn.a(paramOutputStream, this.g);
          Map localMap = this.h;
          if (localMap == null)
            break label182;
          fn.a(paramOutputStream, localMap.size());
          Iterator localIterator = localMap.entrySet().iterator();
          if (!localIterator.hasNext())
            break;
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          fn.a(paramOutputStream, (String)localEntry.getKey());
          fn.a(paramOutputStream, (String)localEntry.getValue());
          continue;
        }
      }
      catch (IOException localIOException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localIOException.toString();
        fh.b("%s", arrayOfObject);
        return false;
      }
      String str = this.c;
      continue;
      label182: fn.a(paramOutputStream, 0);
    }
    paramOutputStream.flush();
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fo
 * JD-Core Version:    0.6.0
 */