import android.content.Context;
import android.net.Uri;

public final class ky
  implements ln
{
  private final ln a;
  private final ln b;
  private final ln c;
  private ln d;

  public ky(Context paramContext, String paramString)
  {
    this(paramContext, null, paramString, false);
  }

  private ky(Context paramContext, lm paramlm, String paramString, boolean paramBoolean)
  {
    this(paramContext, null, new kx(paramString, null, null, 8000, 8000, false));
  }

  private ky(Context paramContext, lm paramlm, ln paramln)
  {
    this.a = ((ln)lp.a(paramln));
    this.b = new la(paramlm);
    this.c = new ks(paramContext, paramlm);
  }

  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.d.a(paramArrayOfByte, paramInt1, paramInt2);
  }

  public final long a(kv paramkv)
  {
    boolean bool;
    String str;
    if (this.d == null)
    {
      bool = true;
      lp.b(bool);
      str = paramkv.a.getScheme();
      if ((!"http".equals(str)) && (!"https".equals(str)))
        break label63;
      this.d = this.a;
    }
    while (true)
    {
      return this.d.a(paramkv);
      bool = false;
      break;
      label63: if ("file".equals(str))
      {
        if (paramkv.a.getPath().startsWith("/android_asset/"))
        {
          this.d = this.c;
          continue;
        }
        this.d = this.b;
        continue;
      }
      if (!"asset".equals(str))
        break label129;
      this.d = this.c;
    }
    label129: throw new kz(str);
  }

  public final void a()
  {
    if (this.d != null);
    try
    {
      this.d.a();
      return;
    }
    finally
    {
      this.d = null;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ky
 * JD-Core Version:    0.6.0
 */