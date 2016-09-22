import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class fr extends HttpEntityEnclosingRequestBase
{
  public fr()
  {
  }

  public fr(String paramString)
  {
    setURI(URI.create(paramString));
  }

  public final String getMethod()
  {
    return "PATCH";
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fr
 * JD-Core Version:    0.6.0
 */