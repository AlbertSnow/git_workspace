import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class la
  implements ln
{
  private final lm a;
  private RandomAccessFile b;
  private long c;
  private boolean d;

  public la()
  {
    this(null);
  }

  public la(lm paramlm)
  {
    this.a = paramlm;
  }

  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j;
    if (this.c == 0L)
      j = -1;
    while (true)
    {
      return j;
      try
      {
        int i = this.b.read(paramArrayOfByte, paramInt1, (int)Math.min(this.c, paramInt2));
        j = i;
        if (j <= 0)
          continue;
        this.c -= j;
        return j;
      }
      catch (IOException localIOException)
      {
      }
    }
    throw new lb(localIOException);
  }

  public final long a(kv paramkv)
  {
    while (true)
    {
      try
      {
        paramkv.a.toString();
        this.b = new RandomAccessFile(paramkv.a.getPath(), "r");
        this.b.seek(paramkv.b);
        if (paramkv.c == -1L)
        {
          l = this.b.length() - paramkv.b;
          this.c = l;
          if (this.c >= 0L)
            break;
          throw new EOFException();
        }
      }
      catch (IOException localIOException)
      {
        throw new lb(localIOException);
      }
      long l = paramkv.c;
    }
    this.d = true;
    return this.c;
  }

  public final void a()
  {
    if (this.b != null);
    try
    {
      this.b.close();
      this.b = null;
      if (this.d)
      {
        this.d = false;
        if (this.a == null);
      }
      return;
    }
    catch (IOException localIOException)
    {
      throw new lb(localIOException);
    }
    finally
    {
      this.b = null;
      if (this.d)
        this.d = false;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     la
 * JD-Core Version:    0.6.0
 */