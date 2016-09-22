import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class ks
  implements ln
{
  private final AssetManager a;
  private final lm b;
  private InputStream c;
  private long d;
  private boolean e;

  public ks(Context paramContext, lm paramlm)
  {
    this.a = paramContext.getAssets();
    this.b = paramlm;
  }

  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j;
    if (this.d == 0L)
      j = -1;
    while (true)
    {
      return j;
      try
      {
        int i = this.c.read(paramArrayOfByte, paramInt1, (int)Math.min(this.d, paramInt2));
        j = i;
        if (j <= 0)
          continue;
        this.d -= j;
        return j;
      }
      catch (IOException localIOException)
      {
      }
    }
    throw new kt(localIOException);
  }

  public final long a(kv paramkv)
  {
    while (true)
    {
      try
      {
        paramkv.a.toString();
        str = paramkv.a.getPath();
        if (str.startsWith("/android_asset/"))
        {
          str = str.substring(15);
          this.c = this.a.open(str, 1);
          if (this.c.skip(paramkv.b) != paramkv.b)
            break label171;
          bool = true;
          lp.b(bool);
          if (paramkv.c != -1L)
            break label152;
          l = this.c.available();
          this.d = l;
          if (this.d >= 0L)
            break label161;
          throw new EOFException();
        }
      }
      catch (IOException localIOException)
      {
        throw new kt(localIOException);
      }
      if (!str.startsWith("/"))
        continue;
      String str = str.substring(1);
      continue;
      label152: long l = paramkv.c;
      continue;
      label161: this.e = true;
      return this.d;
      label171: boolean bool = false;
    }
  }

  public final void a()
  {
    if (this.c != null);
    try
    {
      this.c.close();
      this.c = null;
      if (this.e)
      {
        this.e = false;
        if (this.b == null);
      }
      return;
    }
    catch (IOException localIOException)
    {
      throw new kt(localIOException);
    }
    finally
    {
      this.c = null;
      if (this.e)
        this.e = false;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ks
 * JD-Core Version:    0.6.0
 */