import java.io.UnsupportedEncodingException;

public class fx extends ev
{
  private final fb l;

  public fx(int paramInt, String paramString, fb paramfb, fa paramfa)
  {
    super(paramInt, paramString, paramfa);
    this.l = paramfb;
  }

  protected final ez a(et paramet)
  {
    try
    {
      str = new String(paramet.a, fs.a(paramet.b));
      return ez.a(str, fs.a(paramet));
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        String str = new String(paramet.a);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fx
 * JD-Core Version:    0.6.0
 */