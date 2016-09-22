import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class aop
{
  public static long a(InputStream paramInputStream, OutputStream paramOutputStream, boolean paramBoolean, int paramInt)
  {
    byte[] arrayOfByte = new byte[1024];
    long l = 0L;
    try
    {
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte, 0, 1024);
        if (i == -1)
          break;
        l += i;
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    finally
    {
      if (paramBoolean)
      {
        a(paramInputStream);
        a(paramOutputStream);
      }
    }
    if (paramBoolean)
    {
      a(paramInputStream);
      a(paramOutputStream);
    }
    return l;
  }

  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aop
 * JD-Core Version:    0.6.0
 */